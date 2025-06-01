package com.example.androidlearningapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.androidlearningapp.data.Course
import com.example.androidlearningapp.data.ProgressRepository
import com.example.androidlearningapp.ui.navigation.AppNavGraph
import com.example.androidlearningapp.ui.theme.AndroidLearningAppTheme

class MainActivity : ComponentActivity() {
    private lateinit var progressRepository: ProgressRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressRepository = ProgressRepository(this)

        // Sample courses data
        val courses = listOf(
            Course(
                id = "ai",
                title = "Artificial Intelligence",
                description = "Beginner AI course",
                lessons = emptyList() // To be filled with actual lessons
            ),
            Course(
                id = "crypto",
                title = "Cryptography",
                description = "Beginner Cryptography course",
                lessons = emptyList() // To be filled with actual lessons
            )
        )

        var isDarkMode by mutableStateOf(false)

        setContent {
            AndroidLearningAppTheme(darkTheme = isDarkMode) {
                val navController = rememberNavController()
                AppNavGraph(
                    navController = navController,
                    courses = courses,
                    progressRepository = progressRepository
                )
            }
        }
    }
}
