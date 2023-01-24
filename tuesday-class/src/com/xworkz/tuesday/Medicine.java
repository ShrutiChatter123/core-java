package com.xworkz.tuesday;

public class Medicine {

	public static double medicine(String nameOfMedicine) {
		System.out.println("Medicine = " + nameOfMedicine);
		if(nameOfMedicine == "Dolo 650") {
			double price = 12.26;
			return price;
		}
		
		if(nameOfMedicine == "Paracetmol") {
			double price = 10.26;
			return price;
		}
		
		if(nameOfMedicine == "vicks") {
			double price = 15.20;
			return price;
		}
		
		if(nameOfMedicine == "Cetaphil") {
			double price = 480;
			return price;
		}
		
		if(nameOfMedicine == "cough syrup") {
			double price = 85;
			return price;
		}
		
		if(nameOfMedicine == "Antibiotics") {
			double price = 20;
			return price;
		}
		
		if(nameOfMedicine == "Gabapentin") {
			double price = 55.67;
			return price;
		}
		
		if(nameOfMedicine == "onaprazole") {
			double price = 334;
			return price;
		}
		
		if(nameOfMedicine == "Albuterol") {
			double price = 321.43;
			return price;
		}
		
		if(nameOfMedicine == "Metformin") {
			double price = 65.99;
			return price;
		}
		
		if(nameOfMedicine == "A to Z") {
			double price = 76.87;
			return price;
		}
		
		if(nameOfMedicine == "Adderall") {
			double price = 66;
			return price;
		}
		
		if(nameOfMedicine == "Atorvastatin") {
			double price = 543;
			return price;
		}
		
		if(nameOfMedicine == "Ricol") {
			double price = 77;
			return price;
		}
		
		if(nameOfMedicine == "Paracetamol") {
			double price = 14.66;
			return price;
		}
		
		
		
		System.out.println("Medicine not found... Please visit another store");
		return -500;
	}
	
	public static void main(String[] args) {
		double ref1 = Medicine.medicine("Dolo 650");
		System.out.println("Price is "+ ref1);
		
		double ref2 = Medicine.medicine("Paracetmol");
		System.out.println("Price is "+ ref2);
		
		
		double ref3 = Medicine.medicine("Vicks");
		System.out.println("Price is "+ ref3);
		
		double ref4 = Medicine.medicine("Cetaphil");
		System.out.println("Price is "+ ref4);
		
		double ref5 = Medicine.medicine("Cough syrup");
		System.out.println("Price is "+ ref5);
		
		double ref6 = Medicine.medicine("Gabapentin");
		System.out.println("Price is "+ ref6);
		
		double ref7 = Medicine.medicine("Onaprazole");
		System.out.println("Price is "+ ref7);
		
		double ref8 = Medicine.medicine("Albuterol");
		System.out.println("Price is "+ ref8);
		
		double ref9 = Medicine.medicine("A to z");
		System.out.println("Price is "+ ref9);
		
		double ref10 = Medicine.medicine("Adderall");
		System.out.println("Price is "+ ref10);
		
		double ref11 = Medicine.medicine("Atorvastatin");
		System.out.println("Price is "+ ref11);
		
		double ref12 = Medicine.medicine("Ricol");
		System.out.println("Price is "+ ref12);
		
		double ref13 = Medicine.medicine("Paracetamol");
		System.out.println("Price is "+ ref13);
		
		double ref14 = Medicine.medicine("Histack 150");
		System.out.println("Price is "+ ref14);
		
		double ref15 = Medicine.medicine("Antibiotics");
		System.out.println("Price is "+ ref15);
		

	}
	
	
}









