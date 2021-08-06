package com.example.summerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 기본 Setup
    // 1. 안드로이드 스튜디오 깔기
    // 2. 삼성 통합 USB 드라이버 깔기
    // 3. 개발자 모드 켜기

    // TBL 로그인 화면 어플 만들기 ★★★★★

    // 1. TextView - 화면에 글씨 띄우는거
    // activity_main.xml만 하면 됨

    // 2. EditText_and_Button
    // activity_main.mxl 먼저
    // MainActivity.java

    // 3. Intent
    // 다음화면 액티비티를 먼저 만들어줌
    // 두번째 화면 activity_next.xml에 TextView 까지만
    // MainActivity.java 작업
    // NextActivity.java 작업

    // 4. Toast Message
    // MainActivity.java onClick에 조건 추가하기

    // 5. ImageView
    // activity_next.xml만 작업하면 댐 - drawable 사용법
    
    // 6. 전체적인 패키지 구조
    // manifests
    // java, layout
    // drawable
    // values
    // themes까지

    // 7. HW 정확한 ID와 PW 넣었을때만 다음 액티비티로 넘어가게 하기!


    // 변수 선언

    // 2. EditText_and_Button 부분
    EditText UserName;
    EditText Password;
    Button Login;

    // 3. Intent 부분
    String content;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 어플 화면에 처음 들어오면 시작할 행동
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 바퀴랑 엔진이랑 이어준다
        UserName = findViewById(R.id.UserName);
        Password = findViewById(R.id.Password);
        Login = findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 다음꺼 넘어갈때 주석처리하기
                // 2. EditText_and_Button
                // 누르면 무엇을 해줄지
//                UserName.setText("바보"); // 2. EditText_and_Button 부분

                // 3. Intent 부분 - UserName 넘겨주기 - 다음꺼 할때 주석처리
//                content = UserName.getText().toString();
//
//                Intent intent = new Intent(MainActivity.this,NextActivity.class); // 어디에서 어디로 갈지
//
//                intent.putExtra("UserName", content);
//
//                startActivity(intent);

                // 4. Toast Message 부분
                if (Password.getText().toString().equals("1234")){
                    content = UserName.getText().toString();

                    Intent intent = new Intent(MainActivity.this,NextActivity.class); // 어디에서 어디로 갈지

                    intent.putExtra("UserName", content);

                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}