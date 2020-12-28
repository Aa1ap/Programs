class StringDemo{
	public static void main(String args[]){
	String s1="Yellow";
	System.out.println(s1);
	String s2=new String("Yellow");
	System.out.println(s2);
	s1=s1.concat("Color");
	s2=s2.toUpperCase();
	System.out.println(s1);
	System.out.println(s2);
	StringBuffer s3=new StringBuffer("Red");
	s3.append(" Color");
	System.out.println(s3);
	System.out.println("length of s3 is "+s3.length());
	System.out.println(s3.toString().toUpperCase());
	System.out.println("String s2 and s3 is equal = "+s2.equals(s3));
	System.out.println(s3.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.hashCode());

	}
}