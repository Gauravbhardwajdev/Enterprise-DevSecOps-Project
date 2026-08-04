package com.company.loginservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Login Service</title>
                    <style>
                        * { margin: 0; padding: 0; box-sizing: border-box; }
                        body {
                            font-family: 'Segoe UI', Arial, sans-serif;
                            min-height: 100vh;
                            display: flex;
                            align-items: center;
                            justify-content: center;
                            background: linear-gradient(135deg, #4f46e5 0%%, #7c3aed 100%%);
                        }
                        .card {
                            background: #ffffff;
                            padding: 48px 40px;
                            border-radius: 16px;
                            box-shadow: 0 20px 40px rgba(0,0,0,0.2);
                            text-align: center;
                            max-width: 380px;
                            width: 90%%;
                        }
                        .icon {
                            width: 64px;
                            height: 64px;
                            margin: 0 auto 20px;
                            background: #ecfdf5;
                            border-radius: 50%%;
                            display: flex;
                            align-items: center;
                            justify-content: center;
                            font-size: 32px;
                            color: #10b981;
                        }
                        h1 {
                            color: #1e293b;
                            font-size: 24px;
                            margin-bottom: 8px;
                        }
                        p.subtitle {
                            color: #64748b;
                            font-size: 14px;
                            margin-bottom: 28px;
                        }
                        a.btn {
                            display: inline-block;
                            width: 100%%;
                            padding: 14px 20px;
                            background: #4f46e5;
                            color: #ffffff;
                            text-decoration: none;
                            font-weight: 600;
                            font-size: 15px;
                            border-radius: 8px;
                            transition: background 0.2s ease, transform 0.2s ease;
                        }
                        a.btn:hover {
                            background: #4338ca;
                            transform: translateY(-1px);
                        }
                        .badge {
                            margin-top: 24px;
                            font-size: 12px;
                            color: #94a3b8;
                        }
                        .badge span {
                            display: inline-block;
                            width: 8px;
                            height: 8px;
                            border-radius: 50%%;
                            background: #10b981;
                            margin-right: 6px;
                        }
                    </style>
                </head>
                <body>
                    <div class="card">
                        <div class="icon">&#10003;</div>
                        <h1>Login Successful</h1>
                        <p class="subtitle">You're signed in. Continue to the product catalog below.</p>
                        <a class="btn" href="http://65.2.83.97:30082/products">Open Product Catalog &#8594;</a>
                        <div class="badge"><span></span>Login Service is UP</div>
                    </div>
                </body>
                </html>
                """;
    }

    @GetMapping("/register")
    public String register() {
        return "User Registered";
    }

    @GetMapping("/health")
    public String health() {
        return "Login Service is UP";
    }
}
