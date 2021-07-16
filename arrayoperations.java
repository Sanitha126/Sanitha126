class arrayoperations
{
public static void main(String args[])
{
ArrayList<Integer> a=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("enter test cases");
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
System.out.println("enter choice from 1 to 5");
int q=sc.nextInt();
switch(q)
{
case 1:System.out.print("enter element ");
       int x=sc.nextInt();
       a.add(x);
       System.out.println(a);
       break;
case 2:Collections.sort(a);
       System.out.println("array after sorting "+a);
       break;
case 3:Collections.reverse(a);
       System.out.println("reverse of array "+a);
       break;
case 4:System.out.println("size of array "+a.size());
       break;
case 5:Collections.sort(a,Collections.reverseOrder());
       System.out.println("array in descending order "+a);
       break;
default :System.out.print("invalid input");
}
}
}
}
