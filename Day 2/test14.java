class A{
    int a=50;
    int b=100;
    }
    class B extends A//B is the child class of A
    {
    int c=a*b;
    void display1(){
    System.out.println("The value of c="+c);
    }
    }
    class C extends A //C is the child of A
    {
    int d=b/a;
    void display2(){
    System.out.println("The value of d="+d);
    }
    }
    
    class test14{
    public static void main(String args[]){
    C ob1 =new C();
    B ob2=new B();
    ob1.display2();
    ob2.display1();
    }
    }
    