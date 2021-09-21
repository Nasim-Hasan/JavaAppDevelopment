/**
 * 
 */
package diamondshapedemo;

import java.util.Scanner;

/**
 * @author nhasa
 *
 */
public class DiamondShapeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0,symbol=0,determiner=0;
		
		System.out.println("Input the Size of the Diamond:");
		
		Scanner input=new Scanner(System.in);
		size=input.nextInt();
		
		DrawPluses(size);
		System.out.println();
		
		System.out.print("|");
		
		    if(size==1)
	        {
	            System.out.printf("%s", "<");
		    	System.out.print(">");
		    	DrawBars();
	            System.out.println();
       		    DrawPluses(size);
	        }
	        else
	        {
	            for(int i=1;i<=size;i++)
	            {
	                if(i==1)
	                {
	                	System.out.printf("%s", "/");
	                    System.out.print(" "+"\\");
	                    DrawBars();
	                }
	                else if(i==size)
	                {
	                    if(i%2==0)
	                    {
	                        System.out.printf("%s","<");
	                        DrawDashes(symbol);
	                        System.out.print(">");
	                        DrawBars();
	                        determiner=1;

	                    }
	                    else
	                    {
	                        System.out.printf("%s","<");
	                        DrawEquals(symbol);
	                        System.out.print(">");
	                        DrawBars();
	                    }

	                }
	                else
	                {
	                    if(i%2==0)
	                    {
	                        System.out.printf("%s","/");
	                        DrawDashes(symbol);
	                        System.out.print("\\");
	                        DrawBars();

	                    }
	                    else
	                    {
	                        System.out.printf("%s","/");
	                        DrawEquals(symbol);
	                        System.out.print("\\");
	                        DrawBars();

	                    }

	                }
	                symbol=symbol+2;
	                System.out.println();
	                System.out.print("|");
	            }
	            
	            DrawReverse(size,symbol-4,determiner);

	        }
		    
		   input.close();

	}
	
	//...Drawing of Dashes...//
	private static void DrawDashes(int symbol)
	{
		   for(int k=1;k<=symbol;k++)
           {
               System.out.print("-");
           }
	}
	    
	//...Drawing of Equals...//
	private static void DrawEquals(int symbol)
	{
		   for(int k=1;k<=symbol;k++)
           {
               System.out.print("=");
           }
	}
	
	//...Drawing of Reversed Dashes...//
	private static void ReverseDrawDashes(int symbol)
	{
		   for(int k=symbol;k>=1;k--)
           {
               System.out.print("-");
           }
	}
	 
	//...Drawing of Reversed Equals...//
	private static void ReverseDrawEquals(int symbol)
	{
		   for(int k=symbol;k>=1;k--)
           {
               System.out.print("=");
           }
	}
	
	//...Drawing of Pluses...//
	private static void DrawPluses(int size)
	{
		System.out.print("+");
		
		for(int i=1;i<=2*size;i++)
		{
			System.out.print("-");
		}
		
		System.out.print("+");
		
	}
	
	//....Drawing of Bars...//
	
	private static void DrawBars()
	{
		System.out.printf("%s","|");
		
		
	}
	
	
	//....Drawing of Reverse Diamond...//
	private static void DrawReverse(int size, int symbol, int determiner)
	{
		
		if(size==2)
		{
			System.out.print("\\"+" "+"/");
			DrawBars();
			System.out.println();
		}
		
		else
		{
		    for(int i=1;i<=size-1;i++)
			{
				if(i==size-1)
				{
					System.out.print("\\"+" "+"/");
					DrawBars();
					break;
				}
				else
				{
				       if(determiner==1)
	                   {
	                       System.out.print("\\");
	                       ReverseDrawEquals(symbol);
	                       System.out.print("/");
	                       DrawBars();
	                       determiner=0;
	
	                   }
	                   else
	                   {
	                       System.out.print("\\");
	                       ReverseDrawDashes(symbol);
	                       System.out.print("/");
	                       DrawBars();
	                       determiner=1;
	
	                   }
					
				}
				
				symbol=symbol-2;
				System.out.println();
				System.out.print("|");
				
			}
		    
		    System.out.println();
		   }
		
		  DrawPluses(size);
		
	}

}
