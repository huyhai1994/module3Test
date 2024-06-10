<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entities.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: huyhai1994
  Date: 6/10/24
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% List<Product> products = (List<Product>) request.getAttribute("products"); %>

<html>
<head>
    <title>Quản Lý Thông Tin Sản Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">
</head>
<body>

<div class="container-fluid">
    <div class="row d-flex align-items-center border-bottom mb-2" id="menu-admin">
        <div class="col-md-2">
            <img src="https://i.gyazo.com/d936cdcc28e1f6d50c8b30eef7255d3d.png" alt="logo" width="100%" height="auto">
        </div>
        <div class="col-md-7">
            <h3 class="text-center">Danh sach quan ly san pham</h3>
        </div>
        <div class="col-md-3">
            <div class="row">
                <nav class="navbar navbar-expand-lg">
                    <form action="#" class="d-flex" role="search" method="post">
                        <input class="form-control me-2 w-100" type="search" placeholder="Find Product"
                               aria-label="Search">
                        <button class="btn btn-outline-success mx-2 " type="submit"><i
                                class="fa-solid fa-magnifying-glass"></i></button>
                    </form>
                    <!--Button Add-->
                    <div>
                        <button type="button" class="btn btn-primary" data-bs-toggle="modal"
                                data-bs-target="#exampleModal">
                            <i class="fa-solid fa-square-plus"></i> ADD
                        </button>
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title fs-5" id="exampleModalLabel">New Product</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <div class="mb-3">
                                            <label for="nameProduct" class="form-label">Name</label>
                                            <input class="form-control" id="nameProduct">
                                        </div>
                                        <div class="mb-3">
                                            <label for="priceProduct" class="form-label">Price</label>
                                            <input class="form-control" id="priceProduct">
                                        </div>
                                        <div class="mb-3">
                                            <label for="quantityProduct" class="form-label">Quantity</label>
                                            <input class="form-control" id="quantityProduct">
                                        </div>
                                        <div class="mb-3">
                                            <label for="colorProduct" class="form-label">Color</label>
                                            <input class="form-control" id="colorProduct">
                                        </div>
                                        <div class="mb-3">
                                            <label for="descriptionProduct" class="form-label">Description</label>
                                            <input class="form-control" id="descriptionProduct">
                                        </div>
                                        <div class="mb-3">
                                            <div class="dropdown">
                                                <button class="btn btn-secondary dropdown-toggle" type="button"
                                                        data-bs-toggle="dropdown" aria-expanded="false">
                                                    Category
                                                </button>
                                                <ul class="dropdown-menu">
                                                    <li><a class="dropdown-item" href="#">Smart Phone</a></li>
                                                    <li><a class="dropdown-item" href="#">TV</a></li>
                                                    <li><a class="dropdown-item" href="#">Laptop</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">
                                                Huỷ
                                            </button>
                                            <button type="button" class="btn btn-primary">Lưu</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Button Add-->
                </nav>
            </div>
        </div>
    </div>
    <div class="row m-2">
        <div class="col-md-2">

        </div>
        <div class="col-md-8 border">
            <div class="container-fluid py-2">
                <div class="row">
                    <div class="col-md-12">
                        <div class="row">
                            <div class="col-md-2">
                                <label for="productName" class="form-label">Product Name</label>
                                <input class="form-control" id="productName" placeholder="Enter Product Name">
                            </div>
                            <div class="col-md-2">
                                <label for="price" class="form-label">Price</label>
                                <input class="form-control" id="price" placeholder="Enter Price">
                            </div>
                            <div class="col-md-2">
                                <label for="category" class="form-label">Category</label>
                                <input class="form-control" id="category" placeholder="Enter Category">
                            </div>
                            <div class="col-md-2">
                                <label for="color" class="form-label">Category</label>
                                <input class="form-control" id="color" placeholder="Enter Color">
                            </div>
                            <div class="col-md-2">
                                <p>Clear</p>
                                <button><i class="fa-solid fa-rotate"></i></button>
                            </div>
                            <div class="col-md-2">
                                <form action="#" class="d-flex" role="search" method="post">
                                    <button class="btn btn-outline-success mx-2 " type="submit"><i
                                            class="fa-solid fa-magnifying-glass">Search</i></button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <table class="table table-bordered table-hover text-center">
                <thead>
                <tr>
                    <th>
                        #
                    </th>
                    <th>
                        Product Name
                    </th>
                    <th>
                        Price
                    </th>
                    <th>
                        Quantity
                    </th>
                    <th>
                        Color
                    </th>
                    <th>
                        Category
                    </th>
                    <th width="150px">
                        Acion
                    </th>
                </tr>
                </thead>
                <c:set var="i" value="1"/>
                <c:forEach items="${products}" var="product">
                    <tr>
                        <td><c:out value="${i}"/></td>
                        <td><c:out value="${product.name}"/></td>
                        <td><c:out value="${product.price}"/></td>
                        <td><c:out value="${product.quantity}"/> </td>
                        <td><c:out value="${product.category}"/></td>
                        <td>
                            <button type="button" class="btn btn-success"><i class="fa-solid fa-user-pen"></i></button>
                            <!--Modal Delete-->
                            <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                                    data-bs-target="#staticBackdrop">
                                <i class="fa-solid fa-trash-can"></i>
                            </button>
                            <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static"
                                 data-bs-keyboard="false"
                                 tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h1 class="modal-title fs-5 text-danger" id="staticBackdropLabel">Are you
                                                sure
                                                you want to delete this product?</h1>
                                            <butrningn type="button" class="btn-close" data-bs-dismiss="modal"
                                                       aria-label="Close"></butrningn>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Huỷ
                                                Bỏ
                                            </button>
                                            <button type="button" class="btn btn-danger">Xác Nhận</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <c:set var="i" value="${i + 1}"/>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<div class="container-fluid footer">
    <div class="text-center p-1 text-white">
        <p>© 2024 Bản quyền thuộc về Điện Máy Xanh.</p>
    </div>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
</body>
</html>
