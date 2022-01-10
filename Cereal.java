// Challah Byard, 01/10/22, AP Data Lab 2022, v0.4

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