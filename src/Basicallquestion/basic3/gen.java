package Basicallquestion.basic3;

class Test <T> {
    T obj;
    Test(T obj)
    {
        this.obj = obj;
    }
    public T getObject()
    {
        return this.obj;
    }
}

public class gen {
    public static void main(String args[])
    {
        Test <Integer> obj1 = new Test<Integer>(5);
        System.out.println(obj1.getObject());
        Test <Double> obj2 = new Test<Double >(15.777775);
        System.out.println(obj2.getObject());
        Test<String> obj3 = new Test <String>("Yayy!That's my first generic class");
        System.out.println(obj3.getObject());
    }
}
