package com.example.thefinallab

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun start(view: View){
        val intent = Intent(this, GameScreen::class.java).apply {

        }
        startActivity(intent)
    }
    fun quit(view: View){
        val builder = AlertDialog.Builder(this)

        builder.apply {
            setMessage("Are you sure?")
            setPositiveButton(R.string.ok,
                DialogInterface.OnClickListener { dialog, id ->
                    finishAffinity()
                    // User clicked OK button
                })
            setNegativeButton(R.string.cancel,
                DialogInterface.OnClickListener { dialog, id ->

                    // User cancelled the dialog
                })
        }
        // Set other dialog properties


        // Create the AlertDialog
        builder.show()
    }


}
