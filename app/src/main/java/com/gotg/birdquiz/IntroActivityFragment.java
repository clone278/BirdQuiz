package com.gotg.birdquiz;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IntroActivityFragment extends Fragment {

    private TextView introToptextTextView;

    // configures the IntroActivityFragment when its View is created
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_intro, container, false);

        // get references to GUI components
        introToptextTextView = (TextView) view.findViewById(R.id.introToptextTextView);

        populateIntroView();

        return view; // return the fragment's view for display
    }

    private void populateIntroView()
    {
        introToptextTextView.setText(Html.fromHtml(getString(R.string.intro_toptext)));
    }
/*
    public void startQuiz(View view)
    {
        // do something in response to someone clicking the start button
        // Create the main quiz page as an intent
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
    */
}
