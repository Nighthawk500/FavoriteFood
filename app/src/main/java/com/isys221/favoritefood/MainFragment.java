package com.isys221.favoritefood;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        // Buttons to open websites
        view.findViewById(R.id.btn_culvers).setOnClickListener(v -> openWebsite("https://www.culvers.com/"));
        view.findViewById(R.id.btn_costco).setOnClickListener(v -> openWebsite("https://www.costco.com/"));
        view.findViewById(R.id.btn_innout).setOnClickListener(v -> openWebsite("https://www.in-n-out.com/"));
        view.findViewById(R.id.btn_braums).setOnClickListener(v -> openWebsite("https://www.braums.com/"));

        // Button listener for FavoriteFoodFragment
        view.findViewById(R.id.btn_favorite_food).setOnClickListener(v -> navigateToFavoriteFood());

        return view;
    }

    // Method to open websites
    private void openWebsite(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    // Navigate to FavoriteFoodFragment
    private void navigateToFavoriteFood() {
        FragmentTransaction transaction = requireFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, new FavoriteFoodFragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
