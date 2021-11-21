package co.gov.mintic.misiontic.udea.ciclo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mostrarFragmento1(v : View){
        var manejador = supportFragmentManager
        var transicion = manejador.beginTransaction()
        var frag1 = Fragmento1()
        transicion.add(R.id.contenedor, frag1)
        transicion.commit()
    }

    fun mostrarFragmento2(v : View){
        var manejador = supportFragmentManager
        var transicion = manejador.beginTransaction()
        var frag2 = Fragmento2()
        transicion.add(R.id.contenedor, frag2)
        transicion.commit()
    }
}

