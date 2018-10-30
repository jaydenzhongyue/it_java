/*
题目：计算字符串中最后一个单词的长度，单词之间用空格隔开
示例：hello world
输出：5
*/
class HuaweiTest{
    public static void main(String[] args){
        int length=getStringWordLength("XSUWHQ");
        System.out.println(length);
    }
    //定义一个求一个字符串最后一个单词长度的方法
    //返回值类型： int 方法参数：String s
    public static int getStringWordLength(String s){
        String[] ss=s.split(" ");
        int len=ss.length;
        return ss[len-1].length();
    }
}