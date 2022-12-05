class MethodOverLoading{
	public static void add(int a, int b){
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	public static void main(String pk[]){
		add (19, 81);
		add (90, 63, 55);
	}
	

}