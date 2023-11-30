import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { StudentSurveyComponent } from './student-survey/student-survey.component';
import { ListSurveysComponent } from './list-surveys/list-surveys.component';
import { SurveyService } from './survey.service';
import { HttpClientModule } from '@angular/common/http';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { EditSurveyComponent } from './edit-survey/edit-survey.component';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    StudentSurveyComponent,
    ListSurveysComponent,
    ContactUsComponent,
    ListSurveysComponent,
    EditSurveyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'edit-survey/:id', component: EditSurveyComponent },
    ])
  ],
  exports:[
    StudentSurveyComponent
  ],
  providers: [
    SurveyService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
