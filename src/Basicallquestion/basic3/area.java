package Basicallquestion.basic3;

class rightAngleTrainge
{
      private double length;
      private  double height;
      private int ans;

      public rightAngleTrainge(int l,int h)
      {
           length = l;
           height = h;
      }
      public double ans()
      {
          return length * height/2.0;

      }
}




public class area{
    public static double test(rightAngleTrainge rt) {
        return rt.ans();
    }
    public static void main(String args[])
    {
        rightAngleTrainge  obj =  new rightAngleTrainge(30,50);
        System.out.print(test(obj));

    }
}