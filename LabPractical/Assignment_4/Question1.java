public class Main
{
    public static void main(String args[])
    {
        int vote1=1136;
        int vote2=7636;
        int vote3=11628;
        
        double sum=vote1+vote2+vote3;
        System.out.println(sum);
        
        double P = (11628/sum)*100;
        System.out.println("Percentage of the total votes the winning candidate get : "+P);
    }
}