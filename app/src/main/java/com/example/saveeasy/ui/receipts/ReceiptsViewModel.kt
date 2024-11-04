package com.example.saveeasy.ui.receipts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReceiptsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is receipts Fragment"
    }
    val text: LiveData<String> = _text
}