package com.happytrees.distancebetweentwopoints;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
float [] results = new float[5];//reminder : new float [5] means results array has five members.meaning last member will be results[4] cause first member in array is zero

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double latitude1 =31.9614843;
       double latitude2 =  31.9563457;
        double longitude1 = 34.8815636;
       double longitude2 = 34.8981207;



        //method calculates distances between two points according to their latitude and longitude
       Location.distanceBetween(latitude1,longitude1,latitude2,longitude2,results);// IN METERS


            Log.e("distance",results[0] + " meters ");//you always need first one ([0]) the rest([1],[2].[3]..)  is irrelevant.make your array any number bigger than 10


    }
}
