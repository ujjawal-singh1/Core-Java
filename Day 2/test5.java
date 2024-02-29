class test1{
    int a,b,c;
    void input(int x,int y){
    a=x;
    b=y;
    c=0;
    }
    void calculate(){
    c=a+b;
    }
    void display(){
    System.out.println("Sum is:-" + c);
    }
    }
    class test5{
    public static void main(String x[]){
    test1 ob=new test1();
    test1 ob1=new test1();
    ob.input(5,10);
    ob.calculate();
    ob.display();
    ob1.input(51,10);
    ob1.calculate();
    ob1.display();
    }
    }
    