package SolvdLaba;

import java.util.Arrays;

    class Sort {

        // method to find the partition position
        public static int partition(int array[], int low, int high) {

            // choose the rightmost element as pivot
            int pivot = array[high];

            // pointer for greater element
            //i will increment if a given number is smaller than the pivot
            int i = (low - 1);

            // traverse through all elements
            // compare each element with pivot
            for (int j = low; j < high; j++) {
                if (array[j] <= pivot) {

                    // if element smaller than pivot is found
                    // swap it with the greater element pointed by i
                    i++;

                    // swapping element at i with element at j
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

            // swap the pivot element with the greater element specified by i
            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            // return the position from where partition is done
            return (i + 1);
        }

        static void sort(int array[], int low, int high) {
            if (low < high) {

                // find pivot element such that

                // in the pi we save the index of where we put the pibot
                // so that all elements left to the pivot are smaller and all
                // elements right to the pibot are bigger than pivot
                int pi = partition(array, low, high);

                // recursive call on the left of pivot
                sort(array, low, pi - 1);

                // recursive call on the right of pivot
                sort(array, pi + 1, high);
            }
        }
    }

    // Main class
    class Main {
        public static void main(String args[]) {

            int[] arr = { 8, 7, 2, 1, 0, 9, 6 };
            System.out.println("Unsorted Array");
            System.out.println(Arrays.toString(arr));

            int size = arr.length;

            // call quicksort() on array arr
            Sort.sort(arr, 0, size - 1);

            System.out.println("Sorted Array in Ascending Order ");
            System.out.println(Arrays.toString(arr));
        }
    }




