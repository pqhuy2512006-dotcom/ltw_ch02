package murach.email;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import murach.business.User;
import murach.data.UserDB;


public class EmailListServlet extends HttpServlet {

    // CHỖ SỬA 1: Đổi HttpServerRequest -> HttpServletRequest, HttpServerProvider -> HttpServletResponse
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
            // CHỖ SỬA 2: Đưa toàn bộ việc lấy dữ liệu, tạo User, gọi DB và setAttribute VÀO TRONG ngoặc nhọn này
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            User user = new User(firstName, lastName, email);
            UserDB.insert(user);
            request.setAttribute("user", user);

            url = "/thanks.jsp";
        } // Đóng ngoặc của else if ở đây

        // CHỖ SỬA 3: Dòng getServletContext này PHẢI NẰM BÊN TRONG hàm doPost (trước dấu đóng ngoặc của doPost)
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    } // Đóng ngoặc kết thúc hàm doPost ở đây

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}