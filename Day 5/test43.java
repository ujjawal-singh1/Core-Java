class Test{
    public static void main(String args[]){
    String str1="Strings are immutable";
    String str2=new String("Strings are immutable");
    String str3=new String("Integers are not immutable");
    boolean result=str1.equals(str2);
    System.out.println(result);
    result=str2.equals(str3);
    System.out.println(result);
    }
    }