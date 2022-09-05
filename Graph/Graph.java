
import java.util.*;
// class Graph
// {
//     private boolean adjMatrix[][];
//     private int numVertices;

//     //Initialize the matrix.
//     public Graph(int  numVertices){
//         this.numVertices = numVertices;
//         adjMatrix = new boolean[numVertices][numVertices];

//     }
//     //add edges.
//     public void addEdge(int i,int j){
//         adjMatrix[i][j]=true;
//         adjMatrix[i][j]=true;
//     }

//     //remove edges.
//     public void removeEdge(int i,int j)
//     {
//         adjMatrix[i][j]=false;
//         adjMatrix[i][j]=false;
//     }

//     //print the matrix.
//     public String toString(){
//         StringBuilder s= new StringBuilder();
//         for(int i=0;i<numVertices;i++)
//         {
//             s.append(i+":");    
//             for(boolean j:adjMatrix[i])
//             {
//                 s.append(j?1:0+" ");
//             }
//             s.append("\n");
//         }
//         return s.toString();

//     }
//     public static void main(String[] at)
//     {
//         Graph g= new Graph(4);
//         g.add()
//     }
// }


// //adjacency list.
// class Graph{
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     public static void main(String[] at)
//     {
//         ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());
//         }
//         adj.addEdge(adj,0,1);
//         adj.addEdge(adj,0,2);
//         adj.addEdge(adj,1,2);
//         adj.addEdge(adj,1,3);


//     }

// }

//Bfs search.
// class Graph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
// 	{ 
// 		adj.get(u).add(v); 
// 		adj.get(v).add(u); 
// 	} 
//     static void BFS(ArrayList<ArrayList<Integer>> adj,int v,int s)
//     {
//         boolean visited[]=new boolean[v+1];
//         Queue<Integer> q=new LinkedList<Integer>();
//         visited[s] = true;
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
//     public static void main(String[] aty)
//     {
//         int v=5;
//         ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());
//         }
//         addEdge(adj,0,1);
//         addEdge(adj,0,2);
//         addEdge(adj,1,2); 
//     	addEdge(adj,2,3); 
//     	addEdge(adj,1,3);
//     	addEdge(adj,3,4);
//     	addEdge(adj,2,4);
		
// 		System.out.println("Following is Breadth First Traversal: "); 
// 	    BFS(adj,v,0);
//     }
// }

// class Graph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }

//     static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
//     {
        
//         Queue<Integer> q= new LinkedList<Integer>();
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
//      static void BFSdis(ArrayList<ArrayList<Integer>> adj,int v)
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
//                 BFS(adj,i,visited);
//             }
           
//         }
//     }
//     public static void main(String[] at)
//     {
//         int v=7;
//         ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
//         for(int i=0;i<v;i++)
//         {
//             adj.add(new ArrayList<Integer>());

//             addEdge(adj,0,1); 
//         	addEdge(adj,0,2); 
//         	addEdge(adj,2,3); 
//         	addEdge(adj,1,3); 
//         	addEdge(adj,4,5);
//         	addEdge(adj,5,6);
//         	addEdge(adj,4,6);
//         }
        	
		
// 		System.out.println("Following is Breadth First Traversal: "); 
// 	    BFSdis(adj,v);

//     }
// }

// class Graph
// {
//     static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
//     {
//         adj.get(u).add(v);
//         adj.get(v).add(u);
//     }
//     static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
//     {
//         visited[s]=true;
//         System.out.print(s+" ");
//         for(int i:adj.get(s))
//         {
//             // visited[i]=true;
//             // System.out.print(i+" ");
//             if(visited[i]==false)
//             {
//                 DFSrec(adj,i,visited);
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
//                 DFSrec(adj,i,visited);
//             }
//         }
//     }
//     public static void main(String[] at)
//     {
//         int v = 5; 
// 		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(v); 
		
// 		for (int i = 0; i < v; i++) 
// 			adj.add(new ArrayList<Integer>()); 

// 			addEdge(adj,0,1); 
//         	addEdge(adj,0,2); 
//         	addEdge(adj,1,2);
//         	addEdge(adj,3,4);
		
// 		System.out.println("Following is Depth First Traversal for disconnected graphs: "); 
// 	    DFS(adj,v);
//     }
// }

