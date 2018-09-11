
public class ForTaskA 
{
	public Integer array1 []= { 1, 2, 50, 100, 4, 25, 5, 20};
	public Integer array2 []= { 1, 48, 16, 24, 8, 6, 12, 4, 2, 3};
	public Integer array3 []= { 7, 2, 4, 1, 8, 112, 16, 28, 56, 14};
	
	
	public void PrintArray(Integer array[]) //печатает массив
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	
	
	public void sortMintoMax(Integer a[]) // сортирует (сортировка вставками) по возрастанию
	{
		
		for(int i=1;i<a.length;i++)     
			for(int j=i;j>0;j--)
			{
				if (a[j-1]>a[j])
				{
					int sw=a[j-1];
					a[j-1]=a[j];
					a[j]=sw;
				}
				
			}
	}
	
	public void SortTwin(Integer a[]) // сортирует по парам 
	{
		int j=a.length-1;
		for (int i=0;i<j;i++)
		{
			System.out.println(a[i]+"*"+a[j]+" "+i+"-ая пара");
			j--;
		}
	}

	

}
