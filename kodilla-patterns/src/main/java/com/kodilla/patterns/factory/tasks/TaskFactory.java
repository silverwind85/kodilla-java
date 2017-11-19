package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING ="SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String TaskClass ){
        switch (TaskClass){
            case  SHOPPING:
                return new ShoppingTask("Sopping in Lidl","Coffee",3);
            case PAINTING:
                return new PaintingTask("Painting","blue","kitchen");
            case DRIVING:
                return new DrivingTask("Driving","Warsaw","car");
            default:
                return null;
        }

    }
}
