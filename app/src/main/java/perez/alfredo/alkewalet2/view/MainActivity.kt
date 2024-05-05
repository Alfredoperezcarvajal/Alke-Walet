package perez.alfredo.alkewalet2.view

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import perez.alfredo.alkewalet2.R

class MainActivity : AppCompatActivity() {

    // definimos la variable boton ir a login
    var botonLogin : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Le asignaremos id boton
        botonLogin = findViewById(R.id.btn_ir_login)

        // funcion del boton
        botonLogin?.setOnClickListener {irAlLogin()  }
    }


    // creamos la funcion ir al login
    private fun irAlLogin() {
        val irLogin = Intent (this, LoginActivity::class.java)
        startActivity(irLogin)
    }

}

