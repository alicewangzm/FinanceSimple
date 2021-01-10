package com.mingyuliumr.financesimple.ui.invest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.mingyuliumr.financesimple.R;

public class InvestFragment extends Fragment {

    private InvestViewModel investViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        investViewModel =
                ViewModelProviders.of(this).get(InvestViewModel.class);
        View root = inflater.inflate(R.layout.fragment_invest, container, false);

        return root;
    }
}
