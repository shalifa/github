class unv
{
 public static void main(String ar[])
 {
  String s1=new String("123456.898");
  int c=s1.indexOf('.');
  int a=0,b=0,i;
  int d=s1.length();
  for(i=0;i<c;i++)
  {
    a=a+1;
  }
  b=d-a-1;
 System.out.println("decimal before length"+a);
 System.out.println("Decimal after length"+b);
 }
}
  