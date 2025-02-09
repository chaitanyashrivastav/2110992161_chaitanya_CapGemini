import java.util.*;
class Vowcnt{
	public static void main(String[]args){
Scanner sc= new Scanner(System.in);
String str1=sc.nextLine().toLowerCase();
int count=0;
for(char str : str1.toCharArray()){
if(str=='a'|| str=='e'|| str=='i' || str=='o' || str=='u'){
count++;
}
}
System.out.println(count);
	}
}