	class AirConditionerRunner{

	public static void main(String[] args){
	
	System.out.println("Running start");
	
	int speedseq=5;
	AirConditioner.increasespeed(speedseq);
	int speedseq1=7;
	AirConditioner.decreasespeed(speedseq1);
	String programseq="summer";
	AirConditioner.changeprogram(programseq);
	double tempseq=40;
	AirConditioner.decreaseTemp(tempseq);
	double tempseq1=-0.5;
	AirConditioner.decreaseTemp(tempseq1);
	
	System.out.println("Running end");
	
	}

}