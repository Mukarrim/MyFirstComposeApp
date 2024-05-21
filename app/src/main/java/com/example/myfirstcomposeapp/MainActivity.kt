package com.example.myfirstcomposeapp

import android.app.Application
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeAppTheme {
                // A surface container using the 'background' color from the theme
                //Scafold
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
                CustomView(name = "Mike")
//                }
            }
        }
    }
}

@Composable
fun CustomView(name: String, modifier: Modifier = Modifier) {

    val context = LocalContext.current

    Column(Modifier.padding(16.dp)) {
        Text(
            text = "Welcome $name, hope your like our App!",
            color = Color.Black,
            fontSize = 24.sp,
            fontStyle = FontStyle.Italic
        )

        Text(text = "In order to proceed further click on the button below")

        Image(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Android Icon"
        )

        Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
            Button(onClick = {
            }) {
                Text(text = "Click Me!")
            }
            Button(onClick = {
                Toast.makeText(context, "I'm clicked!", Toast.LENGTH_SHORT).show()
            }) {
                Text(text = "Click Me!")
            }
            Button(onClick = {
            }) {
                Text(text = "Click Me!")
            }
        }

    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
//        Surface(
//            modifier = Modifier.fillMaxSize(),
//            color = MaterialTheme.colorScheme.background
//        ) {
        CustomView("Android")
//        }
    }
}