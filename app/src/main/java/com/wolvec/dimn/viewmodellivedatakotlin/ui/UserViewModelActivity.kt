package com.wolvec.dimn.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.wolvec.dimn.viewmodellivedatakotlin.R
import com.wolvec.dimn.viewmodellivedatakotlin.utils.User
import com.wolvec.dimn.viewmodellivedatakotlin.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_user_view_model.*

class UserViewModelActivity : AppCompatActivity() {

    var userList : ArrayList<User> = ArrayList()
    lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view_model)
        setUpView()
    }

    fun setUpView(){
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        btSalvar.setOnClickListener(View.OnClickListener {
            var user = User()
            user.edad = etEdad.text.toString()
            user.nombre = etNombre.text.toString()
            userList.add(user)
            userViewModel.addUser(user)
        })

        btVer.setOnClickListener(View.OnClickListener {
            var texto = ""
            for (user in userList){
                texto += user.nombre + " " + user.edad + "\n"
            }
            tvUser.text = texto

            texto = ""
            for (user in userViewModel.userList){
                texto += user.nombre + " " + user.edad + "\n"
            }
            tvUserViewModel.text = texto
        })
    }
}
