package comparator;

public class PlayerComparable implements Comparable<PlayerComparable>{

    private String nameOfPlayer;
    private int runsScored;

    public PlayerComparable(String nameOfPlayer, int runsScored) {
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
    public int compareTo(PlayerComparable p) {

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
