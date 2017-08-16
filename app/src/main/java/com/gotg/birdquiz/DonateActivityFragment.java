package com.gotg.birdquiz;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DonateActivityFragment extends Fragment
{
    private TextView aboutBirdsOnlineTextView;
    private TextView nzForestBirdTextView;
    private TextView aboutGregStraightTextView;

    // configures the IntroActivityFragment when its View is created
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_donate, container, false);

        // get references to GUI components
        aboutBirdsOnlineTextView = (TextView) view.findViewById(R.id.aboutBirdsOnlineTextView);
        nzForestBirdTextView = (TextView) view.findViewById(R.id.nzForestBirdTextView);
        aboutGregStraightTextView = (TextView) view.findViewById(R.id.aboutGregStraightTextView);

        // wire up necessary properties
        aboutBirdsOnlineTextView.setText(Util.fromHtml(getString(R.string.about_birdsonline)));
        aboutBirdsOnlineTextView.setMovementMethod(LinkMovementMethod.getInstance());
        nzForestBirdTextView.setText(Util.fromHtml(getString(R.string.donate_forestbird)));
        aboutGregStraightTextView.setText(Util.fromHtml(getString(R.string.about_gregstraight)));
        aboutGregStraightTextView.setMovementMethod(LinkMovementMethod.getInstance());


        return view; // return the fragment's view for display
    }


}