package com.kodilla.observer.homework;

public class Mentor implements Observer {

    final private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void  update(StudentHomework studentHomework) {

        System.out.println("Student: "+ studentHomework.getStudent().getFirstName()
                + " " + studentHomework.getStudent().getLastName() +"\n" +
        "Homework name: " +studentHomework.getName() +"\n" +
        "Total: " + studentHomework.getSolutions().size());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }


}
