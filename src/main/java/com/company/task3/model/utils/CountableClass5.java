package com.company.task3.model.utils;

import com.company.task3.model.intefraces.countable.Countable;

public class CountableClass5 implements Countable {
    private int count = 5;
    private int limit = 5;
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
