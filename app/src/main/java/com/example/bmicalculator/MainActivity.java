package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBMIClick(View view){
        EditText edTxtWeight = findViewById(R.id.edTxtWeight);
        String weight = edTxtWeight.getText().toString();
        EditText edTxtHeight = findViewById(R.id.edTxtHeight);
        String height = edTxtHeight.getText().toString();

        //convert to double and calculate
        double weight_value = Double.parseDouble(weight);
        double height_value = Double.parseDouble(height) / 100;
        double bmi = weight_value / (height_value * height_value);

        //display the name, gender and BMI results
        TextView edTxtBMI = findViewById(R.id.txtBMI);
        edTxtBMI.setText("BMI: " + bmi);

        TextView edTxtName = findViewById(R.id.txtName);
        EditText edTxtFName = findViewById(R.id.edTxtFirstName);
        EditText edTxtLName = findViewById(R.id.edTxtLastName);
        String FName = edTxtFName.getText().toString();
        String LName = edTxtLName.getText().toString();
        edTxtName.setText("Name: " + FName + " " + LName);

        EditText edTxtGender = findViewById(R.id.edTxtGender);
        TextView txtGender = findViewById(R.id.txtGender);
        txtGender.setText("Gender: " + edTxtGender.getText().toString());
    }
    public  void onSalClick(View view){
        EditText edTxtBasicSal = findViewById(R.id.edTxtBasicSalary);
        TextView edTxtNetSal = findViewById(R.id.txtNetSalary);

        String salary = edTxtBasicSal.getText().toString();
        double basic_sal = Double.parseDouble(salary);

        double tax_amount, net_salary;
        if (basic_sal >= 12000)
            tax_amount = 10.0 / 100 * basic_sal;
        else
            tax_amount = 0;

        net_salary = basic_sal - tax_amount;
        edTxtNetSal.setText("Net Salary: " + net_salary);


        TextView edTxtName = findViewById(R.id.txtName);
        EditText edTxtFName = findViewById(R.id.edTxtFirstName);
        EditText edTxtLName = findViewById(R.id.edTxtLastName);
        String FName = edTxtFName.getText().toString();
        String LName = edTxtLName.getText().toString();
        edTxtName.setText("Name: " + FName + " " + LName);
        EditText edTxtGender = findViewById(R.id.edTxtGender);
        TextView txtGender = findViewById(R.id.txtGender);
        txtGender.setText("Gender: " + edTxtGender.getText().toString()) ;

    }
}