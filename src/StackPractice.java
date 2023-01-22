

import java.util.Stack;
public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(" "+stack.isEmpty());
        stack.push("Dheeru");
        stack.push("Batman");
        stack.push("aquaman");
        stack.push("flash");
        System.out.println("My stack is :" + stack);
        stack.pop();
        System.out.println("My stack is :" + stack);
        System.out.println("My stack is :" + stack.search("Dheeru"));


    }
}
