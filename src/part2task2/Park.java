package part2task2;

import java.util.ArrayList;

public class Park
{
    private String parkName;
    private ArrayList<Attraction> arrayAttractions = new ArrayList<>();

    private class Attraction
    {
        String attrName;
        Integer hour, minutes;
        Double cost;

        Attraction(String attrName, int hour, int minutes, double cost)
        {
            this.attrName = attrName;
            this.hour = hour;
            this.minutes = minutes;
            this.cost = cost;
        }

        @Override
        public String toString()
        {
            return attrName + " " + hour + " " + minutes + " " + cost;
        }
    }

    public String getAttraction()
    {
        String str = "";
        for (int i = 0; i < arrayAttractions.size(); i++)
        {
            str = str + " " + arrayAttractions.get(i).toString();
        }
        return str;
    }

    public void addAttraction(String name, int hour, int minutes, double cost)
    {
        Attraction attraction = new Attraction(name, hour, minutes, cost);
        this.arrayAttractions.add(attraction);
    }

    public String getParkName()
    {
        return parkName;
    }

    public void setParkName(String parkName)
    {
        this.parkName = parkName;
    }
}
