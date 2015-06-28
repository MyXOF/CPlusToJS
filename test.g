grammar test;

options {
	backtrack=true;
	memoize=true;
}

@members {
	
}

program
	: declaration+
	| include+
	| namespace+
	;

include
	: '#include' '<' LIB__ '>'
	;

namespace
	: 'using' 'namespace' NAMESPACE__ ';'
	;

declaration
//gobal variable declaration and init
	: variable
	{
		System.out.println($variable.val+";\n");
	}
//function declaration	
	| function_declaration ';'
	{
		System.out.println($function_declaration.val+";\n");
	}
//function implement	
	| function_declaration function_body
	{
		System.out.println($function_declaration.val+$function_body.val+"\n");
	}
	| COMMENT
	{
		System.out.println($COMMENT.text);
	}
	;

//unfinished
//variable declable and init
//type a,b=xxxx,c;
variable returns [String val]
@init{
	$val = null;
}
	: type var_init ';'
	{
		$val = "var " + $var_init.val + ";\n";
	}
	;


var_init returns [String val]
@init{
	$val = null;
}
	: var_name var_assign next_var = var_init
	{
		$val = $var_name + $var_assign.val + $next_var;
	}
	| ',' var_name var_assign next_var = var_init
	{
		$val = ", " + $var_name + $var_assign.val + $next_var.val;
	}
	|
	{
		$val = "";
	}
	;	

var_name returns [String val]
@init{
	$val = null
}
	: ID array_length
	{
		$val = $ID.val + $array_length.val;
	}
	|
	{
		$val = "";
	}	
	;

//unfinished
//parase something like a = (a + d) / 4;
var_assign returns [String val]
@init{
	$val = null;
}
	: '=' expression
	{
		$val = '=' + $expression.val;
	}
	|
	{
		$val = "";
	}
	;


array_length returns [String val]
@init{
	$val = null;
}
	: '[' expression ']' a = array_length
	{
		$val = "[" + $expression.val + "]" + $a.val;
	}
	|
	{
		$val = "";
	}
	;


//unfinished
//parase something like  = {1,2,3,4}
array_assign returns [String val]
@init{
	$val = null;
}
	: '=' '{' '}'
	{
		$val = "";
	}
	|
	{
		$val = "";
	}
	;

// type function_name (parameters)
function_declaration returns [String val]
@init{
	$val = null;
}
	: type ID '(' function_parameters')'
	{
		$val = "function " + $ID.text + "(" + $function_parameters.val + ")";
	}
	;

// type name1,type name2
function_parameters returns [String val]
@init{
	$val = null;
}	
	: type ID next_param = function_parameters
	{
		$val = $ID.text + $next_param.val;
	}
	| ',' type ID next_param = function_parameters
	{
		$val = ',' + $ID.text + $next_param.val;
	}
	| 'void'
	{
		$val = "";
	}
	|
	{
		$val = "";
	}
	;

/*
unfinished
something like
{
	int a = 1; --> variablePart
	if(a > 1)  --> statPart
		return;
}

*/
function_body returns [String val]
@init{
	$val = null;
}
	: '{' variablePart statPart '}'
	{
		$val = "{\n" + $variablePart.val + $statPart.val + "}\n";
	}
	;

/*mutipule varable declaration
like type a,b,c;
     type f,x,c;
	 ...
	 type da,ad,a;
*/
variablePart returns [String val]
@init{
	$val = null;
}
	: variable next_variable = variablePart
	{
		$val = $variable.val + $next_variable.val;
	}
	|
	{
		$val = "";
	}
	;

statPart returns [String val]
@init{
	$val = null;
}
	: stat next_stat = statPart
	{
		$val = $stat.val + $next_stat.val;
	}
	|
	{
		$val = "";
	}
	;
	
//unfinished
//add stat like if/while/for ...
stat returns [String val]
@int{
	$val = null;
}
	: ifStat
	{
		$val = $ifStat.val;
	}
	| forStat
	{
		$val = $forStat.val;
	}
	| whileStat
	{
		$val = $whileStat.val;
	}
	| returnStat
	{
		$val = $returnStat.val + "\n";
	}
	| functioncallStat
	{
		$val = $functioncallStat.val;
	}
	| expression ';'
	{
		$val = $expression.val + ";\n";
	}
	| COMMENT
	{
		$val = $COMMENT.val;
	}
	| ';'
	{
		$val = ";\n";
	}
	;

ifStat returns [String val]
@init{
	$val = null;
}
	: 'if' '(' expressionPart ')' statement elseStat
	{
		$val = "if (" + $expressionPart.val + ")" + $statement.val + $elseStat.val;
	}
	;

elseStat returns [String val]
@init{
	$val = null;
}
	: 'else' else_ifStat
	{
		$val = "else" + $else_ifStat.val;
	}
	|
	{
		$val = "";
	}
	;

else_ifStat returns [String val]
@init{
	$val = null;
}
	: ifStat
	{
		$val = $ifStat.val;
	}
	| statement
	{
		$val = $statement.val;
	}
	;


forStat returns [String val]
@init{
	$val = null;
}
	: 'for' '('a = expression_for ';' b = expression ';' c = expression ')' statement
	{
		$val = "for(" + $a.val + ";" + $b.val + ";" + $c.val + ")" + $statement.val + "\n";
	}
	;

expression_for returns [String val]
@init{
	$val = null;
}
	: type var_init
	{
		$val = $type.text + $var_init.val;
	}
	| var_init
	{
		$val = $var_init.val;
	}
	;

whileStat returns [String val]
@init{
	$val = null;
}
	: 'while' '(' expression ')' statement
	{
		$val = "while (" + $expression.val + ")" + $statement.val;
	}
	| 'do' statement 'while' '(' expression ')'
	{
		$val = "do" + $statement.val + "while (" + $expression.val + ")\n";
	}
	;

returnStat returns [String val]
@init{
	$val = null;
}
	: 'return' expression ';'
	{
		$val = "return" + $expression.val + ";";
	}
	;

functioncallStat returns [String val]
@init{
	$val = null;
}
	: ID '(' expressionPart ')' ';'
	{
		$val = $ID.text + "(" + $expressionPart.val + ");\n";
	}
	;

statement returns [String val]
@init{
	$val = null;
}
	: '{' variablePart statPart '}'
	{
		$val = "{\n" + $variablePart.val + $statPart.val + "\n;";
	}
	| stat
	{
		$val = $stat.val;
	}
	;

expressionPart returns [String val]
@init{
	$val = null;
}
	: expression next_expression = expressionPart
	{
		$val = $expression.val + $next_expression;
	}
	| ',' expression next_expression = expressionPart
	{
		$val = "," + $expression.val + $next_expression;
	}
	|
	{
		$val = "";
	}
	;


expression returns [String val]
@init{
	$val = null;
}
	: cal_operator next_expr = expression
	{
		$val = $cal_operator.text + $next_expr.val;
	}
	| atom_expression next_expr = expression
	{
		$val = $atom_expression.val + $next_expr.val;
	}
	| cal_operator
	{
		$val = $cal_operator.val;
	}
	| atom_expression
	{
		$val = $atom_expression.val;
	}
	;

cal_operator
	: '+' | '-' | '*' | '/' | '%'|
	| '&&' | '||' 
	| '=='| '!=' | '<' | '<=' | '>' | '>='
	| '<<' | '>>' 
	//| '++' | '--'
	;

atom_expression returns [String val]
@init{
	$val = null;
}
	: var_name
	{
		$val = $var_name.val;
	}
	| INT
	{
		$val = $INT.text;
	}
	| CHAR
	{
		$val = $CHAR.text;
	}
	| STRING
	{
		$val = $STRING.text;
	}
	| FLOAT
	{
		$val = $FLOAT.text;
	}
	| BOOL
	{
		$val = $BOOL.text;
	}
	| '(' expression ')'
	{
		$val = "(" + $expression.val + ")";
	}
	;


type
	: basicType
	| basicType '*'	
	;
	
basicType 
	: 'int'
	| 'char'
	| 'float'
	| 'double'
	| 'short'
	| 'long'
	| 'bool'
	| 'void'
	;

assignOperator
	: '='
	| '+='
	| '-='
	| '*='
	| '/='
	| '%='
	| '&='
	| '|='
	| '^='
	;

LIB__
	: 'iostream'
	| 'string'
	;

NAMESPACE__
	: 'std'
	;
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	('+'|'-')*'0'..'9'+
    ;

FLOAT
    :   ('+'|'-')* ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   ('+'|'-')* '.' ('0'..'9')+ EXPONENT?
    |   ('+'|'-')* ('0'..'9')+ EXPONENT
    ;

BOOL
	: 'true'
	| 'false'
	;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ; 
	