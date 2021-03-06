package com.jim.demo1.AppSettings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jim.demo1.AppSettings.app_settings_activity;
import com.jim.demo1.AppSettings.contact_activity;
import com.jim.demo1.Inventory.Inventory;
import com.jim.demo1.R;

/**
 * Created by Jim on 2/2/2015.
 */
public class profile_activity extends Activity {



    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);
        addListenerOnButtonAppSettings();
        addListenerOnButtonContact();
        addListenerOnButtonInventory();
    }

    public void addListenerOnButtonAppSettings() {

        final Context context = this;

        button = (Button) findViewById(R.id.profileAppSettingsButton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, app_settings_activity.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButtonContact() {

        final Context context = this;

        button = (Button) findViewById(R.id.profileContactButton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, contact_activity.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButtonInventory() {

        final Context context = this;

        button = (Button) findViewById(R.id.InventoryButton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Inventory.class);
                startActivity(intent);

            }

        });

    }
}

