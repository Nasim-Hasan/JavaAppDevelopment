using System;

namespace BinarySearch
{
    class Program
    {
        static String[] city = {"London", "Berlin", "Chicago","New York" }; 
        static void Main(string[] args)
        {
            Console.WriteLine("Input the Name of the City:");
            String cityName = Console.ReadLine(); //..Taking Input from the Standard Input Device (Keyboard)

            int i = Search(cityName);

            if (i >= 0)
            {
                Console.WriteLine("Found in the Position:" + i);
            }
            else 
            {
                Console.WriteLine("Not Found");

            }
        }

        static int Search(String tmpcity)
        {
            int c=0;

            for (int i = 0; i <city.Length; i++)
            {
                if (city[i].Equals(tmpcity))
                {
                    c=i;
                    break;
                }
                else
                {
                    c =-1;
                }
            }

            return c;
        
        }

    }
}
