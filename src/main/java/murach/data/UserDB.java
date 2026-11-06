
// Khai báo package murach.data.
// Đây là package chuyên chứa các class làm việc với dữ liệu.
package murach.data;

// Import class User từ package murach.business.
// UserDB cần User để nhận thông tin người dùng dưới dạng đối tượng.
import murach.business.User;


// Khai báo class UserDB.
// Class này chịu trách nhiệm xử lý các thao tác liên quan đến dữ liệu User.
public class UserDB {

    // ==========================================
    // 1. PHƯƠNG THỨC INSERT()
    // ==========================================

    // public: Có thể được gọi từ các class bên ngoài.
    // static: Gọi trực tiếp bằng tên class, không cần tạo đối tượng.
    // long: Kiểu dữ liệu trả về là số nguyên 64 bit.
    // insert: Tên phương thức.
    // User user: Nhận một đối tượng User làm tham số.

    public static long insert(User user) {

        // TODO: Đánh dấu vị trí cần bổ sung code sau này.
        // Ở đây có thể viết code kết nối Database bằng JDBC hoặc JPA.
        // Ví dụ: INSERT INTO Users (firstName, lastName, email)
        //        VALUES (?, ?, ?)

        // Hiện tại chưa thực hiện INSERT vào Database.
        // return 0: Trả về giá trị 0 để mô phỏng kết quả.
        // 0 ở đây KHÔNG có nghĩa là đã lưu thành công.
        return 0;
    }
}
