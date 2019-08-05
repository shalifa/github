class sow
{
 public static void main(String ar[])
 {
  int i,small,temp,j;
  int a[]={2,5,4,7,8,1};
  System.out.println("array is");
  for(i=0;i<a.length;i++)
  {
   System.out.print(a[i]);
  }
  for(i=0;i<a.length;i++)
   {
    for(j=i+1;j<a.length;j++)
     {
      if(a[i]>a[j])
       {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
       }
      }
     }
  System.out.println("sorted array");
  for(i=0;i<a.length;i++)
  {
    System.out.print(a[i]);
   }
 }
}
        
  