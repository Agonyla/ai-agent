package com.agony.aiagent.demo.invoke;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: Agony
 * @create: 2025/7/22 20:12
 * @describe:
 */
@Component
public class SpringAiInvoke implements CommandLineRunner {


    @Resource
    private ChatModel dashscopeChatModel;

    @Override
    public void run(String... args) throws Exception {
        AssistantMessage output = dashscopeChatModel.call(new Prompt("你好，我是一位刚毕业的学生，你可以给我一下建议吗？"))
                .getResult()
                .getOutput();
        System.out.println(output.getText());
    }
    

}
