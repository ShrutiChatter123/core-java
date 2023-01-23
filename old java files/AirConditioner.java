class AirConditioner{
	
	static void increasespeed(int speed){
		System.out.println("Start");
		if(speed==5)
		{
			System.out.println("Cannot increase more");		

		}
		System.out.println("End");
	}
	
	
	static void decreasespeed(int speed){
		System.out.println("Start");
		if(speed<=0 || speed>5){
			System.out.println("invalid speed");
		}
		System.out.println("End");
		
	}
		
	static void changeprogram(String program){
		System.out.println("start");
		if(program==null || program!="summer" || program!="winter" || program!="rain"){
			System.out.println("invalid");
		}
	}	
	static void increaseTemp(double temp){
			
			System.out.println("Start");
		if(temp>32){
			
			System.out.println("invalid temp");
		}
			System.out.println("End");
		
		}
	
	static void decreaseTemp(double temp){
		
		System.out.println("start");
		
		if(temp<0){
		
		System.out.println("invalid temp");
		
		}
		System.out.println("End");
		
	}
	
	}