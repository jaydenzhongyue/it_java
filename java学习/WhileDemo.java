class WhileDemo{
/*
	������
		A:С��ÿ���2.5Ԫ
			double dayMoney=2.5;
		B:ÿ�춼���Ǯ������
			double daySum=0;
		C:С���ӵ�һ�쿪ʼ�洢
			int dayCount=1;
		D:���������죬С�����Դ湻100Ԫ
			double result=100;
		E:�����Ǯ��������5�ı����Ļ�����������6ԪǮ
			daySum-=6;
			���������ǣ��������5�ı����Ļ���Ǯ��Ҫ�ۼ�
			daySum+=dayMoney;
		F:��Ϊ��֪�������죬����һ����Χ��ʹ��whileѭ��������100Ԫ���˳�ѭ��
*/
public static void main(String[] args){
	double dayMoney=2.5;
	double daySum=0;
	int dayCount=1;
	double result=100;
	while(true){
		if(daySum>=result){
			System.out.println("��"+dayCount+"�죬�湻100Ԫ");
			break;
		}
		if(dayCount%5==0){
			daySum-=6;
			System.out.println("��"+dayCount+"�죬������6ԪǮ");
		}
		daySum+=dayMoney;
		dayCount++;
	}
}
}