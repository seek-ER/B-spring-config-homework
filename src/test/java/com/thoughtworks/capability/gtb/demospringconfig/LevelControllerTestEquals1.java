package com.thoughtworks.capability.gtb.demospringconfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(properties = {"levelNumber=1"})
@AutoConfigureMockMvc
class LevelControllerTestEquals1 {
  @Autowired
  private MockMvc mvc;

  @Test
  void getLevel() throws Exception {
    mvc.perform(get("/level"))
        .andExpect(content().string("advanced"));
  }
}