import java.util.*;
class MinMax{
public static int Min(int arr[]){
	int min=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]<min){
min=arr[i];
}

}       
return min;
}
public static int Max(int arr[]){
	int max=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}
}
return max;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

System.out.println("Maximum value is"+Max(arr));
System.out.println("Minimum value is"+Min(arr));
}
}