package murach.email;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.time.LocalDate;
import murach.business.Survey;
import murach.data.UserDB;


public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.html";
        }
        else if (action.equals("add")) {
            Survey survey = new Survey();

            survey.setFirstName(request.getParameter("firstName"));
            survey.setLastName(request.getParameter("lastName"));
            survey.setEmail(request.getParameter("email"));

            String dobString = request.getParameter("dob");
            if(dobString != null && !dobString.isEmpty()){
                survey.setDob(LocalDate.parse(dobString));
            }

            String c1 = request.getParameter("c1");
            survey.setWantsAnnouncements((c1 != null) ? "Yes" : "No");

            String c2 = request.getParameter("c2");
            survey.setWantsSpecialOffers((c2 != null) ? "Yes" : "No");

            String[] countries = request.getParameterValues("country");
            if(countries != null){
                String joinedCountries = String.join(", ", countries);
                survey.setContactMethod(joinedCountries);
            }

            System.out.println("Form submitted for: " + survey.getFirstName() + " " + survey.getlastName());

            request.setAttribute("survey", survey);

            url = "/thanks.jsp";
        }



        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}