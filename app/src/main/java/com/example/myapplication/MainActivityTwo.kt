package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivityTwo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.onBackground)
                    .padding(24.dp)) {
                    ExpandCard(
                        title = "My Title",
                        description = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit,sed do eiusmod tempor incididunt " +
                                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostr exercitation ullamco laboris" +
                                " nisi ut aliquip ex ea commodo consequat. Ut enim ad minim veniam."
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onBackground)
            .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ExpandCard(
                title = "My Title",
                description = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit,sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostr exercitation ullamco laboris" +
                        " nisi ut aliquip ex ea commodo consequat. Ut enim ad minim veniam."
            )
        }
    }
}