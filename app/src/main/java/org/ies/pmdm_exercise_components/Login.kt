package org.ies.pmdm_exercise_components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.ies.pmdm_exercise_components.ui.theme.PmdmexercisecomponentsTheme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PmdmexercisecomponentsTheme {
                LoginContent()
            }
        }
    }
}

@Composable
fun LoginContent() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(


        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    PmdmexercisecomponentsTheme {
        LoginContent()
    }
}