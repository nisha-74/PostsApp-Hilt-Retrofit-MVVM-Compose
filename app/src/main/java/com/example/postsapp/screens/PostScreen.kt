package com.example.postsapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.example.postsapp.model.Post
import com.example.postsapp.viewmodel.PostViewModel

@Composable
fun PostScreen(viewModel: PostViewModel= hiltViewModel()) {
    //Observing Stateflow or Flow  data from viewmodel
    // it makes your compose UI react to flow changes
    val posts = viewModel.posts.collectAsState().value

    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 46.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Posts App\nHilt + Retrofit + MVVM",
                textAlign = TextAlign.Center,
                fontSize = 22.sp
            )
        }
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(posts){post->
                PostCard(post)
            }
        }
    }

}

