package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {

    @Test
    public void testSettingJobId() {
        // Creating two Job objects using the empty constructor
        Job job1 = new Job();
        Job job2 = new Job();

        // Verifying that the IDs of the two objects are distinct
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        // Declare and initialize a new Job object with the instances created above
        Job job = new Job("Product tester", new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));

        // Test that the constructor correctly assigns the class and value of each field
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        // Create instances of Employer, Location, PositionType, and CoreCompetency
        Job job = new Job("Product tester", new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));


        // Creating two Job objects with identical field values except for id
        Job job1 = new Job("Product tester", new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));;
        Job job2 = new Job("Product tester", new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));

        // Verifying that the two jobs are not equal
        assertFalse(job1.equals(job2));
    }

//    @Test
//    public void testToStringMethod() {
//        Job job = new Job("Product tester", new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
//
//        // Expected output of the toString method
//        String expectedOutput = "\nID: " + job.getId() +
//                "\nName: Product tester" +
//                "\nEmployer: ACME" +
//                "\nLocation: Desert" +
//                "\nPosition Type: Quality control" +
//                "\nCore Competency: Persistence\n";
//
//        // Verifying that the toString method returns the expected output
//        assertEquals(expectedOutput, job.toString());
//    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {

    Job job = new Job(
            "Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

        assertTrue(job.toString().startsWith(System.lineSeparator()));
        assertTrue(job.toString().endsWith(System.lineSeparator()));
}

    @Test
    public  void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
        String jobString = job.toString();

        // Test that the constructor correctly assigns the class and value of each field
        assertEquals(job.toString(), System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: " + job.getName().toString() + System.lineSeparator() +
                "Employer: " + job.getEmployer().toString() + System.lineSeparator() +
                "Location: " + job.getLocation().toString() + System.lineSeparator() +
                "Position Type: " + job.getPositionType().toString() + System.lineSeparator() +
                "Core Competency: " + job.getCoreCompetency().toString() +
                System.lineSeparator());
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job(
                "Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String jobString = job.toString();

        assertTrue(jobString.contains("Employer: Data not available"));
    }
    @Test
    public void testToStringIfOnlyIdAvailable() {
        Job job = new Job (
                null,
                null,
                null,
                null,
                null);

        assertEquals(job.toString(), "OOPS! This job does not seem to exist.");
    }

}
