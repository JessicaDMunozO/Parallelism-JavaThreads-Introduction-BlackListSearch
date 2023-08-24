/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {
    private int number_a;
    private int number_b;

    public CountThread(int number_a, int number_b) {
        this.number_a = number_a;
        this.number_b = number_b;
    }

    public void run() {
        for (int i = number_a; i <= number_b; i++) {
            System.out.println(i);
        }
    }
}
