



public class binarysearch {
    public static void bisearch(int[] arr,int k )
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(arr[mid]==k)
            {
                System.out.println("Found at "+mid);
                return;
            }
            else
            {
                if(k<arr[mid])
                {
                    high=mid-1;
                                } 
                                else{
                                    low=mid+1;
                                }               
            }
        }
        System.out.println("Not found");

        }
    



    public static void main(String[] args) {
        int[] arr={1,10,20,47,59,65,75,88,90};
        int k=90;
        bisearch(arr, k);


    }
    
}
