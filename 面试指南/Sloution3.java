package th1;

import java.util.ArrayList;
import java.util.Stack;

public class Sloution3 {
	/*
	 * ����һ�������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ��
	 */
	 public ArrayList<Integer> printListFromTailToHead(ListNode listnode){
		Stack<Integer>  stack=new Stack<>();
		while(listnode!=null){
			stack.push(listnode.val);
			listnode=listnode.next;
		}
		ArrayList<Integer> list=new ArrayList<>();
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		return list;
	 }
	public static void main(String[] args) {
		ListNode node=new ListNode(1);
		node.next=new ListNode(4);
		node.next.next=new ListNode(3);
		node.next.next.next=new ListNode(8);
		Sloution3 s=new Sloution3();
		System.out.println(s.printListFromTailToHead(node));
	}

}
