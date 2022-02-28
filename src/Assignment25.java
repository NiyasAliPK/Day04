
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Assignment25 {

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size for array :");
	int size=input.nextInt();
	int arr[]=new int [size];
	int arr2[]=new int [size];
	Integer arr3[]=new Integer [size];
	int count=0,temp=0;
	
	System.out.println("Enter the values for array :");
	for( int i=0;i<size;i++) {
		arr[i]=input.nextInt();
	
	}
	for (int j=0;j<size;j++) {
		arr2[j]=arr[j];
		if(arr[j]%2!=0) {
			arr2[j]=arr[j];
			j=j+2;
		}
		}
	for(int a=0;a<size;a++) {
		if(arr2[a]==0) {
			count++;
		}
	}
	Set<Integer> set=new HashSet<Integer>();
	for(int i=0;i<arr2.length;i++) {
		if(arr2[i]!=0) {
		set.add(arr2[i]);
	}
	}
	set.toArray(arr3);

	for(int i=0;i<=arr3.length;i++) {
		for(int j=1;j<=i*2;j++) {
			System.out.print(arr3[i]);
		}System.out.println();
		for(int m=1;m<=i*3;m++) {
			System.out.println(arr3[i]);
		}
	}
	
	}
}
	


