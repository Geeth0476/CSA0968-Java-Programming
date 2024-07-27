import java.util.*;

class H17Soldiers {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // Input number of rows and columns
        System.out.println("Enter number of rows:");
        int row = a.nextInt();
        System.out.println("Enter number of columns:");
        int col = a.nextInt();

        // Initialize the 2D array and the count array
        int[][] arr = new int[row][col];
        int[] rowCounts = new int[row];

        // Input array elements and count number of 1s in each row
        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < col; j++) {
                arr[i][j] = a.nextInt();
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            rowCounts[i] = count;
        }

        // Sort the rowCounts array
        int[] sortedCounts = Arrays.copyOf(rowCounts, row);
        Arrays.sort(sortedCounts);

        // Input number of least element indices to display
        System.out.println("Enter the number of least element indices you want:");
        int indexCount = a.nextInt();

        // Find indices of rows with the least number of 1s
        Set<Integer> leastIndices = new LinkedHashSet<>();
        for (int i = 0; i < sortedCounts.length; i++) {
            if (leastIndices.size() >= indexCount) break;
            int count = sortedCounts[i];
            for (int j = 0; j < row; j++) {
                if (rowCounts[j] == count) {
                    leastIndices.add(j);
                    if (leastIndices.size() >= indexCount) break;
                }
            }
        }

        // Print the indices
        for (int index : leastIndices) {
            System.out.print(index + " ");
        }
    }
}
