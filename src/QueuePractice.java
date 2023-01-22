import java.util.*;
public class QueuePractice {

    public static void main(String[] args) {
        Queue<String> mqa = new LinkedList<String>();
        mqa.add("Dheeru1");
        mqa.add("Dheeru2");
        mqa.add("Dheeru3");
        mqa.add("Dheeru4");
        mqa.add("Dheeru5");
        mqa.add("Dheeru6");
        System.out.println("My QUeue is "+ mqa);
        mqa.remove();
        System.out.println("My QUeue is "+ mqa);
        System.out.println("My QUeue is element --"+ mqa.element());
        System.out.println("My QUeue is "+ mqa);
        System.out.println("My QUeue is peek --"+ mqa.peek());
        System.out.println("My QUeue is "+ mqa);
    }

}
