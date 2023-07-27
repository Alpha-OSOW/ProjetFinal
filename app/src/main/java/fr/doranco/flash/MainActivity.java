package fr.doranco.flash;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import fr.doranco.flash.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // Ajout Binding
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolBar);

        initNavigationComponents();

    }

    private void initNavigationComponents() {
        // Configuration de connection de navigation avec la navigation view
        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager()
                        .findFragmentById( R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(R.id.homeFragment, R.id.paysListFragment)
                        .setOpenableLayout(binding.drawerLayout)
                        .build();

        NavigationUI.setupWithNavController(
                binding.navView,
                navController
        );
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        // Ajout du Toggle pour fermer et ouvrir la navigation view (le button a côté de l'accueil)

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                binding.drawerLayout,
                binding.toolBar,
                R.string.open_drawer,
                R.string.close_drawer
        );
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }
}