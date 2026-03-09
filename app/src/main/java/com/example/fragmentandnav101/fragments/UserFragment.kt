package com.example.fragmentandnav101.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentandnav101.R
import com.example.fragmentandnav101.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    private var _binding: FragmentUserBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 1. yol: kullanıcı adı arguments ile alınır
        // val userName = arguments?.getString("userName")

        // 2. yol: kullanıcı adı safeargs ile alınır
        val userName= UserFragmentArgs.fromBundle(requireArguments()).userName
        binding.txtUserName.text = "Kullanıcı adı: $userName"

        // butona tıklandığında logout fonksiyonu çalışacak
        binding.btnLogOut.setOnClickListener {
            logout(it)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun logout(it: View) {
        // kullanıcı ekranından çıkış yapılırsa login ekranına geçiş yap
        val action = UserFragmentDirections.actionUserFragmentToLoginFragment()
        findNavController().navigate(action)
    }
}