package com.example.teacherreview.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.teacherreview.databinding.FragmentStudentProfileBinding
import com.example.teacherreview.utils.Constants
import com.example.teacherreview.viewmodels.SharedViewModel


class StudentProfileFragment : Fragment() {

    // This is the Binding Variable
    private lateinit var binding: FragmentStudentProfileBinding

    // Creating the SharedViewModel Instance
    private val sharedViewModel : SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStudentProfileBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        sharedViewModel.getStudentDetail()


        binding.tvStudentName.text = Constants.MYUSERDATA.name
        binding.tvEmail.text = Constants.MYUSERDATA.email
//        binding.tvRollNumber.text =

        // TODO :- The Whole binding is yet to be done


    }
}