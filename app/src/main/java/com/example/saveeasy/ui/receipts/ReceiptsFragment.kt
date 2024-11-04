package com.example.saveeasy.ui.receipts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.saveeasy.databinding.FragmentReceiptsBinding

class ReceiptsFragment : Fragment() {

    private var _binding: FragmentReceiptsBinding ? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val receiptsViewModel =
            ViewModelProvider(this).get(ReceiptsViewModel::class.java)

        _binding = FragmentReceiptsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textReceipts
        receiptsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}