package Basicallquestion.basic3;

import java.util.ArrayList;

public class arraylist {
         public static void main(String args[])
         {
             ArrayList <String> emails = new ArrayList<String>();
             emails.add("user1@abc.com");
             emails.add("user3@abc.com");
             System.out.println(emails.get(0));
             System.out.println(emails.get(1));
             System.out.println(emails.size());
             emails.add(1,"user2@abc.com");
             System.out.println(emails.get(0));
             System.out.println(emails.get(1));
             System.out.println(emails.get(2));
             System.out.print(emails.size());
         }
}
