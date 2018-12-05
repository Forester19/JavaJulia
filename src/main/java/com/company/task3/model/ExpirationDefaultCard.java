package com.company.task3.model;

import com.company.task3.model.intefraces.IsAccumulatable;
import com.company.task3.model.intefraces.expiration.Expiration;
import com.company.task3.model.intefraces.expiration.IsExpiration;
import com.company.task3.model.intefraces.typable.IsTypable;
import com.company.task3.model.intefraces.typable.Typable;

public class ExpirationDefaultCard extends Card implements IsTypable, IsExpiration, Typable, IsAccumulatable {
    private Expiration expiration;

    public ExpirationDefaultCard(Expiration expiration, int id) {
        super(id);
        this.expiration = expiration;
    }

    @Override
    public Expiration getExpiration() {
        return expiration;
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
        return "ExpirationDefaultCard{" +
                "expiration=" + expiration +
                ", id=" + id + " DateOfCreation" + expiration.gatDateOfCreation() + " expiration " + expiration.getExpiration();
    }
}