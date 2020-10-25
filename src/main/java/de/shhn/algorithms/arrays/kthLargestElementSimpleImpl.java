package de.shhn.algorithms.arrays;

public class kthLargestElementSimpleImpl {
    public int kthBiggestFinding(int[] arr,int k)
    {
        return kthBiggest(arr, 0,arr.length-1, k);
    }
    private int kthBiggest(int[] arr,int left,int right,int k){
        if(left >= right)
            return arr[left];

        int pivotInd = partition(arr,left,right);

        int kthIndex = arr.length - k - 1;

        if(pivotInd < kthIndex)
            kthBiggest(arr,pivotInd+1,right,k);
        else if(pivotInd > kthIndex)
            kthBiggest(arr,left,pivotInd-1,k);

        return arr[kthIndex];
    }
    private int partition(int[] arr,int left,int right){
        int pivot = arr[right];
        int partitionIndex =left;
        for(int i=left;i<right;i++){
            if(arr[i] <= pivot)
                swap(arr, partitionIndex++,i);
        }
        swap(arr, partitionIndex,right);

        return partitionIndex;
    }
    private void swap(int[] arr,int srcInd, int desInd){
        int temp = arr[srcInd];
        arr[srcInd] = arr[desInd];
        arr[desInd] = temp;
    }

}
