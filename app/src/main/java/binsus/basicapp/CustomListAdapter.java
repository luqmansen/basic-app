package binsus.basicapp;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final Integer[] imageIDArray;
    private final String[] nameArray;
    private final String[] infoArray;

    public CustomListAdapter(Activity context,
                             String[] nameArrayParam,
                             String[] infoArrayParam,
                             Integer[] imageIDArrayParam){

        super(context, R.layout.listview_row, nameArrayParam);

        this.context=context;
        this.imageIDArray=imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
    }

    public View getView(int position,
                        View view,
                        ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.listview_row, null, true);

        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextViewID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoTextViewID);
        ImageView imageView =  (ImageView) rowView.findViewById(R.id.imageView1ID);

        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDArray[position]);

        return rowView;
    }

}
