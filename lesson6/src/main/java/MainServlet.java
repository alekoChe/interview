import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/hello")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date = new Date();

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        //printWriter.write("Hello World!");

        if (date.getHours() > 10 && date.getHours() <= 18) printWriter.write("Добрый день!");
        if (date.getHours() > 4 && date.getHours() <= 10) printWriter.write("Доброе утро!");
        if (date.getHours() > 18 && date.getHours() <= 24) printWriter.write("Добрый вечер!");
        if (date.getHours() > 0 && date.getHours() <= 4) printWriter.write("Ты че не спишь?");

        printWriter.close();
    }
}

