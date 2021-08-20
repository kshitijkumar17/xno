package com.mmcorp.xno;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.InterstitialAd;
import com.mopub.common.MoPub;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.SdkInitializationListener;
import com.mopub.mobileads.MoPubView;
import com.polyak.iconswitch.IconSwitch;
import com.google.android.gms.ads.AdRequest;


public class MainActivity extends AppCompatActivity {

    int i=1;
    private MoPubView moPubView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SdkConfiguration.Builder sdkConfiguration = new SdkConfiguration.Builder("b195f8dd8ded45fe847ad89ed1d016da");
        MoPub.initializeSdk(this, sdkConfiguration.build(), initSdkListener());

        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        RelativeLayout resultDialog = (RelativeLayout) findViewById(R.id.dialog_layout);
        TextView turn_teller = findViewById(R.id.turn_teller_text);
        TextView title_app = findViewById(R.id.app_title);
        TextView resultText = findViewById(R.id.dialog_info);

        ViewDialog alert = new ViewDialog();

//        if(i==5){
//            if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
//                alert.showDialog(MainActivity.this, "X wins");
//            }
//        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1_func();
            }
            private void b1_func() {
                if(i%2!=0){
                    b1.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b1.setText("O");
                    turn_teller.setText("X's turn");
                }
                b1.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2_func();
            }
            private void b2_func() {
                if(i%2!=0){
                    b2.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b2.setText("O");
                    turn_teller.setText("X's turn");
                }
                b2.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3_func();
            }
            private void b3_func() {
                if(i%2!=0){
                    b3.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b3.setText("O");
                    turn_teller.setText("X's turn");
                }
                b3.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4_func();
            }
            private void b4_func() {
                if(i%2!=0){
                    b4.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b4.setText("O");
                    turn_teller.setText("X's turn");
                }
                b4.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5_func();
            }
            private void b5_func() {
                if(i%2!=0){
                    b5.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b5.setText("O");
                    turn_teller.setText("X's turn");
                }
                b5.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6_func();
            }
            private void b6_func() {
                if(i%2!=0){
                    b6.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b6.setText("O");
                    turn_teller.setText("X's turn");
                }
                b6.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7_func();
            }
            private void b7_func() {
                if(i%2!=0){
                    b7.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b7.setText("O");
                    turn_teller.setText("X's turn");
                }
                b7.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8_func();
            }
            private void b8_func() {
                if(i%2!=0){
                    b8.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b8.setText("O");
                    turn_teller.setText("X's turn");
                }
                b8.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9_func();
            }
            private void b9_func() {
                if(i%2!=0){
                    b9.setText("X");
                    turn_teller.setText("O's turn");
                }
                else{
                    b9.setText("O");
                    turn_teller.setText("X's turn");
                }
                b9.setEnabled(false);
                if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="X"){
                    alert.showDialog(MainActivity.this, "X wins");
                }
                else if(b1.getText()==b2.getText() && b1.getText()==b3.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b4.getText()==b5.getText() && b4.getText()==b6.getText() && b4.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b7.getText()==b8.getText() && b7.getText()==b9.getText() && b7.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b4.getText() && b1.getText()==b7.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b2.getText()==b5.getText() && b2.getText()==b8.getText() && b2.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b6.getText() && b3.getText()==b9.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b1.getText()==b5.getText() && b1.getText()==b9.getText() && b1.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(b3.getText()==b5.getText() && b3.getText()==b7.getText() && b3.getText()=="O"){
                    alert.showDialog(MainActivity.this, "O wins");
                }
                else if(!b1.isEnabled()  && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
                    alert.showDialog(MainActivity.this, "Match Drawn");
                }
                i++;
            }
        });


        Button bt_restart = findViewById(R.id.button_restart);
        bt_restart.setOnClickListener(view -> {
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            turn_teller.setText("X's turn");
            i=1;
        });

        IconSwitch iconSwitch = findViewById(R.id.iconSwitch);
        iconSwitch.setCheckedChangeListener(new IconSwitch.CheckedChangeListener() {
            @Override
            public void onCheckChanged(IconSwitch.Checked current) {
                switch (current) {
                    case LEFT:
                        findViewById(R.id.main_page).setBackgroundColor(0xFFFFFFFF);
                        title_app.setTextColor(0xFF323232);
                        turn_teller.setTextColor(0xFF323232);
                        b1.setBackground(getResources().getDrawable(R.drawable.grid_topleft_light));
                        b3.setBackground(getResources().getDrawable(R.drawable.grid_topright_light));
                        b7.setBackground(getResources().getDrawable(R.drawable.grid_bottomleft_light));
                        b9.setBackground(getResources().getDrawable(R.drawable.grid_bottomright_light));
                        b2.setBackground(getResources().getDrawable(R.drawable.grid_light));
                        b4.setBackground(getResources().getDrawable(R.drawable.grid_light));
                        b5.setBackground(getResources().getDrawable(R.drawable.grid_light));
                        b6.setBackground(getResources().getDrawable(R.drawable.grid_light));
                        b8.setBackground(getResources().getDrawable(R.drawable.grid_light));
                        b1.setTextColor(0xFF323232);
                        b2.setTextColor(0xFF323232);
                        b3.setTextColor(0xFF323232);
                        b4.setTextColor(0xFF323232);
                        b5.setTextColor(0xFF323232);
                        b6.setTextColor(0xFF323232);
                        b7.setTextColor(0xFF323232);
                        b8.setTextColor(0xFF323232);
                        b9.setTextColor(0xFF323232);
//                        resultDialog.setBackground(getResources().getDrawable(R.drawable.dialog_bg_light));
//                        resultText.setTextColor(0xFF323232);
   //                     findViewById(R.id.dialog_layout).setBackground(getResources().getDrawable(R.drawable.dialog_bg_light));
   //                     result_text.setTextColor(0xFF323232);
                        break;
                    case RIGHT:
                        findViewById(R.id.main_page).setBackgroundColor(0xFF121212);
                        title_app.setTextColor(0xFFFFFFFF);
                        turn_teller.setTextColor(0xFFFFFFFF);
                        b1.setBackground(getResources().getDrawable(R.drawable.grid_topleft_dark));
                        b3.setBackground(getResources().getDrawable(R.drawable.grid_topright_dark));
                        b7.setBackground(getResources().getDrawable(R.drawable.grid_bottomleft_dark));
                        b9.setBackground(getResources().getDrawable(R.drawable.grid_bottomright_dark));
                        b2.setBackground(getResources().getDrawable(R.drawable.grid_dark));
                        b4.setBackground(getResources().getDrawable(R.drawable.grid_dark));
                        b5.setBackground(getResources().getDrawable(R.drawable.grid_dark));
                        b6.setBackground(getResources().getDrawable(R.drawable.grid_dark));
                        b8.setBackground(getResources().getDrawable(R.drawable.grid_dark));
                        b1.setTextColor(0xFFFFFFFF);
                        b2.setTextColor(0xFFFFFFFF);
                        b3.setTextColor(0xFFFFFFFF);
                        b4.setTextColor(0xFFFFFFFF);
                        b5.setTextColor(0xFFFFFFFF);
                        b6.setTextColor(0xFFFFFFFF);
                        b7.setTextColor(0xFFFFFFFF);
                        b8.setTextColor(0xFFFFFFFF);
                        b9.setTextColor(0xFFFFFFFF);
//                        resultDialog.setBackground(getResources().getDrawable(R.drawable.dialog_bg_dark));
//                        resultText.setTextColor(0xFFFFFFFF);
//                        findViewById(R.id.dialog_layout).setBackground(getResources().getDrawable(R.drawable.dialog_bg_dark));
//                        result_text.setTextColor(0xFFFFFFFF);
                        break;
                }
            }
        });

//        turn_teller.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(b1.getText()=="X"){
//                    alert.showDialog(MainActivity.this, "X wins");
//                }
//                else {
//                    alert.showDialog(MainActivity.this, "O wins");
//                }
//            }
//        });

    }

    //mopub ads
    private SdkInitializationListener initSdkListener() {
        return new SdkInitializationListener() {
            @Override
            public void onInitializationFinished() {
                bannerAd();
            }
        };
    }
    private void bannerAd() {
        moPubView = (MoPubView) findViewById(R.id.adview);
        moPubView.setAdUnitId("b195f8dd8ded45fe847ad89ed1d016da");
        moPubView.loadAd();
    }
    @Override
    protected void onDestroy() {
        moPubView.destroy();
        super.onDestroy();
    }
    //mopub ads


    public class ViewDialog {

        public void showDialog(Activity activity, String msg){

            Button b1 = findViewById(R.id.button1);
            Button b2 = findViewById(R.id.button2);
            Button b3 = findViewById(R.id.button3);
            Button b4 = findViewById(R.id.button4);
            Button b5 = findViewById(R.id.button5);
            Button b6 = findViewById(R.id.button6);
            Button b7 = findViewById(R.id.button7);
            Button b8 = findViewById(R.id.button8);
            Button b9 = findViewById(R.id.button9);
            TextView turn_teller = findViewById(R.id.turn_teller_text);

            final Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.activity_dialog);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

            TextView text = dialog.findViewById(R.id.dialog_info);
            text.setText(msg);

            Button dialogBtn_cancel = dialog.findViewById(R.id.dialog_cancel);
            dialogBtn_cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            });

            Button dialogBtn_newgame = dialog.findViewById(R.id.dialog_newgame);
            dialogBtn_newgame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.cancel();
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    turn_teller.setText("X's turn");
                    i=1;
                }
            });

            dialog.show();
        }
    }
}