class A{
    int a=10;
    }
    class B extends A
    {
    int a=20;
    void disp(){
    System.out.println(a);//20
    System.out.println(super.a);//10
    }
    }
    class test15{
    public static void main(String ab[]){
    B ob =new B();
    ob.disp();
    }
    }
    