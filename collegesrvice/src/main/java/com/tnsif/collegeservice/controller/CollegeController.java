package com.tnsif.collegesrvice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnsif.collegesrvice.entity.CollegeEntity;
import com.tnsif.collegesrvice.service.CollegeService;

@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @GetMapping
    public List<CollegeEntity> getAllColleges() {
        return collegeService.getColleges();
    }
    
    @PostMapping
    public CollegeEntity createCollege(@RequestBody CollegeEntity college) {
        return collegeService.saveCollege(college);
    }

    @GetMapping("/{id}")
    public CollegeEntity getCollegeById(@PathVariable int id) {
        return collegeService.getCollegeById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CollegeEntity> updateCollege(
            @PathVariable("id") int id,   // ✅ specify "id"
            @RequestBody CollegeEntity college
    ) {
        CollegeEntity updated = collegeService.updateCollege(id, college);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public String deleteCollege(@PathVariable("id") int id) {
        collegeService.deleteCollege(id);
        return "College with ID " + id + " deleted successfully!";
    }
}
