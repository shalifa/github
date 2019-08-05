class pri
{
 public static void main(String args[])
 {
  int i,count,j;
  System.out.print(1);
  for(i=2;i<=100;i++)
  {
   count=0;
   for(j=1;j<=i;j++)
   {
    if(i%j==0)
    {
     count=count+1;
    }
   }
   if(count==2)
   {
    System.out.print(i);
   }
  }
 }
}
