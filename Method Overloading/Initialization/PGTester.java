class PGTester{
	public static void main(String pk[]){
		
		PG.setPGName("Manjunatha PG");
		PG.setPGTypes("Boys PG");
		PG.setPGPriceOfMonth(5500);
		
		System.out.println(PG.getPGName() +"\n" + PG.getPGTypes() + "\n" + PG.getPGPriceOfMonth());
	}
}