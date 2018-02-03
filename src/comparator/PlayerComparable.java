package comparator;

/**
 *
 * here we have two fields
 *     name of player
 *     runs of player
 * hence comparing is done on th basis of runs and also name id runs are same.
 * we are not using comparator as we just want output only based on predefined logic, if we had more fields
 * and wanted an output with different compare fields we would have used comparator.
 *
 *
 * if we wanted to compare as per
 *    1. runs
 *    2. as per name
 * and wanted 2 different answers then would have used comparator as comparable has no means to let us compare
 * in 2 different ways but comparator has.
 *
 *
 *
 */


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
        }

        return this.getRunsScored() - p.runsScored;
    }

    @Override
    public String toString() {
        String printString = nameOfPlayer + "-"+ runsScored;
        return printString;
    }
}
