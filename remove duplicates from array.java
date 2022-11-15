/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static Integer[] removeDuplicate(Integer arr[]){
         Set<Integer> set=new LinkedHashSet<>();
	       
	       for(Integer a:arr){
	        if(!set.contains(a))set.add(a);
	    }  
	      Integer newArr[]=new Integer[set.size()];
          int i=0;     
          for(Integer a:set)if(a!=null){newArr[i++]=a;}           
    
	         return newArr;
	  
    }
    // remove duplicate from array
	public static void main(String[] args) {
    Integer arr[]={1,2,2,3,3,5,5,5,5};
     arr=removeDuplicate(arr);
     for(Integer a:arr){System.out.print(a+" ");}
     
	}
}

