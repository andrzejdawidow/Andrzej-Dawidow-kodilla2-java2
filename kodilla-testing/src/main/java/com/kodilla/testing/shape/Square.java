package com.kodilla.testing.shape;

public class Square implements Shape{
     String name;
     Integer field;

    public Square(String name, Integer field) {
        this.name = name;
        this.field = field;
    }
    public String getShapeName() {
        return name;
    }
    public Integer getField() {
        return field;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (!name.equals(square.name)) return false;
        return field.equals(square.field);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field.hashCode();
        return result;
    }
}
