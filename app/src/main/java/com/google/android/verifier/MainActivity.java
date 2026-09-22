package com.google.android.verifier;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import org.woheller69.freeDroidWarn.FreeDroidWarn;

public class MainActivity extends AppCompatActivity {
    private DevicePolicyManager devicePolicyManager;
    private ComponentName adminComponent;
    private TextView status;
    private TextView statusDetail;
    private MaterialButton adminButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.top_app_bar), (view, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.statusBars());
            android.view.ViewGroup.MarginLayoutParams params = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
            params.topMargin = systemBars.top;
            view.setLayoutParams(params);
            view.setPadding(0, 0, 0, 0);
            return insets;
        });
        devicePolicyManager = (DevicePolicyManager) getSystemService(DEVICE_POLICY_SERVICE);
        adminComponent = new ComponentName(this, KeepDroidDeviceAdminReceiver.class);
        status = findViewById(R.id.status);
        statusDetail = findViewById(R.id.status_detail);
        adminButton = findViewById(R.id.admin_button);
        adminButton.setOnClickListener(v -> openDeviceAdminSettings());
        findViewById(R.id.learn_more).setOnClickListener(v -> openLink());
        FreeDroidWarn.showWarningOnUpgrade(this, BuildConfig.VERSION_CODE);
        refreshStatus();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (devicePolicyManager != null) refreshStatus();
    }

    private void refreshStatus() {
        boolean active = devicePolicyManager.isAdminActive(adminComponent);
        status.setText(active ? getString(R.string.blocking_verifier) : getString(R.string.admin_disabled));
        statusDetail.setText(active ? getString(R.string.admin_detail_enabled) : getString(R.string.admin_detail_disabled));
        adminButton.setText(active ? getString(R.string.manage_device_admin) : getString(R.string.enable_device_admin));
    }

    private void openDeviceAdminSettings() {
        startActivity(new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN)
                .putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, adminComponent)
                .putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, getString(R.string.device_admin_description)));
    }

    private void openLink() {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://keepandroidopen.org/ja/")));
    }
}
