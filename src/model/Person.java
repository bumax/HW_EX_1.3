package model;

public class Person {
    public Person(String firstName, String lastName, String surName, long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.phone = phone;
    }

    public Person(String input) throws DataInputException {
        String[] data = input.split(" ");
        if(data.length < 4)
            throw new DataInputException("You've entered too few data!");
        else if(data.length > 4)
            throw new DataInputException("You've entered too much data!");

        this.firstName = data[0];
        this.lastName = data[1];
        this.surName = data[2];
        try{
            this.phone = Long.parseLong(data[3]);
         }
        catch (NumberFormatException e){
            throw new DataInputException("Invalid phone number!");
        }
    }
    public void exportData(Exporter exporter) throws Exception {
        exporter.export(this);
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public long getPhone() {
        return phone;
    }

    private String firstName;
    private String lastName;
    private String surName;
    private long phone;


}
