<?php
include 'koneksi.php';

$query = "
    SELECT krs.id, m.npm, m.nama AS nama_mhs, m.jurusan, m.alamat,
           mk.kodemk, mk.nama AS namamk, mk.jumlah_sks AS sks
    FROM krs
    JOIN mahasiswa m ON krs.mahasiswa_npm = m.npm
    JOIN matakuliah mk ON krs.matakuliah_kodemk = mk.kodemk
";
$result = $koneksi->query($query);
?>

<!DOCTYPE html>
<html>
<head>
    <title>Data KRS</title>
    <style>
        input, select, textarea { width: 100%; margin-bottom: 10px; }
        table { width: 100%; border-collapse: collapse; margin-top: 20px; }
        th, td { padding: 8px; border: 1px solid #ccc; text-align: left; }
    </style>
</head>
<body>
    <h2>Form KRS Mahasiswa</h2>
    <form action="add-process.php" method="POST">
        <fieldset>
            <legend>Data Mahasiswa</legend>
            NPM: <input type="text" name="npm" required>
            Nama: <input type="text" name="nama" required>
            Jurusan: 
            <select name="jurusan" required>
                <option value="Informatika">Informatika</option>
                <option value="Sistem Informasi">Sistem Informasi</option>
            </select>
            Alamat: <textarea name="alamat" rows="3" required></textarea>
        </fieldset>
        <fieldset>
            <legend>Data Mata Kuliah</legend>
            Kode: <input type="text" name="kodemk" required>
            Nama Matkul: <input type="text" name="namamk" required>
            SKS: <input type="number" name="sks" required>
        </fieldset>
        <button type="submit">Simpan</button>
    </form>

    <h2>Data KRS</h2>
    <table>
        <tr>
            <th>No</th>
            <th>Nama Lengkap</th>
            <th>Mata Kuliah</th>
            <th>Keterangan</th>
            <th>Aksi</th>
        </tr>
        <?php
        $no = 1;
        while ($row = $result->fetch_assoc()) {
            echo "<tr>
                <td>$no</td>
                <td>{$row['nama_mhs']}</td>
                <td>{$row['namamk']}</td>
                <td>{$row['nama_mhs']} Mengambil Mata Kuliah {$row['namamk']} [{$row['sks']}]</td>
                <td>
                    <a href='edit.php?id={$row['id']}'>Edit</a> | 
                    <a href='delete.php?id={$row['id']}' onclick=\"return confirm('Yakin ingin menghapus?')\">Hapus</a>
                </td>
            </tr>";
            $no++;
        }
        ?>
    </table>
</body>
</html>
