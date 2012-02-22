package open.dolphin.rest;

import java.io.IOException;
import javax.naming.InitialContext;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import open.dolphin.session.UserServiceBeanLocal;
import java.util.logging.Logger;

/**
 *
 * @author Kazushi Minagawa, Digital Globe, Inc.
 */
public final class LogFilter implements Filter {

    Logger logger = Logger.getLogger(getClass().getName());

    private static final String USER_NAME = "userName";
    private static final String PASSWORD = "password";
    private static final String UNAUTHORIZED_USER = "Unauthorized user: ";

    private UserServiceBeanLocal userService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        try {
            userService = EJBLocator.getUserServiceBean();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        String userName = req.getHeader(USER_NAME);
        String password = req.getHeader(PASSWORD);
        //System.err.println(userName);
        //System.err.println(password);

        boolean authentication = userService.authenticate(userName, password);

        if (!authentication) {
            HttpServletResponse res = (HttpServletResponse)response;
            StringBuilder sbd = new StringBuilder();
            sbd.append(UNAUTHORIZED_USER);
            sbd.append(userName).append(": ").append(req.getRequestURI());
            String msg = sbd.toString();
            logger.warning(msg);
            res.sendError(401);
            return;
        }

        BlockWrapper wrapper = new BlockWrapper(req);
        wrapper.setRemoteUser(userName);

        StringBuilder sb = new StringBuilder();
        sb.append(wrapper.getRemoteAddr()).append(" ");
        sb.append(wrapper.getShortUser()).append(" ");
        sb.append(wrapper.getMethod()).append(" ");
        sb.append(wrapper.getRequestURI());
        logger.fine(sb.toString());

        chain.doFilter(wrapper, response);
    }

    @Override
    public void destroy() {
    }
}
