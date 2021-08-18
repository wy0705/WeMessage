package com.example.demo.service;

import com.example.demo.entity.Friends;

import java.util.List;

public interface FriendsService {
    int deleteFriends(int fid);
    int insertFriend(Friends friends);
    List<Integer> selectFriendByIUid(int uid);
}
