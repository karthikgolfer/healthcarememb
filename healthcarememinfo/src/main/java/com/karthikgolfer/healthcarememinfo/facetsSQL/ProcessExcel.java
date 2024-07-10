package com.karthikgolfer.healthcarememinfo.facetsSQL;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.web.multipart.MultipartFile;

public class ProcessExcel {

	List<String> processExcelFile(MultipartFile file) throws IOException {
        List<String> sqlQueries = new ArrayList<>();
        Workbook workbook = new XSSFWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();

        String tableName = "your_table_name";

        // Assuming the first row contains column names
        Row headerRow = rowIterator.next();
        List<String> columnNames = new ArrayList<>();
        headerRow.forEach(cell -> columnNames.add(cell.getStringCellValue()));

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            List<String> values = new ArrayList<>();
            row.forEach(cell -> values.add(cell.toString()));

            String columns = String.join(", ", columnNames);
            String vals = String.join(", ", values.stream().map(v -> "'" + v + "'").toArray(String[]::new));
            String sql = String.format("INSERT INTO %s (%s) VALUES (%s);", tableName, columns, vals);
            sqlQueries.add(sql);
        }

        workbook.close();
        return sqlQueries;
    }
	
}
