package org.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Clara", "Dara", "Efsdfsd", "Birsan", "Blabla");


        // filter + map
        List<String> result = names.stream()
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);

        List<Integer> numbers = Arrays.asList(2, 5, 8, 10, 3, 7);

        int sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        //map
        List<String> employees = Arrays.asList("Ionut", "birsan");
        List<String> names2 = employees.stream()
                .map(e -> e.toUpperCase())
                .toList();
        System.out.println(names2);

        //flat map
        List<List<Integer>> nested = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        List<Integer> flat = nested.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flat);

        // soarted
        List<Integer> nums = List.of(1,2,5,3,6);
        List<Integer> soarted = nums.stream()
                .sorted()
                .toList();

        System.out.println(soarted);


        List<Integer> nums2 = List.of(2, 4, 6);
        boolean anyEven = nums.stream().anyMatch(n -> n % 2 == 0);

    }


}
