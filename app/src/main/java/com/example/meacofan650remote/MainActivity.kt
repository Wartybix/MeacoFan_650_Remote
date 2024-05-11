package com.example.meacofan650remote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.meacofan650remote.ui.OverallScreen
import com.example.meacofan650remote.ui.theme.MeacoFan650RemoteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MeacoFan650RemoteTheme {
                OverallScreen()
            }
        }
    }
}