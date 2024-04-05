package com.example.st10443263ass2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity<textview : View?> : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* Declarations */

        val generateButton = findViewById<Button>(R.id.comparebutton)
        val ClearButton = findViewById<Button>(R.id.ClearButton)
        val NumTextNumber = findViewById<EditText>(R.id.textnumber)
        val ResultTextView = findViewById<TextView>(R.id.textview)
        generateButton.setOnClickListener {

            /* if else statement */
            val age = NumTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                ResultTextView.text= "Please enter a valid age"


            } else {

                if (age < 15 || age > 100) {
                    ResultTextView.text = "please enter a valid age between 15 to 90"
                    NumTextNumber.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                        40 -> "Paul Walker was a famous male american actor known for his amazing character Brian in Fast and Furious"
                        20 -> "Cameron Boyce was a famous Disney actor known for his wonderful character in Descendance"
                        12 -> "Heather O'Rourke a young famous actress who was known as one of the most talented young actress"
                        41 -> "Kobe Bryant was one the best basketball players, he was known as the all-time leading scorer in Lakes history."
                        28 -> "Drazen Petrovic was a famous basketball player known for his explosive scoring ability."
                        50 -> "Michael Jackson was a famous music artist known for his tremendous pop music and dancing ability."
                        34 -> "Rickhado Machado was a young South African artist known for his vibrant music."
                        36 -> "Marilyn Monroe was a young actress and modeling skills most famous for a glamorous beauty."
                        89 -> "Jane Russell was a famous actress and model."
                        90 -> "Sean Connery was a famous author known for his book connery,sean,connery ."

                        else -> "No one Died at this age, please enter a different age!"

                    }
                    ResultTextView.text = result

                }

            }
            ClearButton.setOnClickListener {
                NumTextNumber.text.clear()
                ResultTextView.text = ""
            }



        }



    }


}






