package com.example.kotlinsceneform

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.ar.sceneform.rendering.ModelRenderable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var arrayView : Array<View>

    lateinit var bearRenderable:ModelRenderable
    lateinit var catRenderable:ModelRenderable
    lateinit var cowRenderable:ModelRenderable
    lateinit var dogRenderable:ModelRenderable
    lateinit var elephantRenderable:ModelRenderable
    lateinit var ferretRenderable:ModelRenderable
    lateinit var hippoRenderable:ModelRenderable
    lateinit var horseRenderable:ModelRenderable
    lateinit var koalaRenderable:ModelRenderable
    lateinit var lionRenderable:ModelRenderable
    lateinit var reindeerRenderable:ModelRenderable
    lateinit var wolverinderRenderable:ModelRenderable


    internal var selected = 1  //Default 1 is choose bear

    override fun onClick(view: View?) {
        if (view!!.id == R.id.bear) {
            selected = 1
            mySetBackground(view.id)
        } else if (view.id == R.id.cat) {
            selected = 2
            mySetBackground(view.id)
        } else if (view.id == R.id.cow) {
            selected = 3
            mySetBackground(view.id)
        } else if (view.id == R.id.dog) {
            selected = 4
            mySetBackground(view.id)
        } else if (view.id == R.id.elephant) {
            selected = 5
            mySetBackground(view.id)
        } else if (view.id == R.id.ferret) {
            selected = 6
            mySetBackground(view.id)
        } else if (view.id == R.id.hippopotamus) {
            selected = 7
            mySetBackground(view.id)
        } else if (view.id == R.id.horse) {
            selected = 8
            mySetBackground(view.id)
        }else if (view.id == R.id.koala_bear) {
            selected = 9
            mySetBackground(view.id)
        }else if (view.id == R.id.lion) {
            selected = 10
            mySetBackground(view.id)
        } else if (view.id == R.id.reindeer) {
            selected = 11
            mySetBackground(view.id)
        } else if (view.id == R.id.wolverine) {
            selected = 12
            mySetBackground(view.id)
        }
    }

    private fun mySetBackground(id: Int) {
        for (i in arrayView.indices)
        {
            if (arrayView[i].id == id)
                arrayView[i].setBackgroundColor(Color.parseColor("#80333639"))
            else
                arrayView[i].setBackgroundColor(Color.TRANSPARENT)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupArray()
        setupClickListener()
        setupModel()
    }

    private fun setupModel() {
        ModelRenderable.builder()
            .setSource(this,R.raw.bear)
            .build()
            .thenAccept { modelRenderable -> bearRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Bear model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.cat)
            .build()
            .thenAccept { modelRenderable -> catRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Cat model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.cow)
            .build()
            .thenAccept { modelRenderable -> cowRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Cow model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.dog)
            .build()
            .thenAccept { modelRenderable -> dogRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Dog model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.elephant)
            .build()
            .thenAccept { modelRenderable -> elephantRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Elephant model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.ferret)
            .build()
            .thenAccept { modelRenderable -> ferretRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Ferret model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.hippopotamus)
            .build()
            .thenAccept { modelRenderable -> hippoRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Hippopotamus model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.horse)
            .build()
            .thenAccept { modelRenderable -> horseRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Horse model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.koala_bear)
            .build()
            .thenAccept { modelRenderable -> koalaRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Koala Bear model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.lion)
            .build()
            .thenAccept { modelRenderable -> lionRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Lion model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.reindeer)
            .build()
            .thenAccept { modelRenderable -> reindeerRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Reindeer model",Toast.LENGTH_SHORT).show()
                null
            }

        ModelRenderable.builder()
            .setSource(this,R.raw.wolverine)
            .build()
            .thenAccept { modelRenderable -> wolverinderRenderable = modelRenderable }
            .exceptionally {
                Toast.makeText(this@MainActivity,"Unnable to load Wolver model",Toast.LENGTH_SHORT).show()
                null
            }
    }

    private fun setupClickListener() {
       for (i in arrayView.indices)
       {
           arrayView[i].setOnClickListener(this)
       }
    }

    private fun setupArray() {
        arrayView = arrayOf(
            bear,
            cat,
            cow,
            dog,
            elephant,
            ferret,
            hippopotamus,
            horse,
            koala_bear,
            lion,
            reindeer,
            wolverine
        )
    }
}
