import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int Mathmarks=sc.nextInt();
    int Englishmarks=sc.nextInt();
    int Hindimarks=sc.nextInt();
    int Sciencemarks=sc.nextInt();
    int totalMarks=400;
    int total=Mathmarks+Englishmarks+Hindimarks+Sciencemarks;
    int percent=(total*100)/totalMarks;
    System.out.println(percent);
    if(percent>75){
        System.out.println("Distinction");
    }
    else if(percent>=40 && percent<=75){
        System.out.println(percent +" "+"pass");
    }
    else{
        System.out.println("fail");
    }
    }
}