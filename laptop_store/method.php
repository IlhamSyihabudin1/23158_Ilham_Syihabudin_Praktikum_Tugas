<?php
require_once "koneksi.php";

class Laptop {
    private $conn;

    public function __construct() {
        global $koneksi;
        $this->conn = $koneksi;
    }

    public function get_laptops() {
        $query = "SELECT * FROM laptop";
        $result = mysqli_query($this->conn, $query);
        $data = [];

        while ($row = mysqli_fetch_assoc($result)) {
            $data[] = $row;
        }

        header('Content-Type: application/json');
        echo json_encode($data);
    }

    public function get_laptop($id) {
        $stmt = $this->conn->prepare("SELECT * FROM laptop WHERE id = ?");
        $stmt->bind_param("i", $id);
        $stmt->execute();
        $result = $stmt->get_result();
        $row = $result->fetch_assoc();

        header('Content-Type: application/json');
        echo json_encode($row ?: ["message" => "Laptop not found"]);
    }

    public function insert_laptop() {
        $data = json_decode(file_get_contents("php://input"), true);

        if (!isset($data["nama_laptop"], $data["merk"], $data["spek"], $data["qty"])) {
            http_response_code(400);
            echo json_encode(["message" => "Invalid input"]);
            return;
        }

        $stmt = $this->conn->prepare("INSERT INTO laptop (nama_laptop, merk, spek, qty) VALUES (?, ?, ?, ?)");
        $stmt->bind_param("sssi", $data["nama_laptop"], $data["merk"], $data["spek"], $data["qty"]);

        if ($stmt->execute()) {
            $response = ["message" => "Laptop inserted"];
        } else {
            $response = ["message" => "Insert failed", "error" => $stmt->error];
        }

        header('Content-Type: application/json');
        echo json_encode($response);
    }

    public function update_laptop($id) {
        $data = json_decode(file_get_contents("php://input"), true);

        if (!isset($data["nama_laptop"], $data["merk"], $data["spek"], $data["qty"])) {
            http_response_code(400);
            echo json_encode(["message" => "Invalid input"]);
            return;
        }

        $stmt = $this->conn->prepare("UPDATE laptop SET nama_laptop=?, merk=?, spek=?, qty=? WHERE id=?");
        $stmt->bind_param("sssii", $data["nama_laptop"], $data["merk"], $data["spek"], $data["qty"], $id);

        if ($stmt->execute()) {
            $response = ["message" => "Laptop updated"];
        } else {
            $response = ["message" => "Update failed", "error" => $stmt->error];
        }

        header('Content-Type: application/json');
        echo json_encode($response);
    }

    public function delete_laptop($id) {
        $stmt = $this->conn->prepare("DELETE FROM laptop WHERE id = ?");
        $stmt->bind_param("i", $id);

        if ($stmt->execute()) {
            $response = ["message" => "Laptop deleted"];
        } else {
            $response = ["message" => "Delete failed", "error" => $stmt->error];
        }

        header('Content-Type: application/json');
        echo json_encode($response);
    }
}
?>
