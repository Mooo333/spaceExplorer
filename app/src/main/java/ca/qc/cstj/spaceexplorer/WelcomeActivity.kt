package ca.qc.cstj.spaceexplorer

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        this.title = intent.getStringExtra("Username")
    }

    companion object{

        fun newIntent(context: Context) : Intent {
            val intent = Intent(context, WelcomeActivity::class.java)
            intent.putExtra("UserName", username)
            return intent
        }
    }
}
