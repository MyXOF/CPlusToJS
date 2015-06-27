grammar test;

options {
	backtrack=true;
}

@members {
	
}

program
	: declaration+
	;

declaration
//gobal variable declaration and init
	: variable
	{
		System.out.println($variable.val+"\n");
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
	;

//unfinished
//variable declable and init
//type a,b=xxxx,c;
variable returns [String val]
@init{
	$val = null;
}
	: type var_assign next_var = variable
	{
		$val = "var " + $var_assign.val + $next_var.val;
	}
	| ',' var_assign next_var=variable
	{
		$val = ", "+ $var_assign.val + $next_var.val;
	}
	| type ID array_length array_assign next_var = variable
	{
		$val = "var " + $ID.text + $array_length.val + $array_assign.val + $next_var.val;
	}
	| ',' ID array_length array_assign next_var = variable
	{
		$val = "," + $ID.text + $array_length.val + $array_assign.val + $next_var.val;
	}
	| ';'
	{
		$val = ";\n";
	}
	;


//unfinished
//parase something like a = (a + d) / 4;
var_assign returns [String val]
@init{
	$val = null;
}
	: ID
	{
		$val = "";
	}
	|
	{
		$val = "";
	}
	;

//unfinished
array_length returns [String val]
@init{
	$val = null;
}
	: '[' ID ']'
	{
		$val = "[" + $ID.text + "]";
	}
	| '[' INT ']'
	{
		$val = "[" + $INT.text + "]";
	}
	|	'[' ']'
	{
		$val = "[" + "]";
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
	| expression ';'
	{
		$val = $expression.val + ";\n";
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
	: 'if' '(' expression ')' statement elseStat
	{
		$val = "if (" + $expression.val + ")" + $statement.val + $elseStat.val;
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
	: 'for' '('a = expression ';' b = expression ';' c = expression ')' statement
	{
		$val = "for(" + $a.val + ";" + $b.val + ";" + $c.val + ")" + $statement.val + "\n";
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


statement returns [String val]
@init{
	$val = null;
}
	: '{' variablePart statPart '}'
	{
		$val = "{" + $variablePart.val + $statPart.val + "}";
	}
	| stat
	{
		$val = $stat.val;
	}
	;

//unfinished
expression returns [String val]
@init{
	$val = null;
}
	: ID
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
	| 'void'
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
    
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;    
	