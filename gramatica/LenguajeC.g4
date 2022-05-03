grammar LenguajeC;

programa: encabezado inicio contenido fin;

inicio: LLA                         #iniciar;

fin: LLC                            #finalizar;

encabezado: VOID MAIN PA PC         #encabezar;

contenido: (declarar|imprimir|asignar|declararasignar|condicional|mientras)*;

declarar: ENTERO ID SEMI            #declaracion;

declararasignar: ENTERO ID IGUAL expr SEMI  #declasignar;

imprimir: IMPRIMIR PA expr? PC SEMI   #impresion;

asignar: ID IGUAL expr SEMI                 #asignacion;

condicional: IF  '(' condicion ')' '{' contenido '}' (sino|sinoentonces)?                  #condicionales;

condicion:  condicion AND condicion         #y
            |
            condicion OR condicion          #o
            |
            expr ol=(MAY|MEN|IGU|DIF|MAYIGU|MENIGU) expr  #condiciones
            |
            TRUE                    #verdadero
            |
            FALSE                   #falso
            |
            RES INT                 #intnegcondicion
            |
            INT                     #numeros
            |
            '(' condicion ')'       #condicionparentesis
;

sino: ELSE '{' contenido '}'    #planb;

sinoentonces: ELSEIF '(' condicion ')' '{' contenido '}'  (sino|sinoentonces)? #sinoentonce;

expr:
    expr op=('*'|'/'|'+'|'-') expr  #expresion
    |
    RES INT                         #intnegativo
    |
    INT                             #int
    |
    ID                              #id
    |
    '(' expr ')'                    #parentesis
    ;


mientras: WHILE '(' condicion ')' '{' contenido '}'    #ciclowhile;

VOID: 'void';
MAIN: 'main';
PA: '(';
PC: ')';
LLA: '{';
LLC: '}';
IGUAL: '=';
SEMI: ';';
DC: '"';

ELSEIF: 'else if';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
AND: '&&';
OR: '||';
MAY: '>';
MEN: '<';
MAYIGU: '>=';
MENIGU: '<=';
IGU: '==';
DIF: '!=';
TRUE: 'true';
FALSE: 'false';

ENTERO: 'int';
IMPRIMIR: 'printf';
INT:[0-9]+;
ID:[a-zA-Z]+[a-zA-Z0-9]*;
SUM: '+';
RES: '-';
MUL: '*';
DIV: '/';

ESPACIOS: [ \t\r\n]->skip;
LINEA: '/''/'~[\r\n]* -> skip;
BLOQUE: '/''*'.*?'*''/' -> skip;
