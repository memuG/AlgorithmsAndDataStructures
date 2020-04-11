package com.przemo;

public interface IShow {

    public default String getNotes() {
        return this.toString();
    }
}