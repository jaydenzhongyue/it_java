/*
��Ŀ�������ַ��������һ�����ʵĳ��ȣ�����֮���ÿո����
ʾ����hello world
�����5
*/
class HuaweiTest{
    public static void main(String[] args){
        int length=getStringWordLength("XSUWHQ");
        System.out.println(length);
    }
    //����һ����һ���ַ������һ�����ʳ��ȵķ���
    //����ֵ���ͣ� int ����������String s
    public static int getStringWordLength(String s){
        String[] ss=s.split(" ");
        int len=ss.length;
        return ss[len-1].length();
    }
}