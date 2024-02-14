public class MyClass {
    String name;
    String lastName;
    int age;
    String[] lessons;
    String favoriteFood;

    public MyClass (String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public MyClass (String[] lessons, String favoriteFood){
        this.lessons = lessons;
        this.favoriteFood = favoriteFood;
    }
}
