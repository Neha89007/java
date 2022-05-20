public class Main
{
   static void AgeEligibilty(int Mage , int Fage)
   { 
      if(Mage<60 || Fage<50) 
      {
         throw new ArithmeticException("You can not take the dose as your age is'nt fit into the criteria.."); 
      }
      else 
      {
         System.out.println("As per your age you are eligible!!"); 
      }
   } 

   static void NationalityCheck(String nationality)
   { 
      if(nationality=="Indian") 
      {
          System.out.println("You can take the dose"); 
      }
      else 
      {
          throw new RuntimeException("As per your country you are not eligible go to your contry..");
      }
   } 
   
   public static void main(String args[])
   { 
     System.out.println("Welcome to the Registration process!!");
     AgeEligibilty(35,55); 
     NationalityCheck("new york");
     System.out.println("Have a nice day.."); 
   } 
}