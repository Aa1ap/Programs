interface RBI{

	void loan();
	
}
class SBI implements RBI{
	public void loan(){
	System.out.println("SBI Class") ;
}
}
class interfacedemo{
	public static void main(String args[]){
		System.out.println("== this is interfacedemo==");
		RBI s1=new SBI();
		s1.loan();

}
}