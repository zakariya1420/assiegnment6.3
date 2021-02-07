package com.example.home3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sarary:EditText=findViewById(R.id.sarary)
        var btnpro:Button=findViewById(R.id.process)
        var totalsarary:TextView=findViewById(R.id.totalsarary)
        var interest:TextView=findViewById(R.id.interest)
        var btnclear:Button=findViewById(R.id.clear)
        btnpro.setOnClickListener(){
            var sarary=sarary.text.toString().toDouble()
            var a1=0.00
            var a2=0.00
            var a=0.00

            for(i in 1..3){
                var a=(sarary*3)/100
                a1=a1+a
                sarary=a+sarary

            }
            for(i in 1..4){
                var a=(sarary*5)/100
                a1=a1+a
                sarary=a+sarary
            }
            for(i in 1..3){
                var a=(sarary*7)/100
                a1=a1+a
                sarary=a+sarary
            }


            if(sarary>0){
                interest.setText(a1.toString())
                totalsarary.setText(sarary.toString())
            }
        }
        btnclear.setOnClickListener(){
            sarary.setText("")
            totalsarary.setText("")
            interest.setText("")
        }
    }
}