package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.aboutme.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/in/francisco-arellano-salazar/";
                Intent linkedin = new Intent(Intent.ACTION_VIEW);
                linkedin.setData(Uri.parse(url));
                startActivity(linkedin);
            }
        });
        binding.linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/in/francisco-arellano-salazar/";
                Intent linkedin = new Intent(Intent.ACTION_VIEW);
                linkedin.setData(Uri.parse(url));
                startActivity(linkedin);
            }
        });
        binding.imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://wa.me/56968969873";
                Intent whatsapp = new Intent(Intent.ACTION_VIEW);
                whatsapp.setData(Uri.parse(url));
                startActivity(whatsapp);
            }
        });
        binding.whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://wa.me/56968969873";
                Intent whatsapp = new Intent(Intent.ACTION_VIEW);
                whatsapp.setData(Uri.parse(url));
                startActivity(whatsapp);
            }
        });
        binding.imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/ArellanoFrancisco";
                Intent whatsapp = new Intent(Intent.ACTION_VIEW);
                whatsapp.setData(Uri.parse(url));
                startActivity(whatsapp);
            }
        });
        binding.github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/ArellanoFrancisco";
                Intent whatsapp = new Intent(Intent.ACTION_VIEW);
                whatsapp.setData(Uri.parse(url));
                startActivity(whatsapp);
            }
        });
        binding.imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = getString(R.string.toast);
                Toast.makeText(MainActivity2.this, message, Toast.LENGTH_LONG).show();
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast2 = getString(R.string.toast2);
                String content = binding.mail.getText().toString();
                if (!content.isEmpty()) {
                    sendEmail(content);
                } else {
                    Toast.makeText(MainActivity2.this,toast2, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void sendEmail(String mensaje){
        String myemail = getString(R.string.myemail);
        String toast3 = getString(R.string.toast3);
        Intent email = new Intent(Intent.ACTION_SEND);
        email.setType("text/plain");
        email.putExtra(Intent.EXTRA_EMAIL, new String[] {myemail});
        email.putExtra(Intent.EXTRA_SUBJECT, "Contacto");
        email.putExtra(Intent.EXTRA_TEXT, mensaje);
        try {
            startActivity(email);
            Log.i("EMAIL", "Sending email");
        }
        catch (android.content.ActivityNotFoundException e) {
            Toast.makeText(this, toast3, Toast.LENGTH_SHORT).show();
        }
    }
}