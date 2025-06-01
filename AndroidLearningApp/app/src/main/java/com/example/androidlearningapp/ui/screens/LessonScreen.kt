package com.example.androidlearningapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidlearningapp.data.Lesson
import com.example.androidlearningapp.data.ProgressRepository

@Composable
fun LessonScreen(
    lesson: Lesson,
    courseId: String,
    progressRepository: ProgressRepository,
    onNextLesson: () -> Unit,
    onPreviousLesson: () -> Unit
) {
    var isCompleted by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Text(text = lesson.title, style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Learning Objectives:", style = MaterialTheme.typography.headlineSmall)
        lesson.objectives.forEach { objective ->
            Text(text = "• $objective", style = MaterialTheme.typography.bodyLarge)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = lesson.content, style = MaterialTheme.typography.bodyLarge)
        // Visual aids and quizzes can be added here as composables

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                progressRepository.markLessonComplete(courseId, lesson.id)
                isCompleted = true
            },
            enabled = !isCompleted
        ) {
            Text(text = if (isCompleted) "Completed" else "Mark as Complete")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = onPreviousLesson) {
                Text("Previous")
            }
            Button(onClick = onNextLesson) {
                Text("Next")
            }
        }
    }
}
