class Animal
{
    String color;
    int noofLegs;
    Animal()    //written just to remove error
    {

    }

    Animal(int k)
    {
        noofLegs=k;
    }

    boolean eat(int input)
    {
        if (input == 1)
            return true;
        else
            return false;
    }
}
class Dog extends Animal
{
    Dog()
    {
        Animal a=new Animal(4);
        if( a.eat(1) )
            System.out.println("Your dog is eating. Your dog has "+a.noofLegs+" legs.");        //a.noofLegs is needed here instead of noofLegs because we are calling paramiterised  in default
        else
            System.out.println("Your dog is eating. Your dog has "+a.noofLegs+" legs.");
    }
}

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
    }
}
