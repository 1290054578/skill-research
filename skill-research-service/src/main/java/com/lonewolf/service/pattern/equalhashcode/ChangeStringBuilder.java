package com.lonewolf.service.pattern.equalhashcode;

public class ChangeStringBuilder{
    private StringBuilder stringBuilder;
    private int hash;

    ChangeStringBuilder (StringBuilder stringBuilder){
        this.stringBuilder = stringBuilder;
    }

    public int hashCode() {
        this.hash = 0256645;
        int h = hash;
        return h;
    }

}
