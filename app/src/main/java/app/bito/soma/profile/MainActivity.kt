package app.bito.soma.profile

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Color.rgb
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

            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb( 0, 180, 220))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))




        }
        button2.setOnClickListener {
           profileImage.setImageResource(R.drawable.tennis)
           profileLabelText.text = "スポーツ"
           profileCommentText.text = "週３で、テニスをやっています。"
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb( 220, 0, 100))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
        }
        button3.setOnClickListener {
            profileImage.setImageResource(R.drawable.sushi)
            profileLabelText.text = "好きな食べ物"
            profileCommentText.text = "寿司が大好きです。特にマグロが好きです。"
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb( 0, 180, 120))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
        }
        button4.setOnClickListener {
            profileImage.setImageResource(R.drawable.kendama)
            profileLabelText.text = "趣味"
            profileCommentText.text = "けん玉が好きで、難しい技もできます。"
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb( 150, 150, 150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb( 220, 100, 0))
        }

    }
}