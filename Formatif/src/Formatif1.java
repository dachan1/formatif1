/*
* Author : danielchan
*Date : Dec. 11, 2020
*/
public class Formatif1
{

	public static void main(String[] args)
		{
			
			int [] montab=new int[10];
			for(int i=0; i<10;i++)
			{
				
				montab[i]=(int)(Math.random()*(i+1));
				
			}
			System.out.println(somme(montab));
		}
	static int somme(int []Tab)
	{
			int sum=0;
			for(int i=0;i<Tab.length;i++)
			{
				 sum=+ Tab[i];
			}
			return sum;
			
	}
			
}
