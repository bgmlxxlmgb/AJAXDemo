import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bgm on 2015/12/23.
 */
public class ChangeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println("1111111111111111");
        response.setCharacterEncoding("UTF-8");
        String demo = request.getParameter("demo");
        System.out.println(demo);
        PrintWriter out = response.getWriter();
        out.print("dddddd"+demo);
        System.out.println("2222222222222222");
    }
}
