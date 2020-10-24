package com.oops.composition;

public class PC_1 {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC_1(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // we will be hiding the functionality of the base classes.
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows 10");
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
