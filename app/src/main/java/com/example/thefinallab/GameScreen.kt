package com.example.thefinallab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game_screen.*

class GameScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)
    }
    var count1=0
    var count2=0
    var count3=0
    var count4=0
    var count5=0
    var count6=0
    fun reset(view: View){
        count1=0
        count2=0
        count3=0
        count4=0
        count5=0
        count6=0
        die1.text = "Die1"
        die2.text = "Die2"
        die3.text = "Die3"
        die4.text = "Die4"
        die5.text = "Die5"
        die6.text = "Die6"
    }
    fun dice(view: View){
        var randomDie = (1..6).random()
        if (randomDie ==1){
            imageView.setImageResource(R.drawable.alea_1)
            count1++
            die1.text = "Die1 = "+count1

        }
        else if (randomDie ==2){
            imageView.setImageResource(R.drawable.alea_2)
            count2++
            die2.text = "Die2 = "+count2
        }
        else if (randomDie ==3){
            imageView.setImageResource(R.drawable.alea_3)
            count3++
            die3.text = "Die3 = "+count3
        }
        else if (randomDie ==4){
            imageView.setImageResource(R.drawable.alea_4)
            count4++
            die4.text = "Die4 = "+count4
        }
        else if (randomDie ==5){
            imageView.setImageResource(R.drawable.alea_5)
            count5++
            die5.text = "Die5 = "+count5
        }
        else if (randomDie ==6){
            imageView.setImageResource(R.drawable.alea_6)
            count6++
            die6.text = "Die6 = "+count6
        }

    }
}
