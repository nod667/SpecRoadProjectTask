package ru.malakhov.srptask.models;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class ValueKeeper {

    private AtomicInteger value = new AtomicInteger(0);

    private ValueKeeper() {}

    public void setValue(int value) {
        this.value.set(value);
    }

    public int getValue() {
        return value.get();
    }

}
