package com.company.Challenges.OrganizeContainers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrganizeContainers {

    private Integer[][] container;

    OrganizeContainers() {
    }

    OrganizeContainers(Integer[][] ballContainer) {
        this.container = ballContainer;
    }

    // Write your code here
    Integer[] sumContainer = new Integer[container.length];
    Integer[] sumBalls = new Integer[container[0].length];

    // sum Balls
    for(int i = 0 ; i < container.length; i++)
    {
        for(int j = 0 ; j < container.length ; j++)
        {
            sumBalls[i] += (long)container[i][j];
        }
    }

}

