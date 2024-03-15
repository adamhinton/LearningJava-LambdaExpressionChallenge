package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Jimbo", "BeepBeep", "anna", "bob", "hillbilly", "Squilliam", "DrBtthl", "Zack", "Sissy",
                "mindy"};

        System.out.println(Arrays.toString(names));

        System.out.println("1. Set all to upper case");
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        System.out.println("-".repeat(30));
        System.out.println("2. Add random middle initial, including period");
        Arrays.setAll(names, i -> {
            int firstUpperCaseIndex = (int) 'A';
            Random r = new Random();
            int letterIndex = r.nextInt(26);
            String nameWIthMidInitial = names[i] + " " + (char) (firstUpperCaseIndex + letterIndex) + ".";
            return nameWIthMidInitial;
        });
        System.out.println(Arrays.toString(names));


        System.out.println("-".repeat(30));
        System.out.println("3. Add last name that's reverse of first name");

        Arrays.setAll(names, i ->{
            String firstName = names[i].split(" ")[0];
            String newLastName = new StringBuilder(firstName).reverse().toString();
            return names[i] + " " + newLastName;
        });
        System.out.println(Arrays.toString(names));


        System.out.println("-".repeat(30));
        System.out.println("4. Remove any names where first name equals lastName");

        List<String> namesList = new ArrayList<>(Arrays.asList(names));
        namesList.removeIf(name ->{
            String[] namesSplit = name.split(" ");
            String firstName = namesSplit[0];
            String lastName = namesSplit[namesSplit.length -1];
//            System.out.printf("First last: %s %s", firstName, lastName);

            return firstName.equalsIgnoreCase(lastName);
        });

        System.out.println(namesList);

    }
}


// Make String[] with first names in mixed case
    // At least one palindrome name (Bob, Anna)
// Use Arrays.setAll or List.replaceAll to change vals in array
// If you use List methods you'll need a list backed by the array, so that changes get made to the initial array
    // In other words, don't make copy of the array

// Do the following using one of the above two methods, with appropriate lambdas:
    // Transofmr names to all uppercase
    // Add randomly generated middle initial, including period
    // Add last name that is reverse of first name
    // Print array or its elements, using forEach, at least once
    // create a new modifiable Arraylist from this array, removing any names where the last name equals the first name.
        // Use removeIf with lambda

// NOTES:
// Can make helper methods