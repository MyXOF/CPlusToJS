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
	: '#include' '<' lIB__ '>'
	;

namespace
	: 'using' 'namespace' nAMESPACE__ ';'
	;

declaration
//gobal variable declaration and init
	: variable
	{
		System.out.println($variable.val);
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
		$val = $var_name.val + $var_assign.val + $next_var.val;
	}
	| ',' var_name var_assign next_var = var_init
	{
		$val = ", " + $var_name.val + $var_assign.val + $next_var.val;
	}
	|
	{
		$val = "";
	}
	;	


var_name returns [String val]
@init{
	$val = null;
}
	: ID array_length
	{
		$val = $ID.text + $array_length.val;
	}
	;

//unfinished
var_assign returns [String val]
@init{
	$val = null;
}
	: assignOperator expression
	{
		$val = $assignOperator.text + $expression.val;
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
	: '[' expression ']' next=array_length
	{
		$val = "[" + $expression.val + "]" + $next.val;
	}
	| '.size()'
	{
		$val = ".length()";
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
	| var_init ';'
	{
		$val = $var_init.val;
	}
	| COMMENT
	{
		$val = $COMMENT.text;
	}
	| 'break'
	{
		$val = "break";
	}
	| 'continue'
	{
		$val = "continue";
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
	: expression next = next_expr
	{
		$val = $expression.val + $next.val;
	}
	;

next_expr returns [String val]
@init{
	$val = null;
}
	: ',' expression next = next_expr
	{
		$val = "," + $expression.val + $next.val;
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
	: or_expression
	{
		$val = $or_expression.val;
	}
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
	| '(' expression ')'
	{
		$val = "(" + $expression.val + ")";
	}
	| bool_
	{
		$val = $bool_.val;
	}
	|
	{
		$val = "";
	}
	;

single_cal_operator 
	: '!'
	| '--'
	| '++'
	| '~'
	;

single_expression returns [String val]
@init{
	$val = null;
}
	: atom_expression single_expressionPart
	{
		$val = $atom_expression.val + $single_expressionPart.val;
	}
	;

single_expressionPart returns [String val]
@init{
	$val = null;
}	
	: single_cal_operator atom_expression next = single_expressionPart
	{
		$val = $single_cal_operator.text + $atom_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;

mutiple_cal_operator
	: '*' 
	| '/' 
	| '%'
	;

mutiple_expression returns [String val]
@init{
	$val = null;
}
	: single_expression mutiple_expressionPart
	{
		$val = $single_expression.val + $mutiple_expressionPart.val;
	}
	;
	
mutiple_expressionPart returns [String val]
@init{
	$val = null;
}	
	: mutiple_cal_operator single_expression next  = mutiple_expressionPart
	{
		$val = $mutiple_cal_operator.text + $single_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;


plus_cal_operator
	: '+'
	| '-'
	;

plus_expression returns [String val]
@init{
	$val = null;
}
	: mutiple_expression plus_expressionPart
	{
		$val = $mutiple_expression.val + $plus_expressionPart.val;
	}
	;
	
plus_expressionPart returns [String val]
@init{
	$val = null;
}
	: plus_cal_operator mutiple_expression next = plus_expressionPart
	{
		$val = $plus_cal_operator.text + $mutiple_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;

shift_cal_operator
	: '>>'
	| '<<'
	;
	
shift_expression returns [String val]
@init{
	$val = null;
}
	: plus_expression shift_expressionPart
	{
		$val = $plus_expression.val + $shift_expressionPart.val;
	}
	;

shift_expressionPart returns [String val]
@init{
	$val = null;
}	
	: shift_cal_operator plus_expression next = shift_expressionPart
	{
		$val = $shift_cal_operator.text + $plus_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;

compare_cal_operator
	: '>'
	| '>='
	| '<'
	| '<='
	;	

compare_expression returns [String val]
@init{
	$val = null;
}
	: shift_expression compare_expressionPart
	{
		$val = $shift_expression.val + $compare_expressionPart.val;
	}
	;

compare_expressionPart returns [String val]
@init{
	$val = null;
}
	: compare_cal_operator shift_expression next = compare_expressionPart
	{
		$val = $compare_cal_operator.text + $shift_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;

equal_cal_operator
	: '=='
	| '!='
	;

equal_expression returns [String val]
@init{
	$val = null;
}
	: compare_expression equal_expressionPart
	{
		$val = $compare_expression.val + $equal_expressionPart.val;
	}
	;
	
equal_expressionPart returns [String val]
@init{
	$val = null;
}
	: equal_cal_operator compare_expression next = equal_expressionPart
	{
		$val = $equal_cal_operator.text + $compare_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;

andBit_cal_operator
	: '&'
	;
	
andBit_expression returns [String val]
@init{
	$val = null;
}
	: equal_expression andBit_expressionPart
	{
		$val = $equal_expression.val + $andBit_expressionPart.val;
	}
	;

andBit_expressionPart returns [String val]
@init{
	$val = null;
}
	: andBit_cal_operator equal_expression next = andBit_expressionPart
	{
		$val = $andBit_cal_operator.text + $equal_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;

xorBit_cal_operator
	: '^'
	;
	
xorBit_expression returns [String val]
@init{
	$val = null;
}
	: andBit_expression xorBit_expressionPart
	{
		$val = $andBit_expression.val + $xorBit_expressionPart.val;
	}
	;

xorBit_expressionPart returns [String val]
@init{
	$val = null;
}
	: xorBit_cal_operator andBit_expression next = xorBit_expressionPart
	{
		$val = $xorBit_cal_operator.text + $andBit_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;


orBit_cal_operator
	: '|'
	;	

orBit_expression returns [String val]
@init{
	$val = null;
}
	: xorBit_expression orBit_expressionPart
	{
		$val = $xorBit_expression.val + $orBit_expressionPart.val;
	}
	;

orBit_expressionPart  returns [String val]
@init{
	$val = null;
}
	: orBit_cal_operator xorBit_expression next = orBit_expressionPart
	{
		$val = $orBit_cal_operator.text + $xorBit_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;

and_cal_operator
	: '&&'
	;

and_expression returns [String val]
@init{
	$val = null;
}
	: orBit_expression and_expressionPart
	{
		$val = $orBit_expression.val + $and_expressionPart.val;
	}
	;

and_expressionPart returns [String val]
@init{
	$val = null;
}
	: and_cal_operator orBit_expression next = and_expressionPart
	{
		$val = $and_cal_operator.text + $orBit_expression.val + $next.val;
	}
	|
	{
		$val = "";
	}
	;

or_cal_operator
	: '||'
	;

or_expression returns [String val]
@init{
	$val = null;
}
	: and_expression or_expressionPart
	{
		$val = $and_expression.val + $or_expressionPart.val;
	}
	;

or_expressionPart returns [String val]
@init{
	$val = null;
}
	: or_cal_operator and_expression next = or_expression
	{
		$val = $or_cal_operator.text + $and_expression.val + $next.val;
	}
	|
	{
		$val = "";
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
	| 'string'
	| 'void'
	;
bool_ returns [String val]
@init{
	$val = null;
}
	: 'true'
	{
		$val = "true";
	}
	| 'false'
	{
		$val = "false";
	}
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

lIB__
	: 'iostream'
	| 'string'
	;

nAMESPACE__
	: 'std'
	;
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :    ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |    '.' ('0'..'9')+ EXPONENT?
    |    ('0'..'9')+ EXPONENT
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


