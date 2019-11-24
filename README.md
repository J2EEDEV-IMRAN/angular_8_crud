# angular_8_crud

DIFFERENCE BETWEEN ANGULAR 6 7 OR 8
 https://medium.com/@lifenshades/difference-among-angular-8-7-6-5-4-3-2-breakdown-new-features-and-changes-811fb5f8e6f0
 
 ANGULAR 6:
#Released on April 2018
#This release is focused less on the underlying framework, and more on tool-chain and on making it easier to move quickly with angular in   the future
#No major breaking changes
#Dependency on RxJS 6 (this upgrade have breaking changes but CLI command helps in migrating from older version of RxJS)
#Synchronizes major version number of the:
  — Angular framework
  — Angular CLI
  — Angular Material + CDK
   All of the above are now version 6.0.0, minor and patch releases though are completely independent and can be changed based on a   specific project.
 #Remove support for <template> tag and “<ng-template>” should be used.
 #Registering provider: To register new service/provider, we import Service into module and then inject in provider array. e.g:
  
    // app.module.ts
    import {MyService} from './my-service';
    ...
    providers: [...MyService]
    ... 
 But after this upgrade you will be able to add providedIn property in injectable decorator. e.g:
 
  // MyService.ts
  @Injectable({ providedIn: 'root'})
  export class MyService{}
  
  #CLI Changes: Two new commands have been introduced
— ng update <package>
* Analyse package.json and recommend updates to your application
* 3rd parties can provide update scripts using schematics
* automatically update code for breaking changes
* staying update and low maintenance
— ng add
* add new capablities to your applicaiton
* e.g ng add @angular/material : behind the scene it add bit of necessary code and changes project where needed to add it the thing we just told it to add.
* Now adding things like angular material, progressive web app, service workers & angular elements to your existing ng application will be easy.
  
 #CLI + Material starter templates: Let angular create code snippet for your basic components. e.g:
— Material Sidenav
* ng generate @angular/material:material-nav — name=my-nav
Generate a starter template including a toolbar with app name and then the side navigation & it's also responsive
— Dashboard
* ng generate @angular/material:material-dashboard — name=my-dashboard
Generates Dynamic list of cards
— Datatable
* ng generate @angular/material:material-table — name=my-table
Generates Data Table with sorting, filtering & pagination
#It uses angular.json instead of .angular-cli.json
#Support for multiple projects: Now in angular.json we can add multiple projects
#initial release of Angular Elements which gives us ability to use our angular components in other environments like a Vue.js application. Its potential is truly amazing but unfortunately this release only works for angular application, we need to wait for next release to wrap out angular component into custom element and use it with framework like Vue.js
 
#ANGULAR COMPONENT
 https://material.angular.io/components/paginator/overview
