class Test{
    public static void main(String[] args){
        test3();
    }
    public static void test3(){
        System.out.println(fun(10));
    }
    public static int fun(int x){
        if(x==0||x==1){
            return x+1;
        }
        return fun(x-1)+fun(x-2);
    }
}