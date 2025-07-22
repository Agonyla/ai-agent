package com.agony.aiagent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;

/**
 * @author: Agony
 * @create: 2025/7/22 20:18
 * @describe:
 */
public class LangChainAiInvoke {

    public static void main(String[] args) {

        QwenChatModel qwenModel = QwenChatModel.builder()
                .apiKey(TestApiKey.API_KEY)
                .modelName("qwen-plus")
                .build();
        String answer = qwenModel.chat("你好，我是一位刚毕业的学生，你可以给我一下建议吗？");
        System.out.println(answer);
        
    }
}
