import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListOfBooksComponent } from './components/list-of-books/list-of-books.component';
import { ListOfUsersComponent } from './components/list-of-users/list-of-users.component';
import { LoginComponent } from './components/login/login.component';
import { UserComponent } from './components/user/user.component';

const routes: Routes = [
  { path: "users", component: ListOfUsersComponent },
  { path: "users/:id", component: UserComponent },
  { path: "login", component: LoginComponent },
  { path: "", component: ListOfBooksComponent }, // the root path (homepage)
  { path: "**", redirectTo: "/" } // ** wildcard catches all
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
