package th1;

import java.util.Scanner;

public class Solution1 {

	/**
	 * 在一个二维数组中（每个一维数组的长度相同），
	 * 每一行都按照从左到右递增的顺序排序，
	 * 每一列都按照从上到下递增的顺序排序。
	 * 请完成一个函数，输入这样的一个二维数组和一个整数，
	 * 判断数组中是否含有该整数。
	 */
	//利用二维数据的特点，从左到右递增的规律。选取左下角或者右上角的元素 与target进行比较
	//当待查元素小于target时，去除待查元素所在的行；
	//当待查元素大于target时，去除待查元素所在的列；
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
		System.out.println("是否在数组中："+s.Find(array,7));

	}

}
