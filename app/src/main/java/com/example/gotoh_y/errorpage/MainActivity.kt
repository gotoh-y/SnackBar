package com.example.gotoh_y.errorpage

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var snack = Snackbar.make(root_layout,"情報の読み込みに失敗しました。\n何度も失敗する場合、しばらくたってから再度お試しください",Snackbar.LENGTH_INDEFINITE)
                .setAction("再読込",
                        {
                            finish()
                            startActivity(getIntent())
                        })
                .setActionTextColor(Color.GREEN)

        val snackbarView = snack.view
        val textView = snackbarView.findViewById(android.support.design.R.id.snackbar_text) as TextView
        textView.maxLines = 3

        snack.show()
    }
}
