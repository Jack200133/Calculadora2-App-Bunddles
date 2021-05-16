package com.uvg.taller32

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        if(bundle != null){
            val texto = bundle.getString("valor")
            txtTexto.setText(texto)

            val valor2 = bundle.getString("valor2")
            Toast.makeText(this,valor2, Toast.LENGTH_SHORT).show()
/*
            val valor3 = bundle.getString("valor3","no hay valor")
            Toast.makeText(this,valor3, Toast.LENGTH_SHORT).show() */
        }

        btnRegresar.setOnClickListener(){
            val intent: Intent = Intent()
            intent.putExtra("resultado1","Valor desde pantalla 2")
            setResult(RESULT_OK,intent)
            finish()
        }
        btnSuma.setOnClickListener{
            val intent: Intent = Intent()
            val num1: Int= ValA.text.toString().toInt()
            val num2: Int= ValB.text.toString().toInt()
            var res = 0

            if (num1 != null && num2 !=null) {
                res = num1 + num2
            }
            System.out.println(res)
            intent.putExtra("resultado", "Resultado de la suma es: $res")
            setResult(RESULT_OK,intent)
            finish()

        }

        btnDiv.setOnClickListener{
            val intent: Intent = Intent()
            val num1: Int= ValA.text.toString().toInt()
            val num2: Int= ValB.text.toString().toInt()
            var res = 0

            if (num1 != null && num2 !=null && num2 != 0) {
                res = num1 / num2
            }
            System.out.println(res)
            intent.putExtra("resultado", "Resultado de la division es: $res")
            setResult(RESULT_OK,intent)
            finish()

        }

        btnResta.setOnClickListener{
            val intent: Intent = Intent()
            val num1: Int= ValA.text.toString().toInt()
            val num2: Int= ValB.text.toString().toInt()
            var res = 0

            if (num1 != null && num2 !=null) {
                res = num1 - num2
            }
            System.out.println(res)
            intent.putExtra("resultado", "Resultado de la resta es: $res")
            setResult(RESULT_OK,intent)
            finish()

        }

        btnMult.setOnClickListener{
            val intent: Intent = Intent()
            val num1: Int= ValA.text.toString().toInt()
            val num2: Int= ValB.text.toString().toInt()
            var res = 0

            if (num1 != null && num2 !=null && num2 != 0) {
                res = num1 * num2
            }
            System.out.println(res)
            intent.putExtra("resultado", "Resultado de la multiplicaion es: $res")
            setResult(RESULT_OK,intent)
            finish()

        }
    }
}