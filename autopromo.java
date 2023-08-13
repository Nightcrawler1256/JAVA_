class cal{    //automatic promotion in overloading
  public void show(byte n){
      System.out.println("byte " + n);
  }
    public void show(char n){
        System.out.println("char " + n);
    }

    public void show(short n){
        System.out.println("short " + n);
    }

    public void show(int n){
        System.out.println("int " + n);
    }

    public void show(double n){
        System.out.println("double " + n);
    }
}
public class autopromo {
    public static void main(String[] args) {
        cal obj=new cal();
        int b=3;
        obj.show(b);


    }
}
