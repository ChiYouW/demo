package com.chiyou.spring.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest extends JFrame {

    public SwingTest(){
        // 设置样式
        this.setBounds(200,200,500,200);
        this.setTitle("事件测试");
        // 关闭按钮触发的事件,退出程序
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 添加个按钮
        JButton jButton = new JButton("确定");
        this.add(jButton);
        // 设置窗体是否存在
        this.setVisible(true);

        // 添加监听事件
        jButton.addActionListener(new ActionListener() {
            // 当被触发的时候
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("active ...");
            }
        });

    }

    public static void main(String[] args) {

        new SwingTest();

    }

}
