class Test1{
    int a,b;
    Test1(int x,int y){//Parametrized constructor
    a=x;
    b=y;
    }
    void display(){
    System.out.println(a+" "+b);
    }
    }
    class test7{
    public static void main(String args[]){
    int x=16,y=32;
    Test1 ob=new Test1(x,y);//here constructor called autmatically
    ob.display();
    }
    }
    