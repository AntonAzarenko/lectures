package oop.inheritance.domain;

public class Phone extends Product<Integer> {

    private String tvPlayer;

    public String getTvPlayer() {
        return tvPlayer;
    }

    public void setTvPlayer(String tvPlayer) {
        this.tvPlayer = tvPlayer;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Phone{" +
                "tvPlayer='" + tvPlayer + '\'' +
                '}';
    }
}
