# tothepro
DSA learnings in JAVA

---

## 1. Recursion

_For loop vs Recursion_
1. Control flow: In a for loop, the control flow is explicit
   1. recursion involves the function calling itself, which leads to a recursive chain of function calls.
3. Problem decomposition:
   1. In a for loop, you typically break down a problem into smaller steps
   2. With recursion, the problem is decomposed by reducing it to a smaller instance of the same problem


_Use cases_

* Recursion is well-suited, If the problem can be naturally broken down into smaller, similar subproblems, recursion can provide an elegant solutio
  * Examples include tree traversals, graph traversals, and problems with recursive mathematical definitions
* Backtracking where you explore all possible paths to find a solution
  * such as generating permutations
* Divide and conquer: 
  * Common examples include sorting algorithms like merge sort and quicksort.
* Recursive data structures:
  * making the code more intuitive and concise

_where using recursion may not be the best choice:_
 * Performance-sensitive scenarios:
 * Limited stack space
 * Simplicity and readability


   **Stack Space**

* Stack space, also known as the call stack or stack memory, is a region of memory used by a program to store information about function calls, local variables, and other execution context during runtime. It is a specialized data structure that follows a Last-In-First-Out (LIFO) order.


* Managing the stack space is the responsibility of the operating system and the programming language runtime.


**Get Stack trace in Java**

```public class StackSpaceChecker {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int stackDepth = stackTrace.length;

        System.out.println("Stack depth: " + stackDepth);
    }
}
```
