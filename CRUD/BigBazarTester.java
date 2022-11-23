class BigBazarTester{

     public static void main(String pk[]){
	 
	 BigBazar bazar = new BigBazar();
	 bazar.noOfWorkers = 25;
	 bazar.address = "White field";
	 bazar.floors = " 3 floors";
	 bazar.brand = "Sarkar VBH ";
	 bazar.manager = "VivekBH";
	 bazar.toGetItems();
	 System.out.println(bazar.noOfWorkers + " "+ bazar.address + " "+ bazar.floors + " "+ bazar.brand + " "+ bazar.manager);
	 
	 BigBazar bazar1 = new BigBazar();
	 bazar1.noOfWorkers = 50;
	 bazar1.address = "Rajajinagar";
	 bazar1.floors = "4 floors";
	 bazar1.brand = "OMR";
	 bazar1.manager = "Raju Hallur";
	 bazar1.toGetItems();
	 System.out.println(bazar1.noOfWorkers + " "+ bazar1.address + " "+ bazar1.floors + " "+ bazar1.brand + " "+ bazar1.manager);
	 
	 BigBazar bazar2 = new BigBazar();
	 bazar2.noOfWorkers = 37;
	 bazar2.address = "Banashankari";
	 bazar2.floors = "6 floors";
	 bazar2.brand = "Shree Vinayak";
	 bazar2.manager = "Vinayak";
	 bazar2.toGetItems();
	 System.out.println(bazar2.noOfWorkers + " "+ bazar2.address + " "+ bazar2.floors + " "+ bazar2.brand + " "+ bazar2.manager);
	 }
}