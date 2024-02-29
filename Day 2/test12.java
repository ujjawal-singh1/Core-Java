class A{
    int i=10;
    }
    class B extends A//inheriting parent class
    {
    void disp(){
    System.out.println(i);
    }
    }
    class test12{
    public static void main(String a[]){
    B ob=new B();
    ob.disp();
    }
    }
    