package com.example.anroid_a2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.anroid_a2.ui.main.MainFragment
import com.example.anroid_a2.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {


    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getViewState().observe(this, { value ->
            Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
        })
    }

    fun buttonClick(view: View) {
        viewModel.buttonClick()
    }
}
