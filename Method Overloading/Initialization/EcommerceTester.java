class EcommerceTester{
	
	public static void main(String pk[]){
		
		Ecommerce.setEcommerceName("Amazon");
		Ecommerce.setEcommerceRatings(4.2);
		Ecommerce.setEcommerDownloads("100M+");
		
		System.out.println(Ecommerce.getEcommerceName() + "\n" + Ecommerce.getEcommerceRatings() + "\n" + Ecommerce.getEcommerceDownloads() );
	}
}