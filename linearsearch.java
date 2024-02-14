




public class linearsearch {
    static void search(int[] arr,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n){
                System.out.println("Element at "+ i);
                return;
            }
            

        }
        System.out.println("not found");
        


    }




    public static void main(String[] args) {
        int[] arr={5,1,9,2,10,15,20};
        int n=10;
        linearsearch.search(arr,n);

    }
    
}
