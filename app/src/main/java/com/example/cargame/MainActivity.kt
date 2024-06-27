package com.example.cargame

import GameView
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.content.SharedPreferences
import android.graphics.Color

class MainActivity : AppCompatActivity(), GameTask {
    private lateinit var rootLayout: LinearLayout
    private lateinit var startBtn: Button
    private lateinit var mGameView: GameView
    private lateinit var scoreTextView: TextView
    private lateinit var highScoreTextView: TextView
    private lateinit var sharedPreferences: SharedPreferences

    private var highScore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        startBtn = findViewById(R.id.startBtn)

        rootLayout = findViewById(R.id.rootLayout)
        scoreTextView = findViewById(R.id.score)
        highScoreTextView = findViewById(R.id.highScore)
        mGameView = GameView(this, this)
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        highScore = sharedPreferences.getInt("highScore", 0) // Load high score from SharedPreferences
        rootLayout.setBackgroundResource(R.drawable.backgroundnew)
        highScoreTextView.text = "High Score : $highScore"

        startBtn.setOnClickListener {
            rootLayout.setBackgroundResource(R.drawable.backgroundnew)
            mGameView.setBackgroundResource(R.drawable.road)
            rootLayout.addView(mGameView)
            startBtn.visibility = View.GONE
            scoreTextView.visibility = View.GONE
            highScoreTextView.visibility = View.GONE
        }
    }

    override fun closeGame(mScore: Int, newHighScore: Int) {
        scoreTextView.text = "Score : $mScore"
        if (mScore > highScore) {
            highScore = mScore // Update the activity's highScore variable
            highScoreTextView.text = "High Score : $highScore"
        }
        rootLayout.removeView(mGameView)

        startBtn.visibility = View.VISIBLE
        scoreTextView.visibility = View.VISIBLE
        highScoreTextView.visibility = View.VISIBLE

    }
}

