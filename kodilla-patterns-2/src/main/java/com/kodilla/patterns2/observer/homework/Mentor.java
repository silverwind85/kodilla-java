package com.kodilla.patterns2.observer.homework;

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
        "Total: " + studentHomework.getSolutions().size() +"\n" +
        "Solution: "); studentHomework.getSolutions().stream().forEach(e-> System.out.println(e));
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }


}
