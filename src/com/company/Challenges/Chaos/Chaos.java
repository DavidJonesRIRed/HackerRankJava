package com.company.Chaos;

import java.util.ArrayList;
import java.util.Arrays;

public class Chaos {

        String tooChaotic = "Too Chaotic";
        int totalBribes = 0;
        int tempSpot = 0;
        int currentBribe = 0;
        ArrayList<Integer> originalOrder = new ArrayList<>();
        boolean isChaotic = false;


        public void waitingInLine(int[] line) {
            /*for (int i = 0; i < line.length; i++) {
//            originalOrder[i].add(i+1);
                if (line[i] - (i + 1) > 2) {
                    System.out.println(tooChaotic);
                }
                for(int j = 0; j < i; j++) {
                    if(line[j] > line[i]) {
                        totalBribes++;
                    }
                }
            }*/

            for(int recountBribes = 0; recountBribes < line.length; recountBribes++){
                if(recountBribes != (line.length -1) && line[recountBribes] > line[recountBribes+1]){
                    tempSpot = line[recountBribes];
                    line[recountBribes] = line[recountBribes +1 ];
                    line[recountBribes +1] = tempSpot;
                    currentBribe++;
                    System.out.println(currentBribe);
                    if(currentBribe > 2){
                        //System.out.println(tooChaotic);
                        isChaotic = true;
                        break;
                    }
                }
                else{
                    totalBribes = totalBribes + currentBribe;
                    currentBribe = 0;
                }
            }

            if(isChaotic){
                System.out.println(tooChaotic);
            }
            else{
                System.out.println(totalBribes);
            }

            //System.out.println(Arrays.toString(line));
        }
}
