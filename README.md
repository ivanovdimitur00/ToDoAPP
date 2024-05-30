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
* `build.gradle.kts` - Top-level config file;
* `settings gradle.kts` - Config file for repositories and project;
* `app`- Contains the source files;
  * `app/build.gradle.kts` - Specifies plugins and dependencies used and android configuration;
  * `app/src/main`:
    * `app/src/main/res`:
      * `app/src/main/res/font` - Contains the font the app uses;
      * `app/src/main/res/values` - Contains the file that specifies the colors in use;
    * `app/src/main/java/com.example/todoapp`: - Contains the important source files (for my sake, I won't specify the full path when listing the rest of the files);
      * `MainActivity.kt` - Used to launch the app upon initialization;
      * `KoinApp.kt` - Builds/calls the database;
      * `database` -  Contains the files for the Room database, Dao and the note entity;
      * `repositories` - Contains the files for the notes repository;
      * `Screens` - Contains the files for the layout of the screens and the functionalities.
<br/>

## Installation instructions
Currently, there in no public APK that is available for users to download on their phone. You will have to download these source files and put them in a android studio project and run a google pixel 3 phone emulator. Once that is done, after you run the gradle buld system, the app will be deployed on the device and autovmatically be started.
<br/>
<br/>

## Dependencies
I will list the dependencies that are used inside of the project (in `app/build.gradle.kts`).
<br/>

For the build system:
* gradle 8.0 .
<br/>

For android configuration:
* compileSdk = 34;
* minSdk = 24;
* targetSdk = 33 .
<br/>

For `compileOptions`:
* sourceCompatibility = JavaVersion.VERSION_17;
* targetCompatibility = JavaVersion.VERSION_17 .
<br/>

For `kotlinOptions`:
* jvmTarget = "17".
<br/>

General dependencies:
* implementation("androidx.core:core-ktx:1.9.0")
* implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
* implementation("androidx.activity:activity-compose:1.8.2")
<br/>

Testing dependencies:
* testImplementation("junit:junit:4.13.2")
* androidTestImplementation("androidx.test.ext:junit:1.1.5")
* androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
* androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
* androidTestImplementation("androidx.compose.ui:ui-test-junit4")
<br/>

Jetpack compose dependencies:
* implementation(platform("androidx.compose:compose-bom:2023.03.00"))
* implementation("androidx.compose.ui:ui")
* implementation("androidx.compose.ui:ui-graphics")
* implementation("androidx.compose.ui:ui-tooling-preview")
* implementation("androidx.compose.material3:material3")
* implementation("androidx.compose.ui:ui-android:1.5.4")
* debugImplementation("androidx.compose.ui:ui-tooling")
* debugImplementation("androidx.compose.ui:ui-test-manifest")
<br/>

Koin dependencies:
* implementation("io.insert-koin:koin-android:3.4.0")
* implementation("io.insert-koin:koin-androidx-compose:3.4.4")
<br/>

Room database dependencies:
* implementation("androidx.room:room-runtime:2.5.2")
* annotationProcessor("androidx.room:room-compiler:2.5.2")
* implementation("androidx.room:room-ktx:2.5.2")
<br/>

Kapt dependency:
* kapt("androidx.room:room-compiler:2.5.2") 
<br/>

## System requirements
| System requirements      |
| ------------------------ | 
| Android 9.0 pie or later |  
<br/>

## Usage examples
This example takes place after the app's successful compilation and deployment.
1. When opening the app, you are greeted with an empty to-do list;
2. To create a new note, you have to press the button in the bottom right;
3. A menu appears prompting you to input a title and a sub-title;
4. After the user gives their input, a new note is created;
5. The user can press anywhere on the note to mark it as un/finished. A colour change indicates the state of the note;
6. The user can edit or delete the note. 
<br>

## API references
Nothing to mention here.
<br/>
<br/>

## Bugs
- [x] No bugs have been discovered.
<br/>

## Future improvements
- [ ] Add a separate field in the note for text instead of only a subtitle;
- [ ] Add the option to place pictures.
