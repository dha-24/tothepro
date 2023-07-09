package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * If the input list is empty, an empty list is returned.
 * If the input list contains only one element, a singleton list containing that element is returned.
 * Otherwise, we use the stream method on the input list to iterate over each element.
 * For each element, we recursively call permutations on a sublist that excludes that element. This is done using the filter method to create a new list without the current element.
 * The resulting permutations for the sublist are then mapped to a new list by adding the current element at the beginning of each permutation.
 * Finally, all the permutations from different iterations are collected and returned as a single list using the collect method.
 */


/**
 * O(n!)
 */

public class Permutations {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3,4);
        List<List<Integer>> result = permutations(nums);
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }

    private static List<List<Integer>> permutations(List<Integer> nums) {
        if (nums.size() == 0) {
            return new ArrayList<>();
        } else if (nums.size() == 1) {
            return Arrays.asList(nums);
        } else {
            return nums.stream()
                    .flatMap(num -> permutations(nums.stream().filter(n -> !n.equals(num)).collect(Collectors.toList())).stream()
                            .map(perm -> {
                                List<Integer> permutation = new ArrayList<>();
                                permutation.add(num);
                                permutation.addAll(perm);
                                return permutation;
                            }))
                    .collect(Collectors.toList());
        }
    }
}
