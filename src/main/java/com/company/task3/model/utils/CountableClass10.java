package com.company.task3.model.utils;

import com.company.task3.model.intefraces.countable.Countable;

public class CountableClass10 implements Countable {
    private int count = 10;
    private int limit = 10;
    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean decrement() {
        count --;
        return count >= 0;
    }

    @Override
    public boolean increment(int delta) {
        int newCount = count + delta;
        if(newCount > limit){
            return false;
        }
        count = newCount;
        return true;
    }

}
