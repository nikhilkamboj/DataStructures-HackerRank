package comparator;

import java.util.Comparator;

/**
 * if a user wants to see results as per different fields such as (in ascending or descending order)
 *
 *  1. runs
 *  2. wickets taken
 *  3. yearsPlayed.
 *
 * this can be achieved using comparator by creating innerClasses for each searchType and implementing
 * compare() for each innerClass.
 *
 *
 */

public class PlayerComparator {

    private String nameOfPlayer;
    private int runsScored;
    private int wicketsTaken;
    private int yearsPlayed;

    public PlayerComparator(String nameOfPlayer, int runsScored, int wicketsTaken, int yearsPlayed) {
        this.nameOfPlayer = nameOfPlayer;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.yearsPlayed = yearsPlayed;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public int getRunsScored() {
        return runsScored;
    }


    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public int getYearsPlayed() {
        return yearsPlayed;
    }


    public static Comparator<PlayerComparator> SortRunsScored = new Comparator<PlayerComparator>() {
        @Override
        public int compare(PlayerComparator p1, PlayerComparator p2) {
            return p1.getRunsScored() - p2.getRunsScored();
        }
    };


    public static Comparator<PlayerComparator> SortNameOfPlayer = new Comparator<PlayerComparator>() {
        @Override
        public int compare(PlayerComparator p1, PlayerComparator p2) {
            return p1.nameOfPlayer.compareTo(p2.getNameOfPlayer());
        }
    };

    public static Comparator<PlayerComparator> SortWicketsTaken = new Comparator<PlayerComparator>() {
        @Override
        public int compare(PlayerComparator o1, PlayerComparator o2) {
            return o1.wicketsTaken - o2.wicketsTaken;
        }
    };

    public static Comparator<PlayerComparator> SortYearsPlayed = new Comparator<PlayerComparator>() {
        @Override
        public int compare(PlayerComparator o1, PlayerComparator o2) {
            return o1.yearsPlayed - o2.yearsPlayed;
        }
    };


    @Override
    public String toString() {
        String showString = "{" + nameOfPlayer + "-" + runsScored + "-" + wicketsTaken + "-" + yearsPlayed + "}" + "\n";
        return showString;
    }
}
