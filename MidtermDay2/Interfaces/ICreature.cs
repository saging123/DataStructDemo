namespace MidtermDay2.Interfaces
{
    interface ICreature
    {
        string getCreatureName();
        int GetNumberOfLegs();
        bool hasWings();
        bool canSpeak();
        bool canBreathUnderWater();
        bool canWalk();
    }


}