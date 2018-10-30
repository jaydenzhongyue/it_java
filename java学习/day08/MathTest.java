import java.util.Scanner;

class MathTest {
    public static void main(String[] args) {
        // 1、程序产生一个随机数，被猜的随机数
        int number = (int) (Math.random() * 100) + 1;
        // 3、把number和input比较
        while (true) {
            // 2、键盘录入数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个你要猜的数据：");
            int input = sc.nextInt();
            if (input > number) {
                System.out.println("你猜的数据:" + input + "大了");
            } else if (input < number) {
                System.out.println("你猜的数据:" + input + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }

    }
}