class Singer{


	static String name;
	static String language;
	static int noOfSongs;
	static int noOfAwards;
	static String location;
	
	
	static void initVariable(String arg1, String arg2, int arg3, int arg4, String arg5){
		
		name =  arg1;
		language = arg2 ;
		noOfSongs = arg3;
		noOfAwards = arg4;
		location = arg5;
	}
	
	static void display(){
		System.out.println("initialize start");
		System.out.println(name);
		System.out.println(language);
		System.out.println(noOfSongs);
		System.out.println(noOfAwards);
		System.out.println(location);
		
		System.out.println("initialize end");
	}












}