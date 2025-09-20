
using MidtermDay2.Interfaces;

namespace MidtermDay2.Classes
{

    class Snake : ICreature
    {
        private String Name;

        public Snake(string name)
        {
            this.Name = name;
        }

        public bool canBreathUnderWater()
        {
            return true;
        }

        public bool canSpeak()
        {
            return false;
        }

        public bool canWalk()
        {
            return false;
        }
        public bool canJump()
        {
            return false;
        }
        public string getCreatureName()
        {
            return this.Name;
        }

        public int GetNumberOfLegs()
        {
            return 0;
        }

        public bool hasWings()
        {
            return false;
        }
    }
}