/*
	����
			дһ����������ķ��������������е�Ԫ��
			дһ����������Ԫ�صķ������������е�Ԫ�����������
*/
import java.util.Scanner;
class Reverse{
	public static void main(String[] args){
		//ʹ�þ�̬��ʼ���ķ�������ʼ������
		int[] arr={12,45,56,89,12};
		System.out.println("����ǰ����Ԫ�أ�");
		printArr(arr);
		System.out.println("---------------");
		System.out.println("���������Ԫ�أ�");
		reverse2(arr);
		printArr(arr);
		System.out.println("---------------");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int indexput=getIndex2(arr,value);
		System.out.println(value+"�������е�������"+indexput);
		
	}
	//˳��������������е�Ԫ��
	//����ֵ���ͣ�void���������ͣ�int[] arr;
	public static void printArr(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
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
	//�������򷽷�����������������������ǰ�������������ɡ�
	public static void reverse2(int[] arr){
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		}
	}
	//����Ԫ�ص�һ�������г��ֵ�λ�á�������Ӧ������ֵ
	//����ֵ��int����    �������ͣ�int[] arr,int value
	public static int getIndex(int[] arr,int value){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				return i;
			}
		}
		return -1;//������������Ҳ�����Ӧ��ֵ���ͷ���-1
	}
	/*
	���������ҳ�Ԫ�ص�һ�γ����������е��������ȸ���һ����־����index=-1
	������������ҵ���Ӧ��Ԫ�أ��������Ӧ������
	*/
	public static int getIndex2(int[] arr,int value){
		int index=-1;//��������һ����־����
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				index=i;
				break;
			}
		}
		return index;
	}
	
}