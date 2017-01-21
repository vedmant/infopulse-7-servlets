import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vedmant on 1/21/17.
 */
@WebServlet(name = "MyServlet", urlPatterns = "/test")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String name = null;

        if (cookies != null) {
            for (Cookie cookie: cookies) {
                if (cookie.getName().equals("name")) {
                    name = cookie.getValue();
                }
            }
        }

        if (name == null) {
            name = request.getParameter("name");
            Cookie cookie = new Cookie("name", name);
            cookie.setMaxAge(5);
            response.addCookie(cookie);
        }

        String name1 = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<p>Hello, " + name1 + "</p>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }
}
