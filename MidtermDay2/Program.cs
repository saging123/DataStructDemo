using MidtermDay2.Classes;
using MidtermDay2.Interfaces;


namespace MidtermDay2
{

    class Program
    {

        public static void Main(string[] args)
        {
            ICreature[] creatures = new ICreature[4];
            Snake c1 = new Snake("Anaconda");

            creatures[0] = new Aswang("Manananggal");
            creatures[1] = new Snake("Python");
            creatures[2] = new Snake("Cobra");
            creatures[3] = c1;


            for (int i = 0; i < 4; i++)
            {
                Console.WriteLine("-----------------------");
                Console.WriteLine("Name: " + creatures[i].getCreatureName());
                Console.WriteLine("Legs: " + creatures[i].GetNumberOfLegs());
                Console.WriteLine("Wings: " + creatures[i].hasWings());
                Console.WriteLine("Speak: " + creatures[i].canSpeak());
                Console.WriteLine("Breath Underwater: " + creatures[i].canBreathUnderWater());
                Console.WriteLine("Walk: " + creatures[i].canWalk());
            }







        }
    }


}