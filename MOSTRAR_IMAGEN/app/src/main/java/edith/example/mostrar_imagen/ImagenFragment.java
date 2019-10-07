package edith.example.mostrar_imagen;


import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImagenFragment extends Fragment implements ComunicarFrags {
    private MainActivity mainActivity;
    private ImageView imgAct, imgAnt, imgSig;

    public ImagenFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_imagen, container, false);
        imgAct = linearLayout.findViewById(R.id.imgAct);
        imgAnt = linearLayout.findViewById(R.id.imgAnt);
        imgSig = linearLayout.findViewById(R.id.imgSig);
        // Inflate the layout for this fragment
        return linearLayout;
    }

    @Override
    public void fromMainToFrag(int actual, int anterior, int siguiente) {
        if (mainActivity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            imgAct.setImageResource(actual);
        } else if (mainActivity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            imgAnt.setImageResource(anterior);
            imgAct.setImageResource(actual);
            imgSig.setImageResource(siguiente);
        }
    }
}
