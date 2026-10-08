public class StringBubbleSort {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "grape", "pear"};
        
        System.out.print("Before: ");
        printArray(words);
        
        // Sort the array
        bubbleSort(words);
        
        System.out.print("After:  ");
        printArray(words);
    }
    
    // Bubble sort algorithm for String arrays
    static void bubbleSort(String[] words) {
        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent words alphabetically
                if (words[j].compareTo(words[j + 1]) > 0) {
                    // Swap words[j] and words[j+1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }
    
    // Helper method to print the array
    static void printArray(String[] words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
