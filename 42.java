class wrap1
{
 public static void main(String ar[])
 {
  int a;
  a=10;
  Integer ob =a;//from jdk5;
  Integer b=Integer.valueOf(a);//before jdk5
  System.out.println(a);
  System.out.println(ob);
  System.out.println(b);
 }
}