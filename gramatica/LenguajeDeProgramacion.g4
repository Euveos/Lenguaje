grammar LenguajeDeProgramacion;

programa: clase encabezado contenido cierremetodo cierreclase;

clase: PUEBLO CASTILLO ID VIVE       #encabezadoclase;

encabezado: PUEBLO tipodereturn REY DP DP VIVE;

cierremetodo: MUERE         #cerrarmetodo;

cierreclase: MUERE          #cerrarclase;

tipodereturn: VOID;

contenido:  (imprimir|declarar|asignar|declararasignar|condicional|mientras)*;

imprimir: INVOCACION ':'impresiones?':' FIN #impresion;

impresiones:
            expr                            #imprimirexpr
            |
            STRING                          #imprimirstring;

declarar: tipodato ID FIN #declaracion;

declararasignar: tipodato ID '=' expr FIN   #declasignar;

tipodato: SUBDITO;

asignar: ID '=' expr FIN #asignacion;

condicional: IF  ':' condicion ':' '[' contenido ']' (sino|sinoentonces)?                  #condicionales;

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
            INT                     #numero
            |
            '(' condicion ')'       #condicionparentesis
;


sino: ELSE '[' contenido ']'    #planb;

sinoentonces: ELSEIF ':' condicion ':' '[' contenido ']' (sino|sinoentonces)?   #sinoentonce;

expr:
    expr op=('*'|'/') expr          #mulDiv
    |
    expr op=('+'|'-') expr          #sumRes
    |
    RES INT                         #intnegativo
    |
    ID '+' '+'                      #incrementar
    |
    ID '-' '-'                      #decrementar
    |
    INT                             #int
    |
    ID                              #id
    |
    '(' expr ')'                    #parentesis
    ;

mientras: HECHIZO ':' condicion ':' '[' contenido ']'    #ciclomientras;

VOID: 'verdugo';
PUEBLO: 'pueblo';
CASTILLO: 'castillo';
MUNDO: 'mundo';
REY: 'rey';
VIVE: '[';
MUERE: ']';
DP: ':';
INVOCACION: 'invocacion';
FIN: '!';
SUBDITO: 'subdito';

IF: 'juicio';
ELSE: 'ejecucion';
ELSEIF: 'sentencia';
HECHIZO: 'hechizo';
TRUE: 'cuerdo';
FALSE: 'loco';
INT:[0-9]+;
AND: '&&';
OR: '||';
MAY: '>';
MEN: '<';
MAYIGU: '>=';
MENIGU: '<=';
IGU: '==';
DIF: '!=';
ID:[a-zA-Z]+[a-zA-Z0-9]*;
SUM: '+';
RES: '-';
MUL: '*';
DIV: '/';

STRING : '"' ( '\\"' | . )*? '"' ;
ESPACIOS: [ \t\r\n]->skip;
LINEA: '$''$'~[\r\n]* -> skip;
BLOQUE: '%''%'.*?'%''%' -> skip;