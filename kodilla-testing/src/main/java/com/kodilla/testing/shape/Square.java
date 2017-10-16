package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private int side;

    public Square(String name, int side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return side*side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (side != square.side) return false;
        return name != null ? name.equals(square.name) : square.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + side;
        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", side=" + side +
                '}';
    }
}
