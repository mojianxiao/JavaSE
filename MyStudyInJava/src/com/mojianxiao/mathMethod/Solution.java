package com.mojianxiao.mathMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
	//给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
    public static int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums) {
        	if(!list.contains(i)) {
        	list.add(i);}
        }	
        Collections.sort(list);
        if(list.size() < 3) {
        	return list.get(list.size()-1);
        }
    	return list.get(list.size()-3);
    }
    
}
