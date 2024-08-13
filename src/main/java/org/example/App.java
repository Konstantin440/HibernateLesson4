package org.example;

import org.example.dao.UserDao;
import org.example.entity.Diary;
import org.example.entity.Smartphone;
import org.example.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        UserDao userDao = new UserDao();

        User user1 = new User("kosmos","11123", LocalDate.now());

        User user2 = new User("masha","23313", LocalDate.now());

        Smartphone smartphone = new Smartphone("222","S12",1000);
        Smartphone smartphone1 =  new Smartphone("333","S13",2000);
        Smartphone smartphone2 =  new Smartphone("444","S14",3000);
        Smartphone smartphone3 =  new Smartphone("555","S15",4000);

        Diary diaryOf1User = new Diary(1,111,1111);
        Diary diaryOf2User = new Diary(2,222,2222);
        List<Smartphone> smartphonesOf1User = new ArrayList<>();
        smartphonesOf1User.add(smartphone);
        smartphonesOf1User.add(smartphone1);

        user1.setSmartphones(smartphonesOf1User);

        List<Smartphone> smartphonesOf2User = new ArrayList<>();
        smartphonesOf2User.add(smartphone2);
        smartphonesOf2User.add(smartphone3);

        user2.setSmartphones(smartphonesOf2User);

        user1.setDiary(diaryOf1User);
        user2.setDiary(diaryOf2User);

        userDao.create(user1);
        userDao.create(user2);










    }
}
