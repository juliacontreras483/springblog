package com.codeup.springblog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping (path = "/add/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable long num1, @PathVariable long num2){
        return num1 + "+" + num2 +"=" + (num1 + num2);
    }

    @RequestMapping (path = "/subtract/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable long num1, @PathVariable long num2){
        return num1 + "-" + num2 +"=" + (num1 - num2);
    }

    @RequestMapping (path = "/multiply/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable long num1, @PathVariable long num2){
        return num1 + "*" + num2 +"=" + (num1 * num2);
    }

    @RequestMapping (path = "/divide/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable long num1, @PathVariable long num2){
        return num1 + "/" + num2 +"=" + (num1 / num2);
    }
}




//exercise #2
//Create a MathController class.
//        This controller should listen for requests for several routes that correspond to basic arithmetic operations and produce the result of the arithmetic.
//        Example
//
//        url	response
//        /add/3/and/4	7
//        /subtract/3/from/10	7
//        /multiply/4/and/5	20
//        /divide/6/by/3