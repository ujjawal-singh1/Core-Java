class thread_eg{
    public static void main(String args[]){
    Thread ob=new Thread();
    ob.currentThread();
    System.out.println(ob);
    ob.setName("Ujjawal");
    ob.setPriority(10);
    System.out.println(ob);
    }
    }