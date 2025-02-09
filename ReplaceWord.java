import java.util.*;

class ReplaceWord{

public static void rep(String str, String words,String words1){
String[] word=str.split(" ");
for(int i=0;i<word.length;i++){
if(word[i].equals(words)){

word[i]=words1;
}
}
System.out.print(String.join(" ", word));


}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String words=sc.nextLine();
String words1=sc.nextLine();

rep(str,words,words1);
  

}

}