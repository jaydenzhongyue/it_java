class Exam{
    public static void main(String[] args){
        String s = "杨";
        char[] charArray =s.toCharArray();
        System.out.println(charArray);
        for(char c: charArray){
        System.out.println(Integer.toBinaryString(c));
        }
        char[] arr ={'1','2','3'};
        System.out.println(arr);
       
        char[] cArr ={'北', '京'};
        System.out.println(cArr);
        
        String[] sArr = {"人","民"};
        System.out.println(sArr);
      
}
}