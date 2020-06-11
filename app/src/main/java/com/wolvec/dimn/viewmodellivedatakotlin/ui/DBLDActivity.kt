
package com.wolvec.dimn.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.wolvec.dimn.viewmodellivedatakotlin.R
import com.wolvec.dimn.viewmodellivedatakotlin.databinding.ActivityDBLDBinding
import com.wolvec.dimn.viewmodellivedatakotlin.utils.User
import com.wolvec.dimn.viewmodellivedatakotlin.viewmodel.DBLDViewModel

class DBLDActivity : AppCompatActivity() {

    lateinit var viewModel: DBLDViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_d_b_l_d)
        val binding: ActivityDBLDBinding = DataBindingUtil.setContentView(this,R.layout.activity_d_b_l_d)

        binding.setLifecycleOwner(this)

        viewModel = ViewModelProvider(this).get(DBLDViewModel::class.java)

        binding.viewModel = viewModel
        val user = User("Daniel","25")
        viewModel.setUser(user)
    }
}