class CO{
    int a,b;
    CO(){
    a=20;
    b=40;
    }
    CO(int x,int y){
    a=x;
    b=y;
    }
    CO(int x){
    a=x;
    b=180;
    }
    void disp(){
    System.out.println("The values of a & b are:-"+a+" "+b);
    }
    }
    class test9{
    public static void main(String args[]){
    CO ob1 =new CO(50);
    CO ob2=new CO(50,80);
    CO ob3=new CO();
    ob1.disp();
    ob2.disp();
    ob3.disp();
    }
    }    