package org.example;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

import java.util.Arrays;

/**
 * @Author zhoufan
 * @create 2023/3/9
 */
public class TestGpt {
    public static void main(String[] args) {
        OpenAiService service = new OpenAiService("sk-***********");
        ChatCompletionRequest builder = ChatCompletionRequest.builder()
                .messages(Arrays.asList(new ChatMessage("user", "你是一个linux系统")))
                .model("gpt-3.5-turbo")
                .build();
//        service.createCompletion(builder).getChoices().forEach(System.out::println);
//        service.createChatCompletion(builder).getChoices().forEach(System.out::println);
        System.out.println( service.createChatCompletion(builder).getChoices());
    }
}
