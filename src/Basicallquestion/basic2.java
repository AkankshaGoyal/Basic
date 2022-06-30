package Basicallquestion;

public class basic2 {
    public static void main(String args[])
    {
        int size = 5;
        int[][] pascaltr = new int[size][size];
        int row,col;
        for(row = 0;row<size;row++)
        {
            for(col=0;col<size;col++)
            {
                pascaltr[row][col]=0;
            }
        }
        pascaltr[0][0]=1;
        pascaltr[1][0]=1;
        pascaltr[1][1]=1;
        for(row=2;row<size;row++)
        {
            pascaltr[row][0]=1;
            for(col=1;col<=row;col++)
            {
                pascaltr[row][col] = pascaltr[row-1][col-1]+pascaltr[row-1][col];
            }
        }
        for(row=0;row<size;row++)
        {
            for(col=0;col<=row;col++)
            {
                System.out.print(pascaltr[row][col]);
            }
            System.out.print("\n");
        }
    }
}
