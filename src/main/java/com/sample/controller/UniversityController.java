package com.sample.controller;

import com.sample.models.facade.UserAccountFacade;
import com.sample.models.model.UniversityInfo;
import com.sample.models.model.UniversityInfoRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Controller
public class UniversityController {

    @Autowired
    UniversityInfoRepository universityInfoRepository;

    Logger logger = Logger.getLogger(UniversityController.class);

    @RequestMapping(value = "/adduniversity", method = RequestMethod.GET)
    @ResponseBody
    public String addUniversity() {
        UniversityInfo testUniv = new UniversityInfo();
        testUniv.setId();
        testUniv.setUniversityName("IU");
        testUniv.setDepartmentInfo("SOIC");
        universityInfoRepository.save(testUniv);
        return "University Added";
    }
}
