package org.guildofgamers.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by smday on 01/04/2017.
 */
public class SteveTest {

    static  Map inputMap;

    public final static void main(String[] args) {

        inputMap = new HashMap();

        inputMap.put("Names", "RevoWax");
        inputMap.put("Location", "London");
        inputMap.put("Staff", Arrays.asList("Steve", "Phil"));

        inputMap.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
        });

        if(inputMap.containsKey("Name")) {
            System.out.println("Has name specified");
        }
    }

}
