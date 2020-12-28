abstract class RBI{

	abstract void loan();
}
class SBI extends RBI{
	void loan(){
	System.out.println("SBI Provides load with 5% interest" ) ;
}
}
class HDFC extends RBI{
	void loan(){
	System.out.println("HDFC Provides load with 5% interest" ) ;
}
}
class YESBANK extends RBI{
	void loan(){
	System.out.println("YESBANK Provides load with 5% interest" ) ;
}
}
class Abstractdemo
{
	public static void main(String args[]){
	System.out.println("===abstraction demo====");
	SBI s1=new SBI();
	s1.loan();
	RBI h1=new HDFC(); //dynamic binding
	h1.loan();
	YESBANK y1=new YESBANK();
	y1.loan();
}
}