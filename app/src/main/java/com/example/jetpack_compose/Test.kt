package com.example.jetpack_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Contact(
    val name: String,
    val phoneNumber: String
)

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun VerticalList() {
    val contacts = remember {
        listOf<Contact>(
            Contact(
                name = "Soumya Dey",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Ishan Dey",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Ishani Dey",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
            Contact(
                name = "Gungun Chakraborty",
                phoneNumber = "3748534534"
            ),
        )
    }
//    LazyColumn (
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        items(contacts) { contact ->
//            Card (
//                modifier = Modifier.fillMaxSize().padding(16.dp)
//            ) {
//                Column {
//                    Text(text = contact.name)
//                    Text(text = contact.phoneNumber)
//                }
//            }
//        }
//    }
    LazyRow (
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        items(contacts) { contact ->
            Card (
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                Column {
                    Text(text = contact.name)
                    Text(text = contact.phoneNumber)
                }
            }
        }
    }

}