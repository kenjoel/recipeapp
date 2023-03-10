package com.example.deploy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.deploy.ui.theme.DeployTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .verticalScroll(rememberScrollState())
                .background(color = Color(0xFFF2F2F2))
                .fillMaxWidth()) {
                Image(painterResource(id = R.drawable.food), contentDescription =null, contentScale = ContentScale.Crop, modifier = Modifier.align(Alignment.CenterHorizontally))
                Column(modifier = Modifier.padding(16.dp)) {
                    Row( modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround){
                        Text(text = "Happy Meal", style = TextStyle(fontSize = TextUnit.Companion.Unspecified), modifier = Modifier.align(Alignment.CenterVertically))
                        Text(text = "800 Calories")
                        Text(text = "$6.99", style = TextStyle(color = Color.Green ))
                    }
                }
                Spacer(modifier = Modifier.padding(top = Dp(10F)))

                Button(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(text = "ORDER NOW")

                }

            }
//            DeployTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//
//                }
//            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Clicker(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "We have a button")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DeployTheme {
        Greeting("Android")
    }
}