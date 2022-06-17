
package com.example.akulabhavishya.intentapplication;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class intent3 extends AppCompatActivity {
private EditText txtMobile;
private EditText txtMessage;
private Button btnSms;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_intent3);
txtMobile = (EditText)findViewById(R.id.mblTxt);
txtMessage = (EditText)findViewById(R.id.msgTxt);
btnSms = (Button)findViewById(R.id.btnSend);
btnSms.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent i = new Intent(Intent.ACTION_VIEW);
i.setData(Uri.parse(&quot;smsto:&quot;));
i.setType(&quot;vnd.android-dir/mms-sms&quot;);
i.putExtra(&quot;address&quot;, new String(txtMobile.getText().toString()));
i.putExtra(&quot;sms_body&quot;,txtMessage.getText().toString());
startActivity(Intent.createChooser(i, &quot;Send sms via:&quot;));
}
catch(Exception e){
Toast.makeText(intent3.this, &quot;SMS Failed to Send, Please try again&quot;,
Toast.LENGTH_SHORT).show();
}
}
});
}
}
