public class Main
{
	public static void main(String[] args) {
	    
	    int arr[]={3,1,4,12,5,7};
	    int firstLargestIndex=0,firstLargest=arr[0];
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>firstLargest){firstLargest=arr[i]; firstLargestIndex=i; }
	        
	    }
	    int secondLargest=arr[0];
	    for(int i=0;i<arr.length;i++){
	        if(i!=firstLargestIndex && arr[i]>secondLargest){secondLargest=arr[i];}
	        
	    }
	    
		System.out.println("second largest number is : "+secondLargest);
	}
}
