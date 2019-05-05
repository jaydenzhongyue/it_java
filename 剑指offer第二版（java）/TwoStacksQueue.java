import java.util.Stack;

/*
栈和队列：
    栈：先进后出，在O(n)的时间里找到最大值，最小值；
    队列：先进先出。
    面试题9：用两个栈实现队列，实现两个函数，appendTail和deleteHead，在队列尾部插入节点，在队列头部删除节点。
    一个队列包含两个栈stack1和stack2，要求操作这两个“先进后出”的栈实现一个“先进先出”的队列；
 */
class CQueue<E>{
    private Stack<E> stack1;
    private Stack<E> stack2;
    public CQueue(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    //在队列尾部插入元素，直接在stack1中插入元素
    public void appendTail(E node){
        stack1.push(node);
    }
    //队列头部删除元素
    public E deleteHead(){
        if(stack2.size()==0){
            if(stack1.size()==0){
                throw new RuntimeException();
            }else {
                while (stack1.size()!=0){
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }
}
public class TwoStacksQueue {
    public static void main(String[] argc){
        CQueue<Integer> cq=new CQueue<>();
        //进队列
        for(int i=0;i<5;i++){
            cq.appendTail(i);
        }
        //出队列
        for(int i=0;i<5;i++){
            int temp=cq.deleteHead();
            System.out.print(temp+" ");
        }

    }
}
