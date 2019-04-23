/*
二叉树，每个结点最多只有两个子结点
前序遍历：根左右
中序遍历：左根右
后序遍历：左右根
实现方式：
    递归，循环
    在o(logn)的时间里在二叉搜索树里找到一个结点
 题目：
    输入某个二叉树的前序和中序遍历的结果，重建该二叉树。假设前序和中序遍历的结果中都不含重复的数字，
    前序：{1，2，4，7，3，5，6，8}
    中序：{4，7，2，1，5，3，8，6}
    则重建二叉树，并输出头结点。
    首先在前序遍历和中序遍历中找到根、左子树、右子树对应的子序列。
    方法：
    首先根据前序遍历的第一个数字创建根结点，然后再中序遍历中找到根结点的位置。
    这样可以确定左右子树结点的数量。在前序遍历和中序遍历中划分了左子树和右子树结点的值；
    递归的调用函数，构建左右子树。
 */
 class BinaryTreeNode{
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    public BinaryTreeNode(int root){
        this.data=root;
    }
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return data;
    }
//左子树的set,get方法
    public void setLeft(BinaryTreeNode left){
        this.left=left;
    }
    public  BinaryTreeNode getLeft(){
        return left;
    }
//右子树的set，get方法
    public void setRight(BinaryTreeNode right){
        this.right=right;
    }
    public BinaryTreeNode getRight(){
        return right;
    }

}
public class binaryTree {
    /*
    preOrder前序遍历序列
    inOrder中序遍历序列
     */
    public static BinaryTreeNode reconstructe(int[] preOrder,int[] inOrder){
        if(preOrder==null|| inOrder==null||preOrder.length==0||inOrder.length==0||preOrder.length!=inOrder.length){
            return null;
        }
        //二叉树的根结点
        BinaryTreeNode root=new BinaryTreeNode(preOrder[0]);
        root.setLeft(null);
        root.setRight(null);
        //左子树的结点的个数
        int leftNum=0;
        //遍历中序序列找到根结点的位置
        for(int i=0;i<inOrder.length;i++){
            if(root.getData()==inOrder[i]){
                break;
            }else {
                leftNum++;
            }
        }
        //右子树结点的个数,不需要遍历，直接减去左子树结点的个数即可
        int rightNum=inOrder.length-1-leftNum;
        //重建左子树
        if(leftNum>0){
            //左子树的先序序列
            int[] leftPreOrder=new int[leftNum];
            //左子树的中序序列
            int[] leftInOrder=new int[leftNum];
            //将左子树的结点值分别放在相应的leftPreOrder和leftInOrder数组中
            for(int i=0;i<leftNum;i++){
                leftPreOrder[i]=preOrder[i+1];
                leftInOrder[i]=inOrder[i];
            }
            BinaryTreeNode leftRoot=reconstructe(leftPreOrder,leftInOrder);
            root.setLeft(leftRoot);
        }
        //重建右子树
        if(rightNum>0){
            //右子树的先序序列
            int[] rightPreOrder=new int[rightNum];
            //右子树的中序序列
            int[] rightInOrder=new int[rightNum];
            for (int i=0;i<rightNum;i++){
                rightPreOrder[i]=preOrder[leftNum+1+i];
                rightInOrder[i]=inOrder[leftNum+1+i];
            }
            BinaryTreeNode rightRoot=reconstructe(rightPreOrder,rightInOrder);
            root.setRight(rightRoot);
        }
        return root;


    }
    /*
    后序遍历二叉树，递归实现
     */
    public static void  printPostOrder(BinaryTreeNode root){
        if(root!=null){
            printPostOrder(root.getLeft());
            printPostOrder(root.getRight());
            System.out.print(root.getData()+" ");
        }
    }
    public static void main(String[] argc) {
    int[] preOrder={1,2,4,7,3,5,6,8};
    int[] inOrder={4,7,2,1,5,3,6,8};
    System.out.println("The head node:"+preOrder[0]);
    BinaryTreeNode root=reconstructe(preOrder,inOrder);
    printPostOrder(root);
    }
}
