import java.util.*;

class Charcnt{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int uppcnt=0,lowcnt=0,digitcnt=0,specialcnt=0;
for(char ch:str.toCharArray()){
if(Character.isUpperCase(ch)){
	uppcnt++;
}
else if(Character.isLowerCase(ch)){
lowcnt++;
}
else if(Character.isDigit(ch)){
	digitcnt++;
}
else{
	specialcnt++;
}
}
System.out.println(uppcnt);
System.out.println(lowcnt);
System.out.println(digitcnt);
System.out.println(specialcnt);


}
}