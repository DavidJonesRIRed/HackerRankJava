package com.company.InterviewPrepardness.JumpingClouds;

public class JumpingClouds {
    public JumpingClouds(){
        //
    }

    public int howManyClouds(int[] clouds, int N){

        int Jumps = 0;
        int i = 0;
        while(true) {
            if(i + 2 < N && clouds[i + 2] == 0) {
                i += 2;
            } else if(i + 1 < N) {
                i++;
            } else {
                break;
            }
            Jumps++;
        }
        return Jumps;
    }
}
