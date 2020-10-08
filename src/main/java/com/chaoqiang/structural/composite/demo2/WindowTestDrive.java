package com.chaoqiang.structural.composite.demo2;

/**
 * @author chaoqiang
 * @date 2020-10-08 11:53
 **/
public class WindowTestDrive {

    public static void main(String[] args) {

        WindowComponent window = new Window();
        window.addComponent(new Picture("LOGO图片"));
        window.addComponent(new Button("登录"));
        window.addComponent(new Button("注册"));
        WindowComponent frame = new Frame("FRAME1");
        frame.addComponent(new Label("用户名"));
        frame.addComponent(new TextBox());
        frame.addComponent(new Label("密码"));
        frame.addComponent(new PasswordBox());
        frame.addComponent(new CheckBox());
        frame.addComponent(new TextBox("记住用户名"));
        frame.addComponent(new LinkLable("忘记密码"));
        window.addComponent(frame);

        window.print();
    }
}
