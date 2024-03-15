package com.example.pethormony;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

        public class MainActivity extends AppCompatActivity {

            private TextView textViewTitle;
            private ImageView imageViewProfilePicture;
            private EditText editTextName;
            private EditText editTextEmail;
            private EditText editTextPhoneNumber;
            private Button buttonEditProfile;
            private Button buttonChangePassword;
            private Button buttonSignOut;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.pet_profile_screen);

                textViewTitle = findViewById(R.id.textViewTitle);
                imageViewProfilePicture = findViewById(R.id.imageViewProfilePicture);
                editTextName = findViewById(R.id.editTextName);
                editTextEmail = findViewById(R.id.editTextEmail);
                editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
                buttonEditProfile = findViewById(R.id.buttonEditProfile);
                buttonChangePassword = findViewById(R.id.buttonChangePassword);
                buttonSignOut = findViewById(R.id.buttonSignOut);

                // Add your logic here, such as setting click listeners, etc.
            }
        }

