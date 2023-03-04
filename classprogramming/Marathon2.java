package classprogramming;

import java.util.ArrayList;

class Runner2 {
    String name;
    int BIB;
    int Index = 1;
    ArrayList<String> Fun;
    ArrayList<String> Mini;
    ArrayList<String> Half;
    ArrayList<String> Marathon;

    Runner2() {
        if (BIB == 1) {
            String id = "A" + String.format("%03d", Index);
            Fun.add(id);
        } else if (BIB == 2) {
            String id = "B" + String.format("%03d", Index);
            Mini.add(id);
        } else if (BIB == 3) {
            String id = "C" + String.format("%03d", Index);
            Half.add(id);
        } else if (BIB == 4) {
            String id = "D" + String.format("%03d", Index);
            Marathon.add(id);
        }
    }
}

public class Marathon2 {

}
