package com.example.docker2.service;

import com.example.docker2.model.StudentSurvey;
import com.example.docker2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSurveyService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentSurvey saveSurvey(StudentSurvey survey) {
        return studentRepo.save(survey);
    }

    public List<StudentSurvey> getAllSurveys() {
        return studentRepo.findAll();
    }

    public void deleteSurvey(Long id) {
        studentRepo.deleteById(id);
    }

    public StudentSurvey getSurveyById(Long id) {
        return studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Survey not found for this id :: " + id));
    }

    public StudentSurvey updateSurvey(Long id, StudentSurvey surveyDetails) {
        StudentSurvey survey = getSurveyById(id);
        survey.setFirstName(surveyDetails.getFirstName());
        survey.setLastName(surveyDetails.getLastName());
        survey.setStreet(surveyDetails.getStreet());
        survey.setCityname(surveyDetails.getCityname());
        survey.setStatename(surveyDetails.getStatename());
        survey.setZipCode(surveyDetails.getZipCode());
        survey.setTelephone(surveyDetails.getTelephone());
        survey.setEmail(surveyDetails.getEmail());
        survey.setDateofsurvey(surveyDetails.getDateofsurvey());
        survey.setStudents(surveyDetails.getStudents());
        survey.setLocation(surveyDetails.getLocation());
        survey.setCampus(surveyDetails.getCampus());
        survey.setAtmosphere(surveyDetails.getAtmosphere());
        survey.setDorms(surveyDetails.getDorms());
        survey.setSports(surveyDetails.getSports());
        survey.setHearAboutUniversity(surveyDetails.getHearAboutUniversity());
        survey.setRecommendation(surveyDetails.getRecommendation());
        survey.setComments(surveyDetails.getComments());
        return studentRepo.save(survey);
    }





}
