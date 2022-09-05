import java.util.*;
import java.lang.*;
import java.io.*;

// class revision 
// {
//     public static void main(String[] a)
//     {
//         HashSet<String> h=new HashSet<String>();
//         h.add("gfg");
//         h.add("courses");
//         h.add("ide");

//         System.out.println(h);
//         System.out.println(h.contains("ide"));

//         Iterator<String> i=h.iterator();
//         while(i.hasNext())
//         {
//             System.out.print(i.next()+" ");
//         }
//     }
// }
// class revision
// {
//     static int show(int a[],int b[],int n,int m)
//     {
//         HashSet<Integer> hs=new HashSet<Integer>();
//        // HashSet<Integer> hs1=new HashSet<Integer>();

//         for(int i=0;i<n;i++)
//         {
//             hs.add(a[i]);
//         }
//         int count=0;
//         for(int j=0;j<m;j++)
//         {
//             if(hs.contains(b[j]));
//             {
//                 count++;
//                 hs.remove(b[j]);
//             }
//         }
//        return count;
//     }
//     public static void main(String[] at)
//     {
//        int a[] = new int[]{15, 17, 27, 27, 28, 15};
//         int b[] = new int[]{16, 17, 28, 17, 31, 17};
//         int n = a.length;
//         int m = b.length;



//         System.out.println(show(a,b,n,m));
//     }
// }
// class revision
// {
//     static void show(int a[],int n,int sum)
//     {
//         HashSet<Integer> hs = new HashSet<>();
//         // for(int i=0;i<n;i++)
//         // {
//         //     hs.add(a[i]);
//         // }
//         // for(int j=0;j<m;j++)
//         // {
//         //     hs.add(b[j]);
//         // }
//         // Iterator<Integer> i = hs.iterator();
        
//         // while(i.hasNext())
//         // {
//         //     System.out.print(i.next()+" ");
//         // }
//         for(int i=0;i<n;i++)
//         {
            
//         }
//     }
//     public static void main(String[] at)
//     {
//         int a[]={10,30,10};
//         int n=a.length;
//         int b[]={5,10,5};
//         int m=b.length;

//         show(a,b,n,m);
//     }
// }
// class revision 
// {
//     static int show(int a[],int n,int sum)
//     {
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(int i=0;i<n;i++)
//         {
//             if(a[i]==0)
//             {
//                 a[i]=-1;
//             }
           
//         }
//         int prefix_sum = 0;
//         HashSet<Integer> us = new HashSet<>();
//         us.add(0);
//         for(int i = 0; i < n; i++)
//         {
//             prefix_sum += a[i];
//             if(us.contains(prefix_sum - sum))
//               return 1;
//             us.add(prefix_sum);
//         }
//         return 0;
//     }
//     public static void main(String[] at)
//     {
//         int a[]={1, 1, 1, 0, 1, 0, 1, 1, 1};
//         int n=a.length;
//         int sum=0;
//         System.out.print(show(a,n,sum));
//     }

// }
// // class revision
// // {
// //     static boolean show(int a[],int n,int sum)
// //     {
// //         HashSet<Integer> hs=new HashSet<>();
       
// //         int presum=0;
// //         for(int i=0;i<n;i++)
// //         {
// //             presum+=a[i];
// //             if(presum==sum);
// //             {
// //                 return true;
// //             }
// //             if(hs.contains(presum-sum))
// //             {
// //                 return true;
// //             }
           
// //         }
// //         return false;
// //     }
// //     public static void main(String[] t)
// //     {
// //         int a[]={-3,4,-3,2,1};
// //         int n=a.length;
// //         int sum=0;

// //         System.out.println(show(a,n,sum));
// //     }
// // }

//1.Sub array with sum=0.
//2.Sub array with given sum.
//3.Longest subarray with sum 0.
//4.Longest subarray which contains 0 and 1 .

// class revision 
// {
//     static int show(int a[])
//     {
//         int res =0;
//         HashMap<Integer,Integer> hm= new HashMap<>();
//         int i=0;
//         int sum=0;
//         hm.put(sum,-1);
//         while(i<a.length)
//         {
//             if(a[i]==0)
//             {
//                 sum+=-1;
//             }
//             else if(a[i]==1)
//             {
//                 sum+=1;
//             }
//             if(hm.containsKey(sum))
//             {
//                 int idx=hm.get(sum);
// //                 int len=i-idx;
// //                 res=Math.max(res,len);
// //             }
// //             i++;
// //         }

// //     return res;
// //     }
// //     public static void main(String[] at)
// //     {
// //         int a[]={0,0,1,1,0,1};
// //         System.out.print(show(a));
        
// //     }
// // }

// //longest span in array containing binary string.
// // class revision
// // {
// //     static int show(int a[],int b[],int n)
// //     {
// //         int temp[]= new int[n];
// //         for(int i=0;i<n;i++)
// //         {
// //              temp[i] = a[i]-b[i];
// //         }
// //         HashMap<Integer,Integer> hm=new HashMap<>();

// //         int sum=0;
// //         int i=-1;
// //         int res=0;
// //         hm.put(sum,i);
// //         while(i<a.length-1)
// //         {
// //             i++;
// //             sum+=a[i];
// //             if (sum == 0) 
// // 				res = i + 1; 

// //             if(!hm.containsKey(sum))
// //             {
// //                 hm.put(sum,i);
// //             }
// //             else
// //             {
// //                 int len = i-hm.get(sum);
// //                 res=Math.max(res,len);
// //             }
// //         }
// //         return res;
// //     }
// //     public static void main(String[] at)
// //     {
// //         int a[]={0,0,1,0};
// //         int b[]={1,1,1,1};
// //         int n=a.length;
// //         System.out.print(show(a,b,n));

// //     }
// // }

// class revision
// {
//     static int CHAR=256;
//     static boolean show(String s1,String s2)
//     {
    //     if(s1.length()!=s2.length())
    //     {
    //         return false;
    //     }
    //     char a1[] = s1.toCharArray();
    //     Arrays.sort(a1);
    //     s1=new String(a1);
    //     char a2[] = s2.toCharArray();
    //     Arrays.sort(a2);
    //     s2=new String(a2);
        
    //     // return s1.equals(s2);

    //     // if(s1.length()!=s2.length())
    //     // {
    //     //     return false;
    //     // } 
    //     // int count[]=new int[CHAR];
    //     // for(int i=0;i<s2.length;i++)
    //     // {
    //     //     count[s1.charAt(i)]++;
    //     //     count[s2.charAt(i)]--;
    //     // }
    //     // for(int i=0;i<CHAR;i++)
    //     // {
    //     //     if(count[i]!=0)
    // //         {
    // //             return false;
    // //         }
    // //     }
    // // }
    // // public static void main(String[])
    // // {

    // // }
//}
// class revision
// {
//     static int CHAR=256;
//     static int show(String s)
//     {
//         int fI=new int[CHAR];
//         Arrays.fill(FI,-1);
//         int res=Integer.MAX_VALUE;
//         for(int i=0;i<s.length();i++)
//         {
//             int fi = fI(s.charAt(i));
//             if(fi==-1)
//             {
//                 fI[str.charAt(i)]=i;
//             }
//             else
//             {
//                 res=Math.min(res,fi);
//             }
//         }
//         return (res==Integer.MAX_VALUE)?-1:res;
//     }
// }

// class revision
// {
//     static void show(char str[],int n)
//     {
//         int start=0;
//         for(int i=0;i<n;i++)
//         {
//             if(str.charAt(i)==" ")
//             {
//                 reverse(str,start,i-1);
//                 start=i+1;
//             }
//         }
//         reverse(str,start,n-1);
//         reverse(str,0,n-1);
//     }
//     static void reverse(char str[],int low,int high)
//     {
//         while(low<=high)
//         {
//             int temp=str[low];
//             str[low]=str[high];
//             str[high]=temp;
//             low++;
//             high--;
//         }
//     }
//     public static void main(String[] at)
//     {

//     }
// }   

class revision
{
    static void patsea(String txt,String pat)
    {
        int n=txt.length();
        int m=pat.length();
        // for(int i=0;i<n-m+1;i++)
        // {
        //     int j;
        //     for( j=0;j<m;j++)
        //     {
        //         if(pat.charAt(i)!=txt.charAt(i+j))
        //         {
        //             break;
        //         }
        //     }
        //     if(j==m)
        //     {
        //         System.out.print(i+" ");
        //     }
        // }


        //Improved naive method for distinct element.
        for(int i=0;i<n;)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i]!=a[i+j])
                {
                    break;
                }
            }
            if(j==m)
            {
                System.out.print(i+" ");
            }
            if(j==0)
            {
                i++;
            }
            else
            {
                i=i+j;
            }
        }
    }

    public static void main(String[] t)
    {
        String str="ABCABCD";
        String pat="ABCD";
        System.out.println("sdss");
        patsea(str,pat);
    }
}