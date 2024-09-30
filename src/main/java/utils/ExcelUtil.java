package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
    /**
 * Gets the test data.
 *
 * @param strWorkbookPath  the str workbook path
 * @param strWorksheetName the str worksheet name
 * @return the test data
 */
public static Iterator<Object[]> getTestData(String strWorkbookPath, String strWorksheetName) {
    List<Object[]> data = new ArrayList<Object[]>();

    int inRowCounter = 1;

    try {
        FileInputStream file = new FileInputStream(new File(strWorkbookPath));

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet(strWorksheetName);

        Iterator<Row> rowIterator = sheet.rowIterator();


        Row firstRow = rowIterator.next();

        Map<String, String> columnNamesMap = getColumnNames(firstRow);

        while (rowIterator.hasNext()) {
            Iterator<Cell> cellIterator = rowIterator.next().cellIterator();
            Map<String, String> rowMap = new LinkedHashMap();
            for (Map.Entry entry : columnNamesMap.entrySet()) {
                String strColumnName = entry.getKey().toString();
                String strValue = "";
                try {
                    Cell cell = cellIterator.next();
                    if (cell != null) {
                        strValue = cell.toString();
                    }
                } catch (Exception e) {
                }
                rowMap.put(strColumnName, strValue.trim());
            }
            if (rowMap.get("Execute").equalsIgnoreCase("Y")) {
                rowMap.put("Iteration", "" + inRowCounter);
                data.add(new Object[]{rowMap});
                inRowCounter++;
            }
        }
        file.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return data.iterator();
}
private static Map<String, String> getColumnNames(Row row) {
        Map<String, String> columnNamesMap = new LinkedHashMap();
        Iterator<Cell> cells = row.cellIterator();
        while (cells.hasNext()) {
            String strColumnName = cells.next().toString();
            columnNamesMap.put(strColumnName, strColumnName);
        }
        return columnNamesMap;
    }
}

