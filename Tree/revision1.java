import java.util.*; 
// class revision1
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static void shortestDistance(ArrayList<ArrayList<Integer>> adj,int s,int v,int dist[])
//     {
//         boolean visited[]=new boolean[v];
//         for(int i=0;i<v;i++)
//         {
//             visited[i]=false;
//         }
       
//         Queue<Integer> q=new LinkedList<>();
//         visited[s]=true;
//         q.add(s);
//         while(q.isEmpty()==false)
//         {
//             int u = q.poll();
//             for(int i:adj.get(u))
//             {
//                 if(visited[i]==false)
//                 {
//                     dist[i]=dist[u]+1;
//                     visited[i]=true;
//                     q.add(i);
//                 }
//             }

//         }
        
//     }
//     public static void main(String[] ar)
//     {
//         int v=4;
//         ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());
//         }
//         addEdge(adj,0,1); 
//         addEdge(adj,1,2); 
//         addEdge(adj,2,3); 
//         addEdge(adj,0,2); 
//         addEdge(adj,1,3);
//         int dist[] = new int[v];
//         for(int i=1;i<v;i++)
//         {
//             dist[i]=Integer.MAX_VALUE;
//         }
//         shortestDistance(adj,0,v,dist);
//         for(int i=0;i<v;i++)
//         {
//             System.out.print(dist[i]+" ");
//         }
//     }
// } 

// class revision1
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static boolean dfsrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],int parent)
//     {
//         visited[s]=true;
//         for(int i:adj.get(s))
//         {
//             if(visited[i]==false)
//             {
//                 if(dfsrec(adj,i,visited,parent)==true)
//                 {
//                     return true;
//                 }
//             }
//             else if(i!=parent)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
//     static boolean DFS(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         boolean visited[]=new boolean[v];
//         for(int i=0;i<v;i++)
//         {
//             visited[i]=false;
//         }
//         for(int i=0;i<v;i++)
//         {
//             if(visited[i]==false)
//             {
//                 if(dfsrec(adj,0,visited,-1)==true)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] at)
//     {
//         int v=6;
//         ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>()); 
//         }
//         addEdge(adj,0,1); 
//         addEdge(adj,1,2); 
//         addEdge(adj,2,4); 
//         addEdge(adj,4,5); 
//         addEdge(adj,1,3);
//         addEdge(adj,2,3);

//         if(DFS(adj,v)==true)
//         {
//             System.out.println("cycle found");
//         }
//         else
//         {
//             System.out.println("cycle not found");
//         }
//     }
// }

// class revision1
// {
//      static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         // adj.get(v).add(u);
//     }
//     static void topo(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         int indegree[]=new int[v];
//         for(int i=0;i<v;i++)
//         {
//             for(int x:adj.get(i))
//             {
//                 indegree[x]++;
//             }
//         }
//         Queue<Integer> q=new LinkedList<>();
//         for(int i=0;i<v;i++)
//         {
//             if(indegree[i]==0)
//             {
//                 q.add(i);
//             }
//         }
//         while(q.isEmpty()==false){
//             int u=q.poll();
//             System.out.print(u+" ");
//             for(int i:adj.get(u))
//             {
//                 if(--indegree[i]==0)
//                 {
//                     q.add(i);
//                 }
//             }
//         }
//     }
//         public static void main(String[] at)
//         {
//             int V=5;
//             	ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
// 		for (int i = 0; i < V; i++) 
// 			adj.add(new ArrayList<Integer>()); 

// 			addEdge(adj,0, 2); 
//             addEdge(adj,0, 3); 
//             addEdge(adj,1, 3); 
//             addEdge(adj,1, 4); 
//             addEdge(adj,2, 3);
		
//             System.out.println("Following is a Topological Sort of"); 
//             topo(adj,V);
//         }

    
// }


//Topological sorting dfs based solution.

// class revision1
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         // adj.get(v).add(u);
//     }
//     static void dfsrec(ArrayList<ArrayList<Integer>> adj,int s,Stack<Integer> st,boolean visited[])
//     {
        
//         visited[s]=true;
//         for(int i:adj.get(s))
//         {
//             if(visited[i]==false)
//             {
//                 dfsrec(adj,i,st,visited);
//             }
//         }
//         st.push(s);
//     }
//     static void dfs(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         boolean visited[]=new boolean[v];
//         for(int i=0;i<v;i++)
//         {
//             visited[i]=false;
//         }
//         Stack<Integer> st=new Stack<Integer>();
//         for(int i=0;i<v;i++)
//         {
//             if(visited[i]==false)
//             {
//                 dfsrec(adj,i,st,visited);
//             }
//         }
//         while(st.isEmpty()==false)
//         {
//             System.out.print(st.pop()+" ");
//         }
//     }
//     public static void main(String[] t)
//     {
//         	int V = 5; 
// 		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
// 		for (int i = 0; i < V; i++) 
// 			adj.add(new ArrayList<Integer>()); 

// 			addEdge(adj,0, 1); 
//             addEdge(adj,1, 3); 
//             addEdge(adj,2, 3); 
//             addEdge(adj,3, 4); 
//             addEdge(adj,2, 4); 
		
// 		System.out.println("Following is a Topological Sort of"); 
//         dfs(adj,V);
//     }
   
// }
// class Pair implements Comparable<Pair> 
// {
//     int wt;
//     int vt;

//     Pair(int wt,int vt)
//     {
//         this.wt = wt;
//         this.vt = vt;
//     }
//     public int compareTo(Pair p)
//     {
//         return this.wt - p.wt;
//     }
// }

// class revision1
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static int prims(ArrayList<ArrayList<ArrayList<Integer>>> adj,int v)
//     {
//         boolean visited[]=new boolean[v];
//         PriorityQueue<Pair> pq=new PriorityQueue<>();

//         pq.add(new Pair(0,0));
//         int ans = 0;
//         while(pq.size()!=0)
//         {
//             Pair curr = pq.remove();
//             int u=curr.vt;
//             if(visited[u]==false)
//             {
//                 ans+=curr.wt;
//                 visited[u]=true;
//                 for(ArrayList<Integer> list:adj.get(u))
//                 {
//                     int vertex = list.get(0);
//                     int wt = list.get(1);
//                     if(visited[vertex]==false)
//                     {
//                         pq.add(new Pair(vertex,wt));
//                     }
//                 }
//             }
            
//         }
//         return ans;
//     } 
//     public static void main(String[] at)
//     {
//         int v=5;
//         ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<ArrayList<ArrayList<Integer>>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new Pair<>());
//         }
//         adj.get(0).add(new Pair(1,2));
//         adj.get(1).add(new Pair(0,2));

//         adj.get(1).add(new Pair(2,3));
//         adj.get(2).add(new Pair(1,3));
        
//         adj.get(0).add(new Pair(3,6));
//         adj.get(3).add(new Pair(0,6));

//         adj.get(1).add(new Pair(3,8));
//         adj.get(3).add(new Pair(1,8));

//         adj.get(2).add(new Pair(4,7));
//         adj.get(4).add(new Pair(2,7));

//         System.out.println("--------/-------/--------");
//         System.out.print(prims(adj,v));
//     }

// }

class revision1
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    }
    static void dfsrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
    {
        Stack<Integer> st=new Stack<Integer>();
        st.push(s);
        visited[s]=true;

        for(int i:adj.get(s))
        {
            if(visited[i]==false)
            {
                visited[i]=true;
                dfsrec(adj,s,visited);
            }   
        }
        st.push(s);
    }
    
}





