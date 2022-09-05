import java.util.*;
import java.io.*;
import java.lang.*;

// class Graph 
// {
//     boolean adjmatrix[][];
//     int numvertices;
//     //Initialize the matrix.

//     Graph(int numvertices)
//     {
//         this.numvertices=numvertices;
//         adjmatrix=new boolean[numvertices][numvertices];
//     }
//     //Add edges
//     void addedge(int i,int j)
//     {
//         adjmatrix[i][j]=true;
//         adjmatrix[j][i]=true;
//     }
//     //remove edge
//     void removeedge(int i,int j)
//     {
//         adjmatrix[i][j]=false;
//         adjmatrix[i][j]=false;
//     }
//     //print matrix.
//     public String toString(){
//         StringBuilder s=new StringBuilder();
//         for(int i=0;i<numvertices;i++)
//         {
//             s.append(i+":");
//             for(boolean j:adjmatrix[i])
//             {
//                 s.append((j?1:0)+" ");
//             }
//             s.append("\n");
//         }
//         return s.toString();
//     }
//     public static void main(String[] at)
//     {
//         Graph g=new Graph(4);
//          g.addedge(0, 1);
//             g.addedge(0, 2);
//             g.addedge(1, 2);
//             g.addedge(2, 0);
//             g.addedge(2, 3);

//              System.out.print(g.toString());
//     }
// }
// class Graph
// {
//     static void addedge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     public static void main(String[] at)
//     {
//         int v=5;
//         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());
//         } 
//         addedge(adj,0,1);
//         addedge(adj,0,2);
//         addedge(adj,1,2);
//         addedge(adj,1,3);

//         printgraph(adj);
//     }
//     static void printgraph(ArrayList<ArrayList<Integer>> adj)
//     {
//         for(int i=0;i<adj.size();i++)
//         {
//             for(int j=0;j<adj.get(i).size();j++)
//             {
//                 System.out.print(adj.get(i).get(j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// class Graph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static void bfs(ArrayList<ArrayList<Integer>> adj,int v,int s)
//     {
//         boolean[] visited=new boolean[v];
//         for(int i=0;i<v;i++)
//         {
//             visited[i]=false;
//         }
//         Queue<Integer> q=new LinkedList<>();
//         visited[s]=true;
//         q.add(s);
//         while(q.isEmpty()==false)
//         {
//             int u=q.poll();
//             System.out.print(u+" ");

//             for(int h:adj.get(u))
//             {
//                 if(visited[h]==false)
//                 {
//                     visited[h]=true;
//                     q.add(h);

//                 }
//             }
//         }
//     }
//     public static void main(String[] at)
//     {
//         int v=5;
//         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());
//         } 
//         	addEdge(adj,0,1); 
//     	addEdge(adj,0,2); 
//     	addEdge(adj,1,2); 
//     	addEdge(adj,2,3); 
//     	addEdge(adj,1,3);
//     	addEdge(adj,3,4);
//     	addEdge(adj,2,4);

//         System.out.println("Following is breath first traversal");
//         bfs(adj,v,0);
//     }
// }

// class Graph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);

//     }
//     static void bfs(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
//     {
//         Queue<Integer> q=new LinkedList<>();    

//         visited[s]=true;
//         q.add(s);
//         while(q.isEmpty()==false)
//         {
//             int u=q.poll();
//             System.out.print(u+" ");

//             for(int h:adj.get(u))
//             {
//                 if(visited[h]==false)
//                 {
//                     visited[h]=true;
//                     q.add(h);
//                 }
//             }
//         }   
//     }
//     static void bfsdis(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         boolean[] visited=new boolean[v];
//         for(int i=0;i<v;i++)
//         {
//             visited[i]=false;
//         }
//         for(int i=0;i<v;i++)
//         {
//             if(visited[i]==false)
//             {
//                 bfs(adj,i,visited);
//             }
//         }
//     }
//     public static void main(String[] s)
//     {
//         int v=7;
//         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());

//             addEdge(adj,0,1);
//             addEdge(adj,0,2);
//             addEdge(adj,2,3); 
//         	addEdge(adj,1,3); 
//         	addEdge(adj,4,5);
//         	addEdge(adj,5,6);
//         	addEdge(adj,4,6);

//         System.out.println("Following is Breadth First Traversal: "); 
// 	    bfsdis(adj,v);
//         }
//     }
// }

// class Graph
// {
//     static void addedge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static void BFS(ArrayList<ArrayList<Integer>> adj,int v,int s,boolean visited[])
//     {
//         Queue<Integer> q=new LinkedList<>();
//         visited[s]=true;
//         q.add(s);
//         while(q.isEmpty()==false)
//         {
//             int u=q.poll();
//             System.out.print(u+" ");
//             for(int i:adj.get(u))
//             {
//                 if(visited[i]==false)
//                 {
//                     visited[i]=true;
//                     q.add(i);
//                 }
//             }
//         }
//     }
//     int Bfsdis(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         boolean visited[]=new visited[v+1];
//         int count=0;
//         for(int i=0;i<v;i++)
//         {
//             if(visited[i]==false)
//             {
//                 bfsdis(adj,i,visited);
//                 count++;
//             }
//         }
//         return count;
//     }
//       public static void main(String[] s)
//     {
//         int v=7;
//         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());

//             addEdge(adj,0,1);
//             addEdge(adj,0,2);
//             addEdge(adj,2,3); 
//         	addEdge(adj,1,3); 
//         	addEdge(adj,4,5);
//         	addEdge(adj,5,6);
//         	addEdge(adj,4,6);

//         System.out.println("Following is Breadth First Traversal: "); 
// 	    bfsdis(adj,v);
//         }
//     }

// }


//This is for connected graph.
// class Graph
// {
//     	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
// 	{ 
// 		adj.get(u).add(v); 
// 		adj.get(v).add(u); 
// 	} 
//     static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
//     {
//         visited[s]=true;
//         System.out.print(s+" ");
//         for(int i:adj.get(s))
//         {
//             if(visited[i]==false)
//             {
//                 if(visited[i]==false)
//                 {
//                     DFSrec(adj,i,visited);
//                 }
//             }
//         }
//     }
//     void DFS(ArrayList<ArrayList<Integer>> adj,int v,int s)
//     {
//         boolean visited[]=new boolean[v];
//         DFSrec(adj,s,visited);
//     }

// }

//for disconnected graph.

// class Graph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
// 	{ 
// 		adj.get(u).add(v); 
// 		adj.get(v).add(u); 
// 	} 

//     static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
//     {
//         visited[s]=true;
//         System.out.print(s+" ");
//         for(int i:adj.get(s))
//         {
//             if(visited[i]==false)
//             {
//                 if(visited[i]==false)
//                 {
//                     DFSrec(adj,i,visited);
//                 }
//             }
//         }
//     }
//     static void DFS(ArrayList<ArrayList<Integer>> adj,int v)
//     {
//         boolean visited[]=new boolean[v];
//         for(int i=0;i<v;i++)
//         {
//             if(visited[i]==false)
//             {
//                 DFSrec(adj,i,visited);//This is to print all the vertices of disconnected nodes. 

//             }
//         }

//     }
//     public static void main(String[] t)
//     {
//         	int V = 5; 
// 		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
// 		for (int i = 0; i < V; i++) 
// 			adj.add(new ArrayList<Integer>()); 

// 			addEdge(adj,0,1); 
//         	addEdge(adj,0,2); 
//         	addEdge(adj,1,2);
//         	addEdge(adj,3,4);
		
// 		System.out.println("Following is Depth First Traversal for disconnected graphs: "); 
// 	    DFS(adj,V);
//     }

// }

//count no. of vertices. 
class Graph
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 

    static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
    {
        visited[s]=true;
        System.out.print(s+" ");
        for(int i:adj.get(s))
        {
            if(visited[i]==false)
            {
                if(visited[i]==false)
                {
                    DFSrec(adj,i,visited);
                }
            }
        }
    }
    static int DFS(ArrayList<ArrayList<Integer>> adj,int v)
    {
        boolean visited[]=new boolean[v];
        int count=0;
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                DFSrec(adj,i,visited);//This is to print all the vertices of disconnected nodes. 
                count++;
            }
        }
        return count;
    }
    public static void main(String[] t)
    {
        	int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0,1); 
        	addEdge(adj,0,2); 
        	addEdge(adj,1,2);
        	addEdge(adj,3,4);
		
		System.out.println("Following is Depth First Traversal for disconnected graphs: "); 
	    DFS(adj,V);
    }

}