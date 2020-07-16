package sg.edu.rp.c346.id19022187.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);
        alToDo = new ArrayList();
        ToDoItem item1 = new ToDoItem("Buy milk", Calendar.getInstance());
        alToDo.add(item1);
        alToDo.add(new ToDoItem("Cut hair", Calendar.getInstance()));
        alToDo.add(new ToDoItem("Play game", Calendar.getInstance()));
        adapter = new CustomAdapter(this, R.layout.row, alToDo);
        lvToDo.setAdapter(adapter);
    }
}