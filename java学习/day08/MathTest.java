import java.util.Scanner;

class MathTest {
    public static void main(String[] args) {
        // 1���������һ������������µ������
        int number = (int) (Math.random() * 100) + 1;
        // 3����number��input�Ƚ�
        while (true) {
            // 2������¼������
            Scanner sc = new Scanner(System.in);
            System.out.println("������һ����Ҫ�µ����ݣ�");
            int input = sc.nextInt();
            if (input > number) {
                System.out.println("��µ�����:" + input + "����");
            } else if (input < number) {
                System.out.println("��µ�����:" + input + "С��");
            } else {
                System.out.println("��ϲ�������");
                break;
            }
        }

    }
}