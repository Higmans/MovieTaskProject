package biz.lungo.movietask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;


public class MovieActivity extends Activity {
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
        String titleString = intent.getStringExtra("Title");
        String countryString = intent.getStringExtra("Country");
        String yearString = intent.getStringExtra("Year");
        String genreString = intent.getStringExtra("Genre");
        String directorString = intent.getStringExtra("Director");
        String actorsString = intent.getStringExtra("Actors");
        String descriptionString = intent.getStringExtra("Description");

        poster.setImageResource(posterImage);
        title.setText(titleString + " (" + yearString + ")");
        genre.setText(genreString);
        country.setText(countryString);
        director.setText(directorString);
        actors.setText(actorsString);
        description.setText(descriptionString);
    }
}