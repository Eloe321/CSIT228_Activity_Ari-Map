package Map_Folder;

import java.util.ArrayList;

public class MyMap<Key, Val> {
    private ArrayList<Key> ArrKey;
    private ArrayList<Val> ArrVal;

    public MyMap() {
        ArrKey = new ArrayList<>();
        ArrVal = new ArrayList<>();
    }

    public void put(Key key, Val value) {
        if(ArrKey.contains(key)) {
            int index = ArrKey.indexOf(key);
            ArrVal.set(index, value);
        } else {
            ArrKey.add(key);
            ArrVal.add(value);
        }
    }

    public Val get(Key key) {
        Val tmp;
        if(ArrKey.contains(key)) {
            int index = ArrKey.indexOf(key);
            tmp = ArrVal.get(index);
        } else {
            tmp = null;
        }
        return tmp;
    }

    public Val remove(Key key, Val value) {
        Val tmp;
        if(ArrKey.contains(key)) {
            int index = ArrKey.indexOf(key);
            tmp = ArrVal.get(index);
            ArrKey.remove(index);
            ArrVal.remove(index);
        } else {
            tmp = null;
        }
        return tmp;
    }

    // Checking function

    public void print() {
        for(int i = 0; i < ArrKey.size(); i++){
            System.out.println("{" + ArrKey.get(i) + ", " + ArrVal.get(i) + "}");
        }
    }
}
