class RailwayStation{
	
	static String stationName;
	static int totalArrivingTrains;
	static String address;
	
	
	//setter and getter
	
	static void setStationName(String name){
		stationName=name;
	}
	static String getStationName(){
		return stationName;
	}
	static void setTotalArrivingTrains(int trains){
		totalArrivingTrains=trains;
	}
	static int getTotalArrivingTrains(){
		return totalArrivingTrains;
	}
	static void setAddress(String addresss){
		address=addresss;
	}
	static String getAddress(){
		return address;
	}
}