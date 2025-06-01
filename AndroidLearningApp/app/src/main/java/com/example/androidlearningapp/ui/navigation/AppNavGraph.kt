package com.example.androidlearningapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androidlearningapp.data.Course
import com.example.androidlearningapp.data.ProgressRepository
import com.example.androidlearningapp.ui.screens.*

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Lesson : Screen("lesson/{courseId}/{lessonId}") {
        fun createRoute(courseId: String, lessonId: String) = "lesson/$courseId/$lessonId"
    }
    object NavigationMenu : Screen("navigation_menu")
    object ProgressTracker : Screen("progress_tracker")
    object Instructor : Screen("instructor")
    object FAQ : Screen("faq")
    object Settings : Screen("settings")
}

@Composable
fun AppNavGraph(
    navController: NavHostController,
    courses: List<Course>,
    progressRepository: ProgressRepository
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(
                courses = courses,
                progressRepository = progressRepository,
                onCourseSelected = { course ->
                    val firstLessonId = course.lessons.firstOrNull()?.id ?: ""
                    navController.navigate(Screen.Lesson.createRoute(course.id, firstLessonId))
                }
            )
        }
        composable(Screen.NavigationMenu.route) {
            NavigationMenuScreen(
                onNavigateHome = { navController.navigate(Screen.Home.route) },
                onNavigateAICourse = {
                    val aiCourse = courses.find { it.id == "ai" }
                    aiCourse?.let {
                        val firstLessonId = it.lessons.firstOrNull()?.id ?: ""
                        navController.navigate(Screen.Lesson.createRoute(it.id, firstLessonId))
                    }
                },
                onNavigateCryptoCourse = {
                    val cryptoCourse = courses.find { it.id == "crypto" }
                    cryptoCourse?.let {
                        val firstLessonId = it.lessons.firstOrNull()?.id ?: ""
                        navController.navigate(Screen.Lesson.createRoute(it.id, firstLessonId))
                    }
                },
                onNavigateProgressTracker = { navController.navigate(Screen.ProgressTracker.route) },
                onNavigateInstructor = { navController.navigate(Screen.Instructor.route) },
                onNavigateFAQ = { navController.navigate(Screen.FAQ.route) },
                onNavigateSettings = { navController.navigate(Screen.Settings.route) }
            )
        }
        composable(Screen.ProgressTracker.route) {
            ProgressTrackerScreen(
                courses = courses,
                progressRepository = progressRepository,
                onResetProgress = { courseId ->
                    progressRepository.resetProgress(courseId)
                }
            )
        }
        composable(Screen.Instructor.route) {
            InstructorScreen()
        }
        composable(Screen.FAQ.route) {
            FAQScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen(
                isDarkMode = false,
                onDarkModeToggle = { /* TODO: Implement dark mode toggle */ }
            )
        }
        composable(
            route = Screen.Lesson.route,
            arguments = listOf()
        ) { backStackEntry ->
            val courseId = backStackEntry.arguments?.getString("courseId") ?: ""
            val lessonId = backStackEntry.arguments?.getString("lessonId") ?: ""
            val course = courses.find { it.id == courseId }
            val lessonIndex = course?.lessons?.indexOfFirst { it.id == lessonId } ?: -1
            if (course != null && lessonIndex != -1) {
                val lesson = course.lessons[lessonIndex]
                LessonScreen(
                    lesson = lesson,
                    courseId = courseId,
                    progressRepository = progressRepository,
                    onNextLesson = {
                        val nextIndex = lessonIndex + 1
                        if (nextIndex < course.lessons.size) {
                            val nextLessonId = course.lessons[nextIndex].id
                            navController.navigate(Screen.Lesson.createRoute(courseId, nextLessonId))
                        }
                    },
                    onPreviousLesson = {
                        val prevIndex = lessonIndex - 1
                        if (prevIndex >= 0) {
                            val prevLessonId = course.lessons[prevIndex].id
                            navController.navigate(Screen.Lesson.createRoute(courseId, prevLessonId))
                        } else {
                            navController.popBackStack()
                        }
                    }
                )
            }
        }
    }
}
