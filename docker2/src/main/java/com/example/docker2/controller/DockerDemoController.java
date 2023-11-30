package com.example.docker2.controller;

import com.example.docker2.model.StudentSurvey;
import com.example.docker2.service.StudentSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/survey")
@CrossOrigin("*")
public class DockerDemoController {

    @Autowired
    private StudentSurveyService surveyService;

    @PostMapping
    public ResponseEntity<StudentSurvey> submitSurvey(@RequestBody StudentSurvey survey) {
        System.out.println(survey);
        StudentSurvey savedSurvey = surveyService.saveSurvey(survey);
        return new ResponseEntity<>(savedSurvey, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<StudentSurvey>> listAllSurveys() {
        List<StudentSurvey> surveys = surveyService.getAllSurveys();
        return new ResponseEntity<>(surveys, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentSurvey> getSurveyById(@PathVariable Long id) {
        StudentSurvey survey = surveyService.getSurveyById(id);
        return ResponseEntity.ok().body(survey);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentSurvey> updateSurvey(@PathVariable Long id, @RequestBody StudentSurvey surveyDetails) {
        StudentSurvey updatedSurvey = surveyService.updateSurvey(id, surveyDetails);
        return ResponseEntity.ok().body(updatedSurvey);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable Long id) {
        surveyService.deleteSurvey(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
