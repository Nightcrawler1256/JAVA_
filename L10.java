public class L10 {
    public static void main(String[] args) {
        int num[]={1,3,5,4};
        for(int n:num)
        {
            System.out.println(n);
        }
        int nums[][]={
                {1,2,6,8},
                {9,2,5,6},
                {2,8,1,6}
        };
        for(int a[]:nums)
        {
            for (int n:a)
            {
                System.out.print(n +" ");
            }
            System.out.println();

        }

         int numbers[][]={
                 {3,1},
                 {1,5,7},
                 {7,4,7,9}
         };
        for (int a[]:numbers)
        {
            for(int m:a)
            {
                System.out.print(m +" ");
            }
            System.out.println();
        }
    }
}
