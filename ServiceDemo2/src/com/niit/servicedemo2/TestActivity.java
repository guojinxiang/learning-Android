package com.niit.servicedemo2;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;

public class TestActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.test);
		
		//�õ�����
		NotificationManager notificationManager=
				(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
		
		//ȡ��֪ͨ
		notificationManager.cancel(1);
		
		
	}
}
