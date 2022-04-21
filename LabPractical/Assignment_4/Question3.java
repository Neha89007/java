Package Assignment;

class Bank
{

  void interst ()
  {
    System.out.println ("The interst rate on Education lean is 7%");
  }
}
class Manager extends Bank
{
  @Override void interst ()
  {
    System.out.println ("The line interst rate on Education Ioan is 5%");
  }
}
class override
{
  public static void main (String[]args)
  {
    Managerobj = new Manager ();
    obj.interst ();
  }
}