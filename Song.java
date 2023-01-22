class Song{
	 public static String name;
	 public static String singer;
	 public static String lang;
	 public static String duration;
	
	static void intivariable(String arg1,String arg2,String arg3,String arg4){
		
		name=arg1;
		singer=arg2;
		lang=arg3;
		duration=arg4;
		
	
	}
	
	static void display(){
		System.out.println("initialize start");
		
				System.out.println(name);
				System.out.println(singer);
				System.out.println(lang);
				System.out.println(duration);

		System.out.println("initializeend");
	
	}
	
	
	
	
	
	
	
}