//package com.Ayush.collection.Map;
//
//import java.util.concurrent.ConcurrentHashMap;
//
//public class File3 {
//    //concurrent hasmao
//  public static final   ConcurrentHashMap<Integer,String > session = new ConcurrentHashMap<>();
//    // One Example
//
//    public static void login(Integer userID){
//        String sessionID ="Session-"+System.nanoTime();
//        session.put(userID,sessionID);
//        System.out.println(userID+" logged wit Id "+sessionID);
//    }
//    public static String getSession(Integer userID){
//        return session.get(userID);
//    }
//    public static void logout(String userID) {
//        session.remove(userID);
//        System.out.println(userID + " logged out");
//    }
//    public static void main(String[] args) {
//
////    }
//}
// yet I have not done Threads so that's why we will do this operation tommarao.....
