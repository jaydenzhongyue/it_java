import java.util.Scanner;
class ArrayReverse1{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
     System.out.println(s);
     char[] arr=s.tochar();
    }

    //System.out.println("-------------");
  //  System.out.println("s");
    //�������е�Ԫ��������������������е�Ԫ�أ�ֱ��length/2
	//����ֵ���ͣ�void  �������ͣ�int[] arr;
	public static void reverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp;
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}

}