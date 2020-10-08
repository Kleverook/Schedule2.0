package com.schedule.web;


import com.schedule.system.DatabaseConnection;

import com.schedule.system.NumberWeak;
import com.schedule.system.ScheduleConnectionStudent;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


class Test {
    public boolean state;
}

@RestController
public class RequestController {
    @RequestMapping("/api")
    public String checkLogin(@RequestParam(name = "login", required = true) String login,
                             @RequestParam(name = "password", required = true) String password,
                             Model model) throws Exception {
        System.out.println(login);
        System.out.println(password);
        Test a = new Test();
        a.state = true;
        ScheduleConnectionStudent s = new ScheduleConnectionStudent();

        System.out.println(s.getDivisionList());

        NumberWeak v=s.getNumberWeak();
        System.out.println(v.getNumberWeak());
        System.out.println(v.numberWeakMills());
       System.out.println(s.getShaduleList(6543,v.numberWeakMills()));
        return "true";
    }
}
