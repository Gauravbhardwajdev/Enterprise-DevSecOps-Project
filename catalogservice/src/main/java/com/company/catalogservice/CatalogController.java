package com.company.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @GetMapping("/products")
    public String products() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Product Catalog</title>
                    <style>
                        * { margin: 0; padding: 0; box-sizing: border-box; }
                        body {
                            font-family: 'Segoe UI', Arial, sans-serif;
                            min-height: 100vh;
                            background: linear-gradient(135deg, #4f46e5 0%, #7c3aed 100%);
                            padding: 48px 20px;
                        }
                        .container {
                            max-width: 900px;
                            margin: 0 auto;
                        }
                        .header {
                            text-align: center;
                            color: #ffffff;
                            margin-bottom: 36px;
                        }
                        .header h1 {
                            font-size: 28px;
                            margin-bottom: 8px;
                        }
                        .header p {
                            font-size: 14px;
                            opacity: 0.85;
                        }
                        .grid {
                            display: grid;
                            grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
                            gap: 20px;
                        }
                        .product-card {
                            background: #ffffff;
                            border-radius: 14px;
                            padding: 24px;
                            box-shadow: 0 12px 28px rgba(0,0,0,0.15);
                            transition: transform 0.2s ease, box-shadow 0.2s ease;
                        }
                        .product-card:hover {
                            transform: translateY(-4px);
                            box-shadow: 0 16px 32px rgba(0,0,0,0.22);
                        }
                        .thumb {
                            width: 48px;
                            height: 48px;
                            border-radius: 10px;
                            background: #ecfdf5;
                            color: #10b981;
                            display: flex;
                            align-items: center;
                            justify-content: center;
                            font-size: 22px;
                            margin-bottom: 16px;
                        }
                        .product-card h3 {
                            color: #1e293b;
                            font-size: 16px;
                            margin-bottom: 6px;
                        }
                        .product-card p {
                            color: #64748b;
                            font-size: 13px;
                            margin-bottom: 16px;
                        }
                        .product-card a {
                            display: inline-block;
                            font-size: 13px;
                            font-weight: 600;
                            color: #4f46e5;
                            text-decoration: none;
                        }
                        .product-card a:hover {
                            text-decoration: underline;
                        }
                        .footer-badge {
                            margin-top: 36px;
                            text-align: center;
                            font-size: 12px;
                            color: #e2e8f0;
                        }
                        .footer-badge span {
                            display: inline-block;
                            width: 8px;
                            height: 8px;
                            border-radius: 50%;
                            background: #34d399;
                            margin-right: 6px;
                        }
                    </style>
                </head>
                <body>
                    <div class="container">
                        <div class="header">
                            <h1>Product Catalog</h1>
                            <p>Browse available products from the catalog service</p>
                        </div>
                        <div class="grid">
                            <div class="product-card">
                                <div class="thumb">&#128230;</div>
                                <h3>Product 101</h3>
                                <p>View details for this item</p>
                                <a href="/products/101">View details &#8594;</a>
                            </div>
                            <div class="product-card">
                                <div class="thumb">&#128230;</div>
                                <h3>Product 102</h3>
                                <p>View details for this item</p>
                                <a href="/products/102">View details &#8594;</a>
                            </div>
                            <div class="product-card">
                                <div class="thumb">&#128230;</div>
                                <h3>Product 103</h3>
                                <p>View details for this item</p>
                                <a href="/products/103">View details &#8594;</a>
                            </div>
                        </div>
                        <div class="footer-badge"><span></span>Catalog Service is UP</div>
                    </div>
                </body>
                </html>
                """;
    }

    @GetMapping("/products/{id}")
    public String productById(@PathVariable String id) {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Product %s</title>
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
                            padding: 44px 40px;
                            border-radius: 16px;
                            box-shadow: 0 20px 40px rgba(0,0,0,0.2);
                            text-align: center;
                            max-width: 360px;
                            width: 90%%;
                        }
                        .thumb {
                            width: 64px;
                            height: 64px;
                            margin: 0 auto 20px;
                            background: #ecfdf5;
                            border-radius: 50%%;
                            display: flex;
                            align-items: center;
                            justify-content: center;
                            font-size: 30px;
                            color: #10b981;
                        }
                        h1 {
                            color: #1e293b;
                            font-size: 22px;
                            margin-bottom: 8px;
                        }
                        p.id {
                            color: #64748b;
                            font-size: 14px;
                            margin-bottom: 28px;
                        }
                        a.back {
                            display: inline-block;
                            font-size: 13px;
                            font-weight: 600;
                            color: #4f46e5;
                            text-decoration: none;
                        }
                        a.back:hover {
                            text-decoration: underline;
                        }
                    </style>
                </head>
                <body>
                    <div class="card">
                        <div class="thumb">&#128230;</div>
                        <h1>Product Details</h1>
                        <p class="id">Product ID: %s</p>
                        <a class="back" href="/products">&#8592; Back to Catalog</a>
                    </div>
                </body>
                </html>
                """.formatted(id, id);
    }

    @GetMapping("/health")
    public String health() {
        return "Catalog Service is UP";
    }
}
