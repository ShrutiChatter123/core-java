class MovieRunner{
	public static void main(String[]args)
	{
		Movie.display();
		Movie.initvariable("Yajamana",5000000.00f,"Harikrishna","Darshan","Tanya hope",6);
		Movie.display();
		
		System.out.println("Reinitialize main start");
		Movie.initvariable("Kanthara",160000.00f,"Rishab Shetty","Rishab Shetty","Saptami Gowda",6);
		Movie.display();
		System.out.println("Reinitialize main end");
		
		
	}
	
}



