public class L9 {
    public static void main(String[] args) {
        //simple array declartion and initilisation
//        int nums[]={1,2,3,4};
//        for (int i=0;i<4;i++)
//        {
//            System.out.println(nums[i]);
//        }
//        System.out.println();

//        ........................................................................................

        //string Array
//          String name[]={"Harsh","Ravi","Santosh"};
//          for (int i=0;i<3;i++)
//          {
//              System.out.println(name[i]);
//          }
        int mat[][]=new int[3][3];
        mat[0][0]=3;
        mat[0][1]=2;
        mat[0][2]=1;
        mat[1][0]=3;
        mat[1][1]=4;
        mat[1][2]=5;
        mat[2][0]=7;
        mat[2][1]=2;
        mat[2][2]=1;

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }






    }
}
