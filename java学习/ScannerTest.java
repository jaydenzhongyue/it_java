import java.util.Scanner;
class ScannerTest{
public static void main(String[] args){
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x=sc.nextInt();
		System.out.println("请输入第二个数：");
		int y=sc.nextInt();
		System.out.println("请输入第三个数：");
		int z=sc.nextInt();
		int max;
		max=(x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("Max:"+max);
		*/
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("请输入第一个数：");
		int x=sc.nextInt();
		System.out.println("请输入第二个数：");
		int y=sc.nextInt();
		boolean flag=(x==y);
		System.out.println(flag);
		}
		
	}
}