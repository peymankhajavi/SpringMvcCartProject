package pkh.mvccartexample.springproject.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pkh.mvccartexample.springproject.commands.CartCommand;
import pkh.mvccartexample.springproject.services.CartService;

import javax.validation.Valid;

@Slf4j
@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("cart/{id}/update")
    public String updateCart(@PathVariable String id, Model model){
        model.addAttribute("cart", cartService.findCommandById(Long.valueOf(id)));
        return  "cart/cartForm";
    }

    @PostMapping("cart")
    public String saveOrUpdate(@Valid @ModelAttribute CartCommand command){
       CartCommand savedCommand = cartService.saveCartCommand(command);

        return "redirect:/cart/" + savedCommand.getId() + "/show";
    }

}
