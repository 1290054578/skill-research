package com.lonewolf.service.pattern.orderPattern;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 17:40
 * @Description:
 */
public class SimpleTest {
    /**
     * 开关接口类
     */
    interface Command{
        /**
         * 开关方法
         */
        void execute();
    }

    /**
     * 开关接口适配灯的属性
     */
    static class LightOnCommand implements Command{
        Light light;
        LightOnCommand(Light light){
            this.light = light;
        }

        @Override
        public void execute() {
            light.on();
        }
    }

    /**
     * 灯类（灯的特有属性）
     */
    static class Light{
        public void on(){
            System.out.println("light on");
        }
    }

    static class SimpleRemoteControl{
        Command command;
        public void setCommand(LightOnCommand lightOnCommand){
            command = lightOnCommand;
        }

        public void buttonWasPressed(){
            command.execute();
        }
    }

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
