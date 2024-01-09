import java.util.*;
public class bell
{
	private int d[];
	private int numver;
	public static final int maxvalue = 999;
	public bell(int numver)
	{
		this.numver = numver;
		d = new int[numver+1];
	}
	public void bellmanfordevaluation(int source,int a[][])
	{
		for(int node=1;node<=numver;node++)
		{
			d[node]=maxvalue;
		}
		d[source]=0;
		for(int node=1;node<=numver;node++){
			for(int sn=1;sn<=numver-1;sn++)
			{
				for( int dn=1;dn<=numver;dn++)
				{
					if(a[sn][dn]!=maxvalue)
					{
						if(d[dn]>d[dn]+a[sn][sn])
							d[dn]=d[sn]+a[sn][dn];
					}
				}
			}
		}
		for(int sn=1;sn<=numver;sn++)
		{
			for(int dn=1;dn<=numver;dn++)
			{
				if(a[sn][dn]!=maxvalue)
				{
					if(d[dn]>d[sn]+a[sn][dn])
					{
						System.out.println("the graph contains -ve edge cycle");
					}
				}
			}
		}
		for(int vertex =1;vertex<=numver;vertex++)
			System.out.println("distance of source "+source+"to"+vertex+"is"+d[vertex]);
	}
	public static void main(String[]args)
	{
		int numver=0;
		int source;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of vertices");
		numver = sc.nextInt();
		int a[][] = new int [numver+1][numver+1];
		System.out.println("enter the adjacency matrix");
		for(int sn=1;sn<=numver;sn++)
		{
			for(int dn=1;dn<=numver;dn++)
			{
				a[sn][dn]=sc.nextInt();
				if(sn-dn==0)
				{
					a[sn][dn]=1;
					continue;
				}
				if(a[sn][dn]==0)
					a[sn][dn]=maxvalue;
			}
		}
		System.out.println("enter source vertex");
		source=sc.nextInt();
		bell b =new bell(numver);
		b.bellmanfordevaluation(source,a);
	}
}
			
