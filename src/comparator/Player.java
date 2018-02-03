package comparator;

public class Player implements Comparable<Player>{

    private String nameOfPlayer;
    private int runsScored;

    public Player(String nameOfPlayer, int runsScored) {
        this.nameOfPlayer = nameOfPlayer;
        this.runsScored = runsScored;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public int getRunsScored() {
        return runsScored;
    }


    @Override
    public int compareTo(Player p) {

        if (this.getRunsScored() == p.getRunsScored()) {
            // compare with name
            return this.getNameOfPlayer().compareTo(p.nameOfPlayer);

        } else if (this.getRunsScored() > p.getRunsScored()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        String printString = nameOfPlayer + "-"+ runsScored;
        return printString;
    }
}
