package com.example.loginform
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loginform.databinding.FragmentDetailsBinding
class DetailsFragment : Fragment()
{
    private lateinit var grinding:FragmentDetailsBinding // created object of FragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View?
    {
        grinding= FragmentDetailsBinding.inflate(inflater,container,false) // initializing grinding object
        val firstName = arguments?.getString("First Name") // this key should be matched with putString key in HomeFragment
        val lastName = arguments?.getString("Last Name")
        val emailAddress = arguments?.getString("Email Address")
        val phoneNumber = arguments?.getString("Phone")
        grinding.firstNameValue.text = firstName // setting all value to value field
        grinding.lastNameValue.text = lastName
        grinding.emailValue.text = emailAddress
        grinding.phoneValue.text = phoneNumber
        return grinding.root
    }
}




