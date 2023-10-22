package test.pack;

import com.medusa.example.*;

public class ClassB {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca.name = "Johriel";
        ClassC cc = new ClassC();
        System.out.println("hello "+ ca.name);
        System.out.println("your age is "+cc.age);
        new ClassC();
    }
}
