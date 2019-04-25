package com.example.lottogenapp_clickevent;

import java.util.ArrayList;

public class CLottoGen {

    public String GetLotto(){

        ArrayList<Integer> list = new ArrayList<>();

        //把1~49加進去list裡面
        for(int i =1 ; i<50 ; i++){
            list.add(Integer.valueOf(i));
        }
        //把1~49加進去list裡面_END

        //取六個號碼
        int[] nums = new int[6];
        for(int i = 0 ; i <6 ;i++){
            int index =(int)(Math.random()*list.size());
            nums[i] = Integer.valueOf(list.get(index));
            list.remove(index);
        }
        //取六個號碼_END


        //排序:泡沫排序法(Bubble Sort)
        for(int i = 0 ;  i <nums.length; i++){
            for(int j =0; j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        //排序_End


        String s = "";
        for(int i  : nums ){
            s += String.valueOf(i)+" ";
        }
        return s;
    }
}

