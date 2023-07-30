/**
 * This class is the RestController which facilitates HTTP traffic. A SurveysRepository class is autowired
 * so Spring Boot can inject the appropriate repository for us. We use this repository to save surveys and
 * find a list of all surveys in the database. There is only one endpoint that handles GET and POST methods.
 * <p>
 * 1. POST /survey allows callers to save a Survey object to the database
 * 2. GET /survey will return all surveys from the database.
 */

package com.jmd.swe645.assignment1.controllers;


import com.jmd.swe645.assignment1.database.SurveysRepository;
import com.jmd.swe645.assignment1.models.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class SurveysController {

    @Autowired
    private SurveysRepository surveyRepository;

    @GetMapping(value = "/survey", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Survey> getSurveys() {
        return surveyRepository.findAll();
    }

    @PostMapping("/survey")
    public ResponseEntity addSurvey(@RequestBody Survey survey) {
        surveyRepository.save(survey);
        return ResponseEntity.ok().build();
    }


}
