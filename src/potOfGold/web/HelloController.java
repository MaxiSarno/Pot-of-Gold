package potOfGold.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

import potOfGold.PotOfGoldBaseClass;

/**
 * @author Maxi Sarno
 *
 * History:
 *
 * date			user		description
 * ---------------------------------------------
 * 03/02/2012	Maxi Sarno	creation
 *
 */
public class HelloController extends PotOfGoldBaseClass implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning hello view");

        return new ModelAndView("hello.jsp");
    }

}
