package Basicallquestion.basic3;

import java.util.Arrays;
import java.util.Scanner;
public class july2 {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("First string");
        String string1 = s.nextLine();
        System.out.print("Second String");
        String string2 = s.nextLine();
        if(string1.length()==string2.length())
        {
            char[] characterarray1 = string1.toCharArray();
            char[] characterarray2 = string2.toCharArray();
            Arrays.sort(characterarray1);
            Arrays.sort(characterarray2);
            boolean isanagram = Arrays.equals(characterarray1,characterarray2);
            System.out.println("Anagram"+isanagram);
        }
    }
}
