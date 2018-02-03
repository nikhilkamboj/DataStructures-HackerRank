package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerMain {

    public static void main(String[] args) {

        ArrayList<PlayerComparable> playerArrayList = new ArrayList<PlayerComparable>();

        playerArrayList.add(new PlayerComparable("anu", 10));
        playerArrayList.add(new PlayerComparable("bnu", 100));
        playerArrayList.add(new PlayerComparable("kani", 10));
        playerArrayList.add(new PlayerComparable("mani", 11));
        playerArrayList.add(new PlayerComparable("ahmed", 13));
        playerArrayList.add(new PlayerComparable("ani", 90));
        playerArrayList.add(new PlayerComparable("gaani", 100));
        playerArrayList.add(new PlayerComparable("raani", 102));
        playerArrayList.add(new PlayerComparable("asdjkasa", 1));
        playerArrayList.add(new PlayerComparable("paks", 0));
        playerArrayList.add(new PlayerComparable("dsfdsk", 19));
        playerArrayList.add(new PlayerComparable("sdsd", 20));

        Collections.sort(playerArrayList);

        System.out.println(playerArrayList);

    }

}
