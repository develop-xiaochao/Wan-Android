package com.xiaochao.wanandroid.ui.wechat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WechatViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "这是公众号页"
    }
    val text: LiveData<String> = _text
}