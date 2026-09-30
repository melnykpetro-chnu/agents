package ua.lab;

public class UserService {

    /**
     * Формує текстове представлення користувача для виводу.
     *
     * @param user користувач, дані якого потрібно відформатувати
     * @return рядок у форматі "User: {ім'я}"
     */
    public String formatUser(User user) {
        // Додаємо префікс "User: " до імені користувача
        return "User: " + user.getFullName();
    }
}
