import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SurveyService {

  private apiUrl = 'http://localhost:8080/api/survey'; 

  constructor(private http: HttpClient) { }

  saveSurvey(surveyData: any): Observable<any> {
    return this.http.post(this.apiUrl, surveyData);
  }

  getAllSurveys(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  deleteSurvey(surveyId: number): Observable<void> {
    return this.http.delete<void>(`http://localhost:8080/api/survey/${surveyId}`);
  }

  getSurveyById(surveyId: number): Observable<any> {
    return this.http.get(`${this.apiUrl}/${surveyId}`);
}


  updateSurvey(surveyId: number, surveyData: any): Observable<any> {
    return this.http.put(`${this.apiUrl}/${surveyId}`, surveyData);
  }
  


}
