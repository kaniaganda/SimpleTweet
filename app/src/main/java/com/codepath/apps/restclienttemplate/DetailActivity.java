package com.codepath.apps.restclienttemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.apps.restclienttemplate.models.Tweet;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    ImageView ivProfileImage;
    TextView tvBody;
    TextView tvScreenName;
    TextView tvTimestamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivProfileImage = findViewById(R.id.ivProfileImage);
        tvBody = findViewById(R.id.tvBody);
        tvScreenName = findViewById(R.id.tvScreenName);
        tvTimestamp = findViewById(R.id.tvTimestamp);

        //Tweet tweet = Parcels.unwrap(getIntent().getParcelableExtra("tweet"));
        //tvScreenName.setText(tweet.getUser().screenName);
        //tvBody.setText(tweet.getBody());
        //tvTimestamp.setText(tweet.getCreatedAt());
        tvBody.setText(getIntent().getStringExtra("tvBody"));
        tvScreenName.setText(getIntent().getStringExtra("tvScreenName"));
        tvTimestamp.setText(getIntent().getStringExtra("tvTimestamp"));
    }
}