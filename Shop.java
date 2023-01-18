class Shop{
	
static void buy(String item,double price,String brand)
  	{
	System.out.println("Execution start");	
		
	
	if(price>1000)
	{
		System.out.println("costly");
	}
	else if(price<1000 & price>500)
	{
		System.out.println("expensive");
	}
	
	else if(price<500)
	{
		
		System.out.println("ok");
	}
	
	System.out.println("Execution end");
    }
static void exchange(String item,String brand)
{
	System.out.println("Execution starts");
	System.out.println("item:"+item);
	System.out.println("brand:"+brand);
	System.out.println("Execution end");
	
}

}
