class Exam{
    public static void main(String[] args){
        String s = "��";
        char[] charArray =s.toCharArray();
        System.out.println(charArray);
        for(char c: charArray){
        System.out.println(Integer.toBinaryString(c));
        }
        char[] arr ={'1','2','3'};
        System.out.println(arr);
       
        char[] cArr ={'��', '��'};
        System.out.println(cArr);
        
        String[] sArr = {"��","��"};
        System.out.println(sArr);
      
}
}