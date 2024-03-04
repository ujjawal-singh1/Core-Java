class Thread1 implements Runnable//step1
{
public void run()//step 4
{
for(int i=0;i<10;i++){
System.out.println("Thread is i="+i);
}
}
}
class Thread2{
public static void main(String args[]){
Thread1 ob=new Thread1();
Thread t=new Thread(ob);//step 2
t.start();//step3
for(int i=0;i<10;i++){
System.out.println("Thread main's i="+i);
}
}
}