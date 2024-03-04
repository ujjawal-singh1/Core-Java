//Example of run time
//polymorphism done by method
//overriding(DMD)
class parent{
    void display(){
    System.out.println("This is parent class method");
    }
    }
    class Child1 extends parent{
    void display(){
    System.out.println("This is the Child1 class method");
    }
    }
    class Child2 extends parent{
    void display(){
    System.out.println("This is Child2 class method");
    }
    }
    class DMD{
    public static void main(String args[]){
    parent p=new parent();
    p.display();
    Child1 ob1=new Child1();
    Child2 ob2=new Child2();
    ob1.display();
    ob2.display();
    p=ob1;//the object child1 has been referred
    //By parents reference variable p
    p.display();
    p=ob2;//the object child has been referred
    //by parent refernce variable P
    p.display();
    }
    }    