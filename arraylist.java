import java.util.*;
class arraylist
{
public static void main(String args[])
{
ArrayList<Integer> a=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
System.out.print("enter size of elements: ");
int n=sc.nextInt();
System.out.println("enter elements ");
for(int i=0;i<n;i++)
a.add(sc.nextInt());
System.out.println(a);
System.out.println("enter element to modify: ");
int x=sc.nextInt();
if(a.contains(x))
{
int b=a.indexOf(x);
System.out.println("enter element to replace: ");
int c=sc.nextInt();
a.set(b,c);
System.out.print(a);
}
else
System.out.print("false");
}
}
