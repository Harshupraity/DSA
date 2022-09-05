import java.util.*;
import java.lang.*;
import java.io.*;

// class Node  
// { 
//   int key; 
//   Node left; 
//   Node right; 
//   Node(int k){
//       key=k;
//       left=right=null;
//   }
// }

// class revtree 
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q=new LinkedList<>();
//         q.add(root);
//         while(q.isEmpty()==false)
//         {
//             Node curr=q.poll();
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
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);

//         show(root);
//     }
// }
// class revtree
// {
//     static void show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Queue<Node> q=new LinkedList<>();
//         q.add(root);
//        // q.add(null);
//         while(q.isEmpty()==false)
//         {
//             int count=q.size();
//             for(int i=0;i<count;i++)
//             {
//                 Node curr=q.poll();
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
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);
//         root.left.right=new Node(50);
//         root.left.left.left=new Node(60);

//         show(root);
//     }
// }

// class revtree
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         else 
//         {
//             return show(Math.max(root.left,root.right));
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);
//         root.left.right=new Node(50);

//         System.out.print(show(root));
//     }
// }
// class revtree
// {
//     static int show(Node root)
//     {
//         if(root==null)
//         {
//             return Integer.MIN_VALUE;
//         }
//         else
//         {
//             return Math.max(root.key,Math.max(show(root.left),show(root.right)));
//         }
//     }
//     public static void main(String[] t)
//     {
       
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);
//         root.left.right=new Node(50);

//         System.out.print(show(root));
//     }
// }

// class revtree
// {
//     static int Multilevel=0;
//     static void show(Node root,int level)
//     {
//         if(root==null)
//         {
//             return ;
           
//         }
//         while(Multilevel<level)
//         {
//             System.out.print(root.key+" ");
//             Multilevel=level;
//         }
//         show(root.left,level+1);
//         show(root.right,level+1);

//     }
//     static void printleft(Node root)
//     {
//         show(root,1);
//     }
//     public static void  main(String[] at)
//     {
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.left.left=new Node(40);
//         root.left.right=new Node(50);
//         int level=1;

//         printleft(root);
//     }
// }

// class revtree
// {
//     static boolean show(Node root)
//     {
//       if(root==null)
//       {
//         return true;
//       }
//       if(root.left==null && root.right==null)
//       {
//         return true;
//       }
//       int sum=0;
//       if(root.left!=null)
//       {
//             sum+=root.left.key;
//       }
//       else if(root.right!=null)
//       {
//             sum+=root.right.key;
//       }


//       return (root.key==sum && show(root.left)&& show(root.right));
 

//     }
//     public static void main(String[] at)
//     {
//         Node root=new  Node(20);
//         root.left=new Node(8);
//         root.right=new Node(12);
//         root.right.left=new Node(3);
//         root.right.right=new Node(9);

//         System.out.print(show(root));
//     }
// }

// class revtree
// {
//     public static void main(String args[]) 
//     { 
//         Node root=new Node(20);
//     	root.left=new Node(8);
//     	root.right=new Node(12);
//     	root.right.left=new Node(3);
//     	root.right.right=new Node(9);
    	
//         System.out.print(isCSum(root));
//     } 
    
//     public static boolean isCSum(Node root){
//         if(root==null)
//             return true;
//         if(root.left==null && root.right==null)
//             return true;
//         int sum=0;
//         if(root.left!=null)sum+=root.left.key;
//         if(root.right!=null)sum+=root.right.key;
        
//         return (root.key==sum && isCSum(root.left) && isCSum(root.right));
//     }

// }

//class revtree
// {
//     static boolean show(Node root)
//     {
//         if(root==null)
//         {
//             return true ;
//         }
//         int lh=height(root.left);
//         int rh=height(root.right);

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
        
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(15);
//         root.right.right=new Node(20);

//         System.out.print(show(root));
//     }
// }

// class revtree
// {
//     static int isBalanced(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         int lh=isBalanced(root.left);
//         if(lh==-1)
//         {
//             return -1;
//         }
//         int rh=isBalanced(root.right);
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
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(15);
//         root.right.right=new Node(20);

//         if(isBalanced(root)>0)
//     	    System.out.print("Balanced");
//     	else
//     	    System.out.print("Not Balanced");
//     }
// }
// class revtree
// {
//     static int show(Node root)
//     {
        
//         if(root==null)
//         {
//             return 0;
//         }
//         Queue<Node> q=new LinkedList<>();
//         q.add(root);
//         int res=0;
//         while(q.isEmpty()==false)
//         {
//             int count=q.size();
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
//           //  System.out.println();
//         }
//         return res;
//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(10);
//         root.left=new Node(20);
//         root.right=new Node(30);
//         root.right.left=new Node(15);
//         root.right.right=new Node(20);
//         System.out.print(show(root));
//     }
// }

// class revtree
// {
//   static Node prev = null;
//   static Node show(Node root)
//   {
//     if(root==null)
//     {
//       return root;
//     }
//     Node head = show(root.left);
//     if(prev==null)
//     {
//       head=root;
//     }
//     else
//     {
//       root.left=prev;
//       prev=root;
//     }
//     prev=root;
//     show(root.right);
//     return head;
//   }
//   static void inorder(Node root)
//   {
//     if(root==null)
//     {
//       return ;
//     }
//     inorder(root.left);
//     System.out.print(root.key+" ");
//     inorder(root.right);
//   }
//   public static void  main(String[] at)
//   {
//     Node root=new Node(10);
//     root.left=new Node(20);
//     root.right=new Node(30);
//     root.right.left=new Node(40);

//     root=show(root);
//     inorder(root);
//   }
// }
// class revtree
// {  
//   static int idx = 0;
//   static Node buildTree(int preorder[],int inorder[],int start,int end)
//   {
    
//     if(start>end)
//     {
//       return null;
//     }
//     int curr=preorder[idx++];
    
//     Node node=new Node(curr);
//     int pos=0;
//     for(int i=start;i<=end;i++)
//     {
//         if(inorder[i]==curr)
//         {
//             pos=i;
//             break;
//         } 
//     }
//     node.left=buildTree(preorder,inorder,start,pos-1);
//     node.right=buildTree(preorder,inorder,pos+1,end);

//     return node;
//   }
//     static void show(Node root)
//     {
//       if(root!=null)
//       {
        
      
      
      
//         show(root.left);
//         System.out.print(root.key+" ");
//         show(root.right);
//       }
//     }
  
//   public static void main(String[] at)
//   {
//       int preorder[]={1,2,4,3,5};
//       int inorder[]={4,2,1,5,3};
//       int start=0;
//       int end = inorder.length-1;

//     Node allu = buildTree(preorder,inorder,start,end);
//     show(allu);

//   }
// }
// class revtree
// {
//     static void show(Node root)
//     {
//       if(root==null)
//       {
//         return ;
//       }
//       Stack<Integer> st=new Stack<>();
//       Queue<Node> q=new LinkedList<>();
//       q.add(root);
//       boolean reverse=false;
//       while(q.isEmpty()==false)
//       {
//         int count=q.size();
//         for(int i=0;i<count;i++)
//         {
//           Node curr = q.poll();
//           if(reverse==true)
//           {
//             st.push(curr.key);
//           }
//           else
//           {
//             System.out.print(curr.key+" ");
//           }
//           if(curr.left!=null)
//           {
//             q.add(curr.left);
//           }
//           if(curr.right!=null)
//           {
//             q.add(curr.right);
//           }
//         }
//         if(reverse==true)
//         {
//           while(st.isEmpty()==false)
//           {
//             System.out.print(st.pop()+" ");
//           }
//         }
//         reverse=!reverse;
//       }
      
//     }
//     public static void main(String[] at)
//     {
//        Node root=new Node(1);
//     	root.left=new Node(2);
//     	root.right=new Node(3);
//     	root.left.left=new Node(4);
//     	root.left.right=new Node(5);
//     	root.right.left=new Node(6);
//     	root.right.right=new Node(7);
    	
//       show(root);
//     }
// }

// class revtree
// {
//   static void show(Node root)
//   {
//     if(root==null)
//     {
//       return ;
//     }
//     Stack<Node> s1=new Stack<>();
//     Stack<Node> s2=new Stack<>();

//     s1.add(root);

//     while(s1.isEmpty()==false||s2.isEmpty()==false)
//     {
//         while(!s1.isEmpty())
//         {
//           Node temp=s1.peek();
//           s1.pop();
//           System.out.print(temp.key+" ");

//           if(temp.left!=null)
//           {
//             s2.add(temp.left);
//           }
//           if(temp.right!=null)
//           {
//             s2.push(temp.right);
//           }
//         }
//         while(!s2.isEmpty())
//         {
//           Node temp=s2.peek();
//           s2.pop();
//           System.out.print(temp.key+" ");

//           if(root.left!=null)
//           {
//             s1.add(temp.left);
//           }
//           if(root.right!=null)
//           {
//             s1.add(temp.right);
//           }
//         }
//     }

//   }
//   public static void main(String[] at)
//   {
//     Node root=new Node(1);
//     	root.left=new Node(2);
//     	root.right=new Node(3);
//     	root.left.left=new Node(4);
//     	root.left.right=new Node(5);
//     	root.right.left=new Node(6);
//     	root.right.right=new Node(7);
    	
//       show(root);
//   }
// }

// class revtree
// {
//   static boolean findpath(Node root,ArrayList<Node> p,int n)
//   {
//     if(root==null)
//     {
//       return false;
//     }
//     if(root.key==n)
//     {
//       return true;
//     }
//     if(findpath(root.left,p,n)||findpath(root.right,p,n))
//     {
//       return true;
//     }
//     p.remove(p.size()-1);
//     return false;
//   }
//   static Node LCA(Node root,int n1,int n2)
//   {
//     ArrayList<Node> path1=new ArrayList<>();
//     ArrayList<Node> path2=new ArrayList<>();

//     if(findpath(root,path1,n1)==false||findpath(root,path2,n2)==false)
//     {
//       return null;
//     }
//     for(int i=0;i<path1.size()-1&&i<path2.size()-1;i++)
//     {
//       if(path1.get(i+1)!=path2.get(i+2))
//       {
//           return path1.get(i);
//       }


//     }
//     return null;

//   }
//   public static void main(String[] at)
//   {
//       Node root=new Node(10);
//     	root.left=new Node(20);
//     	root.right=new Node(30);
//     	root.right.left=new Node(40);
//     	root.right.right=new Node(50);
//     	int n1=20,n2=50;

//       Node ans=LCA(root,n1,n2);
//       System.out.println("LCA:"+ans.key);
//   }
// }
// class revtree

// {
//   static Node lca(Node root,int n1,int n2)
//   {
//     if(root==null)
//     {
//       return null;
//     }
//     if(root.key==n1||root.key==n2)
//     {
//       return root;
//     }
//     Node lca1=lca(root.left,n1,n2);
//     Node lca2= lca(root.right,n1,n2);

//     if(lca1!=null && lca2!=null)
//     {
//       return root;
//     }
//     if(lca1!=null)
//     {
//       return lca1;
//     }
//    else
//     {
//       return lca2;
//     }
//   }
//   public static void main(String[] a)
//   {
//      Node root=new Node(10);
//     	root.left=new Node(20);
//     	root.right=new Node(30);
//     	root.right.left=new Node(40);
//     	root.right.right=new Node(50);
//     	int n1=20,n2=50;
	
// 	    Node ans=lca(root,n1,n2);
//     	System.out.println("LCA: "+ans.key);
//   }
// // }
// class revtree
// {
//   static int lca(Node root,int n1,int n2)
//   {
//       ArrayList<Integer> path1=new ArrayList<>();
//       ArrayList<Integer> path2=new ArrayList<>();

//       if(!getpath(root,n1,path1)||!getpath(root,n2,path2))
//       {
//         return -1;
//       }
//       for(int i=0;i<path1.size()&&i<path2.size();i++)
//       {
//         if(path1.get(i+1)!=path2.get(i+1))
//         {
//           return true;
//        //   break:
//         }
//       }
      
      

//   }
//   static boolean getpath(Node root,int target,ArrayList<Integer> p)
//   {
//     if(root==null)
//     {
//       return null;
//     }
//     if(root.key==target)
//     {
//       return true;
//     }
//     if(getpath(root.left,target,p)&&getpath(root.right,target,p))
//     {
//       return true;
//     }
    
//     p.remove(p.size()-1);
//     return false;

//   }
// }
// class Depth
// {
//   int d;
//   Depth(int d)
//   {
//     this.d=d;
//   }
// }
// class  revtree
// {
//   static int ans=-1;
//   static int show(Node root,int target,Depth depth)
//   {
//     if(root==null)
//     {
//       return 0;
//     }
//     if(root.data==target)
//     {
//       depth.d=1;
//       return 1;
//     }
//     Depth ld=new Depth(-1);
//     Depth rd=new Depth(-1);

//     int lh=show(root.left,target,ld);
//     int rh=show(root.right,target,rd);

//     if(ld.d!=-1)
//     {
//       ans = Math.max(ans,ld.d+1+rh);
//       depth.d=ld.d+1;
//     }
//     else if(rd.d!=-1)
//     {
//         ans=math.max(ans,rd.d+1+lh);
//         depth.d=rd.d+1;
//     }

//     return Math.max(lh,rh)-1;

//     }
// }

// class revtree
// {
//   static int show(Node root)
//   {
//       if(root==null)
//       {
//         return 0;
//       }
//       else
//       {
//         return 1+show(root.left)+show(root.right);
//       }
//   }
  
// }
// class revtree
// {
//   static int show(Node root)
//   {
//     int lh=0,rh=0;
//     Node curr=root;
//     while(curr!=null)
//     {
//       lh++;
//       curr=curr.left;
//     }
//     while(curr!=null)
//     {
//       rh++;
//       curr=curr.right;
//     }
//     if(lh==rh)
//     {
//       return (int)Math.pow(2,lh)-1;
//     }
//     else
//     {
//       return 1+show(root.left)+show(root.right);
//     }
//   }
//   public static void main(String[] st)
//   {
//     Node root=new Node(10);
//     	root.left=new Node(20);
//     	root.right=new Node(30);
//     	root.right.left=new Node(40);
//     	root.right.right=new Node(50);

//       System.out.print(show(root));
//   }
// }

