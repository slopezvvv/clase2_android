package cl.tuserver.clase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

import cl.tuserver.clase2.ENUM.EnumClavesIntents;
import cl.tuserver.testingandroid.R;

public class FormularioPersona extends AppCompatActivity {

    private Spinner spinnerHorasMaximas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_persona);
        getActionBar().setTitle("Formulario Persona");

        // TODO CODE
        spinnerHorasMaximas = findViewById(R.id.spinnerHorasMaximas);

        Intent intent = getIntent();
        ArrayList<Integer> horasMaximasArray = (ArrayList<Integer>) intent.getSerializableExtra(EnumClavesIntents.HORAS_MAXIMAS.toString());

        ArrayAdapter adapter = new ArrayAdapter<>(this.getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, horasMaximasArray);
        spinnerHorasMaximas.setAdapter(adapter);
    }
}