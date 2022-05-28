package com.example.lsm_app

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView


class videosView : Fragment(R.layout.fragment_videos_view) {

    var URL: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val video = inflater.inflate(R.layout.fragment_videos_view, container, false)

               val vid = video.findViewById(R.id.videoView) as VideoView

        vid.setVideoURI(Uri.parse(URL))
        vid.setMediaController(MediaController(requireActivity()))
        vid.start()

        return video
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(arguments != null){
             URL = arguments?.getString("key").toString()
        }

    }

}