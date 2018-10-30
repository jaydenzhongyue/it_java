import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = new String(sc.nextLine());
            // 将字符串长度小于8的补齐。满足大于等于8
            if (s.length() % 8 != 0) {
                s = s + "00000000";
            }
            while (s.length() >= 8) {
                System.out.println(s.substring(0, 8));
                s = s.substring(8);
            }
        }

    }
}