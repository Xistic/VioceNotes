package com.example.viocenotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.viocenotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bClass: ActivityMainBinding

    //private var permission = arrayOf(Manifest.permission.RECORD_AUDIO)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bClass.root)
    }

    fun starBtn(view: View){
        bClass.playBtn.setOnClickListener {
            bClass.playBtn.visibility = View.GONE
        }
    }

    fun pauseBtn(view: View){
        bClass.pauseBtn.setOnClickListener {
            bClass.playBtn.visibility = View.VISIBLE
        }
    }

    fun playVoice(view: View){
        bClass.voiceOffBtnBlack.setOnClickListener {
            bClass.voiceOffBtnBlack.visibility = View.GONE
            bClass.pauseBtnOffBlack.visibility = View.GONE
            bClass.pauseBtnOnRed.visibility = View.VISIBLE
            bClass.voiceOnBtnRed.visibility = View.VISIBLE
        }
    }
    fun playVoicePause(view: View){
        bClass.pauseBtnOnRed.visibility = View.GONE
        bClass.pausePlayVoiceBtnRed.visibility = View.VISIBLE
    }

    fun pausePlay(view: View){
        bClass.pausePlayVoiceBtnRed.visibility = View.GONE
        bClass.pauseBtnOnRed.visibility = View.VISIBLE
    }

    fun voiceOff(view: View){
        bClass.voiceOnBtnRed.visibility = View.GONE
        bClass.voiceOffBtnBlack.visibility = View.VISIBLE
        bClass.pauseBtnOnRed.visibility = View.GONE
        bClass.pausePlayVoiceBtnRed.visibility = View.GONE
        bClass.pauseBtnOffBlack.visibility = View.VISIBLE

    }
}