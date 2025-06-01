package com.example.androidlearningapp.data

data class Course(
    val id: String,
    val title: String,
    val description: String,
    val lessons: List<Lesson>
)

data class Lesson(
    val id: String,
    val title: String,
    val objectives: List<String>,
    val content: String,
    val visualAids: List<String>, // URLs or asset names
    val exercises: List<Exercise>,
    val summary: String,
    val checkYourUnderstanding: List<Question>
)

data class Exercise(
    val id: String,
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)

data class Question(
    val id: String,
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)

data class Progress(
    val courseId: String,
    val completedLessons: Set<String>
)
