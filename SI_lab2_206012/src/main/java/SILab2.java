import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) { //ENTRY
        if (list.size() <= 0) { //A
            throw new IllegalArgumentException("List length should be greater than 0"); //B
        }
        int n = list.size(); //C
        int rootOfN = (int) Math.sqrt(n); //C
        if (rootOfN * rootOfN  != n) { //C
            throw new IllegalArgumentException("List length should be a perfect square"); //D
        }
        List<String> numMines = new ArrayList<>(); //E
        for (int i = 0; i < n; i++) { //F.1 F.2 F.3
            if (!list.get(i).equals("#")) { //G
                int num = 0; //H
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //H
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ //I
                        num += 2; //J
                    }
                    else { //K
                        num  += 1; // K
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //L
                    num++; // M
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ // N
                    num++; //O
                }
                numMines.add(String.valueOf(num)); //P
            }
            else { //Q
                numMines.add(list.get(i)); //Q
            }
        }
        return numMines; //R
    } //EXIT
}
