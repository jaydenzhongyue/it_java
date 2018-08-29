package th1;

public class Solution2 {

	/**
	 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
	 * 例如，当字符串为We Are Happy.
	 * 则经过替换之后的字符串为We%20Are%20Happy。
	 * 解题思路：替换字符串，是在原有的字符串上进行；
	 * 还是新开辟一个新的字符串
	 * 1：从前往后替换，后面的字符要一直移动，时间复杂度o(n2)
	 * 2：从后往前替换，先计算需要多少空间，从后往前查询，
	 * 每个字符移动一次，时间复杂度o(n)
	 */
	 public String replaceSpace(StringBuffer str) {
	    	int numberofblank=0;
	    	for(int i=0;i<str.length();i++){
	    		if(str.charAt(i)==' '){
	    			numberofblank++;
	    		}
	    	}
	    	int originalindex=str.length()-1;
	    	int newlength=str.length()+2*numberofblank;
	    	int newindex=newlength-1;
	    	str.setLength(newlength);
	    	for(;originalindex>=0&&originalindex<newlength;originalindex--){
	    		if(str.charAt(originalindex)==' '){
	    			str.setCharAt(newindex--, '0');
	    			str.setCharAt(newindex--, '2');
	    			str.setCharAt(newindex--, '%');
	    		}else{
	    			str.setCharAt(newindex--, str.charAt(originalindex));
	    		}
	    	}
	    	return str.toString();  	
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 s=new Solution2();
		StringBuffer str=new StringBuffer(" helloworld");
		System.out.println(s.replaceSpace(str));

	}

}
