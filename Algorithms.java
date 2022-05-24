//yara adel hassan mohamed 
//19100683 
//algorithms 12th programming assignmnet 

package algorithms;
import java.util.*;  
import java.lang.Math;

public class Algorithms {
    
    static void swapping(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

static int divideconquer(int[] arr, int low, int high)
{
    int pivot = arr[high];
   
    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++)
    {
       
        if (arr[j] < pivot)
        {
           
            i++;
            swapping(arr, i, j);
        }
    }
    swapping(arr, i + 1, high);
    return (i + 1);
}

static void quickSort(int[] arr, int low, int high)
{
    if (low < high)
    {
         
     
        int pi = divideconquer(arr, low, high);
 
     
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

static void print(int[] arr, int size)
{
    for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
         
    System.out.println();
}
   
    public static int binarysearch(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;
        while (low <= high)//STOPPING CONDITHION
        {
            int mid = (low + high) / 2;
            if (target == nums[mid])
            {
                result = mid;
                high = mid - 1;
            }
            else if (target < nums[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
 
        return result;
    }
 
    public static void main(String[] args)
    {
        int[] nums = {4,3,2,1,1,5};
        int n = nums.length;
        int target = 1;
        quickSort(nums, 0, n - 1);
    System.out.println("Sorted array: ");
    print(nums, n);
 
        int index = binarysearch(nums, target);
 
        if (index != -1)
        {
            System.out.println("founded  " + target + " after sorting is index " + index);
        }
        else {
            System.out.println("error not found ");
        }
    }
}

    

