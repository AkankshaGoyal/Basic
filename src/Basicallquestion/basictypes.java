package Basicallquestion;

public class basictypes {
    public static void main(String args[])
    {
          char[] charray = {
                  'a',
                  'b',
                  'c'
          };
          char[] chArray2 = new char[5];
          int index = 0;
          for(char i = 'v';i<='z';i++)
          {
              chArray2[index]= i;
              index++;
          }
          for(int i=0;i<charray.length;i++)
          {
                System.out.println(charray[i]);
          }
          for(int i=0;i<chArray2.length;i++)
          {
                System.out.println(chArray2[i]);
          }
    }
}
