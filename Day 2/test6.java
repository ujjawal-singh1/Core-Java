class Constructor1{
    int a,b;
    Constructor1(){//constructor
    a=10;
    b=20;
    }
    void display(){
    System.out.println(a+" "+b);
    }
    }
    class test6{
    public static void main(String args[]){
    Constructor1 ob=new Constructor1();//here constructor called autmatically
    ob.display();
    }
    }
    