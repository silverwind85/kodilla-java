package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private int sideA;
    private int sideB;

    public Triangle(String name, int sideA, int sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return sideA * sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (sideA != triangle.sideA) return false;
        if (sideB != triangle.sideB) return false;
        return name != null ? name.equals(triangle.name) : triangle.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + sideA;
        result = 31 * result + sideB;
        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
