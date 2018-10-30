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

}