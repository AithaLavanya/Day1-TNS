package Day1.java;

public class marks {

	public static void main(String[] args) {
		int marks=80;
		if(marks>=90 && marks<=100) {
			System.out.println("A Grade");
		} 
		else if(marks<90 && marks>=70) {
			System.out.println("B Grade");
		}
		else if(marks<70 && marks>=60) {
			System.out.println("C Grade");
		}
		else{
			System.out.println("Fail");
		}
	}

}
