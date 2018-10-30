/*
	需求：
			写一个遍历数组的方法，遍历数组中的元素
			写一个逆序数组元素的方法，将数字中的元素逆序输出。
*/
import java.util.Scanner;
class Reverse{
	public static void main(String[] args){
		//使用静态初始化的方法，初始化数组
		int[] arr={12,45,56,89,12};
		System.out.println("逆序前数组元素：");
		printArr(arr);
		System.out.println("---------------");
		System.out.println("逆序后数组元素：");
		reverse2(arr);
		printArr(arr);
		System.out.println("---------------");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int indexput=getIndex2(arr,value);
		System.out.println(value+"在数组中的索引是"+indexput);
		
	}
	//顺序遍历数出数组中的元素
	//返回值类型：void；参数类型：int[] arr;
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
	//将数组中的元素逆序输出，交换数组中的元素，直到length/2
	//返回值类型：void  参数类型：int[] arr;
	public static void reverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp;
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	//数组逆序方法二，定义两个索引，交换前后两个索引即可。
	public static void reverse2(int[] arr){
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		}
	}
	//查找元素第一次在数中出现的位置。输出其对应的索引值
	//返回值：int类型    参数类型：int[] arr,int value
	public static int getIndex(int[] arr,int value){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				return i;
			}
		}
		return -1;//如果在数组中找不到相应的值，就返回-1
	}
	/*
	方法二，找出元素第一次出现在数组中的索引，先给出一个标志索引index=-1
	如果在数组中找到对应的元素，则输出对应的索引
	*/
	public static int getIndex2(int[] arr,int value){
		int index=-1;//首先设置一个标志索引
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				index=i;
				break;
			}
		}
		return index;
	}
	
}