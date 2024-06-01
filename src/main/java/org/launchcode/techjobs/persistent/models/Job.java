package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @NotBlank(message = "Skills cannot be empty")
    private String skills;

    public Job() {
    }

    public Job(Employer employer, String skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}