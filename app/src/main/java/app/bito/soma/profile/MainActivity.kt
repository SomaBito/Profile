package app.bito.soma.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1.setOnClickListener{
            profileImage.setImageResource(R.drawable.shogi)
            profileLabelText.text = "名前"
            profileCommentText.text = "Androidメンバーのそうまです。"
        }
        button2.setOnClickListener {
           profileImage.setImageResource(R.drawable.tennis)
           profileLabelText.text = "スポーツ"
           profileCommentText.text = "週３で、テニスをやっています。"
        }
        button3.setOnClickListener {
            profileImage.setImageResource(R.drawable.sushi)
            profileLabelText.text = "好きな食べ物"
            profileCommentText.text = "寿司が大好きです。特にマグロが好きです。"
        }
        button4.setOnClickListener {
            profileImage.setImageResource(R.drawable.kendama)
            profileLabelText.text = "趣味"
            profileCommentText.text = "けん玉が好きで、難しい技もできます。"
        }

    }
}