package com.example.androidlearningapp.data

import android.content.Context
import android.content.SharedPreferences

class ProgressRepository(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("progress_prefs", Context.MODE_PRIVATE)

    fun getCompletedLessons(courseId: String): Set<String> {
        return prefs.getStringSet(courseId, emptySet()) ?: emptySet()
    }

    fun markLessonComplete(courseId: String, lessonId: String) {
        val completed = getCompletedLessons(courseId).toMutableSet()
        completed.add(lessonId)
        prefs.edit().putStringSet(courseId, completed).apply()
    }

    fun resetProgress(courseId: String) {
        prefs.edit().remove(courseId).apply()
    }
}
