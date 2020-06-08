package com.wolvec.dimn.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.wolvec.dimn.viewmodellivedatakotlin.R
import com.wolvec.dimn.viewmodellivedatakotlin.utils.Sumar
import com.wolvec.dimn.viewmodellivedatakotlin.viewmodel.SumarViewModel
import kotlinx.android.synthetic.main.activity_view_model.*

class ViewModelActivity : AppCompatActivity() {

    lateinit var sumarViewModel: SumarViewModel
    var resultado: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)


        setUpView()
    }



    fun setUpView() {
        sumarViewModel = ViewModelProvider(this).get(SumarViewModel::class.java)
        tvSumar.text = "$resultado"

        tvSumarViewModel.text = ""+ sumarViewModel.resultado

        btSumar.setOnClickListener(View.OnClickListener {
            resultado = Sumar.sumar(resultado)
            tvSumar.text = "$resultado"

            sumarViewModel.resultado = Sumar.sumar(sumarViewModel.resultado)
            tvSumarViewModel.text = "" + sumarViewModel.resultado
        })
    }

}
