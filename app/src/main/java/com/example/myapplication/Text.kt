package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class Text : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    SuperSubScript(
                        "Hey",
                        MaterialTheme.typography.headlineSmall.fontSize,
                        "Okay",
                        MaterialTheme.typography.bodySmall.fontSize,
                        FontWeight.Normal)
                }
            }
        }
    }
}

@Composable
fun TextSelection() {
    SelectionContainer {
        Column {
            Text(text = "Hello World!", modifier = Modifier.padding(20.dp))
            DisableSelection {
                Text(text = "Hello World!", modifier = Modifier.padding(20.dp))
            }
            Text(text = "Hello World!", modifier = Modifier.padding(20.dp))
        }
    }
}

@Composable
fun SuperSubScript(
    normalText: String,
    normalFontSize: TextUnit = MaterialTheme.typography.titleSmall.fontSize,
    superText: String,
    superTextFontSize: TextUnit = MaterialTheme.typography.titleMedium.fontSize,
    superTextFontWeight: FontWeight = FontWeight.Normal
){
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = normalFontSize
            )
        ) {
            append(normalText)
        }
        withStyle(
            style = SpanStyle(
                fontSize = superTextFontSize,
                fontWeight = superTextFontWeight,
                baselineShift = BaselineShift.Subscript
//                baselineShift = BaselineShift.Superscript
            )
        ) {
            append(superText)
        }
    })
}

//@Composable
//fun CustomText() {
//    Text(
//        text = stringResource(id = R.string.app_name),
//        modifier = Modifier
//            .background(MaterialTheme.colorScheme.primary)
//            .padding(16.dp)
//            .width(200.dp),
//    color = Color.White,
//    fontSize = MaterialTheme.typography.bodyMedium,
//    fontStyle = FontStyle.Italic,
//    fontWeight = FontWeight.Bold,
//    textAlign = TextAlign.Center
//    )
//}

@Composable
fun CustomText2(){
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("A")
                }

                append("B")
                append("C")
                append("D")
            }
        }, modifier = Modifier.width(200.dp)
    )
}

@Composable
fun CustomText3() {
    Text(text = "Hello Guys!"
        .repeat(25), maxLines = 2,
        overflow = TextOverflow.Ellipsis)
}

@Preview(showBackground = true)
@Composable
fun TextPreview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            SuperSubScript(
                "Hey",
                MaterialTheme.typography.headlineSmall.fontSize,
                "Okay",
                MaterialTheme.typography.bodySmall.fontSize,
                FontWeight.Normal
            )
        }
    }
}
