package com.example.mravi.collapsingtoolbar.branch;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mravi.collapsingtoolbar.MainActivity;
import com.example.mravi.collapsingtoolbar.R;
import com.example.mravi.collapsingtoolbar.Timer;
import com.example.mravi.collapsingtoolbar.branchIndividualActivities.CseActivity1;
import com.example.mravi.collapsingtoolbar.branchIndividualActivities.CseActivity2;
import com.example.mravi.collapsingtoolbar.branchIndividualActivities.CseActivity3;
import com.example.mravi.collapsingtoolbar.branchIndividualActivities.CseActivity4;
import com.example.mravi.collapsingtoolbar.branchIndividualActivities.CseActivity5;
import com.example.mravi.collapsingtoolbar.branchIndividualActivities.CseActivity6;
import com.example.mravi.collapsingtoolbar.branchIndividualActivities.CseActivity7;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;

/**
 * Created by mravi on 14-01-2018.
 */

public class CustomListAdapter   extends ArrayAdapter<Card> {

    private static final String TAG = "PersonListAdapter";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {

        TextView title;
        ImageView image;

        //regsrt nd rdmre

        Button register;
        Button readmore;


        //nd of rg nd rmr

    }


    public CustomListAdapter(Context context, int resource, ArrayList<Card> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        //sets up the image loader library
        setupImageLoader();

        //get the persons information
        String title= getItem(position).getTitle();

        String imgUrl = getItem(position).getImgUrl();

        //regiser and read more
        String  readmore=getItem(position).getReadmore();
        String register=getItem(position).getRegister();
        //register and read more end


        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
           holder.title= (TextView) convertView.findViewById(R.id.cardTitle);

          holder.readmore=(Button)convertView.findViewById(R.id.readmore);
            holder.register=(Button)convertView.findViewById(R.id.register);

            holder.image = (ImageView) convertView.findViewById(R.id.cardImage);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView v=(TextView)view.findViewById(R.id.cardTitle);
                if(position==0){
                    go1();
                }

                if(position==1) {
                    go2();
                     Toast.makeText(mContext, "ravi tjea dfkjadlfadlkfajf" , Toast.LENGTH_SHORT).show();
                 }
                 if(position==2){
                  go3();

                 }
                 if(position==3){
                     go4();
                 }
                 if(position==4){
                     go5();
                 }


                if(position==5){
                    go6();
                }


                if(position==6){
                    go7();
                }

                if(position==7){
                    go8();
                }

                 }
        });



        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;

        holder.title.setText(title);
holder.readmore.setText(readmore);
holder.register.setText(register);
        //create the imageloader object
        ImageLoader imageLoader = ImageLoader.getInstance();

        int defaultImage = mContext.getResources().getIdentifier("@drawable/image_failed",null,mContext.getPackageName());

        //create display options
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .showImageOnLoading(defaultImage).build();

        //download and display image from url
        imageLoader.displayImage(imgUrl, holder.image, options);





        return convertView;
    }

    private void go7(){
        Intent i=new Intent(mContext,CseActivity6.class);
        mContext.startActivity(i);

    }

    private void go8() {

        Intent i=new Intent(mContext,CseActivity7.class);
        mContext.startActivity(i);

    }

    private void go6() {
        Intent i=new Intent(mContext,CseActivity5.class);
        mContext.startActivity(i);


    }

    private void go5() {

        Intent i=new Intent(mContext,CseActivity4.class);
        mContext.startActivity(i);


    }

    private void go3() {
        Intent i=new Intent(mContext,CseActivity2.class);
        mContext.startActivity(i);

        Toast.makeText(mContext, "card 3", Toast.LENGTH_SHORT).show();
    }

    private void go1() {


        Intent i=new Intent(mContext,CseActivity1.class);
        mContext.startActivity(i);

        Toast.makeText(mContext, "card 0", Toast.LENGTH_SHORT).show();
    }


    private void go2() {
     Intent i=new Intent(mContext,CseActivity2.class);
        mContext.startActivity(i);
    }


    private void go4(){
        Intent i=new Intent(mContext,CseActivity4.class);
        mContext.startActivity(i);

        Toast.makeText(mContext, "card 4", Toast.LENGTH_SHORT).show();

    }


    /**
     * Required for setting up the Universal Image loader Library
     */
    private void setupImageLoader(){
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }


}