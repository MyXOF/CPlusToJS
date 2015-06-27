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
	: variable
	{
		System.out.println($variable.val+"\n");
	}
	| function_declaration ';'
	{
		System.out.println($function_declaration.val+";\n");
	}
	| function_declaration function_body
	{
		System.out.println($function_declaration.val+$function_body.val+"\n");
	}
	;
	
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

function_declaration returns [String val]
@init{
	$val = null;
}
	: type ID '(' function_parameters')'
	{
		$val = "function " + $ID.text + "(" + $function_parameters.val + ")";
	}
	;

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

function_body returns [String val]
@init{
	$val = null;
}
	: '{' variablePart'}'
	{
		$val = "{\n" + $variablePart.val + "}\n";
	}
	;

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
	