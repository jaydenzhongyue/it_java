package th1;

import java.util.Scanner;

public class Solution1 {

	/**
	 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
	 * ÿһ�ж����մ����ҵ�����˳������
	 * ÿһ�ж����մ��ϵ��µ�����˳������
	 * �����һ������������������һ����ά�����һ��������
	 * �ж��������Ƿ��и�������
	 */
	//���ö�ά���ݵ��ص㣬�����ҵ����Ĺ��ɡ�ѡȡ���½ǻ������Ͻǵ�Ԫ�� ��target���бȽ�
	//������Ԫ��С��targetʱ��ȥ������Ԫ�����ڵ��У�
	//������Ԫ�ش���targetʱ��ȥ������Ԫ�����ڵ��У�
	/*public boolean Find(int[][] array,int target){
		int row=0;
		int column=array[0].length-1;
		while(row<=array.length-1&&column>=0){
			if(target<array[row][column]){
				column--;
			}else
				if(target>array[row][column]){
					row++;
				}
				else{
					return true;
				}
		}	
		return false;
	}*/
	public boolean Find(int[][] array,int target){
		for(int i=0;i<array.length;i++){
			int low=0;
			int high=array[i].length-1;
			while(low<=high){
				int mid=(low+high)/2;
				if(target<array[i][mid]){
					high=mid-1;
				}else
					if(target>array[i][mid]){
						low=mid+1;
					}
					else
						return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		Solution1 s=new Solution1();
		System.out.println("�Ƿ��������У�"+s.Find(array,7));

	}

}
