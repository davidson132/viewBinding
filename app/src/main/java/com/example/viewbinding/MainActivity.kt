package com.example.viewbinding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //This next line is for binding. Before doing this, go to gradle scripts module and introduce buildFeatures with viewBinding set to true inside curly braces
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Need to set this up for the view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //End of block


        //Using binding, you can access the different views by using their id names. The id names gets rid of the underscore character and concatenates the words together in camel case
        binding.btClickMe.setOnClickListener {
            binding.tvMessage.text = getString(R.string.new_message)
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_LONG).show()
        }

        //Basically viewBinding allows for 1 variable to manage all views.

    }
}