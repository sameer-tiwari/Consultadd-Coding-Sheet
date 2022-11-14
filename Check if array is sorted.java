
public class Main
{
	public static void main(String[] args) {
	      int arr[]={13,11,14,15,16,17};
	    boolean isSorted=true;
	    for(int i=1;i<arr.length;i++){
	        if(!(arr[i] > arr[i-1]) ){ isSorted=false;break;}
	        
	    }
	  
		System.out.println("Array is Sorted : "+isSorted);
	}
}
