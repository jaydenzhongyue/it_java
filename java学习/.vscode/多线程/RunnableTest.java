
public class RunnableTest  implements Runnable{
    private int ticket=10;
    public RunnableTest(){

    }//构造方法
    public void run(){
        for(int i=0;i<20;i++){
                if(this.ticket>0){
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                            e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"号窗口卖出"+this.ticket+"张票");
                }
        }
    }
    public static void main(String[] args){

    }
}
