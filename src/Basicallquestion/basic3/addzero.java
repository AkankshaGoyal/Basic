package Basicallquestion.basic3;

import java.util.*;

public class addzero {
   public static void zerotostart(ArrayList <Integer> arrList)
   {
          ArrayList <Integer> newarr  = new ArrayList<Integer>();
          int index = 0;
          for(int i=0;i<arrList.size();i++)
          {
               if(arrList.get(i) == 0)
                   newarr.add(index++,arrList.get(i));
          }
          for(int i=0;i<arrList.size();i++)
          {
                if(arrList.get(i)!=0)
                {
                    newarr.add(index++,arrList.get(i));
                }
          }
          for(int j = 0;j< newarr.size();j++)
          {
              arrList.set(j, newarr.get(j));
          }
   }
   public static void main(String args[])
   {
       ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(5, 0, 20, 4, 0, 0, 9));
       zerotostart(input);
       for (int i = 0; i < input.size(); i++){
           System.out.print(input.get(i)+ "  ");
       }
   }

}
