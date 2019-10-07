package edith.example.mostrar_imagen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    private ImagenFragment ifImagen;
    private int[] imgs = {
            R.drawable.dramur00,
            R.drawable.dramur01,
            R.drawable.dramur02,
            R.drawable.dramur03,
            R.drawable.dramur04,
            R.drawable.dramur05,
            R.drawable.dramur06,
            R.drawable.dramur07,
            R.drawable.dramur08,
            R.drawable.dramur09,
            R.drawable.dramur10,
            R.drawable.dramur11,
            R.drawable.dramur12
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment.getClass() == ImagenFragment.class)
            ifImagen = (ImagenFragment) fragment;
    }

    public void fromFragToMain(String fragmento, int valor) {
        int actual = imgs[0];
        int anterior = imgs[0];
        int siguiente = imgs[1];
        if (fragmento.equals("DESPLAZA")) {
            if ((valor >= 1) && (valor <= 11)) {
                anterior = imgs[valor - 1];
                actual = imgs[valor];
                siguiente = imgs[valor + 1];
            } else if (valor == 12) {
                anterior = imgs[valor - 1];
                actual = imgs[valor];
                siguiente = imgs[0];
            }
        }
        ifImagen.fromMainToFrag(actual, anterior, siguiente);
    }
}
