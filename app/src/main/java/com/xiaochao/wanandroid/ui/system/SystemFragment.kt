package com.xiaochao.wanandroid.ui.system

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.xiaochao.wanandroid.R

class SystemFragment : Fragment() {

    private lateinit var systemViewModel: SystemViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        systemViewModel =
                ViewModelProviders.of(this).get(SystemViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_system, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        systemViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}