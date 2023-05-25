package com.example.oxygreens.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.oxygreens.R


class HomeFragment : Fragment() {

    // initialising the image slider
    lateinit var ImageSlider : ImageSlider

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =inflater.inflate(R.layout.fragment_home, container, false)

        // Declaring the image slider
        ImageSlider = view.findViewById(R.id.ImageSlider)

        // Calling the function sliderImage to set the images in the slider
        sliderImage()

        return view
    }



 // Function to set the images in the slider
    private fun sliderImage() {

        val  imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.image1))
        imageList.add(SlideModel(R.drawable.image2))
        imageList.add(SlideModel(R.drawable.image3))
        imageList.add(SlideModel(R.drawable.image4))

      ImageSlider.setImageList(imageList, ScaleTypes.FIT)


    }


}