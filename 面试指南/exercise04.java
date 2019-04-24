/*
剑值offer第二版，面试题8二叉树的下一个结点。
题目：给定一颗二叉树和其中的一个结点，如何找出中序遍历的下一个结点；
树中的结点除了有两个分别指向左、右结点的指针，还有一个指向父节点的指针。
二叉树的中序遍历：{d,b,h,e,i,a,f,c,g}，找出二叉树的下一个结点
          a
      b      c
   d   e   f   g
     h   i
     1、如果一个结点有右子树，那么它的下一个结点：就是右子树中的最左子结点；
     方法：从右子节点出发一直沿着指向左子节点的指针，就可以找到它的下一个结点。
     b的下一个结点是h；
     2、如果一个结点没有右子树，如果结点是父节点的左子节点，则下一个结点就是父节点；
     例如d是b的左子结点，且d没有右子树，d的下一个结点就是b；
     3、如果一个结点既没有右子树，并且还是父节点的右子节点，情况比较复杂：
     需要沿着父节点的指针向上遍历，直到找到一个它父节点的左子结点的结点；如果存在这样的结点，父节点就是下一个结点。
     比如i结点，没有右子树且是父节点e的右子节点；
     通过父节点的指针向上遍历，到达b结点，结点b是父节点a的左子结点；所以，a就是下一个结点；
     找出结点g的下一个结点；g没有右子树，还是c的右子节点。按照c的指针向上遍历，找到a结点，接续向上遍历，由于结点a是根结点，
     没有父结点，故g没有下一个结点。

 */
public class exercise04 {
    public BinaryTreeNode getNextNode(BinaryTreeNode pNode){
        if(pNode==null){
            return null;
        }
        BinaryTreeNode tempNode=null;
        //如果该结点有右子结点，下一个结点就是右子树的最左子节点
        if(pNode.getRight()!=null){
            tempNode=pNode.getRight();
            while (tempNode.getLeft()!=null){
                tempNode=tempNode.getLeft();
            }
            return tempNode;
        }
        //如果该结点没有右子节点，且该结点还是父节点的左子结点
        if(pNode.getParent()==null)
            return null;
        if (pNode.getParent().getLeft()==pNode){
            return pNode.getParent();
        }
        //如果该结点没有右孩子，且是父节点的右子节点；沿着
        //父节点的指针向上遍历，是它父节点的左子节点的节点。这样的节点存在就是下一个节点。
        tempNode=pNode.getParent();
        while (tempNode.getParent()!=null){
            if (tempNode.getParent().getLeft()==tempNode){
                return tempNode.getParent();
            }
            tempNode=tempNode.getParent();
        }
        return null;
    }
    public static void main(String[] argc){
        exercise04 e=new exercise04();
        BinaryTreeNode root=new BinaryTreeNode(1);
        BinaryTreeNode node2=new BinaryTreeNode(2);
        BinaryTreeNode node3=new BinaryTreeNode(3);
        BinaryTreeNode node4=new BinaryTreeNode(4);
        BinaryTreeNode node5=new BinaryTreeNode(5);
        BinaryTreeNode node6=new BinaryTreeNode(6);
        BinaryTreeNode node7=new BinaryTreeNode(7);
        BinaryTreeNode node8=new BinaryTreeNode(8);
        BinaryTreeNode node9=new BinaryTreeNode(9);
        root.setLeft(node2);
        root.setRight(node3);
        root.setParent(null);
        node2.setLeft(node4);
        node2.setRight(node5);
        node2.setParent(root);
        node3.setLeft(node6);
        node3.setRight(node7);
        node3.setParent(root);
        node4.setParent(node2);
        node5.setParent(node2);
        node5.setLeft(node8);
        node5.setRight(node9);
        node6.setParent(node3);
        node7.setParent(node3);
        node8.setParent(node5);
        node9.setParent(node5);
//类型1
        BinaryTreeNode n1=e.getNextNode(root);
        System.out.println(root.getData()+"'s Next node:"+n1.getData());
//类型2
        BinaryTreeNode n2=e.getNextNode(node4);
        System.out.println(node4.getData()+"'s Next node:"+n2.getData());
//类型3
        BinaryTreeNode n3=e.getNextNode(node9);
        System.out.println(node9.getData()+"'s Next node:"+n3.getData());




    }
}
