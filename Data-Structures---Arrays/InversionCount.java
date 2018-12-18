import java.util.*;

public class InversionCount{

/**For each element, count number of elements which are on right side of it and are smaller than it.
**/
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {2,7,5,3};
        InversionCount mms = new InversionCount();
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        mms.sort(inputArr, map);
        for(int i:inputArr){
            
            System.out.println(i+" "+map.get(i));
        }
    }
     
    public void sort(int inputArr[], Map<Integer, Integer> map) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        
        for(int i=0;i<=inputArr.length-1;i++)
          map.put(inputArr[i],0);
        doMergeSort(0, length - 1, map);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex, Map<Integer, Integer> map) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle, map);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex, map);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex, map);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex,  Map<Integer, Integer> map) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {

                map.put(tempMergArr[i], map.get(tempMergArr[i])+1);
              
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
