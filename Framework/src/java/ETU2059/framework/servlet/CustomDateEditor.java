/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ETU2059.framework.servlet;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tafitasoa-P15B-140
 */
public class CustomDateEditor extends PropertyEditorSupport{
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            Date date = dateFormat.parse(text);
            setValue(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please use dd/MM/yyyy");
        }
    }
}
