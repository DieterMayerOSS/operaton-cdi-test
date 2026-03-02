package de.oss.opv.operaton_test;

import org.operaton.bpm.engine.IdentityService;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/check")
public class TestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    // THE MOMENT OF TRUTH
    @Inject
    private IdentityService identityService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        
        long userCount = identityService.createUserQuery().count();
        
        resp.setContentType("text/plain");
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>BINGO! - Operaton CDI Test</h1>");
        resp.getWriter().println("<p>IdentityService injected!</p>");
        resp.getWriter().println("<p>Anzahl User: " + userCount + "</p>");
    }
}