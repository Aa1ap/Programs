class Abc{
	Abc(int x,int y){
	System.out.println("this is a paramertized const");
	System.out.println(x);
   	System.out.println(y);
	
}
}
class Pconstdemo{
	public static void main(String arg[]){
	Abc a1=new Abc(20,10);
}
}