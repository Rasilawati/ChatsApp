package com.unimas.chatsapp;

public class ImageMessageActivity {

    holder.mediaView=(FlowLayout)view.findViewById(R.id.messageMediaContainer);
        ...
                ...
                holder.mediaView.removeAllViews();
// imagesSrc contains image URLs
for(
    int i = 0; i<imagesSrc.size();i++)

    {
        final String url = imagesSrc.get(i);
        ImageView img = new ImageView(this.context);

        FlowLayout.LayoutParams params = new FlowLayout.LayoutParams(100, 100);
        img.setLayoutParams(params);
        img.setImageDrawable(null);
        img.setBackgroundColor(Color.rgb(255, 255, 255));
        holder.mediaView.addView(img);

        // load image into imageView here
    }
}
