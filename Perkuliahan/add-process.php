// add-process.php
<?php
include 'koneksi.php';

$npm = $_POST['npm'];
$nama = $_POST['nama'];
$jurusan = $_POST['jurusan'];
$alamat = $_POST['alamat'];
$kodemk = $_POST['kodemk'];
$namamk = $_POST['namamk'];
$sks = $_POST['sks'];

$koneksi->query("INSERT IGNORE INTO mahasiswa (npm, nama, jurusan, alamat) VALUES ('$npm', '$nama', '$jurusan', '$alamat')");
$koneksi->query("INSERT IGNORE INTO matakuliah (kodemk, nama, jumlah_sks) VALUES ('$kodemk', '$namamk', '$sks')");
$koneksi->query("INSERT INTO krs (npm, kodemk) VALUES ('$npm', '$kodemk')");
header("Location: index.php");
?>
