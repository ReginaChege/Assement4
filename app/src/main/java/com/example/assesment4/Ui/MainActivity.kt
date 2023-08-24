package com.example.assesment4.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assesment4.ViewModel.DisplayViewModel
import com.example.assesment4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var displayRvAdapter: DisplayRvAdapter
    val displayViewModel: DisplayViewModel by viewModels()
    override fun OnCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayRvAdapter = DisplayRvAdapter(emptyList())
    }
    override fun onResume() {
        super.onResume()
        DisplayViewModel.displayLiveData.observe(this,Observer {Display->
            Toast.makeText(baseContext,
                "fetched ${Display?.size}posts",
                Toast.LENGTH_LONG
            ).show()
            binding.rvDisplay.layoutManager= LinearLayoutManager(this@MainActivity)
            binding.rvDisplay.adapter=DisplayRvAdapter(Display)
        })
        DisplayViewModel.errorLiveData.observe(this, Observer{ error->
            Toast.makeText(baseContext,error, Toast.LENGTH_LONG).show()
        })
    }
}

