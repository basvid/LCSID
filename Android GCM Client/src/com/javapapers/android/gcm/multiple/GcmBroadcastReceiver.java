package com.javapapers.android.gcm.multiple;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

public class GcmBroadcastReceiver implements WakefulBroadcastReceiver {

	public void onReceive(Context context, Intent intent) {
		ComponentName comp = new ComponentName(context.getPackageName(),
				GCMNotificationIntentService.class.getName());
		startWakefulService(context, (intent.setComponent(comp)));
		setResultCode(Activity.RESULT_OK);
	}

	private void setResultCode(int resultOk) {
		// TODO Auto-generated method stub
		
	}

	private void startWakefulService(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
	}

	public static void completeWakefulIntent(Intent intent) {
		// TODO Auto-generated method stub
		
	}
}
