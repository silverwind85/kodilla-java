package com.kodilla.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class StudentHomework implements Observable {
    private final List<Observer> observers;
    private final String name;
    private final Student student;
    private final List<String> solutions;

    public StudentHomework(String name, Student student) {
        this.student = student;
        this.name = name;

        observers = new ArrayList<>();
        solutions = new ArrayList<>();
    }
    public void addSolution(String solution){
        solutions.add(solution);
        notifyObserver();
    }

    public List<String> getSolutions() {
        return solutions;
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void  notifyObserver() {
        for (Observer observer : observers) {
           observer.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
}
