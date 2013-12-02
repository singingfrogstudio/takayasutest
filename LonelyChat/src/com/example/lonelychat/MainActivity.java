package com.example.lonelychat;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.content.DialogInterface;
//import android.speech.tts.TextToSpeech;
//import android.speech.tts.TextToSpeech.OnInitListener;
//import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
//import android.view.Menu;
//import android.widget.Spinner;

public class MainActivity extends Activity implements OnClickListener {

	String txt = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		TextView textview1 = (TextView)findViewById(R.id.TextView01);
		TextView textview2 = (TextView)findViewById(R.id.TextView02);
		TextView textview3 = (TextView)findViewById(R.id.TextView03);
		TextView textview4 = (TextView)findViewById(R.id.TextView04);
		TextView textview5 = (TextView)findViewById(R.id.TextView05);
		TextView textview6 = (TextView)findViewById(R.id.TextView06);
		TextView textview7 = (TextView)findViewById(R.id.TextView07);
		TextView textview8 = (TextView)findViewById(R.id.TextView08);
		TextView textview9 = (TextView)findViewById(R.id.TextView09);
		TextView textview10 = (TextView)findViewById(R.id.TextView10);
		
		String txt9 = textview9.getText().toString();
		textview10.setText(txt9);
		
		String txt8 = textview8.getText().toString();
		textview9.setText(txt8);
		
		String txt7 = textview7.getText().toString();
		textview8.setText(txt7);
		
		String txt6 = textview6.getText().toString();
		textview7.setText(txt6);
		
		String txt5 = textview5.getText().toString();
		textview6.setText(txt5);
		
		String txt4 = textview4.getText().toString();
		textview5.setText(txt4);
		
		String txt3 = textview3.getText().toString();
		textview4.setText(txt3);
		
		String txt2 = textview2.getText().toString();
		textview3.setText(txt2);
		
		String txt1 = textview1.getText().toString();
		textview2.setText(txt1);
		
		EditText edit = (EditText)findViewById(R.id.editText1);
		txt = edit.getText().toString();
		
		textview1.setText(txt);
		
	}
	
}
