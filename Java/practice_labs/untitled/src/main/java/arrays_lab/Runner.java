package arrays_lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        //        SCOTTISH ISLANDS
        ArrayList<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

        scottishIslands.add("Coll");

        scottishIslands.add(0, "Tiree");

        scottishIslands.add(2,"Islay");

        System.out.println(scottishIslands.indexOf("Skye"));

        scottishIslands.remove("Tresco");

        scottishIslands.remove(5);

        System.out.println(scottishIslands.size());

        java.util.Collections.sort(scottishIslands);

        for (int i = 0; i < scottishIslands.size(); i++) {
            System.out.println("i am visiting " + scottishIslands.get(i));
        }


//        1. Add "Coll" to the end of the list
//        2. Add "Tiree" to the start of the list
//        3. Add "Islay" after "Jura" and before "Mull"
//        4. Print out the index position of "Skye"
//        5. Remove "Tresco" from the list by name
//        6. Remove "Arran" from the list by index
//        7. Print the number of islands in your arraylist
//        8. Sort the list alphabetically
//        9. Print out all the islands using a for loop

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        //1.
        for (int ii : numbers) {
            if (ii % 2 == 0)
                System.out.println("numbers: " + ii);
        }

        //2.
        java.util.Collections.sort(numbers);
        System.out.println(numbers.get(10) -+ numbers.get(0));

        //3.
        boolean isOne = numbers.get()

//        1. Print out a list of the even integers
//        2. Print the difference between the largest and smallest value
//        3. Print true if the list contains a 1 next to a 1 somewhere
//        4. Print the sum of the numbers
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.
    }
}
