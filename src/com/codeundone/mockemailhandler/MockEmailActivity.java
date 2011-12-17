package com.codeundone.mockemailhandler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MockEmailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mock_email);
		
		Intent intent = getIntent();
		if (intent.hasExtra(Intent.EXTRA_EMAIL)) {
			EditText email = (EditText) findViewById(R.id.email);
			String[] emails = intent.getStringArrayExtra(Intent.EXTRA_EMAIL);
			StringBuilder sb = new StringBuilder();
			final int len = emails.length;
			for (int i = 0; i < len; i++) {
				String e = emails[i];
				sb.append(e);
				if (i < len-1)
					sb.append(", ");
			}
			email.setText(sb.toString());
		}
		
		if (intent.hasExtra(Intent.EXTRA_CC)) {
			EditText cc = (EditText) findViewById(R.id.cc);
			String[] emails = intent.getStringArrayExtra(Intent.EXTRA_CC);
			StringBuilder sb = new StringBuilder();
			final int len = emails.length;
			for (int i = 0; i < len; i++) {
				String e = emails[i];
				sb.append(e);
				if (i < len-1)
					sb.append(", ");
			}
			cc.setText(sb.toString());
		}
		
		if (intent.hasExtra(Intent.EXTRA_BCC)) {
			EditText bcc = (EditText) findViewById(R.id.bcc);
			String[] emails = intent.getStringArrayExtra(Intent.EXTRA_BCC);
			StringBuilder sb = new StringBuilder();
			final int len = emails.length;
			for (int i = 0; i < len; i++) {
				String e = emails[i];
				sb.append(e);
				if (i < len-1)
					sb.append(", ");
			}
			bcc.setText(sb.toString());
		}
		
		if (intent.hasExtra(Intent.EXTRA_SUBJECT)) {
			EditText subject = (EditText) findViewById(R.id.subject);
			subject.setText(intent.getStringExtra(Intent.EXTRA_SUBJECT));
		}
		
		if (intent.hasExtra(Intent.EXTRA_TEXT)) {
			EditText body = (EditText) findViewById(R.id.body);
			body.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
		}
			
	}
	
} 
