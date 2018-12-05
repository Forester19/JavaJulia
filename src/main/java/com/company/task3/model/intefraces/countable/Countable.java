package com.company.task3.model.intefraces.countable;

import java.util.Optional;

public interface Countable {
    int getCount();
    boolean decrement();
    boolean increment(int delta);

    static Countable getCountable(Object value) {
        return Optional.ofNullable(value)
                .filter(item -> item instanceof IsCountable)
                .map(item -> ((IsCountable) item).getCountable()).orElse(null);
    }
}
