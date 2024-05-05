package Homework;

import java.util.*;

public class ex5_Collections {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5);
            Integer duplicate = findDuplicate(numbers);

            if (duplicate != null) {
                System.out.println("Duplicate number found: " + duplicate);
            } else {
                System.out.println("No duplicate found.");
            }
        }

        public static Integer findDuplicate(List<Integer> numbers) {
            Set<Integer> seen = new HashSet<>();

            for (Integer num : numbers) {
                if (seen.contains(num)) {
                    return num;
                }
                seen.add(num);
            }

            return null;


    }
                }

