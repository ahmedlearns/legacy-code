package com.gamasoft.sec.before;

public class Printer {

    public final String printerLocation;

    public Printer(String printerLocation) {
        this.printerLocation = printerLocation;

        System.out.println("opening " + printerLocation);
    }

    public void printLabel(Client u, Label l){
        if (u != null && u.address != null)
            l.sendToPrinter();
    }

    public void printLine(String line){
        System.out.println(line); //simulate sending to printer
    }

}
