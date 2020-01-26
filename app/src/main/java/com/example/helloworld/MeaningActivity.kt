package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_meaning.*

class MeaningActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meaning)

        val word = intent.getStringExtra(KEY_WORD)
        title = word

        meaning.text = when(word) {
            getString(R.string.s_title) ->
                getString(R.string.s_meaning)
            getString(R.string.h_title) ->
                getString(R.string.h_meaning)
            else -> getString(R.string.unknown_word)
        }
    }

    companion object {
        const val KEY_WORD = "word"
    }
}
