import { Component, OnInit } from '@angular/core';
import { SurveyService } from '../survey.service';

@Component({
  selector: 'app-student-survey',
  templateUrl: './student-survey.component.html',
  styleUrls: ['./student-survey.component.css']
})
export class StudentSurveyComponent implements OnInit {

  isSubmitted: boolean = false;


  survey = {
    firstName: '',
    lastName: '',
    street: '',
    cityname: '',
    statename: '',
    zipCode: '',
    telephone: '',
    email: '',
    dateofsurvey: '',


    students: false,
    location: false,
    campus: false,
    atmosphere: false,
    dorms: false,
    sports: false,

    hearAboutUniversity: '',

    recommendation: '',
    
    comments: ''
  };

  constructor(private surveyService: SurveyService) { }


  ngOnInit(): void { }

 
  

  onSubmit(): void {
    this.surveyService.saveSurvey(this.survey).subscribe(response => {
      console.log('Survey saved successfully!', response);
      
      // After successful submission:
      this.isSubmitted = true;
  
      // Reset the form
      this.survey = {
        firstName: '',
        lastName: '',
        street: '',
        cityname: '',
        statename: '',
        zipCode: '',
        telephone: '',
        email: '',
        dateofsurvey: '',
        students: false,
        location: false,
        campus: false,
        atmosphere: false,
        dorms: false,
        sports: false,
        hearAboutUniversity: '',
        recommendation: '',
        comments: ''
      };
  
      // Hide the success message after 5 seconds
      setTimeout(() => {
        this.isSubmitted = false;
      }, 50000);
  
    }, error => {
      console.error('Error saving survey:', error);
    });
  }
  
}

