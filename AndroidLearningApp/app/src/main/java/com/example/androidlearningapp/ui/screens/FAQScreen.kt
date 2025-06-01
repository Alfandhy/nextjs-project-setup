package com.example.androidlearningapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FAQScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Frequently Asked Questions",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Q1: How do I track my progress?",
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = "A1: Your progress is tracked automatically as you mark lessons complete.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 12.dp)
        )
        Text(
            text = "Q2: Can I access lessons offline?",
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = "A2: Yes, lessons are cached for offline access.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 12.dp)
        )
        Text(
            text = "Q3: How do I get a certificate of completion?",
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = "A3: Certificates can be downloaded after completing all lessons in a course.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 12.dp)
        )
        // Add more FAQs as needed
    }
}
