public class Main
{
    // linear search
	public static void main(String[] args) {
	int arr[]={1,2,4,5,6};
	int target=5;
	int targetIndex= -1;
	for(int i=0;i<arr.length;i++){if(arr[i]==target){targetIndex=i;break;} }
		System.out.println("Found target : "+target+" at index : "+targetIndex);
	}
}

