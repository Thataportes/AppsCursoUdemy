package com.teste.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;
import com.teste.slider.activity.CadastroActivity;
import com.teste.slider.activity.LoginActivity;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        // removendo os botões de avançar e voltar
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        //FragmentSlide
        addSlide(new FragmentSlide.Builder()
                .background(R.color.purple_200)
                .fragment(R.layout.intro_1)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(R.color.purple_200)
                .fragment(R.layout.intro_2)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(R.color.purple_200)
                .fragment(R.layout.intro_3)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(R.color.purple_200)
                .fragment(R.layout.intro_4)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(R.color.purple_200)
                .fragment(R.layout.intro_cadastro)

                .build()
        );

    }

    public void ButtonEntrar(View view){
        startActivity(new Intent(this, LoginActivity.class));

    }

    public void ButtonCadastrar(View view){
        startActivity(new Intent(this, CadastroActivity.class));
    }
}
