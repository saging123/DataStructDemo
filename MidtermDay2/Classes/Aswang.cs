
using MidtermDay2.Interfaces;

namespace MidtermDay2.Classes
{

    class Aswang : ICreature
    {
        private String Name;

        public Aswang(string name)
        {
            this.Name = name;
        }

        public bool canBreathUnderWater()
        {
            return false;
        }

        public bool canSpeak()
        {
            return true;
        }

        public bool canWalk()
        {
            return true;
        }

        public string getCreatureName()
        {
            return this.Name;
        }

        public int GetNumberOfLegs()
        {
            return 2;
        }

        public bool hasWings()
        {
            return true;
        }
    }
}