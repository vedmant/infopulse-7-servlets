import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by vedmant on 1/21/17.
 */
@WebServlet(name = "ShowServlet", urlPatterns = "/show")
public class ShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession(true);

        /**
         * Show response
         */

        String name1 = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<p>Hello, " + name1 + "</p>");
        pw.println("<p>Cookies: </p>");
        for (Cookie cookie : cookies) {
            pw.println("<p>Key: " + cookie.getName() + "; Value: " + cookie.getValue() + "</p>");
        }
        pw.println("<p>Session: </p>");
        Enumeration<String> keys = session.getAttributeNames();
        while(keys.hasMoreElements()) {
            String key = keys.nextElement();
            pw.println("<p>Key: " + key + "; Value: " + session.getAttribute(key) + "</p>");
        }
        pw.println("<p>Filter: " + request.getAttribute("filter") + "</p>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }
}
