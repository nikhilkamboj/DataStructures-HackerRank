package comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlayerMain {

    public static void main(String[] args) {

        ArrayList<Player> playerArrayList = new ArrayList<Player>();

        playerArrayList.add(new Player("anu", 10));
        playerArrayList.add(new Player("bnu", 100));
        playerArrayList.add(new Player("kani", 10));
        playerArrayList.add(new Player("mani", 11));
        playerArrayList.add(new Player("ahmed", 13));
        playerArrayList.add(new Player("ani", 90));
        playerArrayList.add(new Player("gaani", 100));
        playerArrayList.add(new Player("raani", 102));
        playerArrayList.add(new Player("asdjkasa", 1));
        playerArrayList.add(new Player("paks", 0));
        playerArrayList.add(new Player("dsfdsk", 19));
        playerArrayList.add(new Player("sdsd", 20));

        Collections.sort(playerArrayList);

        System.out.println(playerArrayList);

    }

}
