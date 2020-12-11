/*
* Author : danielchan
*Date : Dec. 11, 2020
*/
public class Formatif3
{

	public static void main(String[] args)
		{
			int [] myTab= {14,12,24,12,2,9,8,3,1000,4,10};
System.out.println(croissant(myTab));
		}
	static int [] croissant(int []a)
		{
			for(int i=0;i<a.length;i++)
			{
				int temp;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
				}
				
			}
			return a;
			
		}
}
