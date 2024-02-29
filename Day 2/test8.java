class fun_overload{
    void disp(){
    System.out.println("No arguments");
    }
    void disp(int x){
    System.out.println(x);
    }
    void disp(int x,int y){
    System.out.println(x+" "+y);
    }
    }
    class test8{
    public static void main(String args[]){
    fun_overload ob=new fun_overload();
    ob.disp(50,60);
    ob.disp();
    ob.disp(67);
    }
    }
    