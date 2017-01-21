import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by vedmant on 1/21/17.
 */
@WebServlet(name = "HandleServlet", urlPatterns = "/handle")
public class HandleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /**
         * Set session
         */

        HttpSession session = request.getSession(true);
        String sessName = (String) session.getAttribute("name");
        if (sessName == null) {
            sessName = request.getParameter("name");
            session.setAttribute("name", sessName);
        }

        /**
         * Set cookie
         */

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

        RequestDispatcher rd = request.getRequestDispatcher("/show");
        rd.forward(request, response);
    }
}
