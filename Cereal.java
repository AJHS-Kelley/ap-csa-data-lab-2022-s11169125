// Challah Byard, 01/12/22, AP Data Lab 2022, v0.6

public class Cereal 
{

    private String cerealName;
    private double fiber;
    private double cups;
    private double fiberPerCup;

    public Cereal(String cerealName, double fiber, double cups, double fiberPerCup)

    {
    name = cerealName;
    fiber = fiber;
    cups = cups;
    FPC = fiberPerCup;

    }

    public Cereal()
    {
       name = "";
       fiber = 0.0;
       cups = 0.0;
       FPC = 0.0;
        
    }

    // Getters 

    public String getName()
    { 
        return name;
    }

    public double getfiber()
    {
        return fiber;
    }
    public double getcups()
    {
        return cups;
    }
    public double getFPC
    {
        return FPC;
    }
    // toString method
    public String toString ()
    {
        return "cereal: " + name + "fibercontent: " + fiber + "serving size (in cups): " + cups + "fiber per cup: " + FPC;

    }

    public static void main(String[]args)
    {
      Cereal food1 = new Cereal();
       System.out.println(food1.toString());
        
       Cereal food2 = new Cereal("Apple Jack",1,1,0.0);
       System.out.println(food2.toString());

    }

}