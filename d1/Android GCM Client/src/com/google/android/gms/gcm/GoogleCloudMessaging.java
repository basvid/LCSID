package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.javapapers.android.gcm.multiple.GCMNotificationIntentService;
import com.javapapers.android.gcm.multiple.RegisterActivity;

public interface GoogleCloudMessaging {

    GoogleCloudMessaging getInstance(Context context);

	String MESSAGE_TYPE_SEND_ERROR = null;
	String MESSAGE_TYPE_DELETED = null;
	String MESSAGE_TYPE_MESSAGE = null;

	String getMessageType(Intent intent);

	void send(String string, String id, Bundle data);

    abstract GoogleCloudMessaging getInstance(RegisterActivity registerActivity);

	String register(String googleProjectId);

}
