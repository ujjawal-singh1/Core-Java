class test1{
    int a,b,c;
    void input(){
    a=5;
    b=10;
    c=0;
    }
    void calculate(){
    c=a+b;
    }
    void display(){
    System.out.println("Sum is:-" + c);
    }
    }
    public class test3{
    public static void main(String x[]){
    test1 ob=new test1();
    ob.input();
    ob.calculate();
    ob.display();
    }
    }
    
