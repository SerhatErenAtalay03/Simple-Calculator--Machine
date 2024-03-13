package com.serhaterenatalay.simplecalculatormachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.serhaterenatalay.simplecalculatormachine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
     var firstNumber:Double?=null
     var secondNumber:Double?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)



    }

    fun addictionOnClick(view: View){
      firstNumber=binding.editFirstNumber.text.toString().toDoubleOrNull()
      secondNumber=binding.editSecondNumber.text.toString().toDoubleOrNull()

    if(firstNumber!=null && secondNumber!=null){

        binding.resultTextView.text="Result:${firstNumber!!+secondNumber!!}"
    }

    else{

      binding.resultTextView.text="Enter Only Number"

    }


    }

    fun subtractionOnClick(view:View){

         firstNumber=binding.editFirstNumber.text.toString().toDoubleOrNull()
         secondNumber=binding.editSecondNumber.text.toString().toDoubleOrNull()

        if(firstNumber!=null && secondNumber!=null){

            binding.resultTextView.text="Result:${firstNumber!!-secondNumber!!}"
        }

        else{

            binding.resultTextView.text="Enter Only Number"

        }


    }

    fun multiplicationOnClick(view: View){

         firstNumber=binding.editFirstNumber.text.toString().toDoubleOrNull()
         secondNumber=binding.editSecondNumber.text.toString().toDoubleOrNull()

        if(firstNumber!=null && secondNumber!=null){

            binding.resultTextView.text="Result:${firstNumber!!*secondNumber!!}"
        }

        else{

            binding.resultTextView.text="Enter Only Number"

        }


    }

   fun divisionOnClick(view: View){

      firstNumber=binding.editFirstNumber.text.toString().toDoubleOrNull()
       secondNumber=binding.editSecondNumber.text.toString().toDoubleOrNull()

       if(firstNumber!=null && secondNumber!=null){

           binding.resultTextView.text="Result:${firstNumber!!/secondNumber!!}"
       }

       else{

           binding.resultTextView.text="Enter Only Number"

       }


   }






}