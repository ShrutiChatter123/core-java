class FishRunner{

	public static void main(String[] args){
	
	System.out.println("Start FishRunner");
	
	double price = 100;
	Fish.sell(price);
	
	String[] ingredients= { "turmaric powder", "redchilli powder", "masala powder", "Garam Masala powder"};
	String fish = "pomfret";
	
	Fish.cook(fish, ingredients);
	
	Fish.die(2022,8,23);
	
	
	
	}




}