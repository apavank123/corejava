class Task{
	public static void main(String pk[]){
		/*
		for(int i=10; i>=1; i--)
	    System.out.println("The Numbers are "+i);
		*/
 
        Task pnwl=new Task();
        pnwl.Task(10);
 
    }
 
    public void Task(int n)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
            // Recursively call printNumbers
            Task(n-3);
            // Print number while returning from recursion
            System.out.print(" hiiii"+n);
        }
    }
 
}