class Variables {
    int instance=20;
    static int num=30;
    public static int globalvar=70;
     public void display(){
           int var=10;
           System.out.println(var+" "+ instance+" "+ num+ " "+ globalvar);
       }
    public static void main(String[] args) {
      Main n=new Main();
      Main m=new Main();
      m.num=50;
      n.display();
      m.display();
    }
}