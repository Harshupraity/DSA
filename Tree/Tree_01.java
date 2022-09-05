import java.util.*;
import java.lang.*;
import java.io.*;
// class Node
// {
//     int key;
//     Node left;
//     Node right;
//     Node(int k)
//     {
//         key = k;
//         left=null;
//         right=null;
//     }
// }
// class Tree_01
// {
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);
//         root.left= new Node(20);
//         root.right=new Node(30);
//         root.left.left= new Node(40);

//     }
// }

//code for inorder traversal by using recursion .
// class Node
// {
//         int key;
//         Node left;
//         Node right;
//         Node(int k)
//         {
//             key=k;
//             left=right=null;

//         }
// }
// class Tree_01
// {
//     public static void main(String[] sat)
//     {
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);

//         inorder(root);

//     }
//     public static void inorder(Node root)
//     {
//         if(root!=null)
//         {
//             inorder(root.left);//phle root(10) k liye chalega. and turant hi usko cammand milegi ki nhi phle left k liye chalo.tho vo left k liye chalega.
//             System.out.print(root.key+" ");
//             inorder(root.right); 
//         }
//     }
// }

//Preorder traversal by using recursion .
// class Node
// {
//     int key;
//     Node left,right;
//     Node(int k)
//     {
//         key=k;
//         left=right=null;
//     }
// }
// class Tree_01
// {
//     public static void preorder(Node root)
//     {
//         if(root!=null)
//         {
//             System.out.print(root.key+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }

//     }
//     public static void main(String[] at)
//     {
//       Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);
//         preorder(root);
//     }
// }


//post order traversal.
// class Node 
// {
//     int key;
//     Node left;
//     Node right;
//     Node(int k)
//     {
//         key=k;
//         left=right=null;
//     }

// } 
// class Tree_01
// {
//     public static void main(String[] sa)
//     {
//         Node root= new Node(10);
//          root.left= new Node(20);
//          root.right= new Node(30);
//          root.right.left=new Node(40);
//          root.right.right=new Node(50);

//         postorder(root);

//     }
//     static void postorder(Node root)
//     {
//         if(root!=null)
//         {
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.key+" ");
//         }
       
//     }
// }
