class CryptoDemo{
    public static void main(String[] args){
    /*
    ��һ���������ݣ�ת��������洢
    ����һ���������ݣ�Ȼ����һ�����飬����һ��������¼����ı仯��Ȼ���ȡÿ������λ�ϵ����ݡ�
    */
    int  number=123456;
    int[] arr=new int[8]; 
    int index=0;
        while(number>0){
            arr[index]=number%10;
            index++;
            number/=10;
        }
        //ÿ��λ�ϵ����ݼ�5��Ȼ���10ȡ��
        for(int i=0;i<index;i++){
            arr[i]+=5;
            arr[i]%=10;
        }
        //���������������ݵĵ�һλ�����һλ
        int temp=arr[0];
        arr[0]=arr[index-1];
        arr[index-1]=temp;
        //��������
        for(int i=0;i<index;i++){
            System.out.print(arr[i]);
        }
         System.out.println();
    }
}