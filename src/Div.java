package src;

import java.util.ArrayList;
import java.util.List;

public class Div {
        public static void main(String[] args) {
            List<Integer> ar = new ArrayList<>();
            List<Integer> ar2 = new ArrayList<>();
            int initial = 1;
            mul(12,2,ar2);
            mul( 1,2,ar);
            for (int i =0;i<ar2.size();i++){
                if(ar.contains(ar2.get(i))){
                    initial = initial* ar2.get(i);
                    ar.remove(ar2.get(i));
                }
            }

            System.out.println("GCD - "+ initial);

        }

        public static int mul(int i, int div,List<Integer> ar){
            if (i == 1 ){
                return 1;
            }
            if (i % div != 0){
                return mul(i, ++div, ar);
            }
            int out = i / div;
            ar.add(div);
            if (out ==1 ){
                return div;
            }
            return mul(out, div,ar);
        }
    }

