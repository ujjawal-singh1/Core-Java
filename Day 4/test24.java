class Throweg{
    void check(String s1){
    char ch;
    ch=s1.charAt(0);
    if(ch=='A'){
    System.out.println("valid ID");
    }
    else{
    try{
    throw new ArithmeticException();
    //generating an exception
    }
    catch(ArithmeticException e){
    System.out.println(e);
    }
    }
    }
    }
    class TCT{
    public static void main(String args[]){
    Throweg ob=new Throweg();
    ob.check(" ");
    }
    }
    