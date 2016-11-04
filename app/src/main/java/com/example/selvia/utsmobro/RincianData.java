package com.example.selvia.utsmobro;

/**
 * Created by Selvia on 11/4/2016.
 */
public class RincianData {
    private String cake;
    private int idCake;

    // Konstruktor
    public RincianData(String cake,
                       int idCake) {
        this.cake = cake;
        this.idCake = idCake;
    }

    // Metode lain-lain
    public String perolehCake() {
        return cake;
    }

    public int perolehIdCake() {
        return idCake;
    }
}
