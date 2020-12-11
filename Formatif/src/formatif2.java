/*
* Author : danielchan
*Date : Dec. 11, 2020
*/
public class formatif2
{

	public static void main(String[] args)
		{
			int [] myTab= {14,12,24,12,2,9,8,3,1000,4,10};
System.out.println(nombrepair(myTab));
		}
static int nombrepair(int [] a)
{
		int cpt=0;
		for(int i=0;i<a.length;i++)//analyse chaque element du tableau
		{
			if (a[i]%2==0)//si c'est pair =0
			cpt++;//compteur augmente par 1
		}
		return cpt;
}

}

