package com.example.ahmed.layoutparams
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TextWatcher {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mFieldMessage.addTextChangedListener(this)
    }

    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        if (mFieldMessage.text.isNotEmpty()){
            mSend.visibility = View.VISIBLE
            val layoutP = mFieldMessage.layoutParams as LinearLayout.LayoutParams
            layoutP.weight = 8f
        } else {
            mSend.visibility = View.GONE
            val layoutP = mFieldMessage.layoutParams as LinearLayout.LayoutParams
            layoutP.weight = 9f

        }
    }

}
