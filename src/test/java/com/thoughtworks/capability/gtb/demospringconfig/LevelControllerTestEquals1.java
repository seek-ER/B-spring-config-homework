package com.thoughtworks.capability.gtb.demospringconfig;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = {"levelNumber=1"})
class LevelControllerTestEquals1 {

  @Autowired
  private MockMvc mvc;

  @Test
  void getLevel() throws Exception {
    mvc.perform(get("/level"))
        .andExpect(content().string("advanced"));
  }
}