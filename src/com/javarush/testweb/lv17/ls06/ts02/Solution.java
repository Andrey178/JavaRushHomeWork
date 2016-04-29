package com.javarush.testweb.lv17.ls06.ts02;

/**
 * Created by Admin on 20.04.2016.
 */
/* Предложения
Не используя synchronized сделайте так, чтобы количество сделанных и принятых предложений было одинаковым.
*/

public class Solution {
    public volatile static int proposal = 0;

    public static void main(String[] args) {
        new MakeProposal().start();
        new AcceptProposal().start();
    }

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("Сделано предложение №" + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("Принято предложение №" + proposal);
                    thisProposal = proposal;
                }
            }
        }
    }
}