package com.company.task3.model;

import com.company.task3.model.intefraces.expiration.Expiration;
import com.company.task3.model.intefraces.expiration.IsExpiration;
import com.company.task3.model.intefraces.typable.IsTypable;
import com.company.task3.model.intefraces.typable.Typable;

public class ExpirationChildCard  extends Card implements IsTypable, IsExpiration, Typable {
    private Expiration expiration;

    public ExpirationChildCard(Expiration expiration, int id) {
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
    public Type getType() {
        return Type.ChildCard;
    }

    @Override
    public String toString() {
        return "ExpirationChildCard{" +
                "expiration=" + expiration +
                ", id=" + id + " DateOfCreation" + expiration.gatDateOfCreation() + " expiration " + expiration.getExpiration();
    }
}
