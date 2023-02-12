package SC2001_Lab.Project1;

public class InsertSortTest{
    public static void main(String[] args) {
        int[] array;
        array = new int[4];

        array[0] = 1;
        array[1] = 3;
        array[2] = 7;
        array[3] = 5;

        InsertSortTest ins = new InsertSortTest();
        ins.insertSort(array);
        
        int i = 0;
        for(i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    int temp;
    public void insertSort(int[] a)
    {
        int i = 0;
        for(i=1; i<a.length; i++)
        {
            int j;
            for(j=i; j>0; j--)
            {
                if(a[i]<a[i-1]) 
                {
                    temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
}
