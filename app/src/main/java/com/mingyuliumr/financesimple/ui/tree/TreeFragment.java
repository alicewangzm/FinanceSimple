package com.mingyuliumr.financesimple.ui.tree;

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

public class TreeFragment extends Fragment {

    private TreeViewModel treeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        treeViewModel =
                ViewModelProviders.of(this).get(TreeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tree, container, false);
        return root;
    }
}
