public class Main
{
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
       arr[b]=temp;
    }
	public static void main(String[] args) {
	    int arr[]={110,9,44,5,2,4,9};
	    
	    for(int i=0;i<arr.length;i++){
	        int minIndex=i;
	        for(int j=i;j<arr.length;j++){
	            
	            if(arr[j]<arr[minIndex]){minIndex=j;}
	            
	        }
	        swap(arr,i,minIndex);
	    }
	    
		for(int a:arr)System.out.print(a+" ");
	}
}

