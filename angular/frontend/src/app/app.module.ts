import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UserFormComponent } from './user-form/user-form.component';
import { HttpClientModule } from '@angular/common/http';
import { UserListComponent } from './user-list/user-list.component';
import { RouterModule, Routes } from '@angular/router';

const routes:Routes = [
  {path: 'userform', component:UserFormComponent},
  {path: 'userlist', component:UserListComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    UserFormComponent,
    UserListComponent
  ],
  imports: [
    BrowserModule,FormsModule, HttpClientModule, RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
