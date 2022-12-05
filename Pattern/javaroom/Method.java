class Method{
/* what ==> function or method ==> are collections of statements grouped together to perform a
specific task or functionality
why==> 1.reuse the code.  2.calls once use it many time. 
Where is method in Java?
A method is a block of code which only runs when it is called
**There are two types of methods in Java:
1.Predefined Method.
2.User-defined Method.
Syntax: Declare a method

<access_modifier> <return_type> <method_name>( list_of_parameters)
{
    //body
}
*/
	public static int add(int a, int b){
		System.out.println(a+b);
		return 0;
	}
}
/*class MethodTester{
	
	public static void main(String pk []){
		Method.add(12, 32);
		System.out.println("add the number");
	}
}*/