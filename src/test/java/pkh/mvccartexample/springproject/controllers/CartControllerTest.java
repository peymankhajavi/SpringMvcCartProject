package pkh.mvccartexample.springproject.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import pkh.mvccartexample.springproject.commands.CartCommand;
import pkh.mvccartexample.springproject.services.CartService;
import org.mockito.MockitoAnnotations;

public class CartControllerTest {


    @Mock
    CartService cartService;

    CartController cartController;

    MockMvc mockMvc;

    @Before
    public void setUP() throws  Exception{
        MockitoAnnotations.initMocks(this);

        cartController=new CartController();
        mockMvc= MockMvcBuilders.standaloneSetup(cartController).build();
    }


    @Test
    public void updateCart() throws Exception {
        CartCommand command = new CartCommand();
        command.setId(2L);

//        when(cartService.findCommandById(anyLong())).thenReturn(command);
//
//        mockMvc.perform(post("/cart/1/update"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("cart/cartForm"))
//                .andExpect(model().attributeExists("cart"));
    }
}