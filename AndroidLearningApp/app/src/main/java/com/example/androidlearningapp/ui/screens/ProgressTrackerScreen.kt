package com.example.androidlearningapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidlearningapp.data.Course
import com.example.androidlearningapp.data.ProgressRepository

@Composable
fun ProgressTrackerScreen(
    courses: List<Course>,
    progressRepository: ProgressRepository,
    onResetProgress: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Progress Tracker",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        courses.forEach { course ->
            val completed = progressRepository.getCompletedLessons(course.id).size
            val total = course.lessons.size
            val progressPercent = if (total > 0) (completed * 100) / total else 0
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = course.title, style = MaterialTheme.typography.headlineSmall)
                    Spacer(modifier = Modifier.height(8.dp))
                    LinearProgressIndicator(progress = completed.toFloat() / total)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "You're $progressPercent% done!")
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = { onResetProgress(course.id) }) {
                        Text("Reset Progress")
                    }
                }
            }
        }
    }
}
