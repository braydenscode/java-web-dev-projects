package org.example;

public abstract class AbstractEntity {
    private static int uidCounter = 0;
    protected int uid;

    public AbstractEntity() {
        this.uid = ++uidCounter;
    }

    public int getUid() {
        return uid;
    }
}
