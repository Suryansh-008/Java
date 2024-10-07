package Stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> Animals= new Stack<>();

        Animals.push("lion");
        Animals.push("cat");
        Animals.push("Dog");
        Animals.push("Horse");

        System.out.println(Animals);

        System.out.println(Animals.peek());

        Animals.pop();
        System.out.println(Animals);

        System.out.println(Animals.peek());
    }
}
