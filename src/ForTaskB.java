
public class ForTaskB extends ForTaskA
{
	public Integer[] Array1= {-10,4,5,-2,20,1};
	public Integer[] Array2= {4,0,3,0,5,0,6,0,0,0};
	public Integer[] Array3= {1,-30,-5,10,-3,6};
	public Integer[] Array4= {4,-28,-1,7};
	int CountNull=0;
	int CountPlus=0;
	int CountMinus=0;

	public void  CountDetect(Integer a[]) // ������� ���������� "+" � "-" ���������
	{
		for(int i=0;i<a.length-1;i++)
		{
			
			if (a[i]<0) CountMinus++;
			if (a[i]==0) CountNull++;
		}
		CountPlus=a.length-CountMinus-CountNull;
	}
	
	
	public void  MultIsPlus(Integer a[]) // ��������� ���� ������������ ����� ����� "+" (�����. ���-���. ����� � ����� ���������)
	{
		sortMintoMax(a);
		int j_end=CountMinus-1;
		int j=0;
			

				
				for (j=0;j<j_end;j++)
				{
					System.out.println(a[j]+"*"+a[j_end]+" "+j+"-�� ����");
					j_end--;
				}
			
			
			
				int cj=a.length-1;
				for (int cm=CountMinus;cm<cj;cm++)
				{
					System.out.println(a[cm]+"*"+a[cj]+" "+j+"-�� ����");
					cj--;
					j++;
				}
				
		System.out.println();
						
			
		
	}
	
	public void MultIsMinus(Integer a[]) //��������� ���� ������������ ����� ����� "-" (�����. ���-���. ����� � ����� ���������)
	{
		int i=0,j=CountMinus;
		while (i<CountMinus)
		{	
			System.out.println(a[i]+"*"+a[j]+" "+i+"-�� ����");
			i++;
			j++;
		}
		
	}
	
	public boolean IsWay(Integer a[]) // ���������� ����� ����� ������������ ����� , ���� ���-�� �����. � ����� ��. �����
	{
		sortMintoMax(a); // ��������� � ������� �����������
		if (a[0]*a[1]==a[CountMinus]*a[CountMinus+1]) 
			return true;
		else 
			return false;
		
	}

}
