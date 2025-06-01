package com.example.androidlearningapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = PrimaryBlue,
    secondary = AccentGreen,
    background = White,
    surface = White,
    onPrimary = White,
    onSecondary = DarkGray,
    onBackground = DarkGray,
    onSurface = DarkGray,
)

private val DarkColors = darkColorScheme(
    primary = PrimaryBlue,
    secondary = AccentGreen,
    background = DarkGray,
    surface = DarkGray,
    onPrimary = White,
    onSecondary = White,
    onBackground = White,
    onSurface = White,
)

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun AndroidLearningAppTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    var isDarkTheme by remember { mutableStateOf(darkTheme) }
    val colors = if (isDarkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
