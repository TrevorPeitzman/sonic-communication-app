package hu.ait.sonicmessage

import android.media.AudioFormat
import android.media.ToneGenerator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.nisrulz.zentone.ZenTone

val toneg = ToneGenerator(1, 50)
val zenyTone = ZenTone(channelMask = AudioFormat.CHANNEL_OUT_STEREO)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        zenyTone.play(frequency=400f, volume=2)


    }

    override fun onPause() {
        super.onPause()
        zenyTone.stop()
    }
}