package com.example.thestuduyapp.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.clickable
import androidx.compose.material3.Card
import androidx.compose.ui.unit.dp
import com.example.thestuduyapp.data.subjectlist

@Composable
fun Subjectgridscreen(){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        Modifier.padding(8.dp)
    ) {
        items(subjectlist) { subject ->
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .clickable {
                        // handle click, e.g. navigate to subject details
                    }
            ) {
                Text(
                    text = subject.name,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

