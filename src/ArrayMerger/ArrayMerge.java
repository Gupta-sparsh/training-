package ArrayMerger;

public class ArrayMerge implements ArrayMergerInterface{

    @Override
    public int[] mergeSorted(int[] a, int[] b) {
        int i=0,j=0,k=0;
        int []merged_array = new int[a.length+b.length];
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {    merged_array[k] = a[i]; i++; }
            else
            {    merged_array[k] = b[j]; j++; }
            k++;
        }
        if(i==a.length)
            while(j<b.length)
            {    merged_array[k] = b[j]; j++; k++; }
        else
            while(i<a.length)
            {    merged_array[k] = a[i]; i++; k++; }

        return merged_array;
    }
}
