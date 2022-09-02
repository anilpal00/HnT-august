import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const URL = "http://localhost:8001/user";
@Injectable({
  providedIn: 'root'
})

export class UserService {
  save(user: any) {
    return this.http.post(URL + "/age/" + 34 + '/height/' + 100 + "?param1=43&param2", user);
  }

  getUsers() {
    return this.http.get(URL);
  }

  deleteUser(id: any) {
    return this.http.delete(URL+"/"+id);
  }
  constructor(public http: HttpClient) { }

}