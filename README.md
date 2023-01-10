<h1 align="center">Mgs Server</h1>

<p align="center">
  <img src="https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white"> 
  <img src="https://img.shields.io/badge/ktor-%2300A6F2.svg?style=for-the-badge&logo=kotlin&logoColor=white"> 
</p>

<p align="center">  
Metal Gear Solid Rest Api written in Kotlin using Ktor. For app <a href="https://github.com/commandiron/mgs_app">click.</a>
</p>

## Usage
|End Points ```GET```|Definition|
|--------------------|----------|
| ```/mgs/characters``` Params: ```query``` , ```page```, ```limit```|Get all characters|
|```/mgs/characters/search``` Params: ```query``` , ```page```, ```limit```|Search characters|
|```WheelTimePicker { snappedTime -> }```|
|```WheelTimePicker(timeFormat = TimeFormat.AM_PM) { snappedTime -> }```|
