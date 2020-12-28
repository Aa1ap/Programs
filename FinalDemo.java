final class Abc {   \\ cant be inherited
	final int a = 50 ; \\ cant be modified
	public final void display(){ \\ cant be overridden
	System.out.println("final value is " + a) ;
}
}

class FinalDemo{

	public static void main(String args[]){
	Abc a1= new Abc();
	a1.display();
}
}