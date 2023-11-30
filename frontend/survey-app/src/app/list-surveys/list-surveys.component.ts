import { Component } from '@angular/core';
import { SurveyService } from '../survey.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-surveys',
  templateUrl: './list-surveys.component.html',
  styleUrls: ['./list-surveys.component.css']
})
export class ListSurveysComponent {
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

  onDelete(surveyId: number): void {
    const confirmation = confirm('Are you sure you want to delete this survey?');
    if (confirmation) {
      this.surveyService.deleteSurvey(surveyId).subscribe(() => {
        this.surveys = this.surveys.filter(survey => survey.id !== surveyId);
      });
    }
  }

  onEdit(surveyId: number): void {
    console.log("Check this onEdit..")
    this.router.navigate(['/edit-survey', surveyId]);
}
}
