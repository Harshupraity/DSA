import java.util.*;
import java.lang.*;
import java.io.*;

// class MyStack 
// {
//     int arr[];
//     int cap;
//     int top;
//     MyStack(int c)
//     {
//         top=-1;
//         cap=c;
//         arr = new int[cap];


//     }
//      void push(int x)
//     {
//         top++;
//         arr[top]=x;
//     }
//      int pop()
//     {
//         int res= arr[top];
//         top--;
//         return res;
//     }
//      int size()
//     {
//         return top+1;
//     }
//     boolean isEmpty()
//     {
//         return (top==-1);
//     }
// }
// class stack
// {
//     public static void main(String[] at)
//     {
//         MyStack s= new MyStack(5);
//         s.push(10);
//         s.push(20);
//         System.out.print(s.pop());
//         s.push(30);
//         System.out.print(s.pop());
//     }
// }
// class MyStack
// {
//     ArrayList<Integer> al = new ArrayList<Integer>();
//     void push(int x)
//     {
//         al.add(x);
//     }
//     int pop()
//     {
//         int res= al.get(al.size()-1);
//         al.remove(al.size()-1);
//         return res;
//     }
//     int peek()
//     {
//         return al.get(al.size()-1);

//     }
//     boolean isEmpty()
//     {
//         return al.isEmpty();
//     }
//     boolean size()
//     {
//         return al.size();
//     }
// }
// class Node 
// {
//     int data;
//     Node next;
//     Node(int d)
//     {
//         data = d;
//         next= null;
//     }
// }
// class MyStack
// {
//     Node head;
//     int size;
//     MyStack()
//     {
//         head= null;
//         size=0; 
//     }
//     int size()
//     {
//         return size;
//     }
//     boolean isEmpty()
//     {
//         return (head==null);
//     }
//     void push(int x)
//     {
//         Node temp= new Node(x);
//         temp.next= head;
//         head= temp;
//         size++;

//     }
//     int pop()
//     {
//         if(head==null)
//         {
//             return Integer.MAX_VALUE;
//         }
//         int res= head.data;
//         Node temp=head;
//         head= head.next;
//         size--;
//         return res;
//     }
//     int peek()
//     {
//         if(head==null)
//         {
//             return Integer.MAX_VALUE;
//         }
//         return head.data;
//     }
// }
// class 
// {
//     public static void main(String[] ar)
//     {
//             MyStack s= new MyStack();
//             s.push(5);
//             s.push(10);
//             s.push(15);
//             System.out.println(s.pop());
//             System.out.println(s.size());
//             System.out.println(s.isEmpty());    
//     }
// }
// class stack
// {
//     public static void main(String[] at)
//     {
        //Stack<Integer> stack= new Stack<>();   this and below one is same .
        // ArrayDeque<Integer> s = new ArrayDeque<>();
        // s.push(10);
        // s.push(20);
        // s.push(30);
        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        // System.out.println(s.size());
        // System.out.println(s.isEmpty());
//     }
// }
// class stack
// {
//      static boolean matching(char a,char b)
//         {
//             return ((a=='(' && b==')')||
//                     (a=='{' && b=='}')||
//                     (a=='[' && b==']'));

//         }
//      static boolean isBalanced(String str)
//     {
//         Deque<Character> s= new ArrayDeque<>();
       
//         for(int i=0;i<str.length();i++)
//         {
//             char x= str.charAt(i);
//             if(x=='('||x=='{'||x=='[')
//             {
//                 s.push(x);
//             }
//             else
//             {
//                 if(s.isEmpty()==true)
//                 {
//                     return false;
//                 }
//                 else if(matching(s.peek(),x)==false)
//                 {
//                     return false;
//                 }
//             else
//             {
//                 s.pop();
//             }
//         }
//         }
//         return (s.isEmpty()==true); 

//     }
//     public static void main(String[] at)
//     {
//         String str = "{()}[]"; 

//         if (isBalanced(str)) 
//             System.out.print("Balanced"); 
//         else
//             System.out.print("Not Balanced");
//     }
// }
// import java.io.*;
// import java.util.*;


// class TwoStacks { 
//     int cap; 
//     int top1, top2; 
//     int arr[]; 
  
//     TwoStacks(int n) 
//     { 
//         arr = new int[n]; 
//         cap = n; 
//         top1 = -1; 
//         top2 = cap; 
//     } 
  
//     void push1(int x) 
//     { 
//         if (top1 < top2 - 1) { 
//             top1++; 
//             arr[top1] = x; 
//         } 
//         else { 
//             System.out.println("Stack Overflow"); 
//             System.exit(1); 
//         } 
//     } 
  
//     void push2(int x) 
//     { 
//         if (top1 < top2 - 1) { 
//             top2--; 
//             arr[top2] = x; 
//         } 
//         else { 
//             System.out.println("Stack Overflow"); 
//             System.exit(1); 
//         } 
//     } 
    
//     int pop1() 
//     { 
//         if (top1 >= 0) { 
//             int x = arr[top1]; 
//             top1--; 
//             return x; 
//         } 
//         else { 
//             System.out.println("Stack Underflow"); 
//             System.exit(1); 
//         } 
//         return 0; 
//     } 
  
//     int pop2() 
//     { 
//         if (top2 < cap) { 
//             int x = arr[top2]; 
//             top2++; 
//             return x; 
//         } 
//         else { 
//             System.out.println("Stack Underflow"); 
//             System.exit(1); 
//         } 
//         return 0; 
//     }
// }

// class stack {
    
// 	public static void main (String[] args) {
	
// 	    TwoStacks ts=new TwoStacks(5); 
//         ts.push1(5); 
//         ts.push2(10); 
           
//         ts.push2(15); 
//         ts.push1(11); 
     
//         System.out.println("Popped element from stack1 is: " + ts.pop1()); 
//         ts.push2(40); 
//         System.out.println("Popped element from stack2 is: " + ts.pop2());  
	  
// 	}
	
// }


//Implement k stack
// class kstack
// {   
//     int a[],top,next;
//     int k,freetop,cap;
//     kstack(int k1,int n)
//     {
//         k=k1;
//         cap=n;
//         a=new int[cap];
//         top=new int[k];
//         next=new int[cap];
//         for(int i=0;i<k;i++)
//         {
//             top[i]=-1;
//         }
//         freetop=0;
//         for(int i=0;i<cap-1;i++)
//         {
//             next[i]=i+1;
//         }
//         next[cap-1]=-1;
//     }
//     boolean isfull()
//     {
//         return (freetop==-1);
//     }
//     boolean isEmpty(int sn)
//     {
//         return (top[sn]==-1);
//     }
//     void push(int x,int sn)
//     {
//         int i=freetop;
//         freetop = next[i];
//         next[i]=top[sn];
//         top[sn]=i;
//         a[i]=x;
//     }
//     void pop(int sn)
//     {
//         int i= top[sn];
//         top[sn]=next[i];
//         next[i]= freetop;
//         freetop=i;
//         return a[i];
//     }

// }
// class stack
// {
//     public static void main(String[] at)
//     {
//         int k=3,n=10;
//         kstack ks = new kstack(k,n);
//         ks.push(15,2);
//         ks.push(45,2);

//         ks.push(17, 1); 
//         ks.push(49, 1); 
//         ks.push(39, 1);

//         ks.push(11, 0); 
//         ks.push(9, 0); 
//         ks.push(7, 0); 

//         System.out.println("Popped element from stack 2 is " + ks.pop(2) ); 
//         System.out.println("Popped element from stack 1 is " + ks.pop(1) ); 
//         System.out.println("Popped element from stack 0 is " + ks.pop(0) );   
	  
//     }
// }
// class stack
// {
//     static void show(int a[],int n)
//     {
//         for(int i=0;i<n;i++)
//         {
//             int span = 1;
//             for(int j=i-1;j>=0 && a[j]<a[i];j--)
//             {
//                 span++;
//             }
//             System.out.print(span+" ");
//         }
//     }
//     public static void main(String[] at)
//     {
//         int a[] = {100,80,60,70,60,75,85};
//         int n= a.length;
//         show(a,n);
//     }
// }
// class stack
// {
//     public static void show(int a[],int n)
//     {
//         Stack<Integer> s= new Stack<>();
//         s.add(0);
//         System.out.print(1+" ");
//         for(int i=1;i<n;i++)
//         {
//             while(s.isEmpty()==false&&a[s.peek()]<=a[i])
//             {
//                 s.pop();
//             }
//             int span = s.isEmpty() ? i+1:i-s.peek();
//             System.out.print(span+" ");
//             s.push(i);
//         }
//     }
//     public static void main(String[] at)
//     {
//         int a[] = {18,12,13,14,11,16};
//         int n= a.length;
//         show(a,n);
//     }
// }
// class stack
// {
//     static void show(int a[],int n)
//     {
//          for(int i=0;i<n;i++)
//          {
//              int j;
//              for(j=i-1;j>=0;j--)
//              {
//                  if(a[j]>a[i])
//                  {
//                     return a[j]; 
//                     break;
//                  }
//              }
//              if(j==-1)
//              {
//                   return -1;
//              }
//          }
//     }
   
// }
// class stack 
// {
//     static void show(int a[],int n)
//     {
//         Stack<Integer> s= new Stack<>();
//         s.add(0);
//         for(int i=0;i<n;i++)
//         {
//             while(s.isEmpty()==false&&s.peek()<=a[i])
//             {
//                 s.pop();
//             }
//             int pvg = s.isEmpty()?-1:s.peek();
//             System.out.print(pvg+" ");
//             s.add(a[i]);
//         }

//     }
//     public static void main(String[] at)
//     {
//         int a[]={20,30,10,5,15};
//         int n= a.length;
//         show(a,n);
//     }
// }
// class stack
// {
//     static void show(int a[],int n)
//     {
//         for(int i=0;i<n;i++)
//         {
//             int j;
//             for( j=i+1;j<n;j++)
//             {
//                 if(a[i]<a[j])
//                 {
//                     System.out.print(a[j]+" ") ;
//                     break;
//                 }
//             }
//             if(j==n)
//             {
//                 System.out.print(-1+" ");
//             }
//         }
//     }
//     public static void main(String[] at)
//     {
//         int a[]= {5,15,10,8,6,12,9,18};
//         int n= a.length;
//         show(a,n);
//     }
// }
// class stack
// {
//     static ArrayList<Integer> show(int a[],int n)
//     {
//         ArrayList<Integer> v= new ArrayList<>();
//         Stack<Integer> s= new Stack<>();
//         s.add(a[n-1]);
//         v.add(-1);
//         // System.out.print(-1+" ");
//         for(int i=n-2;i>=0;i--)
//         {
//             while(s.isEmpty()==false && s.peek()<a[i])
//             {
//                 s.pop();
//             }
//             int nge = s.isEmpty()?-1:s.peek();
//             // System.out.print(nge+" ");
//             v.add(nge);
//             s.add(a[i]);
//         }
//         Collections.reverse(v);
//         return v;
//     }
//     public static void main(String[] at)
//     {
//        int a[]= {5,15,10,8,6,12,9,18};
//         int n= a.length;
        
//        for(int x: show(a,n)){
//             System.out.print(x + " ");   
//         }  
//     }
// };
// class stack
// {
//     static int show(int a[],int n)
//     {
//         int res=0;
//         for(int i=0;i<n;i++)
//         {
//             int j;
//             int curr= a[i];
//             for(j=i-1;j>=0;j--)
//             {
//                 if(a[j]>a[i])
//                 {
//                     curr+=a[i];
//                 }
//                 else
//                 {
//                     break;
//                 }
//             }
//             for( j=i+1;j<n;j++)
//             {
//                 if(a[j]>=a[i])
//                 {
//                     curr+=a[i];
//                 }
//                 else
//                 {
//                     break;
//                 }
//             }
//             res= Math.max(res,curr);
//         }
//         return res;
//     }
//     public static void main(String[] at)
//     {
//         int a[] = {6,2,5,4,1,5,6};
//         int n= a.length;
//         System.out.print(show(a,n));  
//     }
// }
// class stack 
// {
//     static void previous(int a[],int n)
//     {
//         int res=0;
//         int ps[]= new int[n];
//         int ns[]= new int[n];
//         Stack<Integer> s= new Stack<>();
//         s.add(0);
//         for(int i=0;i<n;i++)
//         {
//             while(isEmpty()==false&& arr[s.peek()]<=a[i])
//             {
//                 s.pop();
//             }
//             int pse= s.isEmpty()?-1:s.peek();   
//             ps[i]= pse;
//             s.push(i);
//         }
//         while(s.isEmpty()==false)
//         {
//             s.pop();
//         }
//         s.push(n-1);
//        while(s.isEmpty()==false && a[s.peek()]<=a[i])
//        {
//            s.pop();
//        }
//        int nse = isEmpty()?-1:s.peek();
//        ns[i]=nse;
//        s.add(i);
//     }
//     for(int i=0;i<n;i++)
//     {
//         int curr=a[i];
//         curr+=
//       curr+=(i-ps[i]-1)*arr[i];
//             curr+=(ns[i]-i-1)*arr[i];
//             res=Math.max(res,curr);
//         }
//         return res;
    
//     }
// 	public static void main (String[] args) {
	
// 	    int[] a=new int[]{6,2,5,4,1,5,6};
//         int n=arr.length;
        
//         System.out.print("Maximum Area: "show(a,n));   
	  
// }
// class stack
// { 
//     static int previous(int a[],int n)
//     {
//         int res=0;
//         int ps[] = new int[n];
//         int ns[]= new int[n];
//         Stack<Integer> s= new Stack<>();
//         for(int i=0;i<n;i++)
//         {
//             while(s.isEmpty()==false && s.peek()<=a[i])
//             {
//                 s.pop();
//             }    
//             int pre = s.isEmpty()?-1:s.peek();
//             ps[i]= pre;
//             s.add(i);
//         }
//             while(s.isEmpty()==false){
//                         s.pop();
//                     }
        
//             s.push(n-1);
//         for(int i=n-1;i>0;i--)
//         {
//             while(s.isEmpty()==false && s.peek()<=a[i])
//             {
//                 s.pop();
//             } 
//             int nre= s.isEmpty()?-1:s.peek();
//             ns[i]=nre;
//             s.add(i);
//         }
//         for(int i=0;i<n;i++)
//         {
//             int curr= a[i];
//             curr+=(i-ps[i]-1)*a[i];
//             curr+=(ns[i]-i-1)*a[i];
//             res= Math.max(curr,res);
//         }
//         return res;

                          
//     }
//     public static void main(String[] at)
//     {
//          int[] a={6,2,5,4,1,5,6};
//          int n = a.length;
//         System.out.print("Maximum Area: "+previous(a,n)); 
//     }
// }
// class stack
// {
//     static int show(int a[],int n)
//     {
//         Stack<Integer> s = new Stack<>();
//         int res=0;
//         int tp;
//         int curr;
//         for(int i=0;i<n;i++)
//         {
//             while(s.isEmpty()==false && a[s.peek()]>=a[i])
//             {
//                 tp=s.peek();s.pop();
//                 curr= a[tp]*(s.isEmpty()?i:i-s.peek()-1);
//                 res= Math.max(res,curr);

//             }
//             s.push(i);
//         }
//         while(s.isEmpty()==false)
//         {
//             tp=s.peek();s.pop();
//             curr=a[tp]*(s.isEmpty()?n:(n-s.peek()-1));
//             res=Math.max(res,curr);
//         }
//         return res;
//     }
//     public static void main(String[] at)
//     {
//           int[] a={6,2,5,4,1,5,6};
//          int n = a.length;
//         System.out.print("Maximum Area: "+show(a,n));
//     }
// }
// class stack 
// {
//     static int largestlist(int R,int c,int a[])
//     {
//         Stack<Integer> s= new Stack<Integer>();
//         int top_val;
//         int max_area=0;
//         int area=0;
//         int i=0;
//         while(i<c)
//         {
//             if(s.empty()|| a[s.peek()]<=a[i])
//             {
//                 s.push(i++);
//             }
//             else
//             {
//                 top_val=a[s.peek()];
//                 s.pop();
//                 area= top_val*i;
//                 if(!s.empty())
//                 {
//                     area= top_val*(i-s.peek()-1);
//                 }
//                 max_area= Math.max(area,max_area);
//             }
//         }
//         while(!s.empty())
//         {
//             top_val=a[s.peek()];
//             s.pop();
//             area= top_val*i;
//             if(!s.empty())
//             {
//                 area= top_val*(i-s.peek()-1);
//             }
//             max_area = Math.max(area,max_area);
//         }
//         return max_area;
//     }
//     static int show(int R,int C,int mat[][])
//     {
//         int res=largestlist(R,C,mat[0]);
//         for(int i=1;i<R;i++)
//         {
//             for(int j=0;j<C;j++)
//             {
//                 if(mat[i][j]==1)
//                 {
//                     mat[i][j]+=mat[i-1][j];
//                 }
//             }
//             res = Math.max(res,largestlist(R,C,mat[i]));
//         }
//         return res;
//     }
//     public static void main(String[] at)
//     {
//         int R=4,C=4;
//         int A[][]={
//              { 0, 1, 1, 0 }, 
//             { 1, 1, 1, 1 }, 
//             { 1, 1, 1, 1 }, 
//             { 1, 1, 0, 0 }, 
//         };
//         System.out.print("Area of maximum rectangle is"+show(R,C,A));
//     }
// }
// class MyStack{
//     Stack<Integer> ms;
//     Stack<Integer> as;
//     MyStack(){
//         ms= new Stack<>();
//         as= new Stack<>();
//     }
//     void push(int x)
//     {
//         if(ms.isEmpty())
//         {
//             ms.add(x);
//             as.add(x);
//             return ;
//         }
//         ms.add(x);
//         if(as.peek()>=ms.peek())
//         {
//             as.add(x);
//         }
//     }
//     void pop()
//     {
//         if(as.peek()==ms.peek())
//         {   
//             as.pop();
//         }
//         ms.pop();
//     }
//     int top()
//     {
//         return ms.peek();
//     }
//     int getMin(){
//         return as.peek();
//     }
// }
// class stack
// {
//     public static void main(String[] at)
//     {
//         MyStack s= new MyStack();
//         s.push(4);
//         s.push(5);
//         s.push(8);
//         s.push(1);
//         // s.pop();
//         System.out.print("Minimum element from stack is"+" "+s.getMin());
//     }   
// }

//Design the stack with getMin() in O(1) space.
//first method that works for only..
// class MyStack 
// {
//     Stack<Integer> s;
//     int min;
//     MyStack()
//     {
//         s=new Stack<>();
//     }
//     void push(int x)
//     {
//         if(s.isEmpty())
//         {
//             min= x;
//             s.add(x);
//         }
//         else if(x<=min)
//         {
//             s.add(x-min);
//             min=x;
//         }
//         else
//         {
//             s.add(x);
//         }
//     }
//     int pop()
//     {
//         int t= s.peek();s.pop();
//         if(t<=0)
//         {
//             int res= min;
//             min=min-t;
//             return res;
//         }
//         else
//         {
//             return t;
//         }

//     }
//     int peek()
//     {
//         int t= s.peek();
//         return ((t<=0)?min:t);
//     }
//     int getMin(){
//         return min;
//     }
// }
// class stack
// {
//     public static void main(String[] at)
//     {
//         MyStack s= new MyStack();
//         s.push(4);
//         s.push(5);
//         s.push(8);
//         s.push(1);
//         s.pop();
     
//         System.out.print(" Minimum Element from Stack: " + s.getMin() );
  
//     }
// }
// class MyStack
// {
//     Stack<Integer> s;
//     int min;
//     MyStack()
//     {
//         new Stack<>();
//     }
//     void push(int x)
//     {
//         if(s.isEmpty() )
//         {
//             min=x;
//             s.add(x);

//         }
//         else if(x<=min)
//         {
//             s.add(2*x-min);
//             min=x;
//         }
//         else
//         {
//             s.add(x);
//         }
//     }
//     int pop()
//     {
//         int t= s.pop();
//         if(t<=min)
//         {
//            int  res=min;
//             min=2*min-t;
//             return res; 
//         }
//         else
//         {
//             return t;
//         }
//     }
    
// }
// class stack
// {
//     public static void main(String[] at)
//     {
//         MyStack s= new MyStack();
//          s.push(4);
//         s.push(5);
//         s.push(8);
//         s.push(1);
//         s.pop();
     
//         System.out.print(" Minimum Element from Stack: " + s.getmin() );
  
//     }
// }


//important code for converting infix to prefix.

import java.util.Stack;
// class stack
// {
//     static int show(String s)
//     {
//         Stack<Integer> st=new Stack<>();
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             if(s.charAt(i)>='0'&& s.charAt(i)<='9')
//             {
//                 st.push(s.charAt(i)-'0');
//             }
//             else
//             {
//                 int op1=st.peek();
//                 st.pop();
//                 int op2=st.peek();
//                 st.pop();

//                 switch(s.charAt(i))
//                 {
//                     case '+':
//                         st.push(op1+op2);
//                         break;

//                     case '-':
//                         st.push(op1-op2);
//                         break;
//                     case '*':
//                         st.push(op1*op2);
//                         break;
//                     case '/':
//                         st.push(op1/op2);
//                         break;
//                     // case '^':
//                     //     st.push(Math.pow(op1,op2));
//                     //     break;
//                 }
//             }
//         }
//         return st.peek();
//     }
//     public static void main(String[] at)
//     {
//         System.out.println(show("-+7*45+20"));
//     }

// }


//important code to convert infix to postfix.

// class stack
// {
//     static int postfixEvaluation(String s)
//     {
//         Stack<Integer> st = new Stack<>();
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)>='0' && s.charAt(i)<='9')
//             {
//                 st.push(s.charAt(i)-'0');
//             }
//             else
//             {
//                 int op2=st.peek();
//                 st.pop();
//                 int op1=st.peek();
//                 st.pop();

//                 switch(s.charAt(i))
//                 {
//                     case '+':
//                         st.push(op1+op2);
//                         break;
//                     case '-':
//                         st.push(op1-op2);
//                         break;
//                     case '*':
//                         st.push(op1*op2);
//                         break;
//                     case '/':
//                         st.push(op1/op2);
//                         break;
//                 }
//             }
//         }
//         return st.peek();
//     }
//     public static void main(String[] at)
//     {
//         System.out.println(postfixEvaluation("46+2/5*7+"));
//         return ;
//     }
// }

