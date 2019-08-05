class coprime
{
 public static void main(String ar[])
 {
  int a=2,b=7,r;
  r=a%b;
  while(r!=0)
  {
   a=b;
   b=r;
   r=a%b;
  }
  if(b==1)
  {
   System.out.print("coprime");
  }
  else
  {
   System.out.print("not");
  }
 }
}