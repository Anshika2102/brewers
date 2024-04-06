// package utils;

// import com.twilio.Twilio;
// import com.twilio.rest.api.v2010.account.Message;

// public class SMSSender {

//     public static void sendSMS(String phone, String otp) {
//         System.out.println("Generated one:" + otp);

//         Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//         Message message = Message.creator(
//                 new com.twilio.type.PhoneNumber("+91" + phone),
//                 "Hello and welcome to TDF. Your otp for verification is:" + otp).create();

//         System.out.println(message.getBody());
//         System.out.println("OTP has been sent.");

//     }
// }