# ToDoAPP
A mobile app for android to take quick notes and craft a to-do list using Kotlin, the jetpack compose UI framework and gradle build system.
<br/>
<br/>

## Table of contents
0. [Project status](#Project-status)
1. [Description](#Description)
3. [Key features and functionalities](#Key-features-and-functionalities)
4. [Structure](#Structure)
5. [Installation instructions](#Installation-instructions)
6. [Dependencies](#Dependencies)
7. [System requirements](#System-requirements)
8. [Usage examples](#Usage-examples)
9. [API references](#API-references)
10. [Bugs](#Bugs)
11. [Future improvements](#Futute-improvements)
<br/>

## Project status
Completed and working. no new features expected.
<br/>
<br/>

## Description
The purpose and goal of the project is to create a mobile app for taking notes.
As an additional goal, the project taught me how to use android studio and deploy the project on an emulated phone with the gradle build system, as well as how to use jetpack compose.

The intended audience was the assistant for my mobile technologies class as well as myself.
<br/>
<br/>

## Key features and functionalities
* Scrollable To-do list;
* Add notes with a button. This includes title and text;
* Mark notes as un/finished;
* Edit notes;
* Delete notes.
<br/>

## Structutre
* `build.gradle.kts` - top-level config file;
* `settings gradle.kts` - config file for repositories and project;
* `app`- contains the source files;
  * `app/build.gradle.kts` - specifies plugins and dependencies used and android configuration;
  * `app/src/main`:
    * `app/src/main/res`:
      * `app/src/main/res/font` - contains the font the app uses;
      * `app/src/main/res/values` - contains the file that specifies the colors in use;
    * `app/src/main/java/com.example/todoapp`: - contains the important source files (for my sake, I won't specify the full path when listing the rest of the files);
      * `MainActivity.kt` - used to launch the app upon initialization;
      * `KoinApp.kt` - builds/calls the database;
      * `database` -  
<br/>

## Installation instructions
1. How to access and/or setup the project;
2. Use a numbered list;
<br/>

## Dependencies
* Dependency 1;
* Dependency 2;
<br/>

## System requirements
| System requirements |
| ------------------- | 
| requirement 1       | 
| requirement 2       | 
<br/>

## Usage examples
1. Make a tutorial on how the project can be used;
2. Use numbered lists;
<br>

## API references
* If the project is used as a standalone library, describe the functions that can be called;
<br/>

## Bugs
- [ ] describe any occuring bugs that need to be fixed;
<br/>

## Future improvements
- [ ] describe some ideas you would want to implement into your project;
