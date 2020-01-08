package com.xiaochao.wanandroid.ui.system

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SystemViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "这是体系页"
    }
    val text: LiveData<String> = _text
}