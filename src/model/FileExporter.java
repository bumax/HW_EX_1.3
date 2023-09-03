package model;
import java.io.*;

public class FileExporter extends Exporter{
    public FileExporter() {
    }

    @Override
    public void export(Person person) throws Exception {
        try(FileWriter writer = new FileWriter(person.getFirstName(), true)){
            writer.write("<"+person.getFirstName()+"><"+person.getLastName()+"><"+person.getSurName()+"><"+person.getPhone()+">\n");
        }
    }
}
