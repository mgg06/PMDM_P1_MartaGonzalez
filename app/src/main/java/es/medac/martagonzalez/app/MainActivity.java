package es.medac.martagonzalez.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Inyectar las fechas reales en los textos con parámetro %1$s
        TextView tvFecha1 = findViewById(R.id.tv_fecha_1);
        TextView tvFecha2 = findViewById(R.id.tv_fecha_2);
        TextView tvFecha3 = findViewById(R.id.tv_fecha_3);

        if (tvFecha1 != null) tvFecha1.setText(getString(R.string.fecha_desbloqueo, "15/05/2027"));
        if (tvFecha2 != null) tvFecha2.setText(getString(R.string.fecha_desbloqueo, "01/01/2028"));
        // Asumiendo que el string del desahogo se llama fecha_desbloqueada y también tiene %1$s
        if (tvFecha3 != null) tvFecha3.setText(getString(R.string.fecha_desbloqueada, "12/03/2026"));

        // 2. Funcionalidad del botón + para abrir la nueva pantalla
        FloatingActionButton fabNuevo = findViewById(R.id.fab_nuevo);
        if (fabNuevo != null) {
            fabNuevo.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, NuevaPromesaActivity.class);
                startActivity(intent);
            });
        }
    }
}
