// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(1, 4);
        m.put(2, 7);
        for(Map.Entry<Integer, Integer> e: m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
