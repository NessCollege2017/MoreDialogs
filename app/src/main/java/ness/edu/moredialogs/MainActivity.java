package ness.edu.moredialogs;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnUserLoggedInListener{
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ConstraintLayout) findViewById(R.id.constraint);

        Log.d("Ness", "MainActivity.onCreate");

    }

    public void showDialog(View view) {
        Log.d("Ness", "MainActivity.showDialog");
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setCancelable(false);
//
//        View v = getLayoutInflater().inflate(R.layout.dialog_login, layout, false);
//
//        final EditText etUserName = (EditText) v.findViewById(R.id.etUserName);
//        EditText etPassword = (EditText) v.findViewById(R.id.etPassword);
//        Button btnCancel = (Button) v.findViewById(R.id.btnCancel);
//        Button btnLogin = (Button) v.findViewById(R.id.btnLogin);
//
//        builder.setView(v);
//
//        final AlertDialog dialog = builder.create();
//
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, etUserName.getText().toString(), Toast.LENGTH_SHORT).show();
//                dialog.dismiss();
//            }
//        });
//        dialog.show();

        LoginFragment f = new LoginFragment();
        f.show(getSupportFragmentManager() ,"loginDialog");
    }

    public void onUserLoggedIn(String s) {

    }
}
