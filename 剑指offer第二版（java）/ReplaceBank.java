/*
实现一个函数，把字符串中的每个空格替换成"%20"
输入："We are happy."
输出：We%20are%20happy."
需求：是在原字符串上进行替换，保证输入字符串之后有足够的内存空间。时间复杂度O(n*2);
能否减少移动次数，从后向前的替换，利用两个指针p1和p2，表明所有的空格都已经替换完毕。
 */
public class ReplaceBank {
    public static String replaceBank(StringBuffer str) {
        int spacenum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spacenum++;
            }
        }
        int originalIndex = str.length() - 1;
        int newLength = str.length() + spacenum * 2;
        int newIndex = newLength - 1;
        str.setLength(newLength);
        while (originalIndex >= 0 && originalIndex < newLength) {
            if (str.charAt(originalIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(originalIndex));
            }
            originalIndex--;
        }
        return str.toString();
    }
    public static  void main(String[] argc){
        System.out.println(replaceBank(new StringBuffer("We are happy.")));
    }
}