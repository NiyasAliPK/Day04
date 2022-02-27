
import java.util.Scanner;


public class Assignment25 {

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size for array :");
	int size=input.nextInt();
	int arr[]=new int [size];
	int arr2[]=new int [size];
	int arr3[]=new int [size];
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
	for(int n=0;n<arr2.length;n++) {
		for(int k=n+1;k<arr2.length;k++) {
			if(arr2[n]<arr2[k]) {
				temp=arr2[n];
				arr2[n]=arr2[k];
				arr2[k]=temp;
			}
		}
	}
	for(int a=0;a<size;a++) {
		if(arr2[a]==0) {
			count++;
		}
	}
//	for(int m=0;m<size-count;m++) {
//		System.out.println(arr2[m]);
//	}
	for (int i=0;i<arr2.length;i++) {
		for (int j=0;j<(i*2)-1;j++) {
			System.out.print(arr2[i]);
		}
		
	}
	}
}
	


