public class Main
{
   // quick sort 
    static int arr[]={555,5,44,44,-22,1,3,-42};
		
    static void swap(int arr[],int a,int b){int temp=arr[a];arr[a]=arr[b];arr[b]=temp;}
    static int partition(int arr[],int s,int l){
        int pivot=arr[l];
        int i=s-1,j=s;
        
        while(j<l){
            
            if(arr[j]<pivot){i++;swap(arr,i,j);j++;}
            else{j++;}
            
        }
        swap(arr,i+1,l);
        return i+1;
        
    }
    static void quickSort(int arr[],int i,int j){
         
         if(i<j){
         int pivotIndex=partition(arr,i,j);
         quickSort(arr,i,pivotIndex-1);
         quickSort(arr,pivotIndex+1,j);
    }
    
    }
	public static void main(String[] args) {
		quickSort(arr,0,arr.length-1);
		for(int a:arr)
		System.out.print(a+" ");
	}
}

