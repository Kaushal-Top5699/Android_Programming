/* Author: Kaushal Topinkatti B
   Date: 23/05/2017
   Title: Android App for beginners that plays animations
*/
package com.example.trans__elcapitan.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, Animation.AnimationListener {

    //Animation Varialbes
    Animation animFadeIn;
    Animation animFadeOut;
    Animation animFadeInOut;

    Animation animLeftRight;
    Animation animRightLeft;
    Animation animTopBottom;

    Animation animBounce;
    Animation animFlash;

    Animation animRotateLeft;
    Animation animRotateRight;

    //UI Variables and give reference to UI

    ImageView imageView;
    TextView textStatus;

    Button btnFadeIn;
    Button btnFadeOut;
    Button btnFadeInOut;

    Button leftRight;
    Button rightLeft;
    Button topBottom;
    Button bounce;
    Button flash;
    Button rotateLeft;
    Button rotateRight;

    //seekBar Variables
    SeekBar seekBarSpeed;
    TextView textSeekerSpeed;

    int seekSpeedProgress;

    //Default things do not change this, it is onCreate() method which actually start your application
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadAnimations(); //call loadAnimaton() method
        loadUI();  //call loadUI() method
    }

    //Start coding loadAnimations() method
    private void loadAnimations() {

        //use the Animation variables declared above to get reference to particular UI or widget
        //here I am are using AnimationUtils.loadAnimation which is specially used for Animations
        animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        animFadeInOut = AnimationUtils.loadAnimation(this, R.anim.fade_in_out);

        animLeftRight = AnimationUtils.loadAnimation(this, R.anim.left_right);
        animRightLeft = AnimationUtils.loadAnimation(this, R.anim.right_left);
        animTopBottom = AnimationUtils.loadAnimation(this, R.anim.top_bot);

        animBounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        animFlash = AnimationUtils.loadAnimation(this, R.anim.flash);

        animRotateLeft = AnimationUtils.loadAnimation(this, R.anim.rotate_left);
        animRotateRight = AnimationUtils.loadAnimation(this, R.anim.rotate_right);
    }

    //Start coding loadUI() method
    private void loadUI() {

        //Here I am initializing or giving reference to our variables of UI of xml using findViewById()
        imageView = (ImageView) findViewById(R.id.imageView);
        textStatus = (TextView) findViewById(R.id.textStatus);

        btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
        btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
        btnFadeInOut = (Button) findViewById(R.id.btnFadeInOut);

        leftRight = (Button) findViewById(R.id.btnLeftRight);
        rightLeft = (Button) findViewById(R.id.btnRightLeft);
        topBottom = (Button) findViewById(R.id.btnTopBottom);

        bounce = (Button) findViewById(R.id.btnBounce);
        flash = (Button) findViewById(R.id.btnFlash);

        rotateLeft = (Button) findViewById(R.id.btnRotateLeft);
        rotateRight = (Button) findViewById(R.id.btnRotateRight);

        //Say, setting all the buttons or calling setOnClickListener method for every button
        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnFadeInOut.setOnClickListener(this);
        leftRight.setOnClickListener(this);
        rightLeft.setOnClickListener(this);
        topBottom.setOnClickListener(this);
        bounce.setOnClickListener(this);
        flash.setOnClickListener(this);
        rotateLeft.setOnClickListener(this);
        rotateRight.setOnClickListener(this);

        //setting the seekBar using the two defined variables of seekBar
        seekBarSpeed = (SeekBar) findViewById(R.id.seekBarSpeed);
        textSeekerSpeed = (TextView) findViewById(R.id.textSeekerSpeed);

        //Here I am using or overriding methods of setOnSeekBarChangeListener
        seekBarSpeed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int value, boolean fromUser) {
                seekSpeedProgress = value;
                textSeekerSpeed.setText(" " +seekSpeedProgress+" of "+seekBarSpeed.getMax());// set the seekBar max property in xml to max
                                                                                            //value of say,5000 then in java set the seekBar
                                                                                            //such that it start from 0 and ends at 5000
                                                                                            //after setting it the code will look like this.
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //leave this blank, I'll be implementing these in my next tutorial
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //leave this blank, I'll be implementing these in my next tutorial
            }
        });
    }

    // Now in onClick overriden method I have used switch and case statments to recognize which button is clicked or tapped
    //get reference to tapped button using R.id.your_button_name
    //then use animation inbuilt methods like duration of animation as shown below
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFadeIn:
                animFadeIn.setDuration(seekSpeedProgress);// in duration method pass the parameter as seekSpeedProgress, so that
                                                            //duration is set according to the seekBar value
                animFadeIn.setAnimationListener(this);
                imageView.startAnimation(animFadeIn);
                break;

            case R.id.btnFadeOut:
                animFadeOut.setDuration(seekSpeedProgress);
                animFadeOut.setAnimationListener(this);
                imageView.startAnimation(animFadeOut);
                break;

            case R.id.btnFadeInOut:
                animFadeInOut.setDuration(seekSpeedProgress);
                animFadeInOut.setAnimationListener(this);
                imageView.startAnimation(animFadeInOut);
                break;

            case R.id.btnLeftRight:
                animLeftRight.setDuration(seekSpeedProgress);
                animLeftRight.setAnimationListener(this);
                imageView.startAnimation(animLeftRight);
                break;

            case R.id.btnRightLeft:
                animRightLeft.setDuration(seekSpeedProgress);
                animRightLeft.setAnimationListener(this);
                imageView.startAnimation(animRightLeft);
                break;

            case R.id.btnTopBottom:
                animTopBottom.setDuration(seekSpeedProgress);
                animTopBottom.setAnimationListener(this);
                imageView.startAnimation(animTopBottom);
                break;

            case R.id.btnBounce:
                 /* Divide seekSpeedProgress by 10 because with the seekBar having a max
                    value of 5000 it will make the animations range between almost instant
                    and half second 5000/10 = 500 milliseconds */
                animBounce.setDuration(seekSpeedProgress/10);
                animBounce.setAnimationListener(this);
                imageView.startAnimation(animBounce);
                break;

            case R.id.btnFlash:
                animFlash.setDuration(seekSpeedProgress/10);
                animFlash.setAnimationListener(this);
                imageView.startAnimation(animFlash);
                break;

            case R.id.btnRotateLeft:
                animRotateLeft.setDuration(seekSpeedProgress);
                animRotateLeft.setAnimationListener(this);
                imageView.startAnimation(animRotateLeft);
                break;

            case R.id.btnRotateRight:
                animRotateRight.setDuration(seekSpeedProgress);
                animRotateRight.setAnimationListener(this);
                imageView.startAnimation(animRotateRight);
                break;
        }
    }

    // finally implement the three methods of animation just check weather our animation is working or not
    @Override
    public void onAnimationStart(Animation animation) {
        textStatus.setText("RUNNING");

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        textStatus.setText("STOPPED");
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
