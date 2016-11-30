package com.test;

import Postage01.Post;

public class Main {

    public static void main(String[] args) {

        Post post = new Post();
        post.setinput(100);
        int postMan = post.deliveringMan(50);
        System.out.println(postMan);


    }
}
