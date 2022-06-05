package Clases2;

public class TvSeries extends Video {
    private int seasons;

    public TvSeries(String title, int id, int seasons) {
        super(title, id);
        this.seasons = seasons;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
}
