package Clases2;

import Clases2.Video;

public class Movie extends Video {

    private int durationMinutes;

    public Movie(String title, int id, int duration) {
        super(title, id);
        this.durationMinutes = duration;
    }

    public int getDuration() {
        return durationMinutes;
    }

    public void setDuration(int duration) {
        this.durationMinutes = duration;
    }
}
