package com.devhee.mybackendapi.cotroller;

import com.devhee.mybackendapi.model.Member;
import com.devhee.mybackendapi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    
    @PostMapping("/create")
    public ResponseEntity<Member> create(@RequestBody Member Member) {
        return ResponseEntity.ok()
                .body(memberService.create(Member));
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Member> read(@PathVariable Long id) {
        return ResponseEntity.ok()
                .body(memberService.read(id).get());
    }

    @PutMapping("/update")
    public ResponseEntity<Member> read(@RequestParam Long id, @RequestParam int age) {
        return ResponseEntity.ok()
                .body(memberService.update(id,age));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        memberService.delete(id);
    }
}
