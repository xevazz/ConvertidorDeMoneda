/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author brand
 */
public class converciones {

    public float colomDolar(float num) {
        num = num / 4814;
        return num;
    }

    public float dolarColom(float num) {
        num = num * 4814;
        return num;
    }

    public float colomEuro(float num) {
        num = num / 5163;
        return num;
    }

    public float euroColom(float num) {
        num = num * 5163;
        return num;
    }
    public float colomLibra(float num) {
        num = num / 5843;
        return num;
    }

    public float libraColom(float num) {
        num = num * 5843;
        return num;
    }

    public float colomYen(float num) {
        num = num / 36;
        return num;
    }

    public float yenColom(float num) {
        num = num * 36;
        return num;
    }

    public float colomWon(float num) {
        num = num / 3;
        return num;
    }

    public float wonColom(float num) {
        num = num * 3;
        return num;
    }
}
