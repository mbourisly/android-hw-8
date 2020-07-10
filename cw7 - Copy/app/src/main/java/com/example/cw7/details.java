package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();
       Pokemon p = (Pokemon) b.getSerializable("pokemon");
        TextView name = findViewById(R.id.textView5);
        TextView attack = findViewById(R.id.textView8);
        TextView defence = findViewById(R.id.textView9);
        TextView total = findViewById(R.id.textView10);
        ImageView img = findViewById(R.id.imageView2);

        name.setText(p.getName());
        attack.setText(p.getAttack()+"");
        defence.setText(p.getDefence()+"");
        total.setText(p.getTotal()+"");
        img.setImageResource(p.getImage());


    }
}