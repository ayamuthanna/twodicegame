public class TwoDiceGames {

private int numRolls;
private int [] rolls;

public TwoDiceGames()
{
  this(100);
}

public TwoDiceGames( int x)
{
  this.numRolls = x;
  rolls = new int[numRolls];
  rollDice();
}

private void rollDice () // private, only want to call in this class stricly
{
  Die d1 = new Die();
  Die d2 = new Die();

  for ( int i = 0; i < rolls.length; i++)
  {
    rolls[i] = d1.roll() + d2.roll();// die rolls are random, so array has 2 random die rolls assigned at each index
  }
}
}

public void SnakeEyes()// how many times snake eyes is found in array
{
  int count = 0;
  
    for ( int i: rolls)
    {
      if ( i == 2)
      {
        count++;
      }
    }
  System.out.print("The number of snake eyes in" );
  System.out.println(numRolls + " rolls is " + count);

}











}