package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("shopping",
                        "newspaper", 2);
            case PAINTINGTASK:
                return new PaintingTask("painting",
                        "yellow", "garage");
            case DRIVINGTASK:
                return new DrivingTask("driving",
                        "uncle John", "car");
            default:
                return null;
        }
    }
}
