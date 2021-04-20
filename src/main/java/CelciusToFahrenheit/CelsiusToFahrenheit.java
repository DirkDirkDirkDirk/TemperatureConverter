package CelciusToFahrenheit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CelsiusToFahrenheit", value = "/CelsiusToFahrenheit")
public class CelsiusToFahrenheit extends HttpServlet {

    private Converter converter;

    public void init() throws ServletException {
        converter = new Converter();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType =
                "<!DOCTYPE HTML>\n";
        String title = "Convert temperatures!!";
        out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                "</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +
                "  <P>Degrees in Celsius: " +
                request.getParameter("temperature") + "\n" +
                "  <P>Degrees in FAHRENHEIT: " +
                (converter.convert((request.getParameter("temperature")))) +
                "</BODY></HTML>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
