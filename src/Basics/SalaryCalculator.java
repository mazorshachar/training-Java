package Basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String career;
		System.out.println("program is starting");
		career = "Softwere Developer";
		System.out.println("my career is :" + career);
		int HoursPerWeek=40;
		int WeeksPerYear=50;
		double Rate=42.5;
		
		double Salary=HoursPerWeek*WeeksPerYear*Rate;
		
		System.out.println("My Salary as a :  " + career + " at a rate of :" + Rate + " is : " + Salary);
	}
}
