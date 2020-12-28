public class pg{
	
	public static void main(String args[]){
	A obj=new A();
	B obj1=new B();
	C obj2=new C();
	System.out.println("this is instance value of a="+obj.a);
	obj.display();
	obj1.dis();
	obj2.dis2();
	

	}
}
class A{
	int a=50;
	void display(){
		int a=80;
		System.out.println("this is local value of a="+a);
}

}
class B{
	void dis(){
		int b=60 ;
		System.out.println("this is local value of b="+b);
}

}
class C{
	void dis2(){
		int C=100 ;
		System.out.println("this is local value of C="+C);
}

}

