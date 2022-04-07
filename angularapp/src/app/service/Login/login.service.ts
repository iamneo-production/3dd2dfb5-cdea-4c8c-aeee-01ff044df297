import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from '../baseUrl';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) {

  }
  loginUser(data: any) {
    return this.http.post(`${baseUrl}/login`, data);
  }
}
