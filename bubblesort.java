public class bubblesort {


    public void bsort(int[] arr)
{
    for(int i=0;i<arr.length-1;i++)
    {
        boolean isswapped=false;
        for(int j=0;j<arr.length-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 isswapped=true;
            }
        }
        if(isswapped==false)
        {
            break;
        }
    }

}



    public static void main(String[] args) {
        int[] arr={5,1,2,9,10};
        bubblesort b=new bubblesort();
        b.bsort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
    
}
