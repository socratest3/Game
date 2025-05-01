public class Level
{
    private boolean goalReached;
    private int points;
    public boolean goalReached()
    {
        return goalReached;
    }
    public int getPoints()
    {
        return points;
    }
    public void setPoints(int p)
    {
    points = p;
    }
    public void reachGoal()
    {
        goalReached=true;
    }
}
