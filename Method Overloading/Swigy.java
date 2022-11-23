class Swigy{
	
	// Pizza, South Indian, Mosaranna, Burger, Sandwitch, Pastries
	
	public static double takeOrder(String item )
	{
		if (item == "Pizza"){
			System.out.println("Thank you for ordering "+item);
			return 99.00;
			//System.out.println();
		}
		if (item == "Burger"){
			System.out.println("Thank you for ordering "+item);
			return 70.00;
		}
		if(item == "Mosaranna"){
			System.out.println("Thank you for ordering "+item);
			return 40;
		}
		if(item == "Sandwitch"){
			System.out.println("Thank you for ordering "+item);
			return 50;
		}
		if (item == "South Indian"){
			System.out.println("Thank you for ordering "+item);
			return 140;
		}if (item == "Pastries"){
			System.out.println("Thank you for ordering "+item);
			return 55;
			// other statements
			//return
			// other statements -- not possible
		}
		return 00.00;
	}
	public static double takeOrder(String item, int price)
	{
		if (item == "Pizza"){
			System.out.println("Thank you for ordering "+item +"Price is"+price);
			return 99.00;
		}
		if (item == "Burger"){
			System.out.println("Thank you for ordering "+item+"Price is"+price);
			return 70.00;
		}
		if(item == "Mosaranna"){
			System.out.println("Thank you for ordering "+item+"Price is"+price);
			return 40;
		}
		if(item == "Sandwitch"){
			System.out.println("Thank you for ordering "+item +"Price is  "+price);
			return 50;
		}
		if (item == "South Indian"){
			System.out.println("Thank you for ordering "+item +"Price is"+price);
			return 140;
		}if (item == "Pastries"){
			System.out.println("Thank you for ordering "+item +"Price is"+price);
			return 55;
			// other statements
			//return
			// other statements -- not possible
		}
		return 00.00;
	}
}