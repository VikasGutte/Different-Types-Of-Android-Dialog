# Different-Types-Of-Android-Dialog
Different Types Of Android Dialog

Alert Dialog 

    AlertDialog.Builder builder = new AlertDialog.Builder(this);//this is activity
        builder.setMessage(R.string.show_alert)
                .setPositiveButton(R.string.show, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        show_alert.setText("Alert Showed");
                    }
                }).setNegativeButton(R.string.dont, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                show_alert.setText("Alert Not Showed");
            }
        }).show();

![Android Dialog](https://github.com/VikasGutte/Different-Types-Of-Android-Dialog/blob/master/Screenshot/Screenshot%202020-04-28%20at%202.20.38%20PM.png)
![](https://github.com/VikasGutte/Different-Types-Of-Android-Dialog/blob/master/Screenshot/Screenshot%202020-04-28%20at%202.20.55%20PM.png)

Custom Dialog

     TextView title = new TextView(this);
        title.setText(R.string.Custom_alert);
        title.setTextColor(R.color.title);
        title.setPadding(20, 20, 20, 20);
        title.setGravity(Gravity.CENTER);
        title.setBackgroundColor(R.color.white);
        title.setTextSize(20);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);//this is activity
        builder.setMessage(R.string.show_alert)
                .setCustomTitle(title)
                .setPositiveButton(R.string.show, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        show_alert.setText("Alert Showed");
                    }
                }).setNegativeButton(R.string.dont, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                show_alert.setText("Alert Not Showed");
            }
        }).show();
    
![](https://github.com/VikasGutte/Different-Types-Of-Android-Dialog/blob/master/Screenshot/Screenshot%202020-04-28%20at%202.21.07%20PM.png)
