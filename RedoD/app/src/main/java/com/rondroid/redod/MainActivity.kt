package com.rondroid.redod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayPerson = ArrayList<PersonData>()
        arrayPerson.add(PersonData("Ronald", "Ronnie"))
        arrayPerson.add(PersonData("Brodrick", "Rick"))
        arrayPerson.add(PersonData("Michael","Mike"))
        arrayPerson.add(PersonData("Emmanuel", "Emma"))
        arrayPerson.add(PersonData("William", "Bill"))
        arrayPerson.add(PersonData("Joel", "Joel"))

        val myAdapter = PersonAdapter(arrayPerson,this)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = myAdapter
    }
}