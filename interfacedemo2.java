interface  RBI{
    int a=9;
    void loan();
    public default void display(){
}
    static void print(){
    System.out.println("sbi provoies loan for 8%");
}
}
interface RBI2{
    void loanrecover();
}
class SBI implements RBI,RBI2{
    public void loan(){
    System.out.println("sbi provoies loan for 8%");
    }
    public void loanrecover(){
    System.out.println("sbi recovers loan");
    }
}
class interfacedemo2{
                public static void main (String args[]){
            System.out.println("-------interfacedemo-----");
        SBI s= new SBI();
        s.loan();
        RBI.print();
}
}