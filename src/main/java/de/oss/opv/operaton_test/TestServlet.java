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
        resp.setContentType("text/plain");
        if (identityService != null) {
            resp.getWriter().write("BINGO! IdentityService has been successfully injected via CDI!");
        } else {
            resp.getWriter().write("ERROR: IdentityService is NULL!");
        }
    }
}