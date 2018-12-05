package com.company.task3.model.intefraces.expiration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public interface Expiration {
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    long getExpiration();
    Date gatDateOfCreation();
    static Expiration getExpiration(Object value) {
        return Optional.ofNullable(value)
                .filter(item -> item instanceof IsExpiration)
                .map(item -> ((IsExpiration) item).getExpiration()).orElse(null);
    }
}
