package th1;

public class Solution2 {

	/**
	 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
	 * ���磬���ַ���ΪWe Are Happy.
	 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
	 * ����˼·���滻�ַ���������ԭ�е��ַ����Ͻ��У�
	 * �����¿���һ���µ��ַ���
	 * 1����ǰ�����滻��������ַ�Ҫһֱ�ƶ���ʱ�临�Ӷ�o(n2)
	 * 2���Ӻ���ǰ�滻���ȼ�����Ҫ���ٿռ䣬�Ӻ���ǰ��ѯ��
	 * ÿ���ַ��ƶ�һ�Σ�ʱ�临�Ӷ�o(n)
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
