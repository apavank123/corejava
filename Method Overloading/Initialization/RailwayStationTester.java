class RailwayStationTester{
	
	public static void main(String pk[]){
		
		RailwayStation.setStationName("Kempegouda RailwayStation....");
		RailwayStation.setTotalArrivingTrains(56);
		RailwayStation.setAddress("Yashavantapur Bengalore");
		
		System.out.println(RailwayStation.getStationName()+ "\n" +RailwayStation.getTotalArrivingTrains() + "\n" + RailwayStation.getAddress() );
	}
}