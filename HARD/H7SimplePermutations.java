public class H7SimplePermutations 
{
    // Function to print the array
    public static void printArray(int[] array) 
    {
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Function to swap two elements in the array
    public static void swap(int[] array, int i, int j) 
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // Recursive function to generate permutations
    public static void generatePermutations(int[] array, int start) 
    {
        if (start == array.length) 
        {
            printArray(array);
            return;
        }
        for (int i = start; i < array.length; i++) 
        {
            swap(array, i, start); // Swap current element with the start element
            generatePermutations(array, start + 1); // Recurse for the next element
            swap(array, i, start); // Swap back to restore the original array
        }
    }
    public static void main(String[] args) 
    {
        int[] array = {1, 4, 3};
        generatePermutations(array, 0);
    }
}
