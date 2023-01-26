package com.xworkz.tuesday.polymorphism;

public class Box {
	
public static void store(int money) {
	System.out.println("Storing the money " + money);
}

public static void store(String bangle) {
	System.out.println("Storing the bangle " + bangle);
}

public static void store(String powder,String cream) {
	System.out.println("Storing the powder " + powder + " and cream " + cream);
}

public static void storee(String charger,String mobile) {
	System.out.println("Storing the charger " + charger +  " and mobile " + mobile);
}

public static void store(int money,String pendrive,String card) {
	System.out.println("Storing the money " + money + " and pendrive " + pendrive + " and card " + card);
}

}



