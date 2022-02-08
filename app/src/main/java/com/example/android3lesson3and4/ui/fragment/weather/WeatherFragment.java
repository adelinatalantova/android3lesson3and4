package com.example.android3lesson3and4.ui.fragment.weather;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android3lesson3and4.R;
import com.example.android3lesson3and4.base.BaseFragment;
import com.example.android3lesson3and4.databinding.FragmentWeatherBinding;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class WeatherFragment extends BaseFragment<WeatherViewModel, FragmentWeatherBinding> {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWeatherBinding.inflate(inflater,container,false);
        fragmentCity();
        return binding.getRoot();
    }
    private void fragmentCity() {
        binding.location.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);
            navController.navigate(R.id.action_weatherFragment_to_cityFragment2);
        });
    }
    @Override
    protected void initialize() {
        viewModel = new ViewModelProvider(requireActivity()).get(WeatherViewModel.class);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void setUpObserves() {
        viewModel.getWeather(WeatherFragmentArgs.fromBundle(getArguments()).getCityName()).observe(getViewLifecycleOwner(),weatherModel -> {
            binding.maxTemperature.setText(String.valueOf(weatherModel.getmMain().getmTempMax()));
            binding.cityTv.setText(weatherModel.getmName());
            binding.minTemperature.setText(String.valueOf(weatherModel.getmMain().getmTempMin()));
            binding.humidityTv.setText(String.valueOf(weatherModel.getmMain().getmHumidity()));
            binding.pressureTv.setText(String.valueOf(weatherModel.getmMain().getmPressure()));
            binding.temperatureTv.setText(String.valueOf(weatherModel.getmCoord().getLat()));
            binding.sunriseTv.setText(String.valueOf(weatherModel.getmSys().getmSunrise()));
            binding.sunsetTv.setText(String.valueOf(weatherModel.getmSys().getmSunset()));
            binding.speedTv.setText(String.valueOf(weatherModel.getmWind().getmSpeed()));
            binding.cloudTv.setText(String.valueOf(weatherModel.getmClouds().getAll()));
        });
    }


}