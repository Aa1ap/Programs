class Xyz{
	
	void disp(){
	System.out.print("This is disp 1") ;}
}
class Abc extends Xyz{
	void disp2(){
	System.out.print("This is disp 2") ;}
}
class Inheritancedemo
{
	public static void main(String args[]){
	Abc a1=new Abc() ;
	a1.disp();
	a1.disp2();
}
}
