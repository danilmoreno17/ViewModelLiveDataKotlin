package com.wolvec.dimn.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wolvec.dimn.viewmodellivedatakotlin.R
import com.wolvec.dimn.viewmodellivedatakotlin.databinding.ActivityDataBindingBinding
import com.wolvec.dimn.viewmodellivedatakotlin.utils.User

class DataBindingActivity : AppCompatActivity() {

    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding)
        val binding: ActivityDataBindingBinding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)

        user = User("Daniel","24")

        binding.user = user
    }
}