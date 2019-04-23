/*
链表，由指针将若干结构连接成链状结构。
创建、插入节点、删除节点 ；
动态的数据结构，需要对指针进行操作，创建链表是不需要知道链表的长度。
插入一个节点时，为新节点分配内存空间。
面试题06，输入一个链表的头结点，从头到尾打印每个结点的值；
思路1：遍历单链表的顺序是从头到尾，要求的输出顺序是从尾到头。
第一个遍历的结点最后一个输出，最后遍历的一个结点第一个输出：后进先出。
使用栈结构，当遍历完栈时，再从栈顶输出节点的值，输出的顺序反转。
思路2：递归，本质上递归就是一个栈结构，反转链表，每次访问一个结点，先递归输出后面
的结点，再输出该结点。输出结果就反过来了。
存在问题：当链表非常长的时候，会导致函数调用的层级很深，导致函数调用栈溢出。
 */
import java.util.ArrayList;
import java.util.Stack;
class Node{
    int data;
    Node next=null;
    Node(int data){
        this.data=data;
    }
}
public class List {
public  static void main(String[] args){
    Node n1=new Node(1);
    Node n2=new Node(2);
    Node n3=new Node(3);
    n1.next=n2;
    n2.next=n3;
    n3.next=null;
    System.out.print("使用栈的方法，从头到尾输出：");
    printListFromTailToHead(n1);
    System.out.println();
    System.out.print("使用递归的方法，从头到尾输出：");
    printListFromTailToHeadReverseList(n1);
}
public static void printListFromTailToHead(Node node){
        Stack<Integer> stack=new Stack<>();
        while (node!=null){
            stack.push(node.data);
            node=node.next;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
}
/*
使用栈，递归到最后一个结点依次开始返回，链表很长的话不适合递归，深度很大
 */

public static void  printListFromTailToHeadReverseList(Node node){
    if(node!=null) {
        if(node.next!=null){
            printListFromTailToHeadReverseList(node.next);
        }
        System.out.print(node.data+" ");
    }
}
}
