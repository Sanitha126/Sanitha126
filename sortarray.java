import java.util.*;
class sortarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int j=1;
for(int i=0;i<n;i+=2)
{
if(a[i]%2==0)
{
while(a[j]%2==0)
j+=2;
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}System.out.print("output :");
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}
