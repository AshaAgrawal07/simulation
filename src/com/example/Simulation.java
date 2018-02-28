package com.example;

import java.util.Scanner;

/**
 * in this game, it will continue until you either go bankrupt or you exit/quit
 */
public class Simulation {

    private static Person gintama = Parser.parse("Gintama.json");



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Location currentRoom = gintama.getLocation().get(gintama.location.indexOf(gintama.getStartingLocation()));
	    boolean goOn = true;
	    boolean otose = false;

        while(goOn) {
            currentRoom.toString();
            System.out.println("Current balance (in yen): " + gintama.getBalance());
            String move = scan.nextLine();

            if (gintama.getStartingTime()%10 == 0 && currentRoom.getName().contains("Yoruzuya")) {
                System.out.println("Otose-tanukibaba wants you to pay rent!!");
                otose = true;
            } else {
                otose = false;
            }

            if (move.indexOf("take") == 0) {
                currentRoom.getItems().get(currentRoom.getItems().indexOf(move.substring(5))).take(move, currentRoom);
            } else if (move.indexOf("buy") == 0) {
                currentRoom.getItems().get(currentRoom.getItems().indexOf(move.substring(4))).buy(move, currentRoom);
            } else if (move.indexOf("consume") == 0) {
                currentRoom.getItems().get(currentRoom.getItems().indexOf(move.substring(8))).consume(move);
            } else if (move.indexOf("moveTo") == 0) {
                currentRoom.moveTo(move);
            } else if (move.indexOf("quit") == 0 || move.indexOf("exit") == 0) {
                break;
            } else if (move.indexOf("time") == 0) {
                gintama.getStartingTime();
            } else if (move.indexOf("balance") == 0) {
                gintama.getBalance();
            } else if (otose && !move.contains("hide")) {
                System.out.println("You need to pay rent and thus are broke.");
                break;
            } else if (move.indexOf("nap") == 0 && currentRoom.getName().contains("Yoruzuya")) {
                Yoruzuya.nap();
            } else if (move.indexOf("play") == 0 && currentRoom.getName().contains("Yoruzuya")) {
                Yoruzuya.play();
            } else if (move.indexOf("clean") == 0 && currentRoom.getName().contains("Yoruzuya")) {
                Yoruzuya.clean();
            } else if (move.indexOf("laze") == 0 && currentRoom.getName().contains("Yoruzuya")) {
                Yoruzuya.laze();
            } else if (move.indexOf("hide") == 0 && currentRoom.getName().contains("Yoruzuya")) {
                Yoruzuya.hide();
            } else if (move.indexOf("stake out") == 0 && currentRoom.getName().contains("HQ")) {
                Shinsengumi.stakeOut();
            } else if (move.indexOf("read") == 0 && currentRoom.getName().contains("HQ")) {
                Shinsengumi.read(move);
            } else if (move.indexOf("fire") == 0 && currentRoom.getName().contains("HQ")) {
                Shinsengumi.fire(move);
            } else if (move.indexOf("train") == 0 && currentRoom.getName().contains("HQ")) {
                Shinsengumi.train();
            } else if (move.indexOf("arrest") == 0 && currentRoom.getName().contains("HQ")) {
                Shinsengumi.arrest(move);
            } else {
                System.out.println("INVALID MOVE");
            }

            if(gintama.getBalance() <= 0) {
                System.out.println("Congrats on becoming a MADAO.  Hasegawa-senpai will surely appreciate your company");
                break;
            }
            currentRoom.nextEpoch();
        }

    }
}
