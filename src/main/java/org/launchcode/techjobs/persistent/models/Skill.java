package org.launchcode.techjobs.persistent.models;
import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message= "Description required. Max of 250 characters.")
    @Size(min= 10, max= 250)
    private String description;
    //longer description of skill

    @ManyToMany(mappedBy= "skills")
    private List<Job> jobs= new ArrayList<>();

    public Skill(String description) {this.description = description;}
    //constructor
    public Skill() {}
    //no arg constructor

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public List<Job> getJobs(){return jobs;}
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
    //public accessor methods (getters and setters)

}