package com.karthikgolfer.healthcarememinfo.facetsSQL;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExcelController {

    @PostMapping("/upload")
    public ResponseEntity<List<String>> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        try {
            ProcessExcel myProcessExcel = new ProcessExcel();
        	List<String> sqlQueries = myProcessExcel.processExcelFile(file);
            return ResponseEntity.ok(sqlQueries);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}