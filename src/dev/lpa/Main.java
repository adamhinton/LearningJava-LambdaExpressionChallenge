package dev.lpa;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Jimbo", "BeepBeep", "anna", "bob", "hillbilly", "Squilliam", "DrBtthl", "Zack", "Sissy",
                "mindy"};
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