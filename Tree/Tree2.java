import java.util.*;
import java.lang.*;
import java.io.*;


//height of abinary tree.
class Node
{
    int key;
    Node left;
    Node right;
    // Node prev;
    // Node next;
    Node(int k)
    {
        key=k;
        left=right=null;
        //Node prev=null;
        //Node next=null;
    }
}

// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         return Math.max(show(root.left),show(root.right))+1;
//     }
//     public static void main(String[] at)
//     {
//         Node root= new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);

//         System.out.println(show(root));
//     }
// }

//printing all the element after k nodes.
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
// class Tree2
// {
//     static  void kThnode(Node root,int k)
//     {
//         if(root!=null && root.key<=k)
//         {
//             kThnode(root.left,k);
//             kThnode(root.right,k);
          
//         }
//         System.out.print(root.key+" ");
        
//     }

//      public static void main(String[] at)
//     {
//         Node root= new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);

//         kThnode(root,2);
//     }

// }


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
// class Tree2
// {
//     static void show(Node root,int k)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         if(k==0)
//         {
//             System.out.print(root.key+" ");
//         }
//         else
//         {
//             show(root.left,k-1);
//             show(root.right,k-1);
//         }
//     }
//    public static void main(String[] at)
//     {
//         Node root= new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);

//         show(root,2);
//     }
// }
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
// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         return Math.max(show(root.left),show(root.right))+1;
//     }

//     static void show(Node root,int k)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         if(k==0)
//         {
//             System.out.print(root.key+" ");
//         }
//         else
//         {
//             show(root.left,k-1);
//             show(root.right,k-1);
//         }
//     }
//    public static void main(String[] at)
//     {
//         Node root= new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);

//         show(root,2);
//     }
    
// }
// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q=new LinkedList<Node>();
//         q.add(root);
//         while(!q.isEmpty())
//         {
//             Node curr = q.poll();
//             System.out.print(curr.key+" ");
//             if(curr.left!=null)
//             {
//                 q.add(curr.left);
//             }
//             if(curr.right!=null)
//             {
//                 q.add(curr.right);
//             }
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root= new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);  

//         show(root);      
//     }
// }
// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q=new LinkedList<Node>();
//         q.add(root);
//         q.add(null);
//         while(q.size()>1)
//         {
//             Node curr= q.poll();
//             if(curr==null)
//             {
//                 System.out.println();
//                 q.add(null);
//                 continue;
//             }
//             System.out.print(curr.key+" ");
//             if(curr.left!=null)
//             {
//                 q.add(curr.left);
//             }
//             if(curr.right!=null)
//             {
//                 q.add(curr.right);
//             }

//         }
//     }
//     public static void main(String[] a)
//     {
//         Node root= new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);  

//         show(root);    
//     }
// }
// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q=new LinkedList<Node>();
//         q.add(root);
//         while(q.isEmpty()==false)
//         {
//             int count= q.size();
//             for(int i=0;i<count;i++)
//             {
//                 Node curr= q.poll();
//                 System.out.print(curr.key+" ");
//                 if(curr.left!=null)
//                 {
//                     q.add(curr.left);
//                 }
//                 if(curr.right!=null)
//                 {
//                     q.add(curr.right);
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);
//         root.left= new Node(20);
//         root.right= new Node(30);
//         root.right.left=new Node(40);   
//         root.right.right=new Node(50);

//         show(root);
//     }
// }
//size of a binary tree.


// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         else

//         {
//             return 1+show(root.left)+show(root.right);
//         }
//     }
//     public static void main(String[] ar)
//     {
//         Node root = new Node(10);
//         root.left= new Node(20);
//         root.right= new Node(30);
//         root.left.left=new Node(40);   
//         root.left.right=new Node(50);
//         root.right.right=new Node(60);

//         System.out.print(show(root));
//     }
// }


// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return Integer.MIN_VALUE;
//         }
//         else
//         {
//             return Math.max(root.key,Math.max(show(root.right),show(root.left)));
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);
//         root.left= new Node(20);
//         root.right= new Node(30);
//         root.left.left=new Node(40);   
//         root.left.right=new Node(50);
//         root.right.right=new Node(60);

//         System.out.print(show(root));
//     }
// }

//Recursive method to show left view of binary tree.
// class Tree2
// {
//    static int maxlevel= 0;
//     static void show(Node root,int level)
//     {
        
//         if(root==null)
//         {
//             return ;
//         }
//         if(maxlevel<level)
//         {
//             System.out.print(root.key+" ");
//             maxlevel=level;
//         }
//         show(root.left,level+1);
//         show(root.right,level+1);
        



//     }
//     static void printview(Node root)
//     {
//         show(root,1);
//     }

//     public static void main(String[] art)
//     {
//         Node root = new Node(10);
//         root.left= new Node(20);
//         root.right= new Node(30);
//         root.left.left=new Node(40);   
//         root.left.right=new Node(50);
//         root.right.right=new Node(60);

//         printview(root);
//     }
// }

// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q= new LinkedList<Node>();
//         q.add(root);
//         while(q.isEmpty()==false)
//         {
//             int count=q.size();
//             for(int i=0;i<count;i++)
//             {
//                 Node curr= q.poll();
//                 if(i==0)
//                 {
//                     System.out.print(curr.key+" ");
//                 }       
//                 if(curr.left!=null)
//                 {
//                     q.add(curr.left);
//                 }
//                 if(curr.right!=null)
//                 {
//                     q.add(curr.right);
//                 }
//             }
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);
//         root.left= new Node(20);
//         root.right= new Node(30);
//         root.left.left=new Node(40);   
//         root.left.right=new Node(50);
//         root.right.right=new Node(60);

//         show(root);
//     }
// }

// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q= new LinkedList<>();
//         q.add(root);
//         while(q.isEmpty()==false)
//         {
//             Node curr = q.poll();
//             System.out.print(curr.key+" ");
//             if(curr.left!=null)
//             {
//                 q.add(curr.left);
//             }
//             if(curr.right!=null)
//             {
//                 q.add(curr.right);  
//             }
//         }
//     }
//     public static void main(String[] a)
//     {
//         Node root = new Node(10);
//         root.left = new Node(20);
//         root.right= new Node(30);
//         root.right.left = new Node(40);
//         root.right.right = new Node(50);
//         show(root);
//     }
// }

// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q=new LinkedList<Node>();
//         q.add(root);
//         q.add(null);
//         while(q.size()>1)
//         {
//             Node curr= q.poll();
//             // System.out.print(curr+" ");
//             // if(curr.left!=null)
//             if(curr==null)
//             {
//                 System.out.println();
//                 q.add(null);
//                 continue;
//             }
//             System.out.print(curr.key+" ");
//             if(curr.left!=null)
//             {
//                 q.add(curr.left);
//             }
//             if(curr.right!=null)
//             {
//                 q.add(curr.right);
//             }
//         }
//     }     
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);
//         root.left = new Node(20);
//         root.right= new Node(30);
//         root.right.left = new Node(40);
//         root.right.right = new Node(50);
//         show(root);
//     }      
// }

// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q= new LinkedList<Node>();
//         q.add(root);
//         while(q.isEmpty()==false)
//         {
            
//             for(int i=0;i<q.size();i++)
//             {
//                 Node curr= q.poll();
//                 System.out.print(curr.key+" ");
//                 if(curr.left!=null)
//                 {
//                     q.add(curr.left);
//                 }
//                 if(curr.right!=null)
//                 {
//                     q.add(curr.right);
//                 }
//             }
//             System.out.println();
//         }

//     } 
//     public static void main(String[] at)
//     {
//         Node root =new Node(10);
//         root.left= new Node(20);

//         root.right= new Node(30);
//         root.right.left = new Node(40);
//         root.right.right = new Node(50);
//         show(root);
//     }
// }


// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         else
//         {
//             return 1+show(root.left)+show(root.right);
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root= new Node(10);
//         root.left= new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(40);
//         root.right.right=new Node(50);

        
//         System.out.print(show(root));
//     }
// }














// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         else
//         {
//             return Math.max(root.key,Math.max(show(root.left),show(root.right)));
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);
//         root.left= new Node(20);
//         root.right= new Node(30);
//         root.left.left=   new Node(40);
//         root.left.right= new Node(50);

//         System.out.print(show(root));

//     }
// }

// class Tree2
// {
//     static int maxlevel = 0;
//     static void show(Node root,int level)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         if(maxlevel<level)
//         {
//             System.out.print(root.key+" ");
//             maxlevel=level;
//         }
//         show(root.left,level+1);
//         show(root.right,level+1);
//         // else
//         // {
//         //     System.out.print(root.key+" ");
//         //     show(root.left);
//         //     //show(root.right);
            
//         // }
//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(5);
//         root.left=new Node(6);
//         root.right=new Node(7);
//         root.left.left=new Node(8);
//         root.left.right=new Node(9);

//         show(root,1);
//     }
    
// }

// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }

//         Queue<Node> q=new LinkedList<Node>();
//         q.add(root);

//         while(q.isEmpty()==false)
//         {
            
//             for(int i=0;i<q.size();i++)
//             {
//                 Node curr = q.poll();
//                 if(i==0)
//                 {
//                     System.out.print(curr.key+" ");
//                 }
//                 if(curr.left!=null)
//                 {
//                     q.add(curr.left);
//                 }
//                 if(curr.right!=null)
//                 {
//                     q.add(curr.right);
//                 }

                
//             }
//         }

//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);   
//         root.left= new Node(20);
//         root.right=new Node(30);
//        root.right.left=new Node(40);
//     	root.right.right=new Node(50);
        
//         show(root);
//     }
// }
// class Tree2 { 
    
//     public static void main(String args[]) 
//     { 
//         Node root=new Node(10);
//     	root.left=new Node(20);
//     	root.right=new Node(30);
//     	root.left.left=new Node(40);
//     	root.left.right=new Node(50);
    	
//         printLeft(root);
//     } 
    
//     public static void printLeft(Node root){
//         if(root==null)
//             return;
//         Queue<Node > q=new LinkedList<>();q.add(root);
//         while(q.isEmpty()==false){
//             int count=q.size();
//             for(int i=0;i<count;i++){
//                 Node curr=q.poll();
//                 if(i==0)
//                     System.out.print(curr.key+" ");
//                 if(curr.left!=null)
//                     q.add(curr.left);
//                 if(curr.right!=null)
//                     q.add(curr.right);
//             }
//         }
//     }
// }

// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q= new LinkedList<Node>();
//         q.add(root);

//         while(q.isEmpty()==false)
//         {
           

//             for(int i=0;i<q.size();i++)
//             {
//                 Node curr = q.poll();
//                 System.out.print(curr.key+" ");
//                 if(curr.left!=null)
//                 {
//                     q.add(curr.left);
//                 }
//                 if(curr.right!=null)
//                 {
//                     q.add(curr.right);
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(10);
//     	root.left=new Node(20);
//     	root.right=new Node(30);
//     	root.left.left=new Node(40);
//     	root.left.right=new Node(50);
//     	root.right.left=new Node(60);
//     	root.right.right=new Node(70);

//         show(root);
//     }
// }

// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         else
//         {
//             return  show(root.left)+show(root.right)+1;
//         }
//     }
//     public static void main(String[] at)
//     {
//             Node root=new Node(10);
//             root.left=new Node(20);
//             root.right=new Node(30);
//             root.left.left=new Node(40);
//             root.left.right=new Node(50);
//             root.right.left=new Node(60);
//             root.right.right=new Node(70);

//             System.out.println(show(root));
//     }
// }

// class Tree2
// {
//     static boolean show(Node root)
//     {
//         if(root==null)
//         {
//             return true ;
//         }
//         if(root.left==null && root.right==null)
//         {
//             return true;
//         }
//         else
//         {
            
//             return ((root.key == root.left.key+root.right.key)&&show(root.left)&&show(root.right));
//         }
//     }
//     public static void main(String[] at)
//     {
        
//         Node root=new Node(3);
//     	root.left=new Node(1);
//     	root.right=new Node(2);
//     	root.left.left=new Node(1);
//     	root.left.right=new Node(0);
    	

//         System.out.println(show(root));
//     }
// }

// class Tree2
// {
//     static boolean show(Node root)
//     {
//         if(root==null)
//         {
//             return true ;
//         } 
//         int lh= height(root.left);
//         int rh= height(root.right);

//         return (Math.abs(lh-rh)<=1 && show(root.left) && show(root.right));
//     }
//     static int height(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         else
//         {
//             return Math.max(height(root.left),height(root.right))+1;
//         }
//     }
    

//     public static void main(String[] at)
//     {
//         Node root = new Node(10);
//         root.left=new Node(5);
//         root.right=new Node(30);
//         root.right.left=new Node(15);
//         root.right.right=new Node(16);
//         System.out.println(show(root));

//     }

// }

// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         int lh = show(root.left);
//         if(lh==-1)
//         {
//             return -1;

//         }
//         int rh=show(root.right);
//         if(rh==-1)
//         {
//             return -1;
//         }
//         if(Math.abs(rh-lh)>1)
//         {
//             return -1;
//         }
//         else
//         {
//             return Math.max(lh,rh)+1;
//         }

//     }
//     public static void main(String[] at)
//     {
//         Node root= new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);
//         root.left.right=new Node(50);
//         root.right.right=new Node(60);
//         root.right.right.right=new Node(70);

//         System.out.println(show(root));
//     }
// }

// class Tree2
// {
//     static int show(Node root)
//     {
//         Queue<Node> q=new LinkedList<>();
//         q.add(root);
//         int res=0;

//         while(q.isEmpty()==false)
//         {
//             int count = q.size();
//             res=Math.max(res,count);
//             for(int i=0;i<count;i++)
//             {
//                 Node curr=q.poll();
//                 if(curr.left!=null)
//                 {
//                     q.add(curr.left);
//                 }
//                 if(curr.right!=null)
//                 {
//                     q.add(curr.right);
//                 }
//             }
            
//         }
//         return res;
        
//     }
//     public static void main(String[] at)
//     {
//         Node root= new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);
//         root.left.right=new Node(50);
//         root.right.left=new Node(60);
//        // root.right.right.right=new Node(70);

//         System.out.println(show(root)); 
//     }
// }

// class Tree2
// {
//     Node prev=null;
//     static int   show(Node root)
//     {
//         if(root==null)
//         {
//             return root;
//         }
//        Node head = show(root.left);
//        if(prev==null)
//        {
//             head=root;
//        }
//        else
//        {
//             root.left=prev;
//             prev.right=root;
//        }
//        prev=root;
//        show(root.right);
//        return head;

//     }
// }

// class Tree2
// {
//     static  int idx = 0;
//     static Node show(int in[],int pre[],int start,int end)
//     {
//         if(start>end)
//         {
//             return null;
//         }
        
       
//         int curr = pre[idx++];
        
//         Node root = new Node(curr);
//         // if(start==end)
//         // {   
//         //     return root;
//         // }
//         int pos=start;
//         for(int i=start;i<=end;i++)
//         {
//             if(in[i]==root.key)
//             {
//                 pos=i;
//                 break;
//             }
//         }
//         root.left = show(in,pre,start,pos-1);
//         root.right = show(in,pre,pos+1,end);
//         return root;
//     }

//     static void inorder(Node root)
//     {
//         if(root!=null)
//         {
//             inorder(root.left);
//             System.out.print(root.key+" ");
//             inorder(root.right);
//         }
//     }
//     public static void main(String[] at)
//     {
//          int in[]={20,10,40,30,50};
//     	int pre[]={10,20,30,40,50};
//     	int n= in.length;
//     	Node root=show(in, pre, 0, n-1);
    	
//     	inorder(root);
//     }
// }
    
// // class Tree2
// // {
// //     public static void show(Node root)
// //     {
// //        if(root==null)
// //        {
// //             return ;
// //        }
// //        Queue<Node> q =new LinkedList<>();
// //        Stack<Integer> s=new Stack<>();
// //        boolean reverse= false;
       
// //        q.add(root);
// //        while(q.isEmpty()==false)
// //        {
// //             int count =q.size();
// //             for(int i=0;i<count;i++)
// //             {
// //                 Node curr = q.poll();
// //                 if(reverse)
// //                 {
// //                     s.add(curr.key);
// //                 }               
// //                 else
// //                 {
// //                     System.out.print(curr.key+" ");
// //                 }
// //                 if(curr.left!=null)
// //                 {
// //                     q.add(curr.left);
// //                 }
// //                 if(curr.right!=null)
// //                 {
// //                     q.add(curr.right);
// //                 }
// //             }

// //        }
// //        if(reverse)
// //        {
// //             while(s.isEmpty()==false)
// //             {
// //                 System.out.print(s.pop()+" ");
// //             }
// //        }
// //        reverse = !reverse;

// //     //    System.out.println();

// //     }
// //     public static void main(String[] at)
// //     {
// //         Node root=new Node(1);
// //     	root.left=new Node(2);
// //     	root.right=new Node(3);
// //     	root.left.left=new Node(4);
// //     	root.left.right=new Node(5);
// //     	root.right.left=new Node(6);
// //     	root.right.right=new Node(7);

// //         show(root);
// //     }
// // }

// class Tree2 { 
    
//     public static void main(String args[]) 
//     { 
//         Node root=new Node(1);
//     	root.left=new Node(2);
//     	root.right=new Node(3);
//     	root.left.left=new Node(4);
//     	root.left.right=new Node(5);
//     	root.right.left=new Node(6);
//     	root.right.right=new Node(7);
    	
//         printSpiral(root);
//         } 
    
//     public static void printSpiral(Node root){
//         if(root==null)return;
//         Queue<Node> q=new LinkedList<>();
//         Stack<Integer> s=new Stack<>();
//         boolean reverse=false;
//         q.add(root);
//         while(q.isEmpty()==false){
//             int count=q.size();
//             for(int i=0;i<count;i++){
//             Node curr=q.poll();
//             if(reverse)
//                 s.add(curr.key);
//             else
//                 System.out.print(curr.key+" ");
//             if(curr.left!=null)
//                 q.add(curr.left);
//             if(curr.right!=null)
//                 q.add(curr.right);
//             }
//             if(reverse){
//                   while(s.isEmpty()==false){
//                     System.out.print(s.pop()+" ");
//                 }
//             }
//         reverse=!reverse;
//         }
//     }   
// } 

// class Tree2
// {
//     static void show(Node root)
//     {
//         Stack<Integer> s=new Stack<>();
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q=new LinkedList<>();
//         boolean reverse=false;
//         q.add(root);
//         while(q.isEmpty()==false)
//         {
//             int count=q.size();
//             for(int i=0;i<count;i++)
//             {
//                 Node curr=q.poll();
//                 if(reverse)
//                 {
//                     s.push(curr.key);
//                 }
//                 else
//                 {
//                     System.out.print(curr.key+" ");
//                 }
//                 if(curr.left!=null)
//                 {
//                     q.add(curr.left);
//                 }
//                 if(curr.right!=null)
//                 {
//                     q.add(curr.right);
//                 }
//             }
//             if(reverse)
//             {
//                 while(!s.isEmpty())
//                 {
//                     System.out.print(s.pop()+" ");

//                 }
                
//             }
//             reverse=!reverse;
//                // System.out.println();
//         }

//     }
//     public static void main(String[] a)
//     {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//     	root.left.right=new Node(5);
//     	root.right.left=new Node(6);
//     	root.right.right=new Node(7);
//         show(root);
//     }
// }

// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Stack<Node> s1=new Stack<>();
//         Stack<Node> s2=new Stack<>();
//         s1.push(root);
//         while(!s1.isEmpty() || !s2.isEmpty())
//         {
//             while(!s1.isEmpty())
//             {
//                 Node temp=s1.peek();
//                 s1.pop();
//                 System.out.print(temp.key+" ");
//                 if(temp.right!=null)
//                 {
//                     s2.push(temp.right);
//                 }
//                 if(temp.left!=null)
//                 {
//                     s2.push(temp.left);
//                 }
//             }  
            
//             while(!s2.isEmpty())
//             {
//                 Node temp=s2.peek();
//                 s2.pop();
//                 System.out.print(temp.key+" ");
//                 if(temp.right!=null)
//                 {
//                     s1.push(temp.left);
//                 }
//                 if(temp.left!=null)
//                 {
//                     s1.push(temp.right);
//                 }
//             }
            
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(1);
//     	root.left=new Node(2);
//     	root.right=new Node(3);
//     	root.left.left=new Node(4);
//     	root.left.right=new Node(5);
//     	root.right.left=new Node(6);
//     	root.right.right=new Node(7);
    	
//         show(root);
//     }
// }

//Recursively.

// class Tree2
// {
//     static int height(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         else
//         {
//             return 1+Math.max(height(root.left),height(root.right));
//         }
//     }
//     static int diameter(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
        
//         int d1 = 1+height(root.left)+height(root.right);
//         int d2 = height(root.left);
//         int d3 = height(root.right);

//         return Math.max(d1,Math.max(d2,d3));    



//     }
//     public static void main(String[] a)
//     {
//         Node root=new Node(1);
//     	root.left=new Node(2);
//     	root.right=new Node(3);
//     	root.left.left=new Node(4);
//     	root.left.right=new Node(5);
//     	root.right.left=new Node(6);
//     	root.right.right=new Node(7);
    	
//         System.out.print(diameter(root));
//     }
// }
// class Tree2
// {
//     static boolean findpath(Node root,ArrayList<Node> p,int n)
//     {
//         if(root==null)
//         {
//             return false;
//         }
//         p.add(root);
//         if(root.key==n)
//         {
//             return true;
//         }
//         if(findpath(root.left,p,n)|| findpath(root.right,p,n))
//         {
//             return true;
//         }
//         p.remove(p.size()-1);
//         return false;
//     }
//     static Node LCA(Node root,int n1,int n2)
//     {
//         ArrayList<Node> path1 = new ArrayList<>();
//         ArrayList<Node> path2 = new ArrayList<>();
//         if(findpath(root,path1,n1)==false||findpath(root,path2,n2)==false)
//         {
//             return null;
//         }
//         for(int i=0;i<path1.size()&&i<path2.size();i++)
//         {
//             if(path1.get(i+1)!=path2.get(i+1))
//             {
//                 return path1.get(i);
//             }
//         }
//         return null;
//     } 
//     public static void main(String[] at)
//     {
//          Node root=new Node(10);
//     	root.left=new Node(20);
//     	root.right=new Node(30);
//     	root.right.left=new Node(40);
//     	root.right.right=new Node(50);
//     	int n1=20,n2=50;
    	
//         Node ans = LCA(root,n1,n2);
//         System.out.println("LCA " + ans.key);
//     }
// }

// class Tree2
// {
//     static Node lca(Node root,int n1,int n2)
//     {
//         if(root==null)
//         {
//             return null;
//         }
//         if(n1==root.key||n2==root.key)
//         {
//             return root;
//         }
//         Node lca1 = lca(root.left,n1,n2);
//         Node lca2 = lca(root.right,n1,n2);

//         if(lca1!=null && lca2!=null)
//         {
//             return root;
//         }
//         if(lca1!=null)
//         {
//             return lca1;
//         }
//         else
//         {
//             return lca2;
//         }

//     }
//     public static void main(String[] at)
//     {
//          Node root=new Node(10);
//     	root.left=new Node(20);
//     	root.right=new Node(30);
//     	root.right.left=new Node(40);
//     	root.right.right=new Node(50);
//     	int n1=20,n2=50;
	
// 	    Node ans=lca(root,n1,n2);
//     	System.out.println("LCA: "+ans.key);

//     }
// }

// class Depth
// {
//     int d;
//     Depth(int d)
//     {
//         this.d=d;
//     }
// }
// class Tree2
// {
    
   
//         // return res;       
    
//     public static void main(String[] at)
//     {
//         Node root=new Node(10);
//     	root.left=new Node(20);
//     	root.right=new Node(30);
//     	root.left.left=new Node(40);
//     	root.left.right=new Node(50);
//     	root.left.left.left=new Node(60);
// 	    root.left.left.left.left=new Node(70);
//     	Depth dist=new Depth(-1);int leaf=50;
	
// 	    burn(root,leaf,dist);
// 	    System.out.print(res);
//     }

//     static int res=0;

//     static int burn(Node root,int target,Depth depth)
//     {
//        // int res=0;
//         if(root==null)
//         {
//             return 0;
//         }
//         if(root.key==target)
//         {
//             depth.d=0;
//             return 1;
//         }
//         Depth ldepth=new Depth(-1);
//         Depth rdepth=new Depth(-1);
//         int lh=burn(root.left,target,depth);
//         int rh=burn(root.right,target,depth);

//         if(ldepth.d!=-1)
//         {
//             depth.d=ldepth.d+1;
//             res=Math.max(res,ldepth.d+1+rh);
//         }
//         else if(rdepth.d!=-1)
//         {
//             depth.d=rdepth.d+1;
//             res=Math.max(res,rdepth.d+1+lh);

//         }
//         return Math.max(lh,rh)+1;
//     }
// }

// // class Distance{
// //     int val;
// //     Distance(int d){val=d;}
// // }

// // class Tree2 { 
    
// //     public static void main(String args[]) 
// //     { 
// //         Node root=new Node(10);
// //     	root.left=new Node(20);
// //     	root.right=new Node(30);
// //     	root.left.left=new Node(40);
// //     	root.left.right=new Node(50);
// //     	root.left.left.left=new Node(60);
// // 	    root.left.left.left.left=new Node(70);
// //     	Distance dist=new Distance(-1);int leaf=50;
	
// // 	    burnTime(root,leaf,dist);
// // 	    System.out.print(res);
// //     } 
    
// //     static int res=0;
    
// //     public static int burnTime(Node root, int leaf, Distance dist){
// //         if(root==null)return 0;
// //         if(root.key==leaf){dist.val=0;return 1;}
// //         Distance ldist=new Distance(-1),rdist=new Distance(-1);
// //         int lh=burnTime(root.left,leaf,ldist);
// //         int rh=burnTime(root.right,leaf,rdist);
        
// //         if(ldist.val!=-1){
// //            dist.val=ldist.val+1;
// //            res=Math.max(res,dist.val+rh);
// //         }
// //         else if(rdist.val!=-1){
// //             dist.val=rdist.val+1;
// //             res=Math.max(res,dist.val+lh);
// //         }
// //         return Math.max(lh,rh)+1;
// //     }
// // } 
// class Tree2
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         return 1+show(root.left)+show(root.right);
//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);
//         root.left.right=new Node(50);

//         System.out.print(show(root)); 
//     }
// }
// class Tree2
// {
//     static int show(Node root)
//     {
//         int lh=0,rh=0;
//         Node curr=root;
//         while(curr!=null)
//         {
//             lh++;
//             curr=curr.left;
//         }
//         curr=root;
//         while(curr!=null)
//         {
//             rh++;
//             curr=curr.right;
//         }
//         if(lh==rh)
//         {
//             return Math.pow(2,lh)-1;
//         }
//         return 1+show(root.left)+show(root.right);
//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);

//         System.out.print(show(root));
//     }
// }

// class Tree2
// {
//     static void Serialization(Node root,ArrayList<Integer> arr)
//     {
//         if(root==null)
//         {
//             arr.add(-1);
//             return ;
//         }
//         arr.add(root.key);
//         Serialization(root.left,arr);
//         Serialization(root.right,arr);

//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         ArrayList<Integer> arr=new ArrayList<>();
//         Serialization(root,arr);

//         for(int x:arr)
//         {
//             System.out.print(x+" ");
//         }
//     }
// }
// class Tree2
// {
//     static void show(Node root,ArrayList<Integer> arr)
//     {
//         int index=0;
//         if(index==arr.size())
//         {
//             return null;
//         }
//         int val =arr[index];
//         index++;
//         if(val==-1)
//         {
//             return null;
//         }
//         Node root = new Node(val);
//         root.left= show(arr);
//         root.right=show(arr);
//         return root;
//     }
// }

// class Tree2
// {
//     static void show(Node root)
//     {
//         Stack<Node> st=new Stack<Node>();
//         Node curr=root;
//         while(curr!=null || st.isEmpty()==false)
//         {
//             while(curr!=null)
//             {
//                 st.push(curr);
//                 curr=curr.left;
//             }
//             curr=st.pop();
//             System.out.print(curr.key+" ");
//             curr=curr.right;
//         }
        
//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(10);
//         root.left= new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);

//        show(root);
//     }
// }
// class Tree2
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Stack<Node> st=new Stack<Node>();
//         st.push(root);
//         while(st.isEmpty()==false)
//         {
           
//             Node curr = st.pop();
//             System.out.print(curr.key+" ");
            
//             if(curr.right!=null)
//             {
//                 st.push(curr.right);
//             }
//             if(curr.left!=null)
//             {
//                 st.push(curr.left);
//             }

//         }

//     }

//     public static void main(String[] at)
//     {
//         Node root=new Node(10);
//         root.left= new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);

//        show(root);
//     }
// }
