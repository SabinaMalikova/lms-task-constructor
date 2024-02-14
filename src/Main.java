import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        MyClass myClass1= new MyClass("Sabina","Malikova",20);
        MyClass myClass2 = new MyClass(new String[]{"Java lessons", "Java sessions", "Soft skills"}, "rice with eggs");

        System.out.println("Name: "+myClass1.name+
                "\nLastname: "+myClass1.lastName+
                "\nAge: "+myClass1.age+
                "\nPeaksoft Lessons: "+ Arrays.toString(myClass2.lessons)+
                "\nMy favorite  food: "+myClass2.favoriteFood);
        //comment

    }
}