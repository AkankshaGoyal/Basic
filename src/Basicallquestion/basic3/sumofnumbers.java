package Basicallquestion.basic3;

public class sumofnumbers {
    public static void main(String args[])
    {
          int[] array = {4,3,8,7,5,2,6};
          int missingnumber = findmissing(array);
          System.out.println("Missing number"+ missingnumber);
    }
    public static int findmissing(int [] array)
    {
         int n = array.length+1;
         int sumofFirst = n*(n+1)/2;
         int actualsum = 0;
         for(int i=0;i<array.length;i++)
         {
               actualsum += array[i];
         }
         return sumofFirst-actualsum;
    }
}
