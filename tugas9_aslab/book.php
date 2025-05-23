<?php

class Book {
    private $code_book;
    private $name;
    private $qty;

    public function __construct($code_book, $name, $qty) {
        if ($this->isValidCodeBook($code_book)) {
            $this->setCodeBook($code_book);
        } else {
            echo "❌ Error: Format code_book harus BB00 (2 huruf kapital + 2 angka)\n";
        }

        $this->name = $name;

        if ($this->isValidQty($qty)) {
            $this->setQty($qty);
        } else {
            echo "❌ Error: qty harus berupa bilangan bulat positif lebih dari 0\n";
        }
    }

    // Setter code_book (private)
    private function setCodeBook($code_book) {
        $this->code_book = $code_book;
    }

    // Getter code_book
    public function getCodeBook() {
        return $this->code_book;
    }

    // Setter qty (private)
    private function setQty($qty) {
        $this->qty = $qty;
    }

    // Getter qty
    public function getQty() {
        return $this->qty;
    }

    // Getter name (tidak perlu validasi)
    public function getName() {
        return $this->name;
    }

    // Validasi code_book
    private function isValidCodeBook($code_book) {
        return preg_match('/^[A-Z]{2}[0-9]{2}$/', $code_book);
    }

    // Validasi qty
    private function isValidQty($qty) {
        return is_int($qty) && $qty > 0;
    }
}

// 🔹 Tes: data valid
echo "--- DATA VALID ---\n";
$book1 = new Book("AB12", "PHP Dasar", 10);
echo "Kode: " . $book1->getCodeBook() . "\n";
echo "Nama: " . $book1->getName() . "\n";
echo "Qty : " . $book1->getQty() . "\n";

// 🔸 Tes: data tidak valid
echo "\n--- DATA INVALID ---\n";
$book2 = new Book("A123", "JavaScript", -3); // salah format dan qty