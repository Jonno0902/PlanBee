package com.scrum.plan.planbee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageListActivity extends AppCompatActivity {
    private RecyclerView mMessageRecycler;
    private MessageAdapter mMessageAdapter;
    private ArrayList<Message> messageList;
    private TextView txtTitle, txtSentMessage;
    private Button btnSend;
    private Chat chat;

    private String[] chatTitles = new String[]{"Cinema crew", "BU Climbing Club", "Paint balling", "Board game cafe", "Bournemouth University", "BPI group", "Chat 5", "Neam Tame", "The instruments", "Scrummers", "Team 11"};
    private int[] chatIcons = new int[]{R.drawable.chat_cinema, R.drawable.chat_climbing, R.drawable.chat_paintballing, R.drawable.chat_board_game, R.drawable.chat_bu, R.drawable.chat_bpi, R.drawable.chat_default, R.drawable.chat_default, R.drawable.chat_trumpet, R.drawable.chat_scrum, R.drawable.chat_11};
    private String[] chatUpcoming = new String[]{"Odeon\nMarch 15th", "The Project\nMarch 8th", "BU Paintball\nMarch 22nd", "", "", "Talbot Campus\nMarch 3rd", "", "", "", "", "Talbot Campus\nMarch 5th"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int chatID = intent.getIntExtra(MyEventsActivity.EXTRA_POS, 0);
        setContentView(R.layout.activity_chat_newest);

        ChatCollection chatCollectionFunctions = new ChatCollection();
        chat = chatCollectionFunctions.generateChat(chatID);
        messageList = chat.getMessages();

      ;

        btnSend = findViewById(R.id.button_chatbox_send);
        txtSentMessage = findViewById(R.id.edittext_chatbox);

        mMessageRecycler = (RecyclerView) findViewById(R.id.chats_recycler);
        mMessageAdapter = new MessageAdapter(this, messageList);
        mMessageRecycler.setAdapter(mMessageAdapter);
        mMessageRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        txtTitle = (TextView) findViewById(R.id.text_chat_title);
        txtTitle.setText(chat.getGroupName());





    }
    private ArrayList<ChatModel> getChats(){
        ArrayList<ChatModel> chats = new ArrayList<>();
        for(int i = 0; i < chatTitles.length; i++){
            ChatModel chatModel = new ChatModel();
            chatModel.setImage_drawable(chatIcons[i]);
            chatModel.setName(chatTitles[i]);
            chatModel.setUpcoming(chatUpcoming[i]);
            chats.add(chatModel);
        }
        return chats;
    }

    public void sendMessage(View view){
        Message message = new Message();
        message.sender = message.generateUser(-1);
        message.entry = txtSentMessage.getText().toString();
        message.epoch = System.currentTimeMillis()/1000 ;
        messageList.add(message);
        txtSentMessage.setText("");


        mMessageAdapter = new MessageAdapter(this, messageList);
        mMessageRecycler.setAdapter(mMessageAdapter);
        mMessageRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        mMessageRecycler.scrollToPosition(messageList.size() - 1);

    }


}
