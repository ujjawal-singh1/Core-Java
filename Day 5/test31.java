class Thread1 implements Runnable//step1
{
public void run()//step 4
{
for(int i=0;i<3;i++){
System.out.println("Thread1 is i="+i);
}
}
}
class Thread2 implements Runnable//step1
{
public void run()//step 4
{
for(int i=0;i<3;i++){
System.out.println("Thread2 is i="+i);
}
}
}
class Thread3 implements Runnable//step1
{
public void run()//step 4
{
for(int i=0;i<3;i++){
System.out.println("Thread3 is i="+i);
}
}
}

class Thread4{
public static void main(String args[]){
Thread1 ob1=new Thread1();
Thread2 ob2=new Thread2();
Thread3 ob3=new Thread3();
Thread t1=new Thread(ob1);//step 2
Thread t2=new Thread(ob2);
Thread t3=new Thread(ob3);
t1.start();//step3
t2.start();
t3.start();
for(int i=0;i<3;i++){
System.out.println("Thread main's i="+i);
}
}
}