class TeaStallTester{
	public static void main(String pk[]){
		//TeaStall.teaStallId=58743;
		//TeaStall.name="Simba Prashant Tea point";
		//TeaStall.address="Ramanagar";
		//TeaStall.contactNo=9036137153L;
		
		TeaStall.setTeaStallId(5678);
		TeaStall.setContactNo(9036137153L);
		TeaStall.setTeaStallName("Simba Prashant TeaStall Point");
		TeaStall.setAddress("Near DonBasco College @Bangalore");
		
		System.out.println(TeaStall.getTeaStallId()+ " \n" + TeaStall.getContactNo()+ " \n" + TeaStall.getTeaStallName()+ " \n" + TeaStall.getAddress());
	} 

}