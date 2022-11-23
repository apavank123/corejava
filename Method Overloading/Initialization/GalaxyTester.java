class GalaxyTester{
	
	public static void main(String pk[]){
		
		Galaxy.setGalaxyName("Milky way");
		Galaxy.setGalaxyType("Spiral Galaxy");
		Galaxy.setGalaxycolor("Many colors");
		Galaxy.setGalaxyDistance("One end to end distance is 1000000 light-years ");
		
		System.out.println(Galaxy.getGalaxyName()+ "\n" + Galaxy.getGalaxyType()+ "\n" + Galaxy.getGalaxyColor() + "\n" +Galaxy.getGalaxyDistance());
	}
}