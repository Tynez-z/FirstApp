package com.example.lessonfirst;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    public Button button;
    public Button buttonThread;
    public EditText editText;
    public Button buttonSend;
    public Button buttonSendFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewUser);
        textView.setText("Циклы");
        button = findViewById(R.id.button);
        buttonThread = findViewById(R.id.buttonThread);
        editText = findViewById(R.id.editTextInputWord);
        buttonSend = findViewById(R.id.buttonSendWord);
        buttonSendFile = findViewById(R.id.buttonSendText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LoopActivity.class);
                startActivity(intent);
            }
        });
        buttonThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), ExampleThreadActivity.class);
                startActivity(intent2);
            }
        });
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(v.getContext(), GetTextActivity.class);
                String msg = editText.getText().toString();
                intent3.putExtra("text", msg);
                startActivity(intent3);
            }
        });
        buttonSendFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileManager fileManager = new FileManager ();
                fileManager.setDataToFile(editText.getText());
                try {
                    FileOutputStream outPut = openFileOutput("‪D:\\Android Studio\\file.txt", MODE_PRIVATE);
                    outPut.write(editText.getText().toString().getBytes());
                    outPut.close();
                    editText.setText("");
                    Toast.makeText(MainActivity.this, "Текст сохранен", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Intent intent4 = new Intent(v.getContext(), ShowTextFromFileActivity.class);
                intent4.putExtra("text", editText.getText().toString());
                startActivity(intent4);
            }
        });
    }

    public void Strings() {
        String str = "Android Developer";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
    }

    public void Methods() {
        Box box4 = new Box(44.1, 33.2);
        Box box5 = new Box(432.4, 4.6);
        System.out.println("Equals " + box4.equals(box5));
        System.out.println("ToString: " + box4.toString());
        int hashCode;
        hashCode = box4.hashCode();
        System.out.println("Hashcode box4: " + hashCode);
    }

    public void methodClone() throws CloneNotSupportedException {
        Box box = new Box(22.1, 45.5);
        Box copyBox = (Box) box.clone();
        System.out.println("Copy box" + copyBox);
    }

    public void workWithArrays() {
        int[] numbers = {92, -108, 2, 120, 67, 4, -81, 9, 88, 1};
        int min, max;
        min = max = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min)
                min = numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("min is: " + min + "; max is: " + max);

        int[] array1 = new int[6];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        array1[5] = 6;
        for (int index = 0; index < array1.length; index++) {
            if (index % 2 == 0) {
                System.out.print("\nEven index: " + array1[index]);
            }
        }

        int[] array = {1, 2, 3, 4, 5};
        System.out.print("\nЧетные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.print("\nНечетные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}