public class Duplication {
    //计算组合数
    public static double zuhe(double N, double k)
    {
        //模拟人类计算的约分过程从而减少阶乘数量
        double m = N-k;
        double min = k;
        double max = m;
        double t = 0;

        double NN=1;
        double kk=1;
        if(min>max)
        {
            t=min;
            min = max;
            max=t;
        }
        //把大的阶乘约分去掉
        while(N>max)
        {
            NN=NN*N;
            N--;
        }
        //计算小的阶乘
        while(min>0)
        {
            kk=kk*min;
            min--;
        }
        //算出组合数
        return NN/kk;
    }
    //计算二项分布值
    public static double binomial(int N,int k,double p)
    {
        double y=1;
        double s=1;
        //计算组合数
        double a =zuhe(N,k);
        //计算(1-p)的(N-k)次方
        while((N-k)>0)
        {
            s=s*(1-p);
            N--;
        }
        //计算p的k次方
        while(k>0)
        {
            y=y*p;
            k--;
        }
        //最后三个值相乘得出二项分布值
        return a*y*s;
    }
    public static void main(String[] argc) {
        int t=8;
        double sum=0;
        int n=15;
        double p=0;
        while(p<=0.31){
            for(int i=0;i<=t-1;i++){
                sum+=binomial(n,i,p);
            }
            System.out.println(sum);
            //"n="+n+" t="+t+" probality="+
            p+=0.01;
            sum=0;
          }
    }
}