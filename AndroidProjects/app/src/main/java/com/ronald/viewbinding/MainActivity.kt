package com.ronald.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.ronald.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var timesPressed = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        here we are infalting the main_xml layout file with the views it contains
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //This code makes it possible an default value to be created when the application is first run
        val initialPeople = People(R.drawable.ronald, "Ronald Otieno","Software Engineer")
        displayPeople(initialPeople)
        binding.button.setOnClickListener {
            timesPressed++


            when(timesPressed % 10){
                0 -> displayPeople(People(R.drawable.ronald,"Ronald Otieno","Software Engineer"))
                1 -> displayPeople(People(R.drawable.chelsea,"Chelsea Owen","Model"))
                2 -> displayPeople(People(R.drawable.kamala,"Kamala Harris","Politician"))
                3 -> displayPeople(People(R.drawable.quincy,"Quincy Missy","Professor"))
                4 -> displayPeople(People(R.drawable.obama,"Barack Obama","President"))
                5 -> displayPeople(People(R.drawable.lim,"Lim Dias","Artist"))
                6 -> displayPeople(People(R.drawable.elon,"Ellon Musk","Space Explorer"))
                7 -> displayPeople(People(R.drawable.smith,"Will Smith","Actor"))
                8 -> displayPeople(People(R.drawable.ella,"Ella Allison","Photographer"))
                9 -> displayPeople(People(R.drawable.ethan,"Ethan Geno","Business Man"))


            }
        }
    }

    private fun displayPeople(people:People){
        binding.imageView.setImageResource(people.image)
        binding.textView.text =people.name
        binding.textCareer.text = people.career
    }

    data class People(var image:Int, var name:String, var career:String)
}