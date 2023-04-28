package gmail.ilya105.signuptaskw3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import gmail.ilya105.signuptaskw3.ui.theme.SignUpTaskW3Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        val btnsignup: Button = findViewById(R.id.btn_signup)
        val etname: EditText = findViewById(R.id.et_name)
        val etfamily: EditText = findViewById(R.id.et_family)
        val checkBox: CheckBox = findViewById(R.id.cb)

        btnsignup.setOnClickListener {
            if (etname.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please Enter Your Name", Toast.LENGTH_SHORT
                ).show()
            } else if (etfamily.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please Enter Your Family", Toast.LENGTH_SHORT
                ).show()
            } else if (checkBox.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Could Not Accept The Terms of Use, Please Check The Agreement",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                finish()
            }


        }
    }
}