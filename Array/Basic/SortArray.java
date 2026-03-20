

class Sorter {

    void sort01(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] == 0) {
                i++;
            }
            else if (arr[j] == 1) {
                j--;
            }
            else {
                // arr[i] == 1 and arr[j] == 0 → swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
    }
}

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 1, 0, 0, 1, 0};

        Sorter obj = new Sorter();   // object created
        obj.sort01(arr);             // method call using object

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
