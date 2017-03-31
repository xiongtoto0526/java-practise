package com.xht.myseed.observeDesign;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private List<Observer> focusUsers;//观察者集合

    /**
     * 价格折扣
     * @param off
     */
    public synchronized void payOff(double off){
        this.price = getPrice() * (1 - off);
        StringBuffer msg = null;

        if(focusUsers != null && !focusUsers.isEmpty()){
            Iterator it = focusUsers.iterator();
            while(it.hasNext()){
                Observer user = (Observer)it.next();

                String msgPart = ", "+ this.getName() +"的价格 "+ this.getPrice() +", 价格折扣 "+ off * 100 +"%!";
                msg = new StringBuffer();
                msg.append("~~~~ 您好 "+ user.getName());
                msg.append(msgPart);

                user.onNotify(msg.toString());//发送提醒
            }
        }
    }

    /**
     * 添加关注用户
     * @param user
     */
    public void addFocusUsers(User user) {
        this.getFocusUsers().add(user);
    }
    /**
     * 删除关注用户
     * @param user
     */
    public void delFocusUser(User user) {
        this.getFocusUsers().remove(user);
    }


    public Product(){
        focusUsers = new ArrayList<Observer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Observer> getFocusUsers() {
        return focusUsers;
    }
    public void setFocusUsers(List<Observer> focusUsers) {
        this.focusUsers = focusUsers;
    }
}
