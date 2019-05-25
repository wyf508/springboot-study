package com.test.springbootstudy.controller;

import com.test.springbootstudy.propertiestest.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/22 0022 下午 2:44
 * @Description TODO
 */
@Controller
public class DemoController {

    @Autowired
    Person person;

    @GetMapping("/test01")
    @ResponseBody
    public String testGetString() {
        return "测试第一个例子";
    }

    @RequestMapping("/test02")
    public String test02(Model model, HttpSession session) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("test", "这是一个map");
        model.addAttribute("map01", map);
        model.addAttribute("hello", "hello world");
        model.addAttribute("person", person);

        session.setAttribute("p", person);

        List<Map> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            HashMap<String, Object> maps = new HashMap<>();
            maps.put("name", "jack" + i);
            maps.put("age", "11" + i);
            list.add(maps);
        }
        model.addAttribute("lists", list);

        List<Person> list2 = new ArrayList<>();
        Person person2 = new Person();
        for (int i = 0; i < 5; i++) {
            person2.setFirstName("tom");
            person2.setAge(22);
            person2.setBirth(new Date());
            list2.add(person2);
        }
        model.addAttribute("list2", list);
        return "thymeleaf-test";
    }

    @ResponseBody
    @RequestMapping("/upload")
    public String upload(@RequestParam("pic") MultipartFile file, HttpServletRequest request) {
        String fileName = file.getOriginalFilename();
        String filePath = "D:/img_temp/";
        try {
            uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    private void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    @GetMapping("/getJson")
    @ResponseBody
    public Person testGetJson() {
        Person p = new Person();
        p.setBirth(new Date());
        p.setAge(21);
        p.setFirstName("fang");
        return p;
    }

    @GetMapping("/testFormat")
    @ResponseBody
    public String testFormatDate(Date birth) {
        System.out.println(birth);
        return "success";
    }


}
