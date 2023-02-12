package SC2001_Lab.Project1;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {6,7,5,3,9,8};
        MergeSort ins = new MergeSort();
        ins.mergeSort(array);

        int i = 0;
        for(i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public void mergeSort(int[] array){
        if(array==null) return;

        if(array.length>1){
            int mid = array.length/2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            for(int i = 0; i<mid; i++){
                left[i] = array[i];
            }
            
            for(int i = mid; i<array.length; i++){
                right[i-mid] = array[i];
            }

            mergeSort(left);
            // merge(array,left, right);
            mergeSort(right);
            //InsertSortTest ins = new InsertSortTest();
            merge(array,left, right);
        }
    }

    public void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
