import java.util.Properties;

import jakarta.mail.Session;

import jakarta.mail.Authenticator; // 追加
import jakarta.mail.Message;       // 追加
import jakarta.mail.PasswordAuthentication; // 追加

import jakarta.mail.Transport;     // 追加
import jakarta.mail.internet.InternetAddress; // 追加
import jakarta.mail.internet.MimeMessage;     // 追加

public class Main {
    public static void main(String[] args){
        // ============================
        // ロリポップの設定
        // ============================
        //自分のメールアドレス
        final String username = "test2@sss-way-8474.vivian.jp";
        //
        final String password = "Trustno1-Trustno1";
        //
        final String smtpServer = "smtp.lolipop.jp";
        //
        final String smtpPort ="465";
        
        // ============================
        // メールの内容
        // ============================

         //送信先のメールアドレス
        final String toEmail ="2511005@i-seifu.jp";
        //送信元のメールアドレス
        final String fromEmail = "tomogane@i-seifu.jp";
        //送信者名
        final String fromName = "友金牧人";
        //件名
        final String subject =  "■6/10（木）開催の企業説明会について";
        //本文
        final String body = """
        お疲れ様です。
        友金です。
        
        ６月10日に企業説明会を開催します
        参加希望の方は以下のURLから申し込みお願いします。
        http://example.com

        以上お願いします
        """;


        // ============================
        // メール送信
        // ============================
     // メール送信の準備
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpServer);    // SMTPサーバーの設定
        props.put("mail.smtp.port", smtpPort);      // SMTPサーバーのポート設定
        props.put("mail.smtp.auth", "true"); // ログインしますか？設定(true=>はい)
        props.put("mail.smtp.ssl.enable", "true");  // セキュアにします？設定(true=>はい)
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        // 認証の設定をしている
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // メール送信
        try {
            // メールを作っている
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail, fromName, "UTF-8"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(body);

            // メール送信実行！！
            Transport.send(message);
            System.out.println("メール送信成功！！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






