import java.util.Scanner;
class ScannerTest{
public static void main(String[] args){
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		int x=sc.nextInt();
		System.out.println("������ڶ�������");
		int y=sc.nextInt();
		System.out.println("���������������");
		int z=sc.nextInt();
		int max;
		max=(x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("Max:"+max);
		*/
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("�������һ������");
		int x=sc.nextInt();
		System.out.println("������ڶ�������");
		int y=sc.nextInt();
		boolean flag=(x==y);
		System.out.println(flag);
		}
		
	}
}