import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { StudentSurveyComponent } from './student-survey/student-survey.component';
import { ListSurveysComponent } from './list-surveys/list-surveys.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { EditSurveyComponent } from './edit-survey/edit-survey.component';

const routes: Routes = [
  { path: '', component: HomepageComponent },
  { path: 'student-survey', component: StudentSurveyComponent },
  { path: 'app-contact-us', component: ContactUsComponent },
  { path: 'list-surveys', component: ListSurveysComponent },
  { path: 'app-edit-survey', component: EditSurveyComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
