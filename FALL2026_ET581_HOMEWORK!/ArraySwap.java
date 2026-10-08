public class ArraySwap {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.print("Before: ");
        printArray(numbers);
        
        
        swap(numbers, 1, 3);
        
        System.out.print("After:  ");
        printArray(numbers);
    }
    
    
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j]; 
        array[j] = temp;     
    }
    
    
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
