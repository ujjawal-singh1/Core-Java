import java.io.*;
class find{
int a,b;
void sum(int x,int y){
a=x+y;
}
void average(int x,int y){
b=(x+y)/2;
}
void display(){
System.out.println("Sum is:-"+a);
System.out.println("Average is:-"+b);
}
}
class soln{
public static void main(String args[])throws IOException{
DataInputStream ds=new DataInputStream(System.in);
System.out.println("Please Eneter 1st no.");
int x=Integer.parseInt(ds.readLine());
System.out.println("Please Enter 2nd number");
int y=Integer.parseInt(ds.readLine());
find ob=new find();
ob.sum(x,y);
ob.average(x,y);
ob.display();
}
}