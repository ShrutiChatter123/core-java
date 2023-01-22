class Movie{
	
	static String name;
	static float budget;
	static String director;
	static String hero;
	static String heroine;
	static int noOfSong;
	
static void initvariable(String arg1,float arg2,String arg3,String arg4,String arg5,int arg6){
	
	
	name=arg1;
	budget=arg2;
	director=arg3;
	hero=arg4;
	heroine=arg5;
	noOfSong=arg6;
	
	
	}
	static void display(){
		System.out.println("initialize start");
		
		System.out.println(name);
		System.out.println(budget);
		System.out.println(director);
		System.out.println(hero);
		System.out.println(heroine);
		System.out.println(noOfSong);
		
		System.out.println("initialize end");
	}
	

}