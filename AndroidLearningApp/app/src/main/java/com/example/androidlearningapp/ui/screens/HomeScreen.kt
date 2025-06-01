package com.example.androidlearningapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.progressSemantics
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidlearningapp.data.Course
import com.example.androidlearningapp.data.ProgressRepository

@Composable
fun HomeScreen(
    courses: List<Course>,
    progressRepository: ProgressRepository,
    onCourseSelected: (Course) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Android Learning App",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Welcome! Choose a course to start learning.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        courses.forEach { course ->
            val completedLessons = progressRepository.getCompletedLessons(course.id).size
            val totalLessons = course.lessons.size
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                onClick = { onCourseSelected(course) }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = course.title, style = MaterialTheme.typography.headlineSmall)
                    Spacer(modifier = Modifier.height(8.dp))
                    LinearProgressIndicator(
                        progress = completedLessons.toFloat() / totalLessons,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp)
                            .progressSemantics()
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = "$completedLessons / $totalLessons lessons completed")
                }
            }
        }
    }
}
