class calculation{
    public int add(int nums[])
    {
        int result=0;
        for (int n:nums)
        {
            result=result+n;

        }return result;

    }

}
public class L124 {
    public static void main(String[] args) {
        calculation obj=new calculation();
        int result=obj.add(new int[]{11,41,4,24});
        System.out.println(result);

    }
}
