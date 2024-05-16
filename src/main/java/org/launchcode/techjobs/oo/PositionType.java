package org.launchcode.techjobs.oo;
import java.util.Objects;

public class PositionType extends JobField{

    public PositionType(String value) {
        super(value); //Call the constructor of the superclass (JobField) with the provided value
    }

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//
//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//    @Override
//    public String toString() {
//        return value;
//    }

    @Override
    public boolean equals(Object o) {
        // Check if the objects are the same instance, if so, they are equal
        if (this == o) return true;
        // Check if the object being compared is null or not an instance of PositionType, if so, they are not equal
        if (o == null || getClass() != o.getClass()) return false;
        // Cast the object being compared to a PositionType object
        PositionType that = (PositionType) o;
//        Compare the IDs of the two PositionType objects, and check if their values are equal
        return getId() == that.getId() && Objects.equals(getValue(), that.getValue());
    }

//

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
