package com.example.parcial_1_am_acn4b_segovia_agustin_forcada_agustin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        Spinner spinner_account_send = findViewById(R.id.account_send);
        Spinner spinner_account_destination = findViewById(R.id.account_destination);
        Spinner spinner_reason = findViewById(R.id.reason);
        Button button_back = findViewById(R.id.button_back);

        String[] opciones_send = {"Selecciones una cuenta de envio agendada", "Cuenta de Melina", "Cuenta de Joaquin", "Cuenta de Marcos"};
        String[] opciones_destination = {"Selecciones una cuenta de destino", "Cuenta de Agustin 24543A", "Cuenta de Agustin 38294B", "Caja de Ahorro"};
        String[] opciones_reason = {"Seleccione un motivo", "Alquileres", "Honorarios", "Donaciones", "Varios"};
        ArrayAdapter<String> adapter_send = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones_send);
        spinner_account_send.setAdapter(adapter_send);
        ArrayAdapter<String> adapter_destination = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones_destination);
        spinner_account_destination.setAdapter(adapter_destination);
        ArrayAdapter<String> adapter_reason = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones_reason);
        spinner_reason.setAdapter(adapter_reason);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SendActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }
}