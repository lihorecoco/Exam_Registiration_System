package pdfCreater;

import java.io.FileOutputStream;
import java.sql.Date;

import model.OrganizedStudentData;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFCreator {

	private String FILE ;
	private  Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
	      Font.BOLD);
	private Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
	      Font.NORMAL, BaseColor.RED);
	private Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
	      Font.BOLD);
	private Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
	      Font.BOLD);
	private int count=0;
	public PDFCreator() {
		super();
	}
	
	public void createPDF(OrganizedStudentData organizedStudent) {
			
			FILE= "C:/Users/Canberk Dogan/Desktop/" + organizedStudent.getFirstName() +" " + organizedStudent.getLastName() +".pdf" ;
		  try {
		      Document document = new Document();
		      PdfWriter.getInstance(document, new FileOutputStream(FILE));
		      document.open();
		     
		      addTitlePage(document);
		      createTable(document,organizedStudent);
		      //addContent(document,organizedStudent);
		      document.close();
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
	}  
	  
	private void addTitlePage(Document document) throws DocumentException{
		
		 Paragraph preface = new Paragraph();
		    // We add one empty line
		    //addEmptyLine(preface, 1);
		    // Lets write a big header
		    preface.add(new Paragraph("Exam Card", catFont));

		    addEmptyLine(preface, 1);

		    document.add(preface);
		    
		 
		    
	}
	
	 

	 private void createTable(Document document,OrganizedStudentData organizedStudentData) throws DocumentException
	 {
		 
		 
		 PdfPTable table = new PdfPTable(6);

		    // t.setBorderColor(BaseColor.GRAY);
		    // t.setPadding(4);
		    // t.setSpacing(4);
		    // t.setBorderWidth(1);
		 
		    PdfPCell c1 = new PdfPCell(new Phrase("First Name"));
		    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		   
		    table.addCell(c1);

		    c1 = new PdfPCell(new Phrase("Last Name"));
		    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		   
		    table.addCell(c1);
		  
		    c1 = new PdfPCell(new Phrase("Entered Class"));
		    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		  
		    table.addCell(c1);
		    
		    c1 = new PdfPCell(new Phrase("Desk Number"));
		    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	
		    table.addCell(c1);
		    
		    c1 = new PdfPCell(new Phrase("Session Name"));
		    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		    table.addCell(c1);
		    
		    c1 = new PdfPCell(new Phrase("Session Date and Time"));
		    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		    table.addCell(c1);
		    table.setHeaderRows(1);
		
		    
		  	table.addCell(organizedStudentData.getFirstName());
		    table.addCell(organizedStudentData.getLastName());
		    table.addCell(organizedStudentData.getClassNameToAttend());
		    table.addCell(""+organizedStudentData.getDeskNumber());
		    table.addCell(organizedStudentData.getSessionName());
		    table.addCell(organizedStudentData.getSessionDate());
		
		   document.add(table);
	 }
	 private static void addEmptyLine(Paragraph paragraph, int number) {
		    for (int i = 0; i < number; i++) {
		      paragraph.add(new Paragraph(" "));
		    }

	 }
}
