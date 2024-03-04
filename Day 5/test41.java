class Test{
    public static void main(String args[]){
    String str=new String("This is really not immutable!!");
    boolean retval;
    retval=str.endsWith("immutable!!");
    System.out.println("returned value="+retval);
    retval=str.endsWith("immu");
    System.out.println("returned value="+retval);
    }
    }