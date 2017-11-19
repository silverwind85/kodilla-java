package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBay;
    private double quantity;
    private boolean isTaskExecuted;

    public ShoppingTask(String taskName, String whatToBay, double quantity) {
        this.taskName = taskName;
        this.whatToBay = whatToBay;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        isTaskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
