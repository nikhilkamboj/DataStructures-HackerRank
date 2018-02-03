package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerMain {

    public static void main(String[] args) {

        ArrayList<PlayerComparator> playerArrayList = new ArrayList<PlayerComparator>();

        playerArrayList.add(new PlayerComparator("anu", 10, 2,2));
        playerArrayList.add(new PlayerComparator("bnu", 100,4,12));
        playerArrayList.add(new PlayerComparator("kani", 10,7,3));
        playerArrayList.add(new PlayerComparator("mani", 11,2,5));
        playerArrayList.add(new PlayerComparator("ahmed", 13,4,7));
        playerArrayList.add(new PlayerComparator("ani", 90,11,9));
        playerArrayList.add(new PlayerComparator("gaani", 100,22,10));
        playerArrayList.add(new PlayerComparator("raani", 102,23,22));
        playerArrayList.add(new PlayerComparator("asdjkasa", 1,32,24));
        playerArrayList.add(new PlayerComparator("paks", 0,42,29));
        playerArrayList.add(new PlayerComparator("dsfdsk", 19,92,32));
        playerArrayList.add(new PlayerComparator("sdsd", 20,200,8));

        Collections.sort(playerArrayList, PlayerComparator.SortNameOfPlayer);

        System.out.println(playerArrayList);

        Collections.sort(playerArrayList,PlayerComparator.SortRunsScored);

        System.out.println(playerArrayList);

        Collections.sort(playerArrayList,PlayerComparator.SortWicketsTaken);

        System.out.println(playerArrayList);

        Collections.sort(playerArrayList, PlayerComparator.SortYearsPlayed);

        System.out.println(playerArrayList);

    }

}
