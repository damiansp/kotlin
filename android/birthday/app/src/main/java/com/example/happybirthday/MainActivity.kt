package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {}
            }
        }
    }
}


@Composable
fun GreetingText(msg: String, from: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = msg, fontSize = 76.sp, lineHeight = 80.sp)
        Text(text = from, fontSize = 36.sp)
    }
}


@Preview(showBackground=true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(msg = "Happy Birthday, Fearthainn!", from = "love Daddy")
    }
}