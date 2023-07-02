package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 The objective of the puzzle is to move the entire stack of disks from one rod to another, while following these rules:

       1. Only one disk can be moved at a time.
       2. Each move consists of taking the top disk from one of the rods and placing it on top of another rod.
       3. No disk may be placed on top of a smaller disk.

 The puzzle starts with all the disks stacked in ascending order of size on one rod,
 with the largest disk at the bottom and the smallest at the top.
 The goal is to move the entire stack to another rod, using the remaining rod as an auxiliary rod.

 *
 */
public class TowerOfHanoi {

    List a = new ArrayList<String>();
    // A --> Source
    // B --> Aux
    // C --> Target

    static void toh(int n, char from_rod, char to_rod, char aux_rod){
        if(n == 1){
            System.out.println("Moving Disk 1 from: "+from_rod+" to rod :" + to_rod);
            return;
        }
        toh(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Moving Disk: "+n+" from rod "+ from_rod+" to rod :"+ to_rod);
        toh(n-1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
    int n = 3;
    toh(n, 'A', 'B', 'C');
    }
}
