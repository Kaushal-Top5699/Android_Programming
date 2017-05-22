{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf810
{\fonttbl\f0\fnil\fcharset0 Menlo-Italic;\f1\fnil\fcharset0 Menlo-Bold;\f2\fnil\fcharset0 Menlo-Regular;
\f3\fnil\fcharset0 Menlo-BoldItalic;}
{\colortbl;\red255\green255\blue255;\red128\green128\blue128;\red0\green0\blue128;\red102\green14\blue122;
\red128\green128\blue0;\red0\green128\blue0;\red0\green0\blue255;}
{\*\expandedcolortbl;;\csgenericrgb\c50196\c50196\c50196;\csgenericrgb\c0\c0\c50196;\csgenericrgb\c40000\c5490\c47843;
\csgenericrgb\c50196\c50196\c0;\csgenericrgb\c0\c50196\c0;\csgenericrgb\c0\c0\c100000;}
\paperw11900\paperh16840\margl1440\margr1440\vieww15140\viewh9500\viewkind0
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f0\i\fs24 \cf2 /* Author: Kaushal Topinkatti B\uc0\u8232    Date: 23/05/2017\u8232    Title: Android App for beginners that plays animations\u8232 */\u8232 
\f1\i0\b \cf3 package 
\f2\b0 \cf0 com.example.trans__elcapitan.seekbar;\uc0\u8232 \u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.support.v7.app.AppCompatActivity;\uc0\u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.os.Bundle;\uc0\u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.view.View;\uc0\u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.view.animation.Animation;\uc0\u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.view.animation.AnimationUtils;\uc0\u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.widget.Button;\uc0\u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.widget.ImageView;\uc0\u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.widget.SeekBar;\uc0\u8232 
\f1\b \cf3 import 
\f2\b0 \cf0 android.widget.TextView;\uc0\u8232 \u8232 
\f1\b \cf3 public class 
\f2\b0 \cf0 MainActivity 
\f1\b \cf3 extends 
\f2\b0 \cf0 AppCompatActivity\uc0\u8232         
\f1\b \cf3 implements 
\f2\b0 \cf0 View.OnClickListener, Animation.AnimationListener \{\uc0\u8232 \u8232     
\f0\i \cf2 //Animation Varialbes\uc0\u8232     
\f2\i0 \cf0 Animation 
\f1\b \cf4 animFadeIn
\f2\b0 \cf0 ;\uc0\u8232     Animation 
\f1\b \cf4 animFadeOut
\f2\b0 \cf0 ;\uc0\u8232     Animation 
\f1\b \cf4 animFadeInOut
\f2\b0 \cf0 ;\uc0\u8232 \u8232     Animation 
\f1\b \cf4 animLeftRight
\f2\b0 \cf0 ;\uc0\u8232     Animation 
\f1\b \cf4 animRightLeft
\f2\b0 \cf0 ;\uc0\u8232     Animation 
\f1\b \cf4 animTopBottom
\f2\b0 \cf0 ;\uc0\u8232 \u8232     Animation 
\f1\b \cf4 animBounce
\f2\b0 \cf0 ;\uc0\u8232     Animation 
\f1\b \cf4 animFlash
\f2\b0 \cf0 ;\uc0\u8232 \u8232     Animation 
\f1\b \cf4 animRotateLeft
\f2\b0 \cf0 ;\uc0\u8232     Animation 
\f1\b \cf4 animRotateRight
\f2\b0 \cf0 ;\uc0\u8232 \u8232     
\f0\i \cf2 //UI Variables and give reference to UI\uc0\u8232 \u8232     
\f2\i0 \cf0 ImageView 
\f1\b \cf4 imageView
\f2\b0 \cf0 ;\uc0\u8232     TextView 
\f1\b \cf4 textStatus
\f2\b0 \cf0 ;\uc0\u8232 \u8232     Button 
\f1\b \cf4 btnFadeIn
\f2\b0 \cf0 ;\uc0\u8232     Button 
\f1\b \cf4 btnFadeOut
\f2\b0 \cf0 ;\uc0\u8232     Button 
\f1\b \cf4 btnFadeInOut
\f2\b0 \cf0 ;\uc0\u8232 \u8232     Button 
\f1\b \cf4 leftRight
\f2\b0 \cf0 ;\uc0\u8232     Button 
\f1\b \cf4 rightLeft
\f2\b0 \cf0 ;\uc0\u8232     Button 
\f1\b \cf4 topBottom
\f2\b0 \cf0 ;\uc0\u8232     Button 
\f1\b \cf4 bounce
\f2\b0 \cf0 ;\uc0\u8232     Button 
\f1\b \cf4 flash
\f2\b0 \cf0 ;\uc0\u8232     Button 
\f1\b \cf4 rotateLeft
\f2\b0 \cf0 ;\uc0\u8232     Button 
\f1\b \cf4 rotateRight
\f2\b0 \cf0 ;\uc0\u8232 \u8232     
\f0\i \cf2 //seekBar Variables\uc0\u8232     
\f2\i0 \cf0 SeekBar 
\f1\b \cf4 seekBarSpeed
\f2\b0 \cf0 ;\uc0\u8232     TextView 
\f1\b \cf4 textSeekerSpeed
\f2\b0 \cf0 ;\uc0\u8232 \u8232     
\f1\b \cf3 int \cf4 seekSpeedProgress
\f2\b0 \cf0 ;\uc0\u8232 \u8232     
\f0\i \cf2 //Default things do not change this, it is onCreate() method which actually start your application\uc0\u8232     
\f2\i0 \cf5 @Override\uc0\u8232     
\f1\b \cf3 protected void 
\f2\b0 \cf0 onCreate(Bundle savedInstanceState) \{\uc0\u8232         
\f1\b \cf3 super
\f2\b0 \cf0 .onCreate(savedInstanceState);\uc0\u8232         setContentView(R.layout.
\f3\i\b \cf4 activity_main
\f2\i0\b0 \cf0 );\uc0\u8232         loadAnimations(); 
\f0\i \cf2 //call loadAnimaton() method\uc0\u8232         
\f2\i0 \cf0 loadUI();  
\f0\i \cf2 //call loadUI() method\uc0\u8232     
\f2\i0 \cf0 \}\uc0\u8232 \u8232     
\f0\i \cf2 //Start coding loadAnimations() method\uc0\u8232     
\f1\i0\b \cf3 private void 
\f2\b0 \cf0 loadAnimations() \{\uc0\u8232 \u8232         
\f0\i \cf2 //use the Animation variables declared above to get reference to particular UI or widget\uc0\u8232         //here I am are using AnimationUtils.loadAnimation which is specially used for Animations\u8232         
\f1\i0\b \cf4 animFadeIn 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 fade_in
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 animFadeOut 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 fade_out
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 animFadeInOut 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 fade_in_out
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f1\b \cf4 animLeftRight 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 left_right
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 animRightLeft 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 right_left
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 animTopBottom 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 top_bot
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f1\b \cf4 animBounce 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 bounce
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 animFlash 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 flash
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f1\b \cf4 animRotateLeft 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 rotate_left
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 animRotateRight 
\f2\b0 \cf0 = AnimationUtils.
\f0\i loadAnimation
\f2\i0 (
\f1\b \cf3 this
\f2\b0 \cf0 , R.anim.
\f3\i\b \cf4 rotate_right
\f2\i0\b0 \cf0 );\uc0\u8232     \}\u8232 \u8232     
\f0\i \cf2 //Start coding loadUI() method\uc0\u8232     
\f1\i0\b \cf3 private void 
\f2\b0 \cf0 loadUI() \{\uc0\u8232 \u8232         
\f0\i \cf2 //Here I am initializing or giving reference to our variables of UI of xml using findViewById()\uc0\u8232         
\f1\i0\b \cf4 imageView 
\f2\b0 \cf0 = (ImageView) findViewById(R.id.
\f3\i\b \cf4 imageView
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 textStatus 
\f2\b0 \cf0 = (TextView) findViewById(R.id.
\f3\i\b \cf4 textStatus
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f1\b \cf4 btnFadeIn 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnFadeIn
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 btnFadeOut 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnFadeOut
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 btnFadeInOut 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnFadeInOut
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f1\b \cf4 leftRight 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnLeftRight
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 rightLeft 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnRightLeft
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 topBottom 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnTopBottom
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f1\b \cf4 bounce 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnBounce
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 flash 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnFlash
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f1\b \cf4 rotateLeft 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnRotateLeft
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 rotateRight 
\f2\b0 \cf0 = (Button) findViewById(R.id.
\f3\i\b \cf4 btnRotateRight
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f0\i \cf2 //Say, setting all the buttons or calling setOnClickListener method for every button\uc0\u8232         
\f1\i0\b \cf4 btnFadeIn
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 btnFadeOut
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 btnFadeInOut
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 leftRight
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 rightLeft
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 topBottom
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 bounce
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 flash
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 rotateLeft
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 rotateRight
\f2\b0 \cf0 .setOnClickListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232 \u8232         
\f0\i \cf2 //setting the seekBar using the two defined variables of seekBar\uc0\u8232         
\f1\i0\b \cf4 seekBarSpeed 
\f2\b0 \cf0 = (SeekBar) findViewById(R.id.
\f3\i\b \cf4 seekBarSpeed
\f2\i0\b0 \cf0 );\uc0\u8232         
\f1\b \cf4 textSeekerSpeed 
\f2\b0 \cf0 = (TextView) findViewById(R.id.
\f3\i\b \cf4 textSeekerSpeed
\f2\i0\b0 \cf0 );\uc0\u8232 \u8232         
\f0\i \cf2 //Here I am using or overriding methods of setOnSeekBarChangeListener\uc0\u8232         
\f1\i0\b \cf4 seekBarSpeed
\f2\b0 \cf0 .setOnSeekBarChangeListener(
\f1\b \cf3 new 
\f2\b0 \cf0 SeekBar.OnSeekBarChangeListener() \{\uc0\u8232             \cf5 @Override\uc0\u8232             
\f1\b \cf3 public void 
\f2\b0 \cf0 onProgressChanged(SeekBar seekBar, 
\f1\b \cf3 int 
\f2\b0 \cf0 value, 
\f1\b \cf3 boolean 
\f2\b0 \cf0 fromUser) \{\uc0\u8232                 
\f1\b \cf4 seekSpeedProgress 
\f2\b0 \cf0 = value;\uc0\u8232                 
\f1\b \cf4 textSeekerSpeed
\f2\b0 \cf0 .setText(
\f1\b \cf6 " " 
\f2\b0 \cf0 +
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 +
\f1\b \cf6 " of "
\f2\b0 \cf0 +
\f1\b \cf4 seekBarSpeed
\f2\b0 \cf0 .getMax());
\f0\i \cf2 // set the seekBar max property in xml to max\uc0\u8232                                                                                             //value of say,5000 then in java set the seekBar\u8232                                                                                             //such that it start from 0 and ends at 5000\u8232                                                                                             //after setting it the code will look like this.\u8232             
\f2\i0 \cf0 \}\uc0\u8232 \u8232             \cf5 @Override\uc0\u8232             
\f1\b \cf3 public void 
\f2\b0 \cf0 onStartTrackingTouch(SeekBar seekBar) \{\uc0\u8232                 
\f0\i \cf2 //leave this blank, I'll be implementing these in my next tutorial\uc0\u8232             
\f2\i0 \cf0 \}\uc0\u8232 \u8232             \cf5 @Override\uc0\u8232             
\f1\b \cf3 public void 
\f2\b0 \cf0 onStopTrackingTouch(SeekBar seekBar) \{\uc0\u8232                 
\f0\i \cf2 //leave this blank, I'll be implementing these in my next tutorial\uc0\u8232             
\f2\i0 \cf0 \}\uc0\u8232         \});\u8232     \}\u8232 \u8232     
\f0\i \cf2 // Now in onClick overriden method I have used switch and case statments to recognize which button is clicked or tapped\uc0\u8232     //get reference to tapped button using R.id.your_button_name\u8232     //then use animation inbuilt methods like duration of animation as shown below\u8232     
\f2\i0 \cf5 @Override\uc0\u8232     
\f1\b \cf3 public void 
\f2\b0 \cf0 onClick(View v) \{\uc0\u8232         
\f1\b \cf3 switch 
\f2\b0 \cf0 (v.getId()) \{\uc0\u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnFadeIn
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animFadeIn
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 );
\f0\i \cf2 // in duration method pass the parameter as seekSpeedProgress, so that\uc0\u8232                                                             //duration is set according to the seekBar value\u8232                 
\f1\i0\b \cf4 animFadeIn
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animFadeIn
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnFadeOut
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animFadeOut
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 animFadeOut
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animFadeOut
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnFadeInOut
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animFadeInOut
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 animFadeInOut
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animFadeInOut
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnLeftRight
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animLeftRight
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 animLeftRight
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animLeftRight
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnRightLeft
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animRightLeft
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 animRightLeft
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animRightLeft
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnTopBottom
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animTopBottom
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 animTopBottom
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animTopBottom
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnBounce
\f2\i0\b0 \cf0 :\uc0\u8232                  
\f0\i \cf2 /* Divide seekSpeedProgress by 10 because with the seekBar having a max\uc0\u8232                     value of 5000 it will make the animations range between almost instant\u8232                     and half second 5000/10 = 500 milliseconds */\u8232                 
\f1\i0\b \cf4 animBounce
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 /\cf7 10\cf0 );\uc0\u8232                 
\f1\b \cf4 animBounce
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animBounce
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnFlash
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animFlash
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 /\cf7 10\cf0 );\uc0\u8232                 
\f1\b \cf4 animFlash
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animFlash
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnRotateLeft
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animRotateLeft
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 animRotateLeft
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animRotateLeft
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232 \u8232             
\f1\b \cf3 case 
\f2\b0 \cf0 R.id.
\f3\i\b \cf4 btnRotateRight
\f2\i0\b0 \cf0 :\uc0\u8232                 
\f1\b \cf4 animRotateRight
\f2\b0 \cf0 .setDuration(
\f1\b \cf4 seekSpeedProgress
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 animRotateRight
\f2\b0 \cf0 .setAnimationListener(
\f1\b \cf3 this
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf4 imageView
\f2\b0 \cf0 .startAnimation(
\f1\b \cf4 animRotateRight
\f2\b0 \cf0 );\uc0\u8232                 
\f1\b \cf3 break
\f2\b0 \cf0 ;\uc0\u8232         \}\u8232     \}\u8232 \u8232     
\f0\i \cf2 // finally implement the three methods of animation just check weather our animation is working or not\uc0\u8232     
\f2\i0 \cf5 @Override\uc0\u8232     
\f1\b \cf3 public void 
\f2\b0 \cf0 onAnimationStart(Animation animation) \{\uc0\u8232         
\f1\b \cf4 textStatus
\f2\b0 \cf0 .setText(
\f1\b \cf6 "RUNNING"
\f2\b0 \cf0 );\uc0\u8232 \u8232     \}\u8232 \u8232     \cf5 @Override\uc0\u8232     
\f1\b \cf3 public void 
\f2\b0 \cf0 onAnimationEnd(Animation animation) \{\uc0\u8232         
\f1\b \cf4 textStatus
\f2\b0 \cf0 .setText(
\f1\b \cf6 "STOPPED"
\f2\b0 \cf0 );\uc0\u8232     \}\u8232 \u8232     \cf5 @Override\uc0\u8232     
\f1\b \cf3 public void 
\f2\b0 \cf0 onAnimationRepeat(Animation animation) \{\uc0\u8232 \u8232     \}\u8232 \}\u8232 \
}
