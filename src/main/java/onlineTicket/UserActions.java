package onlineTicket;


import java.time.LocalDateTime;
import java.util.Date;

/**
 * Интерфейс, определяющий действия пользователя.
 */
interface UserActions {
    boolean authorize();
    boolean selectRoute();
    boolean checkTicketAvailability();
    boolean checkFunds();
}

