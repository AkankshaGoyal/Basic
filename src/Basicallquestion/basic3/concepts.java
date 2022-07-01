package Basicallquestion.basic3;

class Student
{
      public String name;
      public int age;
      public void setAge(int a)
      {
            age = a;
      }
}

class UnderGrad extends Student
{
      public UnderGrad()
      {
            this.age = 10;
            this.name = "John Doe";
      }
      public void set_age(int a)
      {
          if(a < 50)
          {
              age = 0;
          }
          else
          {
               super.setAge(a);
          }
      }
}




public class concepts {
      public static void main(String args[])
      {
               UnderGrad one = new UnderGrad();
               System.out.println("Age without any method called, only constructor: " + one.age);
               one.set_age(50);
               System.out.println("Age after setting"+one.age);
               one.setAge(10);
               System.out.println("Age after setage"+ one.age);
      }
}
