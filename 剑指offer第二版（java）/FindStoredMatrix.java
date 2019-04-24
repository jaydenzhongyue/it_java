/*
剑指offer04，在一个二维数组中查找一个值是否存在。二维数组行和列的值以此递增；
解决方法，每次选取数组右上角的元素和待查数字number比较；
如果matrix[row][colum]==number,找到number；
否则，matrix[row][colum]>number,colum--
    否则，row++；
 */
class FindStoredMatrix {
    public  boolean Find(int[][] matrix,int rows,int columns,int number){
        boolean find=false;
        if(matrix !=null && rows>0 && columns>0){
            int row=0;
            int column=columns-1;
            while(row<rows&&column>=0){
                if(matrix[row][column]==number){
                    find=true;
                    break;
                }
                else if(matrix[row][column]>number){
                    --column;
                }
                    else
                        ++row;
            }
        }
        return find;
    }
    public  boolean Find1(int[][] matrix,int number){
        int rows=matrix.length;
        if(rows==0)
            return false;
        int colums=matrix[0].length;
        int row=0,colum=colums-1;
        while(row<rows&&colum>=0){
            if(matrix[row][colum]==number)
                return true;
            else if(matrix[row][colum]>number)
                    colum--;
                 else
                     row++;
        }
        return false;
    }
    public static void  main(String[] argc){
        int[][] matrix=new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        FindStoredMatrix t=new FindStoredMatrix();
        System.out.println(t.Find(matrix,3,2,7));
        System.out.println(t.Find1(matrix,7));

    }
}