import { Component } from '@angular/core';
import { SurveyService } from '../survey.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent {
  surveys: any[] = [];
  constructor(
    private surveyService: SurveyService,
    private router: Router // Inject the Router service
    ) { }

  
  

  ngOnInit(): void {
  this.surveyService.getAllSurveys().subscribe(data => {
    this.surveys = data;
  }, error => {
    console.error('Error fetching surveys:', error);
  });
  }
  getLikesAboutCampusString(survey: any): string {
    const likes = [];
    if (survey.students) likes.push('Students');
    if (survey.location) likes.push('Location');
    if (survey.campus) likes.push('Campus');
    if (survey.atmosphere) likes.push('Atmosphere');
    if (survey.dorms) likes.push('Dorm Rooms');
    if (survey.sports) likes.push('Sports');
    return likes.join(', ');
  }
}
