package com.xiaochao.wanandroid.ui.me

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MeViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "这是我的页面"
    }
    val text: LiveData<String> = _text
}
