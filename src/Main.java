// credit by ChatGpt
public class Main {
    public static void main(String[] args) {
        // Testing HashSet with integers
        testIntegerSet();

        // Testing HashSet with strings
        testStringSet();
    }

    private static void testIntegerSet() {
        HashSet<Integer> integerSet = new HashSet<>();

        // Adding elements
        System.out.println("Adding elements to integerSet:");
        System.out.println("Added 1: " + integerSet.add(1));
        System.out.println("Added 2: " + integerSet.add(2));
        System.out.println("Added 3: " + integerSet.add(3));
        System.out.println("Added 2 again: " + integerSet.add(2)); // Should return false

        // Displaying elements
        System.out.println("Elements in integerSet:");
        for (Integer element : integerSet) {
            System.out.println(element);
        }

        // Removing elements
        System.out.println("Removing element 2: " + integerSet.remove(2));
        System.out.println("Removing element 4: " + integerSet.remove(4)); // Should return false

        // Displaying elements after removal
        System.out.println("Elements in integerSet after removal:");
        for (Integer element : integerSet) {
            System.out.println(element);
        }

        // Size of the set
        System.out.println("Size of integerSet: " + integerSet.size());
    }

    private static void testStringSet() {
        HashSet<String> stringSet = new HashSet<>();

        // Adding elements
        System.out.println("\nAdding elements to stringSet:");
        System.out.println("Added 'apple': " + stringSet.add("apple"));
        System.out.println("Added 'banana': " + stringSet.add("banana"));
        System.out.println("Added 'orange': " + stringSet.add("orange"));
        System.out.println("Added 'banana' again: " + stringSet.add("banana")); // Should return false

        // Displaying elements
        System.out.println("Elements in stringSet:");
        for (String element : stringSet) {
            System.out.println(element);
        }

        // Removing elements
        System.out.println("Removing element 'banana': " + stringSet.remove("banana"));
        System.out.println("Removing element 'grape': " + stringSet.remove("grape")); // Should return false

        // Displaying elements after removal
        System.out.println("Elements in stringSet after removal:");
        for (String element : stringSet) {
            System.out.println(element);
        }

        // Size of the set
        System.out.println("Size of stringSet: " + stringSet.size());
    }
}