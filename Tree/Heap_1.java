import java.util.*;
import java.io.*;
import java.lang.*;
  

    
//  class MinHeap{
//             int arr[];
//         int size;
//         int capacity;
        
//         MinHeap(int c){
//         size = 0; 
//         capacity = c; 
//         arr = new int[c];
//         }
    
//         int left(int i) { return (2*i + 1); } 
//         int right(int i) { return (2*i + 2); } 
//         int parent(int i) { return (i-1)/2; } 
    
    
//     void insert(int x) 
//     { 
//     if (size == capacity)return;
//     size++; 
//     arr[size-1]=x; 
 
//     for (int i=size-1;i!=0 && arr[parent(i)]>arr[i];) 
//     { 
//         int temp = arr[i]; 
//         arr[i] = arr[parent(i)]; 
//         arr[parent(i)] = temp; 
//         i = parent(i); 
//     } 
//     }
//     void minHeapify(int i)
//     {
//         int lt =left(i),rt=right(i);
//         int smallest=i;
//         if(lt<size && arr[lt]<arr[i])
//         {
//             smallest=lt;
//         }
//         if(rt<size && arr[rt]<arr[i])//
//         {
//             smallest=rt;
//         }
//         if(smallest!=i)
//         {
//             int temp = arr[i];
//             arr[i]=arr[smallest];
//             arr[smallest]=temp;
//             minHeapify(smallest);
//         }
//     }
//    int extractMin()
//     {
//         if(size==0)
//         {
//             return Integer.MAX_VALUE;
//         }
//         if(size==1)
//         {
//             size--;
//             return arr[0];
//         }
//         int temp=arr[0];
//         arr[0]=arr[size-1];
//         arr[size-1]=temp;

//         size--;
//         minHeapify(0);

//         return arr[size];
//     }
//     void Decrease(int i,int x)
//     {
//         arr[i]=x;
//         while(i!=0 && arr[parent(i)]>arr[i])
//         {
//             int temp=arr[i];
//             arr[i]=arr[parent(i)];
//             arr[parent(i)]=temp;
             
//         }
//     }
//     void deleteKey(int i)
//     {
//         Decrease(i,Integer.MIN_VALUE);
//         extractMin();

//     }
//     //build heap.
//     void buildheap()
//     {
//         for(int i=(size-2)/2;i>=0;i--)
//         {
//             minHeapify(i);
//         }
//     }

// }
    
   

// class Heap_1
// {
//     public static void main(String[] at)
//     {
//         MinHeap h=new MinHeap(11);
//         h.insert(3); 
//         h.insert(2);
//          h.deleteKey(0);
//         h.insert(15);
//         h.insert(20);
//         System.out.println(h.extractMin());
//         h.Decrease(2,1);
//         System.out.println(h.extractMin());
   
//     }
// }


//Heap sort.

// class Heap_1
// {
    
//     void maxheapify(int arr[],int n,int i)
//     {
//         int largest=i;
//         int l=2*i+1;
//         int r=2*i+2;

//         if(l<n && arr[l]>arr[largest])
//         {
//             largest=l;
//         }
//         if(r<n && arr[r]>arr[largest])
//         {
//             largest=r;
//         }
//         if(largest!=i)
//         {
//             int temp=arr[i];
//             arr[i]=arr[largest];
//             arr[largest]=temp;
//             maxheapify(arr,n,largest);
//         }
//     }
//     void buildheap(int arr[],int n)
//     {
//         for(int i=(n-2)/2;i>=0;i--)
//         {
//             maxheapify(arr,n,i);
//         }
//     }

//     void sort(int arr[])
//     {
//         int n=arr.length;
//         buildheap(arr,n);
//         for(int i=n-1;i>0;i--)
//         {
//             int temp=arr[0];
//             arr[0]=arr[i];
//             arr[i]=temp;

//             maxheapify(arr,i,0);
//         }
//     }
//     //this to print sorted array.
//     static void printArray(int arr[])
//     {
//         int n=arr.length;
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] at)
//     {
//         int arr[]={12,11,13,5,6,7};
//         int n=arr.length;

//         Heap_1 ob=new Heap_1();
//         ob.sort(arr);
//         System.out.println("sorted array is");
//         printArray(arr);

//     }

    
// }

// class Heap_1
// {
//     public static void main(String[] at)
//     {
//         PriorityQueue<Integer> pq=new PriorityQueue<>();
//         pq.add(10);
//         pq.add(20);
//         pq.add(15);

//         System.out.println(pq.peek());
//         System.out.println(pq.poll());
//         System.out.println(pq.peek());

//     }
// }

// class Heap_1{
//     static void sort(int arr[],int k)
//     {
//         PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
//         for(int i=0;i<=k;i++)
//         {
//             pq.add(arr[i]);
//         }
//         int index=0;
//         for(int i=k+1;i<arr.length;i++)
//         {
//             arr[index++]=pq.poll();
//             pq.add(arr[i]);
//         }
//         while(pq.isEmpty()==false)
//         {
//             arr[index++]=pq.poll();
//         }
//     }
//        static void printArray(int arr[])  
//         { 
//             for(int i = 0; i < arr.length; i++) 
//                 System.out.print(arr[i] + " "); 
//         } 
    
//      public static void main(String[] args)  
//     { 
//         int k = 3; 
//         int arr[] = { 2, 6, 3, 12, 56, 8 }; 
        
//         sort(arr, k); 
//         System.out.println("Following is sorted array"); 
//         printArray(arr); 
//     } 
// }
// class Heap_1
// {
//     public static void main(String[] at)
//     {
//         int n=5;
//         int cost[]={1,12,5,111,200};
//         int sum=10;

//         int res=0;
//         Arrays.sort(cost);
//         for(int i=0;i<n;i++)
//         {
//             if(cost[i]<=sum)
//             {
//                 sum-=cost[i];
//                 res++;
//             }
//             else
//             {
//                 break;
//             }
//         }
//         System.out.print(res);
//     }
// }
// class Heap_1
// {
//     public static void main(String[] t)
//     {
//          int n=5;
//         int cost[]={1,12,5,111,200};
//         int sum=10;
//         PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
//         int res=0;
//         for(int i=0;i<n;i++)
//         {
//             pq.add(cost[i]);
//         }

//         for(int i=0;i<n;i++)
//         {
//         if(pq.peek()<=sum)
//         {
//             sum=sum-pq.poll();
//             res++;
//         }
//         else
//         {
//             break;
//         }
//          }
//     System.out.print(res);

//     }
   
    
// }

// class Heap_1
// {
//     public static void main(String[] at)
//     {
//         int k=3;
//         int arr[]={5,15,10,20,8,25,18};
//         int n=arr.length;
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i=0;i<k;i++)
//         {
//             pq.add(arr[i]);
//         } 
//         for(int i=k;i<n;i++)
//         {
//             if(arr[i]>pq.peek())
//             {
//                 pq.poll();
//                 pq.add(arr[i]);
//             }
//             else
//             {
//                 continue;
//             }
//         }
//         Iterator iterator = pq.iterator(); 
	
// 	    while (iterator.hasNext()) 
// 	    { 
// 		    System.out.print(iterator.next() + " "); 
// 	    } 
//     }
    
// }


// //efficient solution for k nearerst element .
// // class Pair
// // {
// //     Integer key;
// //     Integer value;
// //     public Pair(Integer key,Integer value)
// //     {
// //         this.key=key;
// //         this.value=value;
// //     }
// //     public Integer getkey()
// //     {
// //         return key;

// //     }
// //     public void setkey(Integer key)
// //     {
// //         this.key=key;
// //     }
// //     public Integer getValue()
// //     {
// //         return value;
// //     }
// //     public void setValue(Integer value)
// //     {
// //         this.value = value;
// //     }

// // }

// // class Heap_1
// // {
// //     public static void printKclosest(int arr[],int n,int k,int x)
// //     {
// //         PriorityQueue<Pair> pq=new PriorityQueue<>(
// //                                 new Comparator<Pair>()
// //                                 {
// //                                     public int compare(Pair p1,Pair p2)
// //                                     {
// //                                         return p2.getValue().compareTo(
// //                                             p1.getValue()
// //                                         );
// //                                     }
// //                                 }
// //         );

// //         for(int i=0;i<k;i++)
// //         {
// //             pq.offer(new Pair(arr[i],
// //                     Math.abs(arr[i]-x)));
// //         }
// //         for(int i=k;i<n;i++)
// //         {
// //             int diff=Math.abs(arr[i]-x);

// //             if(pq.peek().getValue()>diff)
// //             {
// //                 pq.poll();
// //                 pq.offer(new Pair(arr[i],diff));
// //             }
// //         }
// //         while(!pq.isEmpty())
// //         {
// //             System.out.print(pq.poll().getkey()+" ");
// //         }
// //     }
// //     public static void main(String[] t)
// //     {
// //         	int arr[] = { 10,30,5,40,38,80,70 };

// // 	int size = arr.length;

// // 	int x=35; int k = 3;

// // 	printKclosest(arr,size,k,x);
// //     }
// // }

// // class Triplet implements Comparable<Triplet>
// // {
// //     int li,vali,val;  
// //     Triplet(int li,int vali,int val)
// //     {
// //         this.li=li;
// //         this.vali=vali;
// //         this.val=val;
// //     } 
// //    public int compareTo(Triplet t){
// //         if(val<=t.val)return -1;
// //         else return 1;
// //    }
// // }

// // class Heap_1
// // {
// //     static ArrayList<Integer> mergeksorted(ArrayList<ArrayList<Integer>> lists)
// //     {
// //         ArrayList<Integer> rv=new ArrayList<>();
// //         PriorityQueue<Triplet> pq=new PriorityQueue<>();

// //         for(int i=0;i<lists.size();i++)
// //         {
// //             Triplet p = new Triplet(i,0,lists.get(i).get(0));
// //             pq.add(p);
// //         }


// //         while(pq.size()>0)
// //         {
// //             Triplet p = pq.remove();
// //             rv.add(p.val);
// //             p.vali++;

// //             if(p.vali<lists.get(p.li).size())
// //             {
// //                 p.val=lists.get(p.li).get(p.vali);
// //                 pq.add(p);
// //             }
// //         }
// //         return rv;
// //     }
// //     public static void main(String[] at)
// //     {
// //         ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();

// //         ArrayList<Integer> a1=new ArrayList<Integer>();
// //         a1.add(10);
// //         a1.add(20);
// //         a1.add(30);
// //         lists.add(a1);

// //         ArrayList<Integer> a2=new ArrayList<Integer>();
// //         a2.add(5);
// //         a2.add(15);
// //         lists.add(a2);    

// //         ArrayList<Integer> a3=new ArrayList<Integer>();
// //         a3.add(1);
// //         a3.add(9);
// //         a3.add(11);
// //         a3.add(18);
// //         lists.add(a3);

// //     List<Integer> res = mergeksorted(lists); 
  
// //     System.out.println("Merged array is"); 
// //     for (int x : res) 
// //         System.out.print(x + " ");
// //     }
// //     // List<Integer> res=mergeksorted(lists);

   
// // }

// // class Heap_1 
// // {
// //     public static void main(String[] at)
// //     {
// //         double[] arr= {25,7,10,15,20};
// //         int n=5;
// //         double temp[] = new double[n];
// //         int size=0;
// //         for(int i=0;i<n;i++)
// //         {
// //             temp[i]=arr[i];
// //             size++;
// //             int j=i;
// //             while(j>0 && temp[j]<temp[j-1])
// //             {
// //                 double a=temp[j];
// //                 temp[j]=temp[j-1];
// //                 temp[j-1]=a;
// //                 j--;
// //             }
// //             if(size%2!=0)
// //             {
// //                 System.out.print(temp[size/2]+" ");
// //             }
// //             else
// //             {
// //                 System.out.print(((temp[size/2]+temp[(size-1)/2])/2)+" ");
// //             }
// //         }
// //     }
// // }

// // class Node 
// // {
// //     double data;
// //     Node left,right;
// //     int lcount;

// //     Node(double x)
// //     {
// //         data=x;
// //         left=right=null;
// //         lcount=0;
// //     }
// // }
// // class Heap_1
// // {
// //     public static void printMedian(int arr[],int n)
// //     {
// //         PriorityQueue<Integer> minheap=new PriorityQueue<Integer>();
// //         PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>(Collections.reverseOrder());
// //         maxheap.add(arr[0]);
// //         System.out.print(arr[0]+" ");

// //         for(int i=1;i<n;i++)
// //         {
// //             int x=arr[i];
// //             if(maxheap.size()>minheap.size())
// //             {
// //                 if(maxheap.peek()>x)
// //                 {
// //                     minheap.add(maxheap.poll());
// //                     maxheap.add(x);
// //                 }
// //                 else
// //                 {
// //                     minheap.add(x);
// //                 }
// //                 System.out.print(((double)(maxheap.peek()+minheap.peek())/2)+" ");
// //             }
// //             else
// //             {
// //                 if(x<=maxheap.peek())
// //                 {
// //                     maxheap.add(x);
// //                 }
// //                 else
// //                 {
// //                     minheap.add(x);
// //                     maxheap.add(minheap.poll());
// //                 }

// //                 System.out.print(maxheap.peek()+" ");
// //             }
// //         }
// //     }
// //     public static void main(String[] ar)
// //     {
// //         int keys[]= {12,15,10,5,8,7,16};
// //         printMedian(keys,7);
// //     }
// // }

// //  double n=sc.nextInt();
// // 		    double x=sc.nextInt();
// // 		    double y=sc.nextInt();
// // 		    double a=sc.nextInt();
// // 		    double b=sc.nextInt();

// // 		    double k=x/a;
// // 		    double res=k*n;
// // 		    double l=y/b;
// // 		    double count=l*n;


// class Heap_1
// {
//     public static void main(String[] at)
//     {
//         int cost[]={1,12,5,111,200};
//         int sum=10;

//         Arrays.sort(cost);
//         int res=0;
//         for(int i=0;i<cost.length;i++)
//         {
//             if(cost[i]<sum)
//             {
//                 sum-=cost[i];
//                 res++;
//             }


//         }
//         System.out.println(res);
//     }
// }

// class Heap_1
// {
//     public static void main(String[] at)
//     {
//         int n=5;
//         int cost[]={1,12,5,111,200};
//         int sum=10;
//         PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
//         for(int i=0;i<n;i++)
//         {
//             pq.add(cost[i]);
//         }
//         int res=0;
//         for(int i=0;i<n;i++)
//         {
//             if(pq.peek()<=sum)
//             {
//                 sum-=pq.poll();
//                 res++;
//             }
//             else
//             {
//                 break;
//             }
//         }
//         System.out.println(res);
//     }

// }

// class Heap_1
// {
//     static void printklargest(int a[],int n,int k)
//     {
//         PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
//         for(int i=0;i<k;i++)
//         {
//             pq.add(a[i]);
//         }
//         for(int i=k;i<n;i++)
//         {
//             if(a[i]>pq.peek())
//             {
//                 pq.poll();
//                 pq.add(a[i]);
//             }
//             else
//             {
//                 continue;
//             }
//         }
//         while(pq.size()>0)
//         {
//             System.out.print(pq.poll()+" ");
//         }
//     }
//     public static void main(String[] at)
//     {
//         int a[]={5,15,10,20,8};
//         int n=a.length;
//         int k=2;
//         printklargest(a,n,k);
//     }
// }

class Pair
{
    Integer key;
    Integer value;

    public Pair(Integer key,Integer value)
    {
        this.key=key;
        this.key=value;
    }
    public Integer getkey()
    {
        return key;
    }
    public void setkey(Integer key)
    {
        this.key=key;
    }
    public Integer getvalue()
    {
        return value;
    }
    public void setvalue(Integer key)
    {
        this.key=key;
    }
}
class Heap_1
{
    public static void printKClosest(int arr[],int n,int k,int x)
    {

    
    PriorityQueue<Pair> pq=new PriorityQueue<>(
                            new Comparator<Pair>()

                            public int compare(Pair p1,Pair p2)
                            {
                                return p2.getvalue().compareTo(p1.getvalue());
                            }
    );
    for(int i=0;i<k;i++)
    {
        pq.offer(new Pair(arr[i],Math.abs(arr[i]-x)));
    }
    for(int i=k;i<n;i++)
    {
        int diff = Math.abs(arr[i]-x);
        if(pq.peek().getvalue()>diff)
        {
            pq.poll();
            pq.offer(new Pair(arr[i],diff))
        }
    }
     while(!pq.isEmpty()) 
    { 
        System.out.print(pq.poll().getKey() + " "); 
    }
    }
    public static void main (String[] args)
{
	int arr[] = { 10,30,5,40,38,80,70 };

	int size = arr.length;

	int x=35; int k = 3;

	printKClosest(arr,size,k,x);}

}