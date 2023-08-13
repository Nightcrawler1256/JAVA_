
class calc{
    public int add(int n1, int n2){
        int result=n1+n2;
        return result;
    }
    public int add(int n1, int n2 , int n3){
        int result=n1+n2+n3;
        return result;
    }
    public double add(double n1, double n2){
        double result=n1+n2;
        return result;
    }
}
public class overloading {
    public static void main(String[] args) {
        calc obj=new calc();
        int result = obj.add(2,3);
        System.out.println(result);
        int result1=obj.add(2,3,4);
        System.out.println(result1);
        double result3=obj.add(2.3,4.4);
        System.out.println(result3);
    }
}
