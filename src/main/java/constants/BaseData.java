package constants;

public class BaseData {

    public interface Login {
        String EMAIL_ID = "faizal.prakoso@smartfren.com";
        String PIN = "545454";
        String INVALID_EMAIL_ID = "haris@smart.com";
        String SWITCH_NUMBER = "088906011294";
        String PIN2 = "142839";
    }

    public interface LaunchPage {
        String WELCOME_EN = "Hi, There!";
        String WELCOME_DESC_EN = "You can log in by using email or switch number that has been registered.";
        String WELCOME_DESC_ID = "Kamu bisa log in menggunakan email atau nomor switch yang telah terdaftar.";
        String WELCOME_DESC_SIGN_UP_EN = "Enter your email address or register via social media.";
        String WELCOME_DESC_SIGN_UP_ID = "Silakan masukkan alamat emailmu atau daftar melalui sosial media.";
    }

    public interface Validation {
        String VALIDATION_USERNAME_TITLE_EN = "Email Not Registered";
        String VALIDATION_USERNAME_DESC_EN = "You can register and create your account now!";
        String VALIDATION_LOGIN_PAGE = "Log in";
        String VALIDATION_REGISTER_PAGE = "Sign up";
        String VALIDATION_USERNAME_1 = "Faizal Akbar Prakoso";
        String VALIDATION_USERNAME_2 = "Satrio Panji Prakoso";
        String VALIDATION_ALT_PHONE_1 = "8194120194";
        String VALIDATION_ALT_PHONE_2 = "8881850440";
        String VALIDATION_ALREADY_REGISTERED_TITLE_EN = "Email Registered";
        String VALIDATION_ALREADY_REGISTERED_DESC_EN = "You can log in to your switch account now!";
    }

    public interface HomePage {
        String GUEST_NAME = "Hi, Guest";
    }
}
