package com.example.docker2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//pojo

@Entity
public class StudentSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String street;
    private String cityname;
    private String statename;
    private String zipCode;
    private String telephone;
    private String email;
    private String dateofsurvey;

    private Boolean students;
    private Boolean location;
    private Boolean campus;
    private Boolean atmosphere;
    private Boolean dorms;
    private Boolean sports;

    private String hearAboutUniversity;
    private String recommendation;
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateofsurvey() {
        return dateofsurvey;
    }

    public void setDateofsurvey(String dateofsurvey) {
        this.dateofsurvey = dateofsurvey;
    }

    public Boolean getStudents() {
        return students;
    }

    public void setStudents(Boolean students) {
        this.students = students;
    }

    public Boolean getLocation() {
        return location;
    }

    public void setLocation(Boolean location) {
        this.location = location;
    }

    public Boolean getCampus() {
        return campus;
    }

    public void setCampus(Boolean campus) {
        this.campus = campus;
    }

    public Boolean getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Boolean getDorms() {
        return dorms;
    }

    public void setDorms(Boolean dorms) {
        this.dorms = dorms;
    }

    public Boolean getSports() {
        return sports;
    }

    public void setSports(Boolean sports) {
        this.sports = sports;
    }

    public String getHearAboutUniversity() {
        return hearAboutUniversity;
    }

    public void setHearAboutUniversity(String hearAboutUniversity) {
        this.hearAboutUniversity = hearAboutUniversity;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public StudentSurvey() {
    }

    public StudentSurvey(Long id, String firstName, String lastName, String street, String cityname, String statename, String zipCode, String telephone, String email, String dateofsurvey, Boolean students, Boolean location, Boolean campus, Boolean atmosphere, Boolean dorms, Boolean sports, String hearAboutUniversity, String recommendation, String comments) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.cityname = cityname;
        this.statename = statename;
        this.zipCode = zipCode;
        this.telephone = telephone;
        this.email = email;
        this.dateofsurvey = dateofsurvey;
        this.students = students;
        this.location = location;
        this.campus = campus;
        this.atmosphere = atmosphere;
        this.dorms = dorms;
        this.sports = sports;
        this.hearAboutUniversity = hearAboutUniversity;
        this.recommendation = recommendation;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "StudentSurvey{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", cityname='" + cityname + '\'' +
                ", statename='" + statename + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", dateofsurvey='" + dateofsurvey + '\'' +
                ", students=" + students +
                ", location=" + location +
                ", campus=" + campus +
                ", atmosphere=" + atmosphere +
                ", dorms=" + dorms +
                ", sports=" + sports +
                ", hearAboutUniversity='" + hearAboutUniversity + '\'' +
                ", recommendation='" + recommendation + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
