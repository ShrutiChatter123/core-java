class SingerRunner{

	public static void main(String[] args){
	
		Singer.initVariable("S P Balasubramanya", "Kannada", 1500, 60, "Bengaluru");
		Singer.display();
	
	
		System.out.println("Reinitialize main String");
	
		Singer.initVariable("Sanjith Hegde", "Kannada", 25, 5, "Bengaluru");
		Singer.display();
	
	
	}





}