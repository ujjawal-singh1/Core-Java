class A{
    int a=50;
    }
    class B extends A//B is the child class of A
    {
    int b=a*a;
    }
    class C extends B //C is the child of B & grandchild of A
    {
    void display(){
    System.out.println("The value of a="+a);
    System.out.println("The value of b="+b);
    }
    }
    
    class test13{
    public static void main(String args[]){
    C ob =new C();//creating object of class C to //call the values of functions and variables from all parent class A&B
    ob.display();
    }
    }
    