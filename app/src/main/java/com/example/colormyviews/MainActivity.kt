package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.box_five_text
import kotlinx.android.synthetic.main.activity_main.box_four_text
import kotlinx.android.synthetic.main.activity_main.box_one_text
import kotlinx.android.synthetic.main.activity_main.box_three_text
import kotlinx.android.synthetic.main.activity_main.box_two_text
import kotlinx.android.synthetic.main.activity_main.constraint_layout
import kotlinx.android.synthetic.main.activity_main.green_button
import kotlinx.android.synthetic.main.activity_main.red_button
import kotlinx.android.synthetic.main.activity_main.yellow_button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text,
                        box_four_text, box_five_text, constraint_layout,
                        red_button, green_button, yellow_button)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_three_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_four_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_five_text -> view.setBackgroundColor(Color.RED)
            R.id.red_button -> box_three_text.setBackgroundColor(Color.RED)
            R.id.yellow_button -> box_four_text.setBackgroundColor(Color.YELLOW)
            R.id.green_button -> box_five_text.setBackgroundColor(Color.GREEN)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}