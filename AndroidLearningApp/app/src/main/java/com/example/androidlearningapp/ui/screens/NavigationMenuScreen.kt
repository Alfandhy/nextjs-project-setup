package com.example.androidlearningapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NavigationMenuScreen(
    onNavigateHome: () -> Unit,
    onNavigateAICourse: () -> Unit,
    onNavigateCryptoCourse: () -> Unit,
    onNavigateProgressTracker: () -> Unit,
    onNavigateInstructor: () -> Unit,
    onNavigateFAQ: () -> Unit,
    onNavigateSettings: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Navigation Menu",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            ListItem(
                headlineText = { Text("Home") },
                modifier = Modifier.padding(vertical = 4.dp),
                onClick = onNavigateHome
            )
            Divider()
            ListItem(
                headlineText = { Text("AI Course") },
                modifier = Modifier.padding(vertical = 4.dp),
                onClick = onNavigateAICourse
            )
            Divider()
            ListItem(
                headlineText = { Text("Cryptography Course") },
                modifier = Modifier.padding(vertical = 4.dp),
                onClick = onNavigateCryptoCourse
            )
            Divider()
            ListItem(
                headlineText = { Text("Progress Tracker") },
                modifier = Modifier.padding(vertical = 4.dp),
                onClick = onNavigateProgressTracker
            )
            Divider()
            ListItem(
                headlineText = { Text("About Instructor") },
                modifier = Modifier.padding(vertical = 4.dp),
                onClick = onNavigateInstructor
            )
            Divider()
            ListItem(
                headlineText = { Text("FAQ") },
                modifier = Modifier.padding(vertical = 4.dp),
                onClick = onNavigateFAQ
            )
            Divider()
            ListItem(
                headlineText = { Text("Settings") },
                modifier = Modifier.padding(vertical = 4.dp),
                onClick = onNavigateSettings
            )
        }
    }
}
