class CryptoDemo{
    public static void main(String[] args){
    /*
    把一个整型数据，转换成数组存储
    定义一个整型数据，然后定义一个数组，定义一个索引记录数组的变化。然后获取每个数据位上的数据。
    */
    int  number=123456;
    int[] arr=new int[8]; 
    int index=0;
        while(number>0){
            arr[index]=number%10;
            index++;
            number/=10;
        }
        //每个位上的数据加5，然后对10取余
        for(int i=0;i<index;i++){
            arr[i]+=5;
            arr[i]%=10;
        }
        //交换上面所得数据的第一位和最后一位
        int temp=arr[0];
        arr[0]=arr[index-1];
        arr[index-1]=temp;
        //输出最后结果
        for(int i=0;i<index;i++){
            System.out.print(arr[i]);
        }
         System.out.println();
    }
}