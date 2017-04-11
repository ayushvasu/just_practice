package adobe_interv;

import java.io.*;
import java.util.*;
class comp_one
{
	private int V;  
    private LinkedList<Integer> adj[]; 

  
  @SuppressWarnings("unchecked")
comp_one(int v)
  {
      V = v;	
      adj = new LinkedList[v+1];
      for (int i=1; i<=v; ++i)
          adj[i] = new LinkedList<Integer>();
  }

  void addEdge(int v,int w)
  {
      adj[v].add(w);
  }
 
  boolean DFSUtil(int v,boolean visited[],boolean recstack[])
  {
      // Mark the current node as visited and print it
      visited[v] = true;
      recstack[v]=true;
      //System.out.print(v+" ");

      // Recur for all the vertices adjacent to this vertex
      Iterator<Integer> i = adj[v].listIterator();
      while (i.hasNext())
      {
          int n = i.next();
          if (!visited[n] && DFSUtil(n,visited,recstack))
        	  return true;
          else if(recstack[n])
        	  return true;
        	  
      }
      recstack[v]=false;
      return false;
  }

 
  boolean DFS()
  {

      boolean visited[] = new boolean[V+1];
      boolean recstack[]=new boolean[V+1];

      for (int i=1; i<=V; ++i)
      {
    
          if(DFSUtil(i,visited,recstack))
        	  return true;
      }
      return false;
  }

	public static void main(String aargs[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(bf.readLine());
		int sol[]=new int[t];
		for(int i=0;i<t;i++)
		{
			String str=bf.readLine();
			String str1[]=str.split("\\s+");
			int m=Integer.parseInt(str1[0]);
			int n=Integer.parseInt(str1[1]);
			comp_one g=new comp_one(m);
			for(int j=0;j<n;j++)
			{
				String str2=bf.readLine();
				String str3[]=str2.split("\\s+");
				int a=Integer.parseInt(str3[0]);
				int b=Integer.parseInt(str3[1]);
				g.addEdge(a, b);
			}
			if(g.DFS())
				sol[i]=0;
			else
				sol[i]=1;
		}
		for(int i=0;i<t;i++)
			System.out.println(sol[i]);
	}
}