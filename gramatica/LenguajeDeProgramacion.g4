grammar LenguajeDeProgramacion;

programa: encabezado VIVE contenido MUERE;

encabezado: tipodereturn REY DP DP;

tipodereturn: VOID;

contenido:  (imprimir|declarar|asignar|declararasignar|condicional|mientras)*;

imprimir: INVOCACION expr? FIN #impresion;

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
    INT                             #int
    |
    ID                              #id
    |
    '(' expr ')'                    #parentesis
    ;

mientras: HECHIZO ':' condicion ':' '[' contenido ']'    #ciclomientras;

VOID: 'verdugo';
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

ESPACIOS: [ \t\r\n]->skip;
LINEA: '$''$'~[\r\n]* -> skip;
BLOQUE: '%''%'.*?'%''%' -> skip;