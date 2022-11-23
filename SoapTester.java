class SoapTester{
	
	public static void main(String pk[]){
		
		//create multiple of Soap
		
		// className refe = new ClassName();
		
		Soap soap = new Soap();
		
		soap.name="Lux ";
		soap.color= " White ";
		soap.shape=" ovel ";
		soap.price=40;
		soap.toGetFresh();
		System.out.println(soap.name+ "" + soap.color + ""+soap.shape );
	
		Soap soap1 =  new Soap();
		
		soap.name="Pears";
		soap.color="Blue";
		soap.shape="Square";
		soap.price=20;
		soap.toGetFresh();

	}
}