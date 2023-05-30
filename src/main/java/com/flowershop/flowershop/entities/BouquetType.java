package com.flowershop.flowershop.entities;


public enum BouquetType {

    ROND("R"),PARALLELE("P"),LONGS("L");
    private String code;

    private BouquetType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
