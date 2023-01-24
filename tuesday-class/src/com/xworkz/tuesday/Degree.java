package com.xworkz.tuesday;

public class Degree {

	public static String studentName(String name) {
		System.out.println("Name = " + name);
		if (name == "Shruti") {
			String degree = "B.E";
			return degree;
		}

		if (name == "Rakesh") {
			String degree = "Diploma";
			return degree;
		}
		if (name == "Annesh") {
			String degree = "B.Sc";
			return degree;
		}

		if (name == "Manjunath") {
			String degree = "M.Tech";
			return degree;
		}

		if (name == "Daneshwari") {
			String degree = "Diploma";
			return degree;
		}

		if (name == "Laxmi") {
			String degree = "B.Tech";
			return degree;
		}

		if (name == "Kavya") {
			String degree = "B.E";
			return degree;
		}

		if (name == "Akshata") {
			String degree = "B.E";
			return degree;
		}

		if (name == "Suhas") {
			String degree = "SSLC";
			return degree;
		}

		if (name == "Shashank") {
			String degree = "B.E";
			return degree;
		}

		if (name == "Muddanna") {
			String degree = "Diploma";
			return degree;
		}

		if (name == "Rupesh") {
			String degree = "B.A";
			return degree;
		}

		if (name == "Janaki") {
			String degree = "M.A";
			return degree;
		}

		if (name == "Farhan") {
			String degree = "Diploma";
			return degree;
		}
		
		if (name == "Rajesh") {
			String degree = "Diploma";
			return degree;
		}
		
		if (name == "Vinod") {
			String degree = "B.Tech";
			return degree;
		}
		
		if (name == "Abhishek") {
			String degree = "B.E in Civil Engineering";
			return degree;
		}
		
		if (name == "Manjula") {
			String degree = "B.E in Civil Engineering";
			return degree;
		}
		
		if (name == "Sharada") {
			String degree = "B.E in Mechanical Engineering";
			return degree;
		}
		
		if (name == "Navneeta") {
			String degree = "B.E in Mechanical Engineering";
			return degree;
		}
		System.out.println("Name is not found....");
		return null;
	}

	public static void main(String[] args) {
		String ref = Degree.studentName("Shruti");
		System.out.println("Degree is " + ref);
		
		String reff = Degree.studentName("Manjunath");
		System.out.println("Degree is " + reff);
		
		String ref1 = Degree.studentName("Manjula");
		System.out.println("Degree is " + ref1);
	}
}
