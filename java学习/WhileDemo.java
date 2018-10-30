class WhileDemo{
/*
	分析：
		A:小芳每天存2.5元
			double dayMoney=2.5;
		B:每天都会把钱存起来
			double daySum=0;
		C:小芳从第一天开始存储
			int dayCount=1;
		D:经过多少天，小芳可以存够100元
			double result=100;
		E:如果存钱的日期是5的倍数的话，消防消费6元钱
			daySum-=6;
			暗含条件是，如果不是5的倍数的话，钱就要累加
			daySum+=dayMoney;
		F:因为不知道多少天，不是一个范围。使用while循环，超过100元就退出循环
*/
public static void main(String[] args){
	double dayMoney=2.5;
	double daySum=0;
	int dayCount=1;
	double result=100;
	while(true){
		if(daySum>=result){
			System.out.println("第"+dayCount+"天，存够100元");
			break;
		}
		if(dayCount%5==0){
			daySum-=6;
			System.out.println("第"+dayCount+"天，消费了6元钱");
		}
		daySum+=dayMoney;
		dayCount++;
	}
}
}