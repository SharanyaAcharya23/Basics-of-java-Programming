
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String numberParam = request.getParameter("number");
        int number = 0;
        boolean isPrime = true;

        out.println("<html><body>");

        try {
            number = Integer.parseInt(numberParam);

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                out.println("<h2>" + number + " is a Prime Number.</h2>");
            } else {
                out.println("<h2>" + number + " is NOT a Prime Number.</h2>");
            }

        } catch (NumberFormatException e) {
            out.println("<h2>Invalid input. Please enter a valid integer.</h2>");
        }

        out.println("<a href='index.html'>Try Again</a>");
        out.println("</body></html>");
    }
}
