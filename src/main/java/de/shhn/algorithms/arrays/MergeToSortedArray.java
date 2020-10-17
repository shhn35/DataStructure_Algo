package de.shhn.algorithms.arrays;

public class MergeToSortedArray {
    public int[] merge(int[] arr_1,int[] arr_2, int implementationCode){
        switch (implementationCode){
            case 1:
                return merge_implement_1(arr_1,arr_2);
            case 2:
                return merge_implement_2(arr_1,arr_2);
            case 3:
                return merge_implement_3(arr_1,arr_2);
            default:
                return new int[]{};
        }
    }
    private int[] merge_implement_1(int[] arr_1,int[] arr_2){
        int[] arr_out = new int[arr_1.length + arr_2.length];

        int ind_1 = 0,ind_2 = 0;

        for (int i=0;i<arr_out.length;i++){
            if(ind_1 == arr_1.length){
                arr_out[i] = arr_2[ind_2++];
            }
            else if(ind_2 == arr_2.length){
                arr_out[i] = arr_1[ind_1++];
            }
            else if(arr_1[ind_1] < arr_2[ind_2]){
                arr_out[i] = arr_1[ind_1++];
            }
            else{
                arr_out[i] = arr_2[ind_2++];
            }
        }
        return arr_out;
    }

    private int[] merge_implement_2(int[] arr_1,int[] arr_2){
        int[] arr_out = new int[arr_1.length + arr_2.length];

        int ind_1 = 0,ind_2 = 0;

        for (int i=0;i<arr_out.length;i++){
            if(ind_1 == arr_1.length ||
                    (ind_2<arr_2.length &&
                            arr_1[ind_1] >= arr_2[ind_2])){
                arr_out[i] = arr_2[ind_2++];
            }
            else if(ind_2 == arr_2.length ||
                    arr_1[ind_1] < arr_2[ind_2]){
                arr_out[i] = arr_1[ind_1++];
            }
        }
        return arr_out;
    }

    private int[] merge_implement_3(int[] arr_1,int[] arr_2){
        int[] arr_out = new int[arr_1.length + arr_2.length];

        int ind_1 = 0, ind_2 = 0, ind_out = 0;

        // Two arrays still have at least one elements
        while (ind_1 < arr_1.length && ind_2 < arr_2.length){
            if(arr_1[ind_1] < arr_2[ind_2])
                arr_out[ind_out++] = arr_1[ind_1++];
            else
                arr_out[ind_out++] = arr_2[ind_2++];
        }

        // Only arr_1 has still some elements
        while(ind_1 < arr_1.length){
            arr_out[ind_out++] = arr_1[ind_1++];
        }
        // Only arr_2 has still some elements
        while (ind_2 < arr_2.length){
            arr_out[ind_out++] = arr_2[ind_2++];
        }

        return  arr_out;
    }
}
