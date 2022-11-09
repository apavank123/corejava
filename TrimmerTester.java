class TrimmerTester{
	
	public static void main(String pk[]){
		
		Trimmer.brandName = "Philips";
		Trimmer.color = "Black";
		Trimmer.price = 2999;
		Trimmer.working = "For  Beard & Moustache, Body Grooming, Nose, Ear& Eyebrow";
		Trimmer.warranty = "2+1 Year of warranty";
		
		System.out.println(Trimmer.brandName);
		System.out.println(Trimmer.color);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.working);
		System.out.println(Trimmer.warranty);
	}
}