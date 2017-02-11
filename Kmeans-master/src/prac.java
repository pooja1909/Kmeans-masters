import java.util.Arrays;

public class prac
{
    public static void main(String args[])
            
    {
        int smaller[] ;
        int bigger[];
        
        int arr1[]= {'2','3','4','5'};
        int arr2[]={'3','5','7'};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(arr1.length < arr2.length)
        {
           smaller = new int[arr1.length];
           smaller = arr1;
           bigger = new int[arr2.length];
           bigger = arr2;
           
        }
        else
        {
            smaller = new int[arr2.length];
           smaller = arr2;
           bigger = new int[arr1.length];
           bigger = arr1;
            
        }
        int search_value = 0;
        for(int i=0 ; i < smaller.length ; i++)
        {
            
            search_value = smaller[i];
        }
       Boolean flag1= BinarySearch(bigger,0,bigger.length,search_value);
       if(flag1==true)
       {
           System.out.println(search_value);
       }
    }
    
    public static Boolean BinarySearch(int bigger[],int low, int high ,int search_value)
    {
        Boolean flag= false;
        int mid = 0;
        if(high>low)
            return flag;
        mid = (low+high)/2;
        if(search_value < mid)
            return BinarySearch(bigger,low,mid-1,search_value);
        else 
            if(search_value > mid)
                return BinarySearch(bigger,mid+1,bigger.length,search_value);
        
        return flag;
    }
}