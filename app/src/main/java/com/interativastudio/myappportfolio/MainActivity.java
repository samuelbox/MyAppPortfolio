package com.interativastudio.myappportfolio;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPopularMovies = (Button)findViewById(R.id.btn_popular_movies);
        btnPopularMovies.setOnClickListener(this);

        Button btnStockHawk = (Button)findViewById(R.id.btn_stock_hawk);
        btnStockHawk.setOnClickListener(this);

        Button btnBuildItBigger = (Button)findViewById(R.id.btn_build_it_bigger);
        btnBuildItBigger.setOnClickListener(this);

        Button btnMakeMaterial = (Button)findViewById(R.id.btn_make_material);
        btnMakeMaterial.setOnClickListener(this);

        Button btnGoObiquitous = (Button)findViewById(R.id.btn_go_obiquitous);
        btnGoObiquitous.setOnClickListener(this);

        Button btnCapstone = (Button)findViewById(R.id.btn_capstone);
        btnCapstone.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_popular_movies:
                showMessage(getString(R.string.msg_popular_movies));
                break;

            case R.id.btn_stock_hawk:
                showMessage(getString(R.string.msg_stock_hawk));
                break;

            case R.id.btn_build_it_bigger:
                showMessage(getString(R.string.msg_build_it_bigger));
                break;

            case R.id.btn_make_material:
                showMessage(getString(R.string.msg_make_material));
                break;

            case R.id.btn_go_obiquitous:
                showMessage(getString(R.string.msg_go_obiquitous));
                break;

            case R.id.btn_capstone:
                showMessage(getString(R.string.msg_capstone));
                break;

            default:
                break;
        }

    }

    /**
     * This method shows a Toast to the user.
     *
     * @param  mtext  a String that contains a message
     */

     private void showMessage(String mtext){
        Toast toast = Toast.makeText(getApplicationContext(),mtext,Toast.LENGTH_LONG );
        toast.show();
    }
}
