package com.company.task3.model;

import com.company.task3.model.intefraces.IsAccumulatable;
import com.company.task3.model.intefraces.countable.Countable;
import com.company.task3.model.intefraces.countable.IsCountable;
import com.company.task3.model.intefraces.typable.IsTypable;
import com.company.task3.model.intefraces.typable.Typable;

public class CountableDefaultCard  extends Card implements IsCountable, IsTypable, Typable, IsAccumulatable {
    private Countable countable;

    public CountableDefaultCard(Countable countable, int id) {
        super(id);
        this.countable = countable;
    }
    public int getCount(){
        return countable.getCount();
    }

    @Override
    public Countable getCountable() {
        return countable;
    }

    @Override
    public Typable getTypable() {
        return this;
    }

    @Override
    public Typable.Type getType() {
        return Type.DefaultCard;
    }

    @Override
    public String toString() {
        return "CountableChildCard{" +
                "countable=" + countable +
                ", id=" + id + " type " + getType().toString() + " count " + countable.getCount();
    }
}
