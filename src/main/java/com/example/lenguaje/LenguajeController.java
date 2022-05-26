package com.example.lenguaje;

import eugenio.parser.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import java.io.*;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LenguajeController implements Initializable {

    private static String salida="";
    private static String traduccion="";
    private static String nombreClase;

    @FXML
    private MenuBar barraMenu;

    @FXML
    private MenuItem btnAbrirArchivo;

    @FXML
    private MenuItem btnAcercaDe;

    @FXML
    private Menu btnArchivo;

    @FXML
    private MenuItem btnCerrarPrograma;

    @FXML
    private Menu btnEditar;

    @FXML
    private Button btnCombatir;

    @FXML
    private Button btnDefender;

    @FXML
    private MenuItem btnEjecutar;

    @FXML
    private MenuItem btnLimpiar;

    @FXML
    private MenuItem btnTraducir;

    @FXML
    private Menu menuAyuda;

    @FXML
    private Menu menuEjecutar;

    @FXML
    private Button btnCortar;

    @FXML
    private CodeArea txtAreaEntrada;

    @FXML
    private TextArea txtAreaSalida;

    @FXML
    private CodeArea txtAreaTraduccion;

    @FXML
    void abrirArchivo(ActionEvent event) {
        clear();
        FileChooser selectorArchivos = new FileChooser();
        selectorArchivos.setInitialDirectory(new File(System.getProperty("user.home")));
        File archivo = selectorArchivos.showOpenDialog(null);
        if (archivo!=null){
            try{
                Scanner input = new Scanner(new File(archivo.getAbsolutePath()));
                while (input.hasNext()){
                    txtAreaEntrada.appendText(input.nextLine()+'\n');
                }
                input.close();
            }
            catch (FileNotFoundException e){
                System.out.println("El archivo no se encontró: "+archivo.getName());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @FXML
    void clear(){
        txtAreaEntrada.clear();
        txtAreaTraduccion.clear();
        txtAreaSalida.clear();
    }

    @FXML
    void ejecutarGramatica(ActionEvent event) {

        try {
            CharStream input = CharStreams.fromString(txtAreaTraduccion.getText());
            LenguajeDeProgramacionLexer lexico = new LenguajeDeProgramacionLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            LenguajeDeProgramacionParser sintactico = new LenguajeDeProgramacionParser(tokens);
            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener(){
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg,
                                        RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error de sintaxis en la línea " +
                            line + " posición: " + charPositionInLine + " " + msg);
                }
            });
            ParseTree arbol = sintactico.programa();
            MyVerificador verificacion = new MyVerificador();
            verificacion.visit(arbol);

            MyVisitor visita = new MyVisitor();
            visita.visit(arbol);

            //GENERACION DE ARCHIVOS
            File miArchivo = new File("C:\\Users\\eugen\\IdeaProjects\\Lenguaje\\src\\main\\resources\\Archivos\\"+nombreClase+".j");
            FileWriter escritor = new FileWriter("C:\\Users\\eugen\\IdeaProjects\\Lenguaje\\src\\main\\resources\\Archivos\\"+nombreClase+".j");
            escritor.write(salida);
            escritor.close();

            Process proceso1 = Runtime.getRuntime().exec("Java -jar jasmin.jar "+nombreClase+".j",null, new File("C:\\Users\\eugen\\IdeaProjects\\Lenguaje\\src\\main\\resources\\Archivos"));
            proceso1.waitFor();
            Process proceso2 = Runtime.getRuntime().exec("Java "+nombreClase,null,new File("C:\\Users\\eugen\\IdeaProjects\\Lenguaje\\src\\main\\resources\\Archivos"));
            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso2.getInputStream()));
            String lectura = "";
            while((lectura=lector.readLine())!=null){
                txtAreaSalida.appendText(lectura+System.lineSeparator());
            }
            proceso1.destroy();
            proceso2.destroy();

            //txtAreaSalida.setText(salida);
            salida="";
        } catch(ArithmeticException ar){
            txtAreaSalida.setText("Error: División entre 0 detectada.\nIngrese una operación válida.");
            salida="";
            return;
        }
        catch (NullPointerException npe){
            txtAreaSalida.setText(npe.getMessage());
            salida="";
            return;
        } catch (Exception pce){
            txtAreaSalida.setText(pce.getMessage());
            salida="";
            return;
        }
    }

    @FXML
    void traducir(){
        txtAreaSalida.clear();
        try {
            CharStream input = CharStreams.fromString(txtAreaEntrada.getText());
            LenguajeCLexer lexico = new LenguajeCLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            LenguajeCParser sintactico = new LenguajeCParser(tokens);
            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener(){
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg,
                                        RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error de sintaxis en la línea " +
                            line + " posición: " + charPositionInLine + " " + msg);
                }
            });
            ParseTree arbol = sintactico.programa();

            MyCLanguageVisitor visita = new MyCLanguageVisitor();
            visita.visit(arbol);
        }
        catch(ArithmeticException ar){
            txtAreaSalida.setText("Error: División entre 0 detectada.\nIngrese una operación válida.");
            salida="";
            return;
        }
        catch (NullPointerException npe){
            txtAreaSalida.setText(npe.getMessage());
            salida="";
            return;
        } catch (Exception pce){
            txtAreaSalida.setText(pce.getMessage());
            salida="";
            return;
        }
        txtAreaTraduccion.clear();
        txtAreaTraduccion.appendText(traduccion);
        traduccion="";
    }

    @FXML
    void salir(){
        System.exit(0);
    }

    void setTraduccion(String texto){
        traduccion=texto;
    }

    void setSalida(String texto){
        salida=texto;
    }

    void concatenar(String resultado){
        salida=salida+resultado+"\n";
    }

    void setNombreClase(String nombre){
        nombreClase=nombre;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtAreaEntrada.setParagraphGraphicFactory(LineNumberFactory.get(txtAreaEntrada));
        txtAreaTraduccion.setParagraphGraphicFactory(LineNumberFactory.get(txtAreaTraduccion));
    }
}
