class PaintTester{
	
	public static void main (String pk[]){
		
		Paint.setPaintId(123456);
		Paint.setColor("Pink");
		Paint.setBrandName("Nerolac");
		
		System.out.println(Paint.getPaintId()+ " \n" + Paint.getColor()+ " \n" + Paint.getBrandName());
	}
}