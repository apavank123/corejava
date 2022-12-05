class MethodOverLoading{
/* What ==> Method declares more than once within a same class but diff in parameter
Why ==> increase the readability of program 
 */
	public static void add(int a, int b){
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
}
/*class MethodOverLoadingTester{
	
	public static void main(String pk[]){
		MethodOverLoading.add(12, 22);
		MethodOverLoading.add(31, 14, 22);
	}
}*/