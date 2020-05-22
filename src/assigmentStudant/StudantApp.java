package assigmentStudant;

public class StudantApp {
	
	public static void main(String[] args) {
		student std1 = new student("Joe","123456789");
		student std2 = new student("Dan","159357894");
		student std3 = new student("Matt","147258369");
	}
}		
	class student {
		
			// Properties of student
		
		private String name;
		private String ssn;
		private String email;
		private String StudentID;
		private static int iD = 1000;
		static String EmailExt = "@uni.edu";
	
	
		// Constructor 
		public student (String name,String ssn ) {
			this.name = name;
			this.ssn = ssn;
			email = name+EmailExt;
			iD++;
			SetAccountNumber();
			System.out.println("New account created." + name + "  " + ssn + "\n Email address created : "+  email);
		
		}
		private void SetAccountNumber() {
			int random = (int) (Math.random() * 10000);
			StudentID = iD + "" + random + ssn.substring(5,9);

			System.out.println("\n" + StudentID);
		}
	}
	
		
	

