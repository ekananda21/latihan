package id.allianz.coding.memberCoding.Controller;

import id.allianz.coding.memberCoding.entity.MemberCodingClass;
import id.allianz.coding.memberCoding.service.MemberCodingClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class MemberCodingClassController {

    @Autowired
    private MemberCodingClassService service;

    @PostMapping("/insert")
    public ResponseEntity<String> insertData(@RequestBody MemberCodingClass body) {
        this.service.insertMember(body);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
