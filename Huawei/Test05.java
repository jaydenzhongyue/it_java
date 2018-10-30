import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuffer sb = new StringBuffer();
            sb.append(sc.next());
            String s = sb.reverse().substring(0, sb.length() - 2);
            char ch[] = s.toCharArray();
            int result = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] >= 'A' && ch[i] <= 'F') {
                    result += Integer.valueOf(ch[i] - 55) * Math.pow(16, i);
                } else {
                    result += Integer.valueOf(ch[i] - 48) * Math.pow(16, i);
                }
            }
            System.out.println(result);
        }
    }
}