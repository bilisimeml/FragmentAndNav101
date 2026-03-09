package com.example.fragmentandnav101.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentandnav101.R
import com.example.fragmentandnav101.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root

    }

    // view oluşturulduktan sonra çalışacak kodlar burada yazılır
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // butona tıklandığında login fonksiyonu çalışacak
        binding.btnLogin.setOnClickListener {
            login(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun login(view: View) {
        // kullanıcı adını al
        val userName = binding.etUserName.text.toString()
        // kullanıcı adı boş ise hata göster
        if (userName.isEmpty()) {
            binding.etUserName.error = "Kullanıcı adı boş olamaz"
            return
        }else{
            // hatayı sil
            binding.etUserName.error = null
            // kullanıcı adı boş değilse kullanıcı ekranına geçiş yap
            val action = LoginFragmentDirections.actionLoginFragmentToUserFragment(userName)
            findNavController().navigate(action)
        }


    }

}