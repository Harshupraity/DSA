import java.util.*;
// class dobaragraph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static void findshort(ArrayList<ArrayList<Integer>> adj,int v,int s,int dis[])
//     {
//         boolean visited[]=new boolean[v];
//         Queue<Integer> q=new LinkedList<Integer>();
//         visited[s]=true;
        
//         q.add(s);
//         while(q.isEmpty()==false)
//         {
//             int x=q.poll();
//             for(int i:adj.get(x))
//             if(visited[i]==false)
//             {
//                 visited[i]=true;
//                 dis[i]=dis[x]+1;
//                 q.add(i);
//             }
//         }
        
//     }
//     public static void main(String[] ar)
//     {
//         int v=4;
//         int s=0;
//         ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());
           
//         }
//          addEdge(adj,0,1);
//             addEdge(adj,1,2);
//             addEdge(adj,2,3);
//             addEdge(adj,0,2);
//             addEdge(adj,1,3);
//         int dis[]=new int[v];
//         for(int i=0;i<v;i++)
//         {
//             dis[i]=Integer.MAX_VALUE;
//         }
//         dis[s]=0;
//         System.out.print("shortest array is -:");
//         findshort(adj,v,s,dis);

//         for(int i=0;i<v;i++)
//         {
//             System.out.print(dis[i]+" ");
//         }

//     }
// }

// class dobaragraph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static boolean DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],int parent)
//     {
//         visited[s]=true;

//         for(int i:adj.get(s))
//         {
//             if(visited[i]==false)
//             {
//                 if(DFSrec(adj,i,visited,parent)==true)
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
//     static boolean  DFS(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         boolean visited[]=new boolean[v];
//         for(int i=0;i<v;i++)
//         {
//             if(visited[i]==false)
//             {
//                 if(DFSrec(adj,i,visited,-1)==true)
//                 {
//                     return true;
//                 }
//             }
           
//         }
//          return false;
       
//     }
//      public static void main(String[] at)
//         {
//             	int V = 6; 
// 		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
// 		for (int i = 0; i < V; i++) 
// 			adj.add(new ArrayList<Integer>()); 

// 			addEdge(adj,0,1); 
//         	addEdge(adj,1,2); 
//         	addEdge(adj,2,4); 
//         	addEdge(adj,4,5); 
//         	addEdge(adj,1,3);
//         	addEdge(adj,2,3);
		
// 		if(DFS(adj,V)==true)
//     	    System.out.println("Cycle found");
//     	else
//     	    System.out.println("No cycle found");
//         }
// }



//Again cycle of undirected graph.

// class dobaragraph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],int parent)
//     {
//         visited[s]=0;
//         for(int i:adj.get(s))
//         {
//             if(visited[i]==false)
//             {
//                 if(DFSrec(adj,s,visited,parent)==true)
//                 {
//                     return true;
//                 }
//             }
//             else if(i!=parent)
//             {
//                 return true;
//             }

//         }
//     }
//     public boolean DFS(int v,ArrayList<ArrayList<Integer>> adj,)
//     {
//         boolean visited[] = new boolean[v];
//         for(int i=0;i<v;i++)
//         {
//             if(visited[i]==false)
//             {
//                 if(DFSrec(adj,i,visited,-1)==true)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
// class dobaragraph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v); //DFS based solution.
//        
//     }
//     static boolean DFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],boolean recstack[])
//     {
//         visited[s]=true;
//         recstack[s]=true;
//         for(int i:adj.get(s))
//         {
//             if(visited[i]==false && DFS(adj,i,visited,recstack)==true)
//             {
//                 return true;
//             }
//             else if(recstack[i]==true)
//             {
//                 return true;
//             }
//         }
//         recstack[s]=false;
//         return false;
//     }
//     static boolean Detectcycle(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         boolean visited[] = new boolean[v];
//         boolean recstack[]=new boolean[v];

//         for(int i=0;i<v;i++)
//         {
//             if(visited[i]==false)
//             {
//                 if(DFS(adj,i,visited,recstack)==true)
//                 {
//                     return true;
//                 }
//             }           
//         }
//         return false;
//     }
//     public static void main(String[] at)
//     {
//         int V=6;
//         ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
// 		for (int i = 0; i < V; i++) 
// 			adj.add(new ArrayList<Integer>()); 

// 			addEdge(adj,0,1); 
//         	addEdge(adj,2,1); 
//         	addEdge(adj,2,3); 
//         	addEdge(adj,3,4); 
//         	addEdge(adj,4,5);
//         	addEdge(adj,5,3);
		
// 		if(Detectcycle(adj,V)==true)
//     	    System.out.println("Cycle found");
//     	else
//     	    System.out.println("No cycle found");
//     }
// }

//Topological sorting.
// class dobaragraph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static void Topological(ArrayList<ArrayList<Integer>> adj,int v)
//     {

//         int in_degree[]=new int[v];
//         for(int i=0;i<v;i++)
//         {
//             for(int u:adj.get(i))
//             {
//                 in_degree[u]++;
//             }
//         }
//         Queue<Integer> q = new LinkedList<>();
//         for(int i=0;i<v;i++)
//         {
//             if(in_degree[i]==0)
//             {
//                 q.add(i);
//             }
//         }
//    //     int count=0;
       
//         // visited[s]=true;
//         // q.add(s);
//         while(q.isEmpty()==false)
//         {
//             int l= q.poll();
//              System.out.println(l+" ");
//             for(int x: adj.get(l))
//             {
//                 if(--in_degree[x]==0)
//                 {
//                     q.add(x);
//                 }
//             }
          
            
//         }
//     }
//     public static void main(String[] at)
//     {
//         int v=5;
//         ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());
//             addEdge(adj,0,2);
//             addEdge(adj,0,3);
//             addEdge(adj,1, 3); 
//             addEdge(adj,1, 4); 
//             addEdge(adj,2, 3);
//         }
//         System.out.println("topo");
//         Topological(adj,v);
//     }

// }



//ye wala sahi h.

// class dobaragraph
// {
//      static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static boolean detectcycle(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         int indegree[] = new int[v]; 
//         for(int i=0;i<v;i++)
//         {
//             for(int x:adj.get(i))
//             {
//                 indegree[x]++;
//             }           
//         }
//         int count=0;
//         Queue<Integer> q=new LinkedList<>();
//         for(int i=0;i<v;i++)
//         {
//             if(indegree[i]==0)
//             {
//                 q.add(i);
//             }
//         }
//         while(q.isEmpty()==false)
//         {
//             int i=q.poll();
//             System.out.print(i+" ");
//             for(int u:adj.get(i))
//             {
//                 if(--indegree[u]==0)
//                 {
//                     q.add(u);
//                     count++;
//                 }
//             }
//         }
//     return (count!=v);
    
//     }
//     public static void main(String[] at)
//     {
//         int V=5;
//        	ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
// 		for (int i = 0; i < V; i++) 
// 			adj.add(new ArrayList<Integer>()); 

// 			addEdge(adj,0, 1); 
//             addEdge(adj,4, 1); 
//             addEdge(adj,1, 2); 
//             addEdge(adj,2, 3); 
//             addEdge(adj,3, 1);  
		
//         System.out.print(detectcycle(adj,V));
//     }

// }


//Topological sorting using DFS
// class dobaragraph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//       //  adj.get(v).add(u);
//     } 
//     static void topo(ArrayList<ArrayList<Integer>> adj,int v)
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
//                 DFS(adj,i,st,visited);
//             }
//         }
//         while(st.isEmpty()==false)
//         {
//             System.out.print(st.pop()+" ");
//         }
//     }
//     static void DFS(ArrayList<ArrayList<Integer>> adj,int s,Stack<Integer> st,boolean visited[])
//     {
//         visited[s]=true;
//         for(int i:adj.get(s))
//         {
//             if(visited[i]==false)
//             {
//                 DFS(adj,i,st,visited);
//             }
//         }
//         st.push(new Integer(s));
//     }
//     public static void main(String[] at)
//     {
//         int v=5;
//         ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());
//            	addEdge(adj,0, 1); 
//             addEdge(adj,1, 3);
//              addEdge(adj,3, 4);  
//             addEdge(adj,2, 3); 
           
//             addEdge(adj,2, 4); 
//         }

//         System.out.println("following");
//         topo(adj,v);

//     }

// }

class dobaragraph
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        //adj.get(v).add(u);
    } 
    static void DFS(ArrayList<ArrayList<Integer>> adj,int u,Stack<Integer> st,boolean visited[])
    {
        visited[u]=true;
        for(int v:adj.get(u))
        {
            if(visited[v]==false)
            {
                DFS(adj,v,st,visited);
            }
        }
        st.push(u);
    }
    static void topo(ArrayList<ArrayList<Integer>> adj,int v)
    {
         boolean visited[]=new boolean[v];
        
        for(int Q = 0;Q<v; Q++) 
        {
    		visited[Q] = false;
        }
        Stack<Integer> st=new Stack<Integer>(); 
       
      
        for(int u=0;u<v;u++)
        {
            if(visited[u]==false)
            {
                DFS(adj,u,st,visited);
            }
        }
        while(st.isEmpty()==false)
        {
            System.out.println(st.pop()+" ");
        }
    }
    public static void main(String[] at)
    {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
           	addEdge(adj,0, 1); 
            addEdge(adj,1, 3);
              
            addEdge(adj,2, 3); 
             addEdge(adj,3, 4);
           
            addEdge(adj,2, 4); 
        }

        System.out.println("following");
        topo(adj,v);

    }
}

class dobaragraph
{
    
}

