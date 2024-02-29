class Test1{
    int a,b;//instance variable
    void input(){
    a=10;
    b=20;
    }
    void disp(){
    System.out.println("The values are "+a +" "+b);
    }
    }
public class Test2 {
    public static void main(String x[]){
        Test1 ob=new Test1();
        ob.input();
        ob.disp();
        }
}
    