class DuplicateArrayElements
{
    void printRepeating(int arr[], int size)
    {
        int i;  
        System.out.println("Duplicate elements are : ");
    
        for (i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }         
    } 
 
    public static void main(String[] args) 
    {
        DuplicateArrayElements duplicateArrayElements = new DuplicateArrayElements();
        int arr[] = {1, 2, 4, 1, 4, 5, 3};
        int arr_size = arr.length;
        duplicateArrayElements.printRepeating(arr, arr_size);
    }
}