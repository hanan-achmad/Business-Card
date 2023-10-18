package com.example.hanansbusinesscard.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScehme = darkColorScheme(
        primary = Purple200,
        primaryContainer = Purple700,
        secondary = Teal200
)

private val LightColorScheme = lightColorScheme(
        primary = Purple500,
        primaryContainer = Purple700,
        secondary = Teal200
)

@Composable
fun BusinessCardTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorScehme
    } else {
        LightColorScheme
    }

    MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            shapes = Shapes,
            content = content
    )
}