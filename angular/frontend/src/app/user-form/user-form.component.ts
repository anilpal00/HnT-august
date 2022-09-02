import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'userForm',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  user = {
    name:'Anil',
    age:'22',
    dob: new Date()
  }

  users:any[] =[];
  constructor(public userService: UserService) { }

  deleteUser(id:number){
    const observable = this.userService.deleteUser(id);
    observable.subscribe((responseBody: any) => {
      console.log(responseBody);
    },
      (error: any) => {
        console.log(error);
      }
    );
  }
  
  saveUser() {
    console.log('clicked');
    this.user.dob = new Date(this.user.dob);
    const promise = this.userService.save(this.user);
    promise.subscribe((responseBody: any) => {   //success handler
      console.log(responseBody);
      this.users.push(responseBody);
    },
      (error: any) => {
        console.log(error);
      }
    );
  }

  ngOnInit(): void {
    const observable = this.userService.getUsers();
    observable.subscribe((usersFromServer:any)=>{
      this.users=usersFromServer;
    })
  }

}
function responseBody(responseBody: any, any: any) {
  throw new Error('Function not implemented.');
}

