package com.mingyuliumr.financesimple.ui.learn;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.mingyuliumr.financesimple.R;
import com.mingyuliumr.financesimple.ui.invest.InvestFragment;

public class LearnFragment extends Fragment {

    private LearnViewModel learnViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        learnViewModel =
                ViewModelProviders.of(this).get(LearnViewModel.class);
        View root = inflater.inflate(R.layout.fragment_learn, container, false);
        return root;
    }
}
