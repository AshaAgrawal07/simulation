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
            } else if (move.indexOf())
        }

    }
}
