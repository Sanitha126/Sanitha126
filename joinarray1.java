class joinarray
{
public static void main(String args[])
{

ArrayList<Integer> a=new ArrayList<Integer>();
a.add(20);
a.add(80);
a.add(30);
ArrayList<Integer> b=new ArrayList<Integer>();
b.add(10);
b.add(60);
b.add(50);
System.out.println("first array :"+a);
System.out.println("second array :"+b);
a.addAll(b);
Collections.sort(a);
System.out.println("resultant array :"+a);
}
}
