package superkey;

public class Main extends Demo {
	int num=100;
	Main(){
		super();
		System.out.println("Child Constructor");
	}
	void show() {
		System.out.println("Child Variable: " + num);
		System.out.println("Parent Variable: " + super.num);
		super.display();
		
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.show();
		 
	}

}
