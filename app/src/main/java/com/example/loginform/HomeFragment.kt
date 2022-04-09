package com.example.loginform
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.loginform.databinding.FragmentHomeBinding

class HomeFragment : Fragment()
{
    private lateinit var binding:FragmentHomeBinding // created object of FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        binding= FragmentHomeBinding.inflate(inflater,container,false) // initializing binding object

        binding.registerBtn.setOnClickListener{
            // put a setOnClickListener on registerBtn to go on next fragment
            val fName=binding.firstNameInputET.text.toString() // converting input data to string and pass a variable
            val lName=binding.lastNameInputET.text.toString()
            val email=binding.emailInputET.text.toString()
            val phone=binding.phoneInputET.text.toString()
            val candle=Bundle().apply {
                // Bundle to pass on findNavController
                putString("Email Address", email) // putting the user written value to "Email Address key"
                putString("Phone", phone) // "Phone" naming can be any name
                putString("First Name", fName)
                putString("Last Name", lName)
            }
            findNavController().
            navigate(R.id.action_homeFragment_to_detailsFragment,candle)
        }
        return binding.root // MainActivity or the layout
    }

}