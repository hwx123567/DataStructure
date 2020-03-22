import com.sun.org.apache.xpath.internal.objects.XNodeSet;

public class BinarySearchTree<E extends Comparable<E>> {

    private Node root;
    private int size;

    private class Node{
        E element;
        Node left;
        Node right;
        Node parent;

        public Node(E element,Node parent){
            this.element = element;
            this.parent = parent;
            this.right = null;
            this.left = null;
        }

    }

    /**
     * 1. 找到父节点
     * 2. 创建新节点 node
     * 3. parent.left = node || parent.right = node
     * @param element
     */
    public void add(E element){
        //添加的第一个节点是父节点
        if(root == null){
            root = new Node(element,null);
            size++;
            return;
        }
        //添加的第一个节点不是根节点
        //找到所添加节点的父节点
        Node node = root;
        int cmp = 0;
        Node parent = root;
        while (node != null){
            cmp = compare(element,node.element);
            parent = node;
            if(cmp > 0){
                node = node.right;
            }else if(cmp < 0){
                node = node.left;
            }else {   //相等直接返回
                return;
            }
        }
        //找到父节点，最后确定插入的位置
        if(cmp > 0){
            parent.right = new Node(element,parent);
        }else {
            parent.left = new Node(element,parent);
        }
        size++;
    }


    /**
     * 前序遍历 ——  递归
     */
    public void preOrderTraversal(){
        preOrderTraversal(root);
    }
    //前序遍历以node为根的二分搜索树
    private void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.element);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    /**
     * 中序遍历
     */
    public void inOrderTraversal(){
              inOrderTraversal(root);
    }
    //中序遍历一node为根的二分搜索树
    private void inOrderTraversal(Node node){
        if (node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.element);
        inOrderTraversal(node.right);
    }


    /**
     * 树中是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(E element){
        return contains(root,element);
    }

    //以node为根的二分搜索树中是否包含元素e
    private boolean contains(Node node,E element){
        if(node == null){
            return false;
        }
        if(element.compareTo(node.element) == 0){
            return true;
        }else if(element.compareTo(node.element) < 0){
            return contains(node.left,element);
        }else {
            return  contains(node.right,element);
        }
    }





    private int compare(E e1,E e2){
        return 0;
    }


    public static void main(String[] args) {

    }


}
