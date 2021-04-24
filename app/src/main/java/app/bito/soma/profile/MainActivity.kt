package app.bito.soma.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //画像を見えなくする
        profileImage.isVisible = false
        profileCommentText.isVisible = false

        button1.setOnClickListener{
            profileImage.isVisible = true
            profileCommentText.isVisible = true

        }

    }
}