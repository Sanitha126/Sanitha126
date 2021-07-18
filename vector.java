class vector
{
public static void main(String args[])
{
Vector v=new Vector();
Scanner sc=new Scanner(System.in);
v.add(101);
v.add("Rama");
v.add(6.58);
v.add(102);
v.add("Gita");
v.add(8.98);
System.out.println("1."+v);
v.remove(4);
System.out.println("2."+v);
int m=v.indexOf(6.58);
v.set(m,9.17);
System.out.println("3."+v);
if(v.contains("sita"))
System.out.print("4.found");
else
System.out.println("4.false");

}
}
