package com.droidplanner.fragments.calibration.fs;

import com.droidplanner.R;
import com.droidplanner.fragments.calibration.FragmentCalibration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentSetupFS extends FragmentCalibration {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_setup_fs_main, container,
				false);
		setupLocalViews(view);

		return view;
	}

	private void setupLocalViews(View view) {
	}
}
