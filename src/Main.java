import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		ForTaskA TaskA = new ForTaskA();
		ForTaskB TaskB = new ForTaskB();
		System.out.println("Выберите задание\r\n1)натуральные\r\n2)целые");
		int choice;	
		choice=readInt();
		switch(choice)
		{
		case 1:
		System.out.println("Какую хотите последовательность?");
		System.out.print("1)");
		Utils.PrintArray(TaskA.array1);
		System.out.print("\r\n2)");
		Utils.PrintArray(TaskA.array2);
		System.out.print("\r\n3)");
		Utils.PrintArray(TaskA.array3);
		System.out.println();
		Integer num=null;
		num=readInt();
		switch(num)
	      {
	         case 1 :
	        	 Print(TaskA.array1);
	     		TaskA.sortMintoMax(TaskA.array1);
	     		TaskA.SortTwin(TaskA.array1);
	                break;
	         case 2 :
	        	 Print(TaskA.array2);
	     		TaskA.sortMintoMax(TaskA.array2);
	     		TaskA.SortTwin(TaskA.array2);
		            break;
	         case 3 :
	        	 Print(TaskA.array2);
	     		TaskA.sortMintoMax(TaskA.array3);
	     		TaskA.SortTwin(TaskA.array3);
	            break;
	         
	         default :
	            System.out.println("Ничего не выбрали");
	      }
		break;
		case 2:
			System.out.println("Какую хотите последовательность?");
			System.out.print("1)");
			Utils.PrintArray(TaskB.Array1);
			System.out.print("\r\n2)");
			Utils.PrintArray(TaskB.Array2);
			System.out.print("\r\n3)");
			Utils.PrintArray(TaskB.Array3);
			System.out.print("\r\n4)");
			Utils.PrintArray(TaskB.Array4);
			System.out.println();
			Integer num1=null;
			 num1=readInt();
			switch(num1)
			{
			case 1:
				System.out.println("Массив: ");
				  TaskB.CountDetect(TaskB.Array1);
				TaskB.PrintArray(TaskB.Array1);
				if (TaskB.CountNull!=0)
				{
					
				
		     		System.out.println();
		     		TaskB.sortMintoMax(TaskB.Array1);
		     		TaskB.SortTwin(TaskB.Array1);
		     		break;
				}
				
				if (TaskB.CountMinus!=TaskB.CountPlus)
				{
					System.out.println();
					TaskB.MultIsPlus(TaskB.Array1);
					
					break;
				}
				
				if (TaskB.IsWay(TaskB.Array1))
				{
					System.out.println();
					TaskB.MultIsPlus(TaskB.Array1);
				
					break;
				}
				else 
				{
					System.out.println();
					TaskB.MultIsMinus(TaskB.Array1);
					
					break;
				}
				
			case 2:
				System.out.println("Массив: ");
				  TaskB.CountDetect(TaskB.Array2);
				TaskB.PrintArray(TaskB.Array2);
				if (TaskB.CountNull!=0)
				{
					System.out.println();
		     		TaskB.sortMintoMax(TaskB.Array2);
		     		TaskB.SortTwin(TaskB.Array2);
		     		
		     		break;
				}
				
				if (TaskB.CountMinus!=TaskB.CountPlus)
				{
					System.out.println();
					TaskB.MultIsPlus(TaskB.Array2);
					
					break;
				}
				
				if (TaskB.IsWay(TaskB.Array2))
				{
					System.out.println();
					TaskB.MultIsPlus(TaskB.Array2);
					
					break;
				}
				else 
				{
					System.out.println();
					TaskB.MultIsMinus(TaskB.Array2);
					
					break;
				}
				
			case 3:
				System.out.println("Массив: ");
				  TaskB.CountDetect(TaskB.Array3);
				TaskB.PrintArray(TaskB.Array3);
				if (TaskB.CountNull!=0)
				{
					System.out.println("Массив: ");
					TaskB.PrintArray(TaskB.Array3);
		     		System.out.println();
		     		TaskB.sortMintoMax(TaskB.Array3);
		     		TaskB.SortTwin(TaskB.Array3);
		     		break;
				}
				
				if (TaskB.CountMinus!=TaskB.CountPlus)
				{					
					System.out.println();
					TaskB.MultIsPlus(TaskB.Array3);
					
					break;
				}
				
				if (TaskB.IsWay(TaskB.Array3))
				{
					System.out.println();
					
					TaskB.MultIsPlus(TaskB.Array3);
					
					
					break;
				}
				else 
				{
					System.out.println();
					
					TaskB.MultIsMinus(TaskB.Array3);
					
					break;
				}
				
			case 4:
				System.out.println("Массив: ");
				  TaskB.CountDetect(TaskB.Array4);
				TaskB.PrintArray(TaskB.Array4);
				if (TaskB.CountNull!=0)
				{				
		     		System.out.println();
		     		TaskB.sortMintoMax(TaskB.Array4);
		     		TaskB.SortTwin(TaskB.Array4);
		     		
		     		break;
				}
				
				if (TaskB.CountMinus!=TaskB.CountPlus)
				{
					System.out.println();
					TaskB.MultIsPlus(TaskB.Array4);
				
					break;
				}
				
				if (TaskB.IsWay(TaskB.Array4))
				{
					System.out.println();
					TaskB.MultIsPlus(TaskB.Array4);
					
					break;
				}
				else 
				{
					System.out.println();
					TaskB.MultIsMinus(TaskB.Array4);
					
					break;
				}
				
			 default :
		            System.out.println("Ничего не выбрали");
			}        
				
				
				
				
			
			break;
		  default :
	            System.out.println("Ничего не выбрали");
		
		}

	}
	
	public static Integer readInt() //проверка на верный ввод
	{
		Scanner input_start=new Scanner(System.in);
		Integer choice_met=null;
		while (true)
		{
            try 
            {
            	choice_met = Integer.parseInt(input_start.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Невверный ввод!");       
            }
            
            return choice_met;
		}
        
	}
	
	public static void Print(Integer [] a)
	{
		System.out.println("Массив: ");
		Utils.PrintArray(a);
 		System.out.println();
	}

}
