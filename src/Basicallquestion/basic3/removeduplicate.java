package Basicallquestion.basic3;

import java.util.*;
public class removeduplicate {
    public static void removeDuplicates(ArrayList <Character> arrlist)
    {
          for(int i=0;i<arrlist.size();i++)
          {
              for(int j=i+1;j<arrlist.size();j++)
              {
                  if(arrlist.get(i).equals(arrlist.get(j)))
                  {
                      arrlist.remove(j);
                      j--;
                  }
              }
          }
    }
    public static void main(String args[])
    {
        ArrayList<Character> input = new ArrayList<Character>(Arrays.asList('d', 'c','a', 'b', 'b', 'c', 'c', 'c', 'd'));
        removeDuplicates(input);
        for(int i=0;i<input.size();i++)
        {
            System.out.print(input.get(i));
        }
    }
}
