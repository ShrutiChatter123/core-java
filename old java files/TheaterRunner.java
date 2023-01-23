class TheaterRunner{
	
	public static void main(String[]args){
		
	Theater.display();
	Theater.initvariable("kempegowda Theater",400.00f,"shankar Gowda","Bangalore","open air theater");
	Theater.display();
	
	
	System.out.println("Reinitialize main atart");
	Theater.initvariable("sudha Theater",320.00f,"ramayya","hubli","open air theater");
	Theater.display();

		System.out.println("Reintialize main end");
		
		
	

	}
	
	
}