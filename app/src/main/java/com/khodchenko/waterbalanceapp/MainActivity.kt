package com.khodchenko.waterbalanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val dumpContent = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,"
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent),
                        ItemRowModel(R.drawable.image, "Title", dumpContent)
                    )
                ){
                        _, item ->
                    ItemRow(item)
                }
            }
        }
    }
}

@Composable
private fun ListItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable { },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
    ) {

        Box(
        ) {
            Row(verticalAlignment = CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(shape = CircleShape)
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = "Léa Seydoux")
                    Text(text = "French actor")
                }


            }
        }

    }
}

@Preview
@Composable
private fun CircleItem() {
    var counter = remember {
        mutableStateOf(0)
    }
    var backgroundColor = remember {
        mutableStateOf(Color.Cyan)
    }

    Box(
        modifier = Modifier
            .size(100.dp)
            .background(color = backgroundColor.value, shape = CircleShape)
            .clickable {
                when (++counter.value) {
                    10 -> backgroundColor.value = Color.Red
                    20 -> backgroundColor.value = Color.Green
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = counter.value.toString(),
            textAlign = TextAlign.Center,
            style = TextStyle(color = Color.White, fontSize = 20.sp)
        )
    }
}


