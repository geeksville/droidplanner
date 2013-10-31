package com.droidplanner.drone.variables.mission.waypoints;

import android.content.Context;

import com.droidplanner.R;
import com.droidplanner.fragments.markers.MarkerManager.MarkerSource;
import com.droidplanner.fragments.markers.helpers.MarkerWithText;
import com.droidplanner.fragments.mission.MissionFragment;
import com.droidplanner.fragments.mission.MissionLandFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;

public class Land extends GenericWaypoint implements MarkerSource {

	public double yawAngle;

	public Land(LatLng coord, double altitude) {
		super(coord, altitude);
	}

	@Override
	protected BitmapDescriptor getIcon(Context context) {
		return BitmapDescriptorFactory.fromBitmap(MarkerWithText
				.getMarkerWithTextAndDetail(R.drawable.ic_wp_map, "text",
						"detail", context));
	}

	@Override
	public MissionFragment getDialog() {
		return new MissionLandFragment();
	}

}