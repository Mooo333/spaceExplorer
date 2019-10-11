package ca.qc.cstj.spaceexplorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnConnexionClick(view: View?){
        if(edtMotDePasse.text.toString() == "333"){
            val intent = WelcomeActivity.newIntent(this, edtNomUtilisateur.text.toString());
            startActivity(intent);
        }else{
            Toast.makeText(this, R.string.msgMauvaisMotPasse, Toast.LENGTH_LONG).show()
        }
    }
}
