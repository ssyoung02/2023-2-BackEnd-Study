public abstract class Animal {
    public abstract void speak();
}
class Cat extends Animal{
    public void speak(){
        System.out.println("cat says Meow!");
    }
}
class Dog extends Animal{
    public void speak(){
        System.out.println("dog says Woof!");
    }
}