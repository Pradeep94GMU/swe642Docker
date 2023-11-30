import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { SurveyService } from '../survey.service';

@Component({
  selector: 'app-edit-survey',
  templateUrl: './edit-survey.component.html',
  styleUrls: ['./edit-survey.component.css']
})
export class EditSurveyComponent {
  
  survey: any = {
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

  constructor(
    private surveyService: SurveyService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    console.log("iinside OnInt");
    const surveyId = this.route.snapshot.params['id'];
    console.log("after rount param");
    this.surveyService.getSurveyById(surveyId).subscribe(data => {
      console.log("inside on inti...server ID");
      this.survey = data; // Assign the fetched data to the survey object
    }, error => {
      console.log("errroooorrrD");
      console.error('Error fetching survey:', error);
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

  onSubmit(): void {
    this.surveyService.updateSurvey(this.survey.id, this.survey).subscribe(response => {
      console.log('Survey updated successfully!');
      this.router.navigate(['/list-surveys']);
    });
  }
}
