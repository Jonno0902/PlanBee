package com.scrum.plan.planbee;

import java.util.ArrayList;

public class ChatCollection {

    private ArrayList<Chat> chats;

    public ChatCollection(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ChatCollection() {
    }

    public Chat generateChat(int chatID) {
        Chat chat = new Chat();
        ArrayList<Message> messages = new ArrayList<Message>();
        Message message = new Message();

        switch (chatID) {
            case 0: {
                message = new Message();
                message.sender = message.generateUser(0);
                message.entry = "Who wants to see Captain Marvel?";
                message.epoch = 1551442324L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(-1);
                message.entry = "Bro. Aren't you in a lecture rn?";
                message.epoch = 1551442564L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(0);
                message.entry = "Bro.";
                message.epoch = 1551442564L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(2);
                message.entry = "Bro.";
                message.epoch = 1551442624L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(3);
                message.entry = "Bro.";
                message.epoch = 1551442744L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(4);
                message.entry = "Bro.";
                message.epoch = 1551443164L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(5);
                message.entry = "Bro.";
                message.epoch = 1551443884L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(-1);
                message.entry = "But srsly?";
                message.epoch = 1551444304L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(0);
                message.entry = "srsly bro.";
                message.epoch = 1551444784L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(5);
                message.entry = "got em";
                message.epoch = 1551445144L;
                messages.add(message);

                chat = new Chat(chatID, messages);
                chat.setGroupName("Cinema Crew");
                break;
            }
            case 1: {
                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "It's time to take out the trash.";
                message.epoch = 1551442324L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(-1);
                message.entry = "So. You're finally asking Crystal out?";
                message.epoch = 1551442564L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(7);
                message.entry = ":'D";
                message.epoch = 1551442564L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "Kinda harsh.";
                message.epoch = 1551442624L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(8);
                message.entry = "He just said what we were all thinking";
                message.epoch = 1551442744L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "Guys. I don't like Crystal!";
                message.epoch = 1551443164L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "Kinda harsh.";
                message.epoch = 1551443884L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "No I mean I don't like you like that.";
                message.epoch = 1551444304L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "Shame.";
                message.epoch = 1551444784L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "I mean i could like you like that...";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "I mean i DO you like that...";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(11);
                message.entry = "YUS HE ADMITTED IT! It was almost worth getting beaten up for stealing Cry's phone. My ship sails!";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "So Crystal doesn't actually like me back?";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(11);
                message.entry = "Nah she does. She just doens't want to admit it.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "Yeah. You're pretty cool <3";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(-1);
                message.entry = "Guys could you take this somewhere else. All this soppyness is making me feel sick.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "Ah sorry. I didn't think about all the single virgin losers that my relationship would offend.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(12);
                message.entry = "Woah. Shots fired.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(8);
                message.entry = "Crystal is actually trash bro. I don't see what you actually see in her.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "Does anyone actually want to do this litter pick? I was thinking 7pm Wednesday on Bournemouth Beach.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(-1);
                message.entry = "Nah count me out. I don't want to interrupt your sunset date with Crystal.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "I'll go babe <3";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "Come on don't be like that. Think about the environment.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(-1);
                message.entry = "Oh I am. I'm gonna do my own litter pick at 7pm at Redwood park then head to maccy D's afterwards.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(8);
                message.entry = "I'll go to that one. Redwood park's nearer to my house than the beach";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(7);
                message.entry = "I'll go too.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(9);
                message.entry = "Well if you're going to that one I'll go as well.";
                message.epoch = 1551445144L;
                messages.add(message);


                message = new Message();
                message.sender = message.generateUser(11);
                message.entry = "It's been a while since I've had a mc flurry...";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "Will! I thought you were on my side. Are you srsly abandoning me for a mc flurry.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "I'm not sure you understand the power of the mc flurry.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(9);
                message.entry = "The mc flurry is pretty OP...";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(6);
                message.entry = "The is a mc D near bournemouth beach";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(7);
                message.entry = "As in the one in the town centre? Thats too long a walk bro.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "MDs have a lot of packaging. Do none of you care about the cause?";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(8);
                message.entry = "Maccys also have a good recycling scheme...";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "You have no loyalty.";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(9);
                message.entry = "Is that what you told Luke when you cheated on him with Wilt";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(10);
                message.entry = "We were drunk!";
                message.epoch = 1551445144L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(11);
                message.entry = "Can you blame her? I am devastatingly sexy.";
                message.epoch = 1551445144L;
                messages.add(message);

                chat = new Chat(chatID, messages);
                chat.setGroupName("Litter Pick");
                break;
            }
            default: {
                message = new Message();
                message.sender = message.generateUser(0);
                message.entry = "Who wants to see Captain Marvel?";
                message.epoch = 1551442324L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(-1);
                message.entry = "Bro. Aren't you in a lecture rn?";
                message.epoch = 1551442564L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(0);
                message.entry = "Bro.";
                message.epoch = 1551442564L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(2);
                message.entry = "Bro.";
                message.epoch = 1551442624L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(3);
                message.entry = "Bro.";
                message.epoch = 1551442744L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(4);
                message.entry = "Bro.";
                message.epoch = 1551443164L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(5);
                message.entry = "Bro.";
                message.epoch = 1551443884L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(-1);
                message.entry = "But srsly?";
                message.epoch = 1551444304L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(0);
                message.entry = "srsly bro.";
                message.epoch = 1551444784L;
                messages.add(message);

                message = new Message();
                message.sender = message.generateUser(5);
                message.entry = "got em";
                message.epoch = 1551445144L;
                messages.add(message);

                chat = new Chat(chatID, messages);
            }
        }

        return chat;

    }

    public Chat getChatByID(int chatID) {
        for (Chat chat : chats) {
            if (chat.getChatID() == chatID) {
                return chat;
            }
        }
        return null;
    }
}

//This Class is everything you need to hold a list of messages
//for one chat
class Chat {
    private int chatID;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private String groupName;
    private ArrayList<Message> messages;

    public Chat(int chatID, ArrayList<Message> messages) {
        this.chatID = chatID;
        this.messages = messages;
    }

    public Chat() {
    }

    public void AddMessage(Message NewMessage) {
        this.messages.add(NewMessage);
    }

    public int getChatID() {
        return this.chatID;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}

class Message {
    public Sender sender;
    public String entry;
    public long epoch;

    //This is a Blank Constructor
    public Message() {
        //Blank Constructor
        this.sender = generateUser(0);
        this.entry = "This is a test message";
        this.epoch = 0;
    }

    //This Constructor Sender, String, Long
    public Message(Sender sender, String message, long epoch) {
        this.sender = sender;
        this.entry = message;
        this.epoch = epoch;
    }

    //This generates a new User and returns the Sender depending on the ID passed in
    public Sender generateUser(int userId) {
        Sender user = new Sender();
        user.userId = userId;

        switch (userId) {
            case -1:
                user.nickname = "Jack Clarke";
                user.profilePicture = R.drawable.psn_13;
                break;
            case 0: {
                user.nickname = "Dave Powers";
                user.profilePicture = R.drawable.psn_0;
                break;
            }
            case 1: {
                user.nickname = "Jeremie Malitrott";
                user.profilePicture = R.drawable.psn_1;
                break;
            }
            case 2: {
                user.nickname = "Ezechiel McAndie";
                user.profilePicture = R.drawable.psn_2;
                break;
            }
            case 3: {
                user.nickname = "Nanete Fenich";
                user.profilePicture = R.drawable.psn_3;
                break;
            }
            case 4: {
                user.nickname = "Rochelle Fowgies";
                user.profilePicture = R.drawable.psn_4;
                break;
            }
            case 5: {
                user.nickname = "Herrick Kipping";
                user.profilePicture = R.drawable.psn_5;
                break;
            }
            case 6: {
                user.nickname = "Ken Batchelder";
                user.profilePicture = R.drawable.psn_6;
                break;
            }
            case 7: {
                user.nickname = "Murdock Malling";
                user.profilePicture = R.drawable.psn_7;
                break;
            }
            case 8: {
                user.nickname = "Marion Cordoba";
                user.profilePicture = R.drawable.psn_8;
                break;
            }
            case 9: {
                user.nickname = "Sid Matzeitis";
                user.profilePicture = R.drawable.psn_9;
                break;
            }
            case 10: {
                user.nickname = "Crystal Cumberpatch";
                user.profilePicture = R.drawable.psn_17;
                break;
            }
            case 11: {
                user.nickname = "Willette Blanche";
                user.profilePicture = R.drawable.psn_11;
                break;
            }
            case 12: {
                user.nickname = "Dru Yanez";
                user.profilePicture = R.drawable.psn_12;
                break;
            }

            default: {
                user.nickname = "Emma Latham";
                user.profilePicture = R.drawable.psn_48;
            }
        }
        return user;
    }

}


class Sender {
    public String nickname;
    public int profilePicture;
    public int userId;

    public Sender() {
        //Blank Constructor
        nickname = "";
        profilePicture = 0;
        userId = 0;
    }

    public Sender(String nickname, int profilePicture, int userId) {
        this.nickname = nickname;
        this.profilePicture = profilePicture;
        this.userId = userId;
    }

}
