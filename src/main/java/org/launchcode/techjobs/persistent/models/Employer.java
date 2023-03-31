package org.launchcode.techjobs.persistent.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message= "Field required.")
    @Size(min= 3, max= 100)
    private String location;
    //ensures not empty and reasonable length
    //string field for location

    @OneToMany
    @JoinColumn(name= "employer_id") //name parameter
    private final List<Job> jobs= new ArrayList<>();
    //empty array list for private property jobs

    public Employer(String location) {this.location = location;}
    //constructor
    public Employer(){};
    //no arg constructor

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    //public accessor methods (getters and setters)
}
