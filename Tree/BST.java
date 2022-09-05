import java.util.*;
import java.io.*;
import java.lang.*;

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


// //Recursive..
// // class BST 
// // {
// //     static boolean search(Node root,int x)
// //     {
// //         if(root ==null)
// //         {
// //             return false ;
// //         }
// //         if(root.key==x)
// //         {
// //             return true;
// //         }
// //         if(root.key<x)
// //         {
// //             return search(root.right,x);
// //         }
// //       //  if(root.key>x)
        
// //            return search(root.left,x);
        
// //     }
// //     public static void main(String[] a)
// //     {
// //         Node root=new Node(15);
// //     	root.left=new Node(5);
// //     	root.left.left=new Node(3);
// //     	root.right=new Node(20);
// //     	root.right.left=new Node(18);
// //     	root.right.left.left=new Node(16);
// //     	root.right.right=new Node(80);
// //     	int x=16;
    	
//     	if(search(root,x))
//     	    System.out.print("Found");
//     	else
//     	    System.out.print("Not Found");
//     }
// }

//Iterative solution.

// class BST
// {
//     static boolean search(Node root,int x)
//     {
     
//         while(root!=null)
//         {
//             if(root.key==x)
//             {
//                 return true;
//             }
//             else if(root.key<x)
//             {
//                 root = root.right;
//             }
//             else 
//             {
//                 root = root.left;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(15);
//     	root.left=new Node(5);
//     	root.left.left=new Node(3);
//     	root.right=new Node(20);
//     	root.right.left=new Node(18);
//     	root.right.left.left=new Node(16);
//     	root.right.right=new Node(80);
//     	int x=16;
    	
//     	if(search(root,x))
//     	    System.out.print("Found");
//     	else
//     	    System.out.print("Not Found");
//     }
// }

//Insertion recursive.
// class BST
// {
//     static Node insert(Node root,int x)
//     {
//         if(root==null)
//         {
//             return new Node(x);
//         }
//          if(root.key>x)
//         {
//             root.left= insert(root.left,x);
//         }
//         else if(root.key<x)
//         {
//             root.right= insert(root.right,x);
//         }
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
//         Node root=new Node(15);
//     	root.left=new Node(5);
//     	root.left.left=new Node(3);
//     	root.right=new Node(20);
//     	root.right.left=new Node(18);
//     	//root.right.left.left=new Node(16);
//     	root.right.right=new Node(80);
//     	int x=16;
//         root = insert(root,x);
//        inorder(root);
//     }

// }

//iterativaly.
// class BST
// {
//     static Node insert(Node root,int x)
//     {
//         Node temp=new Node(x);
//         Node parent = null,curr=root;
//         while(curr!=null)
//         {
//             parent=curr;
//             if(curr.key<x)
//             {
//                 curr = curr.right;
//             }
//             else if(curr.key>x)
//             {
//                 curr= curr.left;
//             }
//             else 
//             {
//                 return root;
//             }

//         }
//        if(parent==null)
//        {
//             return temp;
//        }
//        if(parent.key>x)
//        {
//         parent.left = temp;
//        }
//        if(parent.key<x)
//        {
//         parent.right = temp;
//        }
       
//         return root;
       
//     }
//         static void inorder(Node root)
//         {
//             if(root!=null)
//             {
//                 inorder(root.left);
//                 System.out.print(root.key+" ");
//                 inorder(root.right);
//             }
//         }
    
//     public static void main(String[] as)
//     {
//         Node root=new Node(15);
//     	root.left=new Node(5);
//     	root.left.left=new Node(3);
//     	root.right=new Node(20);
//     	root.right.left=new Node(18);
//     	//root.right.left.left=new Node(16);
//     	root.right.right=new Node(80);
//     	int x=16;
//         root = insert(root,x);
//        inorder(root);
//     }
    
// }

// class BST
// {
//   static boolean search(Node root,int target)
//   {
 
//     while(root!=null)
//     {
//          if(root.key==target)
//         {
//           return true;
//         }
//        else if(root.key<target)
//         {
//           //return search(root.right,target);
//           root=root.right;
//         }
//         else
//         {
//           // return search(root.left,target);
//           root=root.left;
//         }
   
      
//     }
//     return false;
//   }
//   public static void main(String[] targ)
//   {
//     Node root= new Node(10);
//     root.left=new Node(20);
//     root.right=new Node(30);
//     root.left.left=new Node(40);
//     root.left.left.right=new Node(50);
//     int target = 50;

//     System.out.print(search(root,target));
//   }
// }
// class BST { 
    
//     public static void main(String args[]) 
//     { 
//         Node root=new Node(15);
//     	root.left=new Node(5);
//     	root.left.left=new Node(3);
//     	root.right=new Node(20);
//     	root.right.left=new Node(18);
//     	root.right.left.left=new Node(16);
//     	root.right.right=new Node(80);
//     	int x=80;
    	
//     	if(search(root,x))
//     	    System.out.print("Found");
//     	else
//     	    System.out.print("Not Found");
//     } 
    
//     public static boolean search(Node root, int x){
//         while(root!=null){
//             if(root.key==x)
//                 return true;
//             else if(root.key<x)
//                 root=root.right;
//             else
//                 root=root.left;
//         }
//         return false;
//     }
// } 

// class BST
// {
//     static void inorder(Node root)
//     {
//         if(root!=null)
//         {
//             inorder(root.left);
//             System.out.print(root.key+" ");
//             inorder(root.right);
//         }
//     }
//     static Node show(Node root,int x)
//     {
//         if(root==null)
//         {
//             return new Node(x);
//         }
//         else if(root.key<x)
//         {
//             root.right= show(root.right,x);
//         }
//         else
//         {
//             root.left=  show(root.left,x);
//         }
//         return root;
//     }
//     public static void main(String[] a)
//     {
//         Node root=new Node(15);
//     	root.left=new Node(5);
//     	root.left.left=new Node(3);
//     	root.right=new Node(20);
//     	root.right.left=new Node(18);
//     	root.right.left.left=new Node(16);
//     	root.right.right=new Node(80);
//     	int x=10;

//         root = show(root,x);
//         inorder(root);
//     }
// }

// class BST
// {
//     static Node show(Node root,int x)
//     {
        
//           Node temp=new Node(x);
//           Node parent=null,curr=root;
//           while(curr!=null)
//           {
//             parent=curr;
//             if(curr.key>x)
//             {
//                 curr=curr.left;
//             }
//             else if(curr.key<x)
//             {
//                 curr=curr.right;
//             }
//             else
//             {
//                 return root;
//             }
//           
//             if(parent==null)
//             {
//                 return temp;
//             }
//             if(parent.key>x)
//             {
//                 parent.left=temp;
//             }
//             else
//             {
//                 parent.right=temp
//             }
//             }
//             return root;
// //     }
// //      static void inorder(Node root)
// //     {
// //         if(root!=null)
// //         {
// //             inorder(root.left);
// //             System.out.print(root.key+" ");
// //             inorder(root.right);
// //         }
// //     }
// //     public static void main(String[] a)
// //     {
// //         Node root=new Node(15);
// //     	root.left=new Node(5);
// //     	root.left.left=new Node(3);
// //     	root.right=new Node(20);
// //     	root.right.left=new Node(18);
// //     	root.right.left.left=new Node(16);
// //     	root.right.right=new Node(80);
// //     	int x=10;
// //         root = show(root,x);
// //         inorder(root);
//     }
// }

// class BST
// {
//     static Node Deletion(Node root,int x)
//     {
//         if(root==null)
//         {
//             return null;
//         }
//         if(root.key>x)
//         {
//             root.left=Deletion(root.left,x);
//         }
//         else if
//         {
//             root.right=Deletion(root.right,x);
//         }
//         else
//         {
//             if(root.left==null)
//             {
//                 return root.right;
//             }
//             if(root.right==null)
//             {
//                 return root.left;
//             }

//             Node succ = getSucc(root);
//             root.key=succ.key;
//             root.right=Deletion(root.right,succ.key);
//         }
//         return root;

//     }
//     Node getSucc(Node root)
//     {
//         Node curr= root.right;
//         while(curr!=null && curr.left!=null)
//         {
//             curr=curr.left;
//         }
//         return curr;
//     }
// } 
// class BST
// {
//     static Node show(Node root,int floor)
//     {
//         Node res=null;
//         // while(root!=null)
//         // {
//         //     if(root.key==floor)
//         //     {
//         //         return root;
//         //     }
//         //     else if(root.key>floor)
//         //     {
//         //         root=root.left;
//         //     }
//         //     else
//         //     {
//         //         res=root;
//         //         root=root.right;
//         //     }
//         // }
//         // return res;
//         if(root==null)
//         {
//             return null;
//         }
//         else if(root.key>floor)
//         {
//             root.left=show(root.left,floor);
//         }
//         else
//         {
//             root.right-show(root.right,floor); 
//         }
//     }
//     public static void main(String[] a)
//     {
//         Node root=new Node(15);
//     	root.left=new Node(5);
//     	root.left.left=new Node(3);
//     	root.right=new Node(20);
//     	root.right.left=new Node(18);
//     	root.right.left.left=new Node(16);
//     	root.right.right=new Node(80);
//     	int floor=17;
    	
//     	System.out.print("Floor: "+(show(root,floor).key));
//     }

// }

// class BST
// {
//     // static void inorder(Node root)
    // {
    //     if(root!=null)
    //     {
    //         inorder(root.left);
    //         System.out.print(root.key+" ");
    //         inorder(root.right);
    //     }
    // }
    // static Node show(Node root,int x)
    // {
    //     Node res=null;
    //     while(root!=null)
    //     {
    //         if(root.key==x)
    //         {
    //             return root;
    //         }
    //         else if(root.key<x)
            // {
                
            //     root=root.right;
            // }
            // else
            // {
            //     res=root;
            //     root=root.left;
            // }
    //     }
    //     return res;
    // }
    // public static void main(String[] s)
    // {
    //     Node root=new Node(15);
    // 	root.left=new Node(5);
    // 	root.left.left=new Node(3);
    // 	root.right=new Node(20);
    	// root.right.left=new Node(18);
    	// root.right.left.left=new Node(16);
    	// root.right.right=new Node(80);
    	// int x=17;
        // root=show(root,x);
       // System.out.print("ceil:"+show(root,x).key);
        // inorder(root);

//     }
// }

// class BST
// {
//    //using functions
//    public static void main(String[] a)
//    {
//     TreeSet<String> s=new TreeSet<String>();
//     //element are add .
//     s.add("gfg");
//     s.add("courses");
//     s.add("ide");
//     s.remove("ide");
//     // s.contains("gfg");

//     //To print the element of the tree.
//     // System.out.println(s);
    
//     //To iterative over the tree.

//     Iterator<String> i= s.iterator();
//     while(i.hasNext())
//     {
//         System.out.println(i.next());
//     }


//    }
// }
// class BST
// {
//     public static void main(String[] at)
//     {
//         TreeMap<Integer,String> t=new TreeMap<Integer,String>();
//         t.put(15,"geeks");
//         t.put(10,"courses");
//         t.put(20,"ide");
//         // System.out.println(t);
//         // System.out.println(t.containsKey(10));
//         for(Map.Entry<Integer,String> e:t.entrySet())
//         {
//             System.out.println(e.getKey()+" "+e.getValue());//print value in sorted order as in hashMap
//         }
//     }
// }

// class BST
// {
//     static void printceiling(int arr[],int n)
//     {
//         System.out.print("-1"+" ");
//         TreeSet<Integer> s=new TreeSet<>();
//         s.add(arr[0]);
//         for(int i=1;i<n;i++)
//         {
//             if(s.ceiling(arr[i])!=null)
//             {
//                 System.out.print(s.ceiling(arr[i])+" ");    
//             }
//             else
//             {
//                 System.out.print("-1"+" ");
//             }

//             s.add(arr[i]);
//         }
//     }
//     public static void main(String[] at)
//     {
//         int arr[]={2,8,30,15,25,12};
//         int n=arr.length;
//         printceiling(arr,n);
//     }
// }

// class BST
// {
//     static int count=0;
//     static void show(Node root,int k)
//     {
        
//         if(root!=null)
//         {
//             show(root.left,k);
//             count++;
//             if(count==k)
//             {
//                 System.out.print(root.key);
//                 return ;
//             }
//             show(root.right,k);
//             //System.out.print(root.key+" ");
//         }
      
//     }
//     public static void main(String[] at)
//     {
//         Node root=new Node(50);
//         root.left=new Node(20);
//         root.right=new Node(100);
//         root.left.left=new Node(10);
//         root.left.right=new Node(40);
//         root.right.left=new Node(70);
//         root.right.right=new Node(120);
//         int k=3;

//         show(root,k);
//     }
// }

// 2nd approach. 
// class BST
// {

//     static int minvalue(Node root)
//     {
//         if(root==null)
//         {
//             return Integer.MAX_VALUE;
//         }
//         int res=root.key;
//         int lres=minvalue(root.left);
//         int rres=minvalue(root.right);

//         if(lres<res)
//         {
//             res=lres;
//         }
//         if(rres<res)
//         {
//             res=rres;
//         }
//         return res;

//     }
//     static int maxvalue(Node root)
//     {
//         if(root==null)
//         {
//             return Integer.MIN_VALUE;
//         }
//         int res=root.key;
//         int lres=maxvalue(root.left);
//         int rres=maxvalue(root.right);

//         if(lres>res)
//         {
//             res=lres;
//         } 
//         if(rres>res)
//         {
//             res=rres;
//         }
//         return res;
//     }
//     static int checkBst(Node root)
//     {
//         if (root == null)
//         {
//             return 1; 
//         }  
             
//         if(root.left!=null && maxvalue(root.left)>root.key)
//         {
//             return 0;
//         }
//         if(root.right!=null && minvalue(root.right)<root.key)
//         {
//             return 0;
//         }
//         if(checkBst(root.left)==0 || checkBst(root.right)==0)
//         {
//             return 0; 
//         }

//         return 1;
//     }
//     public static void main(String[] at)
//     {
//          Node root = new Node(4);  
//         root.left = new Node(2);  
//         root.right = new Node(5);  
//         root.left.left = new Node(1);  
//         root.left.right = new Node(3);  
          
//         if (checkBst(root)==1) 
//             System.out.println("IS BST"); 
//         else
//             System.out.println("Not a BST");
//     }
// }
// class BST
// {
//     static boolean show(Node root,int min,int max)
//     {
//         if(root==null)
//         {
//             return true;
//         }
//         else
//         {
//             return (root.key>min && root.key<max && show(root.left,min,root.key) && show(root.right,root.key,max));
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(4);  
//         root.left = new Node(2);  
//         root.right = new Node(5);  
//         root.left.left = new Node(1);  
//         root.left.right = new Node(3);  
          
//          if (show(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) 
//             System.out.println("IS BST"); 
//         else
//             System.out.println("Not a BST");
//     }
// }

// class BST
// {
//     static int prev=Integer.MIN_VALUE;
//     public static boolean isBST(Node root)  
//     {  
//         if (root == null)  
//             return true;  
        
//         if(isBST(root.left)==false)return false;
        
//         if(root.key<=prev)return false;
//         prev=root.key;
        
//         return isBST(root.right);
//     }
    
//     public static void main(String args[])
//     {
//         Node root = new Node(4);  
//         root.left = new Node(2);  
//         root.right = new Node(5);  
//         root.left.left = new Node(1);  
//         root.left.right = new Node(3);  
          
//         if (isBST(root)) 
//             System.out.println("IS BST"); 
//         else
//             System.out.println("Not a BST");
            
//         System.out.println(prev);
//     }
// }

//Naive apr
// class BST
// {
//     static void show(Node root)
//     {
//         int prev = Integer.MIN_VALUE;
//         first=null;
//         second= null;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]<prev)
//             {
//                 if(first==null)
//                 {
//                     first=prev;
//                 }
//                 second = arr[i];
//             }
//             prev=arr[i];
//         }
//     }
//     public static void main(String[] st)
//     {
//         Node root = new Node(18);  
//         root.left = new Node(60);  
//         root.right = new Node(70);  
//         root.left.left = new Node(4);  
//         root.right.left = new Node(8);
//         root.right.right = new Node(80);  


//     }
// }

// class BST
// {
//     static void inorder(Node root)
//     {
//         if(root!=null)
//         {
//             inorder(root.left);
//             System.out.print(root.key+" ");
//             inorder(root.right);
//         }
//     }
//    static Node prev=null,first=null,second=null;
//     static void  show(Node root)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         show(root.left);
//         if(prev!=null && root.key<prev.key)
//         {
//             if(first==null)
//             {
//                 first = prev;
//             }
//             second = root;
//         }
//         prev=root;
//         show(root.right);
//     }
//     public static void main(String[] aa)
//     {
//         Node root = new Node(18);  
//         root.left = new Node(60);  
//         root.right = new Node(70);  
//         root.left.left = new Node(4);  
//         root.right.left = new Node(8);
//         root.right.right = new Node(80);  
//           inorder(root); 
//         System.out.println();;
//         show(root);
//         int temp=first.key;
//         first.key=second.key;
//         second.key=temp;
//         inorder(root);

//     }
// }

// class BST
// {
//     static ArrayList<Integer> show(Node root,ArrayList<Integer> list)
//     {
//         //ArrayList<Integer> li = new ArrayList<Integer>();
//         if(root==null)
//         {
//             return list;
//         }

//         show(root.left,list);
//         list.add(root.key);
//         show(root.right,list);

//         return list;
//     }
//     static boolean is(Node root,int target)
//     {
//         ArrayList<Integer> a1=new ArrayList<>();

//         ArrayList<Integer> a2 = show(root,a1);
//         int start=0;
//         int end = a2.size()-1;
//         while(start<end)
//         {
//             if(a2.get(start)+ a2.get(end) == target)
//             {
//                 System.out.println("Pair Found: " + a2.get(start) + " + " + a2.get(end) + " "
//                                    + "= " + target); 
                
//                 return true;
//             }
//             if(a2.get(start)+a2.get(end)>target)
//             {
//                 end--;
//             }
//             if(a2.get(start)+a2.get(end)<target)
//             {
//                 start++;
//             }
//         }
//         System.out.println("No such values are found !");
//         return false;


//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);  
//         root.left = new Node(8);  
//         root.right = new Node(20);  
//         root.left.left = new Node(4);
//         root.left.right = new Node(9);
//         root.right.left = new Node(11);
//         root.right.right = new Node(30);  
//         root.right.right.left = new Node(25);
        
//         int sum=33;
        
//         is(root,sum);
//     }
    
        

// }
// class BST
// {
//     static boolean show(Node root,int sum,HashSet<Integer> s)
//     {
//         if(root==null)
//         {
//             return false;
//         }
//         if(show(root.left,sum,s)==true)
//         {
//             return true;
//         }
//         if(s.contains(sum-root.key))
//         {
//             return true;
//         }
//         else
//         {
//             s.add(root.key);
//         }
//         return  show(root.right,sum,s);
//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);  
//         root.left = new Node(8);  
//         root.right = new Node(20);  
//         root.left.left = new Node(4);
//         root.left.right = new Node(9);
//         root.right.left = new Node(11);
//         root.right.right = new Node(30);  
//         root.right.right.left = new Node(25);
        
//         int sum=33;
        
//         HashSet<Integer> s=new HashSet<>();    
//         System.out.print(show(root,sum,s));
//     }
// }
// class BST
// {
//     static void Vsum(Node root,int hd,TreeMap<Integer,Integer> mp)
//     {
//         if(root==null)
//         {
//             return ;
//         }
//         Vsum(root.left,hd-1,mp);
//         int sum = (mp.get(hd)==null)?0:mp.get(hd);
//         mp.put(hd,root.key+sum);
//         Vsum(root.right,hd+1,mp);
//     }
//     static void show(Node root)
//     {
//         TreeMap<Integer,Integer> mp=new TreeMap<Integer,Integer>();
//         Vsum(root,0,mp);

//         for(Map.Entry sum:mp.entrySet())
//         {
//             System.out.print(sum.getValue()+" ");    
//         }
//     }
//     public static void main(String[] at)
//     {
//         Node root = new Node(10);  
//         root.left = new Node(20);  
//         root.right = new Node(50);  
//         root.left.left = new Node(30);
//         root.left.right = new Node(40);
        
//         show(root);
//     }
// }
// class Pair 
// {
//     Node node;
//     int hd;
//     Pair(Node n,int h)
//     {
//         node = n;
//         hd=h;
//     }
// }
// class BST
// {
//     static void Vertical(Node root)
//     {
//         Queue<Pair> q=new LinkedList<Pair>();
//         Map<Integer,ArrayList<Integer>> mp=new TreeMap<>();
//         q.add(new Pair(root,0));
//         while(!q.isEmpty())
//         {
//             Pair p=q.poll();
//             Node curr=p.node;
//             int hd=p.hd;

//             if(mp.containsKey(hd))
//             {
//                 mp.get(hd).add(curr.key);
//             }
//             else
//             {
//                 ArrayList<Integer> al=new ArrayList<Integer>();
//                 al.add(curr.key);
//                 mp.put(hd,al);
//             }
//             if(curr.left!=null)
//             {
//                 q.add(new Pair(curr.left,hd-1));
                
//             }
//             if(curr.right!=null)
//             {
//                 q.add(new Pair(curr.right,hd+1));
//             }
//         }
    
//      for(Map.Entry<Integer,ArrayList<Integer>> p:mp.entrySet()){
//             ArrayList<Integer> al=p.getValue();
//             for(int x: al)
//                 System.out.print(x+" ");
//             System.out.println();
//      }
//     }
//     public static void main(String[] at)
//     {
//          Node root = new Node(10);  
//         root.left = new Node(20);  
//         root.right = new Node(30);  
//         root.left.left = new Node(40);
//         root.left.right = new Node(50);
        
//         Vertical(root);
//     }
// }
class BST
{
    static void show(Node root)
    {
          if(root==null)return false;
        
        if(isPairSum(root.left,sum,s)==true)
            return true;
            
        if(s.contains(sum-root.key))  
            return true;
        else
            s.add(root.key);
        return isPairSum(root.right,sum,s);
    }
}