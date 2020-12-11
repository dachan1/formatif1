/*
* Author : danielchan
*Date : Dec. 11, 2020
*/
public class Formatif3
{

	public static void main(String[] args)
		{
			int [] myTab= {14,12,24,12,2,9,8,3,1000,4,10};
			System.out.println(shift(myTab));

		}
	static int [] shift(int []a)
		{
			int tab[] = new int[a.length];
			int b = Methodestable.plusPetitIndex(a);
			for(int i=0; i<a.length-1; i++)
			{
				if(i>b)
					tab[i]=a[i];
			
			else
			{
				tab[i]=a[i+1];
			}
			tab[a.length-1] = tab[a.length-1];
			
				
			
}
			return tab;
		}
}
	


