package biz.lungo.movietask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;


public class MovieActivity extends Activity {
    private static final String LOG_TAG = "Intent error";
    ImageView poster;
    TextView title;
    TextView genre;
    TextView country;
    TextView director;
    TextView actors;
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_movie);
        poster = (ImageView) findViewById(R.id.posterView);
        title = (TextView) findViewById(R.id.titleView);
        genre = (TextView) findViewById(R.id.genreView);
        country = (TextView) findViewById(R.id.countryView);
        director = (TextView) findViewById(R.id.directorView);
        actors = (TextView) findViewById(R.id.actorsView);
        description = (TextView) findViewById(R.id.descriptionView);
        Intent intent = getIntent();
        int posterImage = intent.getIntExtra("PosterImage", 0);
        String titleString = null;
        if (intent.hasExtra("Title")) {
            titleString = intent.getStringExtra("Title");
        }else{
            Log.e(LOG_TAG, "No Title");
        }
        String countryString = null;
        if (intent.hasExtra("Country")) {
            countryString = intent.getStringExtra("Country");
        }else{
            Log.e(LOG_TAG, "No Country");
        }
        String yearString = "0";
        if (intent.hasExtra("Year")) {
            yearString = intent.getStringExtra("Year");
        }else {
            Log.e(LOG_TAG, "No Year");
        }
        String genreString = "";
        if (intent.hasExtra("Genre")) {
            genreString = intent.getStringExtra("Genre");
        } else {
            Log.e(LOG_TAG, "No Genre");
        }
        String directorString = "";
        if (intent.hasExtra("Director")) {
            directorString = intent.getStringExtra("Director");
        } else {
            Log.e(LOG_TAG, "No Director");
        }
        String actorsString = "";
        if (intent.hasExtra("Actors")) {
            actorsString = intent.getStringExtra("Actors");
        } else {
            Log.e(LOG_TAG, "No Actors");
        }
        String descriptionString = "";
        if (intent.hasExtra("Description")) {
            descriptionString = intent.getStringExtra("Description");
        } else {
            Log.e(LOG_TAG, "No Description");
        }
        poster.setImageResource(posterImage);
        title.setText(titleString + " (" + yearString + ")");
        genre.setText(genreString);
        country.setText(countryString);
        director.setText(directorString);
        actors.setText(actorsString);
        description.setText(descriptionString);
    }
}