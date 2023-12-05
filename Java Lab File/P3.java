class ArraysExample {
    // Function to demonstrate single-dimensional array
    void singleDimensionalArrayExample() {
        System.out.println("Single-Dimensional Array Example:");

        // Declaration and initialization of a single-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing and displaying elements of the array
        System.out.print("Array Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Function to demonstrate multi-dimensional array
    void multiDimensionalArrayExample() {
        System.out.println("\nMulti-Dimensional Array Example:");

        // Declaration and initialization of a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing and displaying elements of the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to demonstrate ragged array
    void raggedArrayExample() {

        // Declaration and initialization of a ragged array
        int[][] raggedMatrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Accessing and displaying elements of the ragged array
        System.out.println("\nRagged Array Elements:");
        for (int i = 0; i < raggedMatrix.length; i++) {
            for (int j = 0; j < raggedMatrix[i].length; j++) {
                System.out.print(raggedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ArraysExample x = new ArraysExample();
        x.singleDimensionalArrayExample();
        x.multiDimensionalArrayExample();
        x.raggedArrayExample();
    }
}