package Basicallquestion.basic3;


class Pet
{
    private static int newID;
    private int  petID;
    private String petType;
    private String petName;
    private int petAge;

    public Pet(String type,String name,int age)
    {
        petType = type;
        petID =  newID;
        petName = name;
        petAge =  age;
        newID = newID + 1;
    }
    public void printpetdetails()
    {
        System.out.println("Pet ID: " + petID);
        System.out.println("Pet Type: " + petType);
        System.out.println("Pet Name: " + petName);
        System.out.println("Pet Age: " + petAge);
    }


}



public class program1 {
    public static void main(String args[])
    {
        Pet  mydog = new Pet("dog","Ruffy",3);
        mydog.printpetdetails();
        Pet newcat = new Pet("Cat","Princess",2);
        newcat.printpetdetails();
    }
}
