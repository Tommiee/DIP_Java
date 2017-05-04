public class BurningAlcohol extends Alcohol
{
  public void burn(){
    if(ml > 0)
      System.out.println("Burn All the "+this.getClass().getName()+"!");
      ml = 0;
  }
}
