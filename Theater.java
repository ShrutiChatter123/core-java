class Theater{
	
	static String name;
	static float ticketPrice;
	static String ownerName;
	static String location;
	static String type;
	
	static void initvariable(String arg1,float arg2,String arg3,String arg4,String arg5){
		
		name=arg1;
		ticketPrice=arg2;
		ownerName=arg3;
		location=arg4;
		type=arg5;
		
	}
	
	static void display(){
		System.out.println("initialize start");
		
		System.out.println(name);
	    System.out.println(ticketPrice);
		System.out.println(ownerName);
		System.out.println(location);
		System.out.println(type);
	
		System.out.println("initialize end ");
	
	}
	
}




