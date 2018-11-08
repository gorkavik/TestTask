package part2task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Cinema
{
    private String cinemaName, adress;
    ArrayList<String> cinema = new ArrayList<>();

    public Cinema(String cinemaName, String adress)
    {
        this.cinemaName = cinemaName;
        this.adress = adress;
    }

    private class Film
    {
        String nameFilm;
        int hours, minutes;

        public Film(String nameFilm, int hours, int minutes)
        {
            this.nameFilm = nameFilm;
            this.hours = hours;
            this.minutes = minutes;
        }

        public String getNameFilm()
        {
            return nameFilm;
        }

        public int getHours()
        {
            return hours;
        }

        public int getMinutes()
        {
            return minutes;
        }

        @Override
        public String toString()
        {
            return nameFilm + " " + hours + " " + minutes;
        }
    }

    public void addFilm(String nameFilm, int hours, int minutes)
    {
        Film film = new Film(nameFilm, hours, minutes);
        cinema.add(adress + " " + film.toString());
    }

    public String getFilms()
    {
        String[] str = new String[cinema.size()];
        for (int i = 0; i < cinema.size(); i++)
        {
            str[i] = cinema.get(i);
        }
        return Arrays.toString(str);
    }

    public void setCinemaName(String cinemaName)
    {
        this.cinemaName = cinemaName;
    }

    public String getCinemaName()
    {
        return cinemaName;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    public String getAdress()
    {
        return adress;
    }
}
