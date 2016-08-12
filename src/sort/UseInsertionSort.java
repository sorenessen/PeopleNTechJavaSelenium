package sort;

/**
 * Created by soren on 8/6/2016.
 */
public class UseInsertionSort {
    public static void main(String[] args) {
        int[] list = {9, 6, 7, 0, 3, 5};
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }}
//            int[] arr1 = {17,32,12,86,1007,367,188,421};
//            int[] arr2 = UseInsertionSort(arr1);
//            for(int i:arr2){
//                System.out.print(i);
//                System.out.print(", ");
//            }
//        }
//
//        public static int[] UseInsertionSort(int[] input){
//
//            int temp;
//            for (int i = 1; i < input.length; i++) {
//                for(int j = i ; j > 0 ; j--){
//                    if(input[j] < input[j-1]){
//                        temp = input[j];
//                        input[j] = input[j-1];
//                        input[j-1] = temp;
//                    }
//                }
//            }
//            return input;
//        }
//    }
//
//
//

