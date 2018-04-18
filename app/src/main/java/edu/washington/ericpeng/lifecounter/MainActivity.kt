package edu.washington.ericpeng.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv1 : TextView
    private lateinit var tv2 : TextView
    private lateinit var tv3 : TextView
    private lateinit var tv4 : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.p1_score)
        tv2 = findViewById(R.id.p2_score)
        tv3 = findViewById(R.id.p3_score)
        tv4 = findViewById(R.id.p4_score)

        val lose = findViewById<TextView>(R.id.loser)

        findViewById<Button>(R.id.p1_b1).setOnClickListener(this)
        findViewById<Button>(R.id.p1_b2).setOnClickListener(this)
        findViewById<Button>(R.id.p1_b3).setOnClickListener(this)
        findViewById<Button>(R.id.p1_b4).setOnClickListener(this)

        findViewById<Button>(R.id.p2_b1).setOnClickListener(this)
        findViewById<Button>(R.id.p2_b2).setOnClickListener(this)
        findViewById<Button>(R.id.p2_b3).setOnClickListener(this)
        findViewById<Button>(R.id.p2_b4).setOnClickListener(this)

        findViewById<Button>(R.id.p3_b1).setOnClickListener(this)
        findViewById<Button>(R.id.p3_b2).setOnClickListener(this)
        findViewById<Button>(R.id.p3_b3).setOnClickListener(this)
        findViewById<Button>(R.id.p3_b4).setOnClickListener(this)

        findViewById<Button>(R.id.p4_b1).setOnClickListener(this)
        findViewById<Button>(R.id.p4_b2).setOnClickListener(this)
        findViewById<Button>(R.id.p4_b3).setOnClickListener(this)
        findViewById<Button>(R.id.p4_b4).setOnClickListener(this)

        tv1.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().removePrefix("Score: ").trim().toInt() <= 0)
                    lose.text = resources.getString(R.string.lose, 1)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        })

        tv2.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().removePrefix("Score: ").trim().toInt() <= 0)
                    lose.text = resources.getString(R.string.lose, 2)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        })

        tv3.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().removePrefix("Score: ").trim().toInt() <= 0)
                    lose.text = resources.getString(R.string.lose, 3)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        })

        tv4.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().removePrefix("Score: ").trim().toInt() <= 0)
                    lose.text = resources.getString(R.string.lose, 4)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        })
    }


    override fun onClick(v: View) {
        val p1 = tv1.text.removePrefix("Score: ").trim().toString().toInt()
        val p2 = tv2.text.removePrefix("Score: ").trim().toString().toInt()
        val p3 = tv3.text.removePrefix("Score: ").trim().toString().toInt()
        val p4 = tv4.text.removePrefix("Score: ").trim().toString().toInt()

        when (v.id) {
            R.id.p1_b1 -> tv1.text = resources.getString(R.string.score, (p1 + 1).toString())
            R.id.p1_b2 -> tv1.text = resources.getString(R.string.score, (p1 - 1).toString())
            R.id.p1_b3 -> tv1.text = resources.getString(R.string.score, (p1 + 5).toString())
            R.id.p1_b4 -> tv1.text = resources.getString(R.string.score, (p1 - 5).toString())

            R.id.p2_b1 -> tv2.text = resources.getString(R.string.score, (p2 + 1).toString())
            R.id.p2_b2 -> tv2.text = resources.getString(R.string.score, (p2 - 1).toString())
            R.id.p2_b3 -> tv2.text = resources.getString(R.string.score, (p2 + 5).toString())
            R.id.p2_b4 -> tv2.text = resources.getString(R.string.score, (p2 - 5).toString())

            R.id.p3_b1 -> tv3.text = resources.getString(R.string.score, (p3 + 1).toString())
            R.id.p3_b2 -> tv3.text = resources.getString(R.string.score, (p3 - 1).toString())
            R.id.p3_b3 -> tv3.text = resources.getString(R.string.score, (p3 + 5).toString())
            R.id.p3_b4 -> tv3.text = resources.getString(R.string.score, (p3 - 5).toString())

            R.id.p4_b1 -> tv4.text = resources.getString(R.string.score, (p4 + 1).toString())
            R.id.p4_b2 -> tv4.text = resources.getString(R.string.score, (p4 - 1).toString())
            R.id.p4_b3 -> tv4.text = resources.getString(R.string.score, (p4 + 5).toString())
            R.id.p4_b4 -> tv4.text = resources.getString(R.string.score, (p4 - 5).toString())
        }
    }
}
