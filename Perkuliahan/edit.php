<?php
include 'koneksi.php';

$id = $_GET['id'];
$query = $koneksi->query("
    SELECT krs.id, m.npm, m.nama AS nama_mhs, m.jurusan, m.alamat,
           mk.kodemk, mk.nama AS namamk, mk.jumlah_sks AS sks
    FROM krs
    JOIN mahasiswa m ON krs.mahasiswa_npm = m.npm
    JOIN matakuliah mk ON krs.matakuliah_kodemk = mk.kodemk
    WHERE krs.id = $id
");

$data = $query->fetch_assoc();
?>

<!DOCTYPE html>
<html>
<head><title>Edit KRS</title></head>
<body>
<h2>Edit Data KRS</h2>
<form action="edit-process.php" method="POST">
    <input type="hidden" name="id" value="<?= $data['id'] ?>">
    NPM: <input type="text" name="npm" value="<?= $data['npm'] ?>" readonly><br>
    Nama: <input type="text" name="nama" value="<?= $data['nama_mhs'] ?>"><br>
    Jurusan: 
    <select name="jurusan">
        <option <?= $data['jurusan'] == 'Informatika' ? 'selected' : '' ?>>Informatika</option>
        <option <?= $data['jurusan'] == 'Sistem Informasi' ? 'selected' : '' ?>>Sistem Informasi</option>
    </select><br>
    Alamat: <textarea name="alamat"><?= $data['alamat'] ?></textarea><br>

    Kode: <input type="text" name="kodemk" value="<?= $data['kodemk'] ?>"><br>
    Nama Matkul: <input type="text" name="namamk" value="<?= $data['namamk'] ?>"><br>
    SKS: <input type="number" name="sks" value="<?= $data['sks'] ?>"><br>

    <button type="submit">Update</button>
</form>
</body>
</html>
