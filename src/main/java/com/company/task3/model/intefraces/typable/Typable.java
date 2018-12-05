package com.company.task3.model.intefraces.typable;

public interface Typable {
    enum Type{
        StudentCard,
        ChildCard,
        DefaultCard
    }
    Type getType();
}
