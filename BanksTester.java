class BanksTester{
	
	public static void main(String pk []){
		
		Banks.addBanksNames("RBI");
		Banks.addBanksNames("BOI");
		Banks.addBanksNames("HDFC");
		Banks.addBanksNames("Vijay Bank");
		Banks.addBanksNames("CBI");
		
		Banks.getBanksNames();
		System.out.println("End of the addBanksNames");
	}
}