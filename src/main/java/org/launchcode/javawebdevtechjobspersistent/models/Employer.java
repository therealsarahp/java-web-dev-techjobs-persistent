package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @NotBlank(message="Location is required.")
    private String location;

    @OneToMany
    @JoinColumn(name= "employer_id")
    private final List<Job> jobs = new ArrayList<>();

//    public Employer(String name, String location) {
//        super(name);
//        this.location = location;
//    }

    public Employer(){};

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
