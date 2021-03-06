package com.tuochebang.user.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.framework.app.component.adapter.CommonBaseAdapter;
import com.tuochebang.user.adapter.adapterview.MessageAdapterView;
import com.tuochebang.user.request.entity.MessageInfo;

public class MessageListAdapter extends CommonBaseAdapter<MessageInfo> {
    public MessageListAdapter(Context context) {
        super(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = new MessageAdapterView(this.mContext);
        }
        ((MessageAdapterView) convertView).refreshView((MessageInfo) getItem(position));
        return convertView;
    }
}
