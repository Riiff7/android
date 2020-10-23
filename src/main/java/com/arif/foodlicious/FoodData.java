package com.arif.foodlicious;

import java.util.ArrayList;

public class FoodData {

    private static String[] foodnames = {
            "Mie Aceh",
            "Bika Ambon",
            "Rendang",
            "Gulai Ikan Patin",
            "Otak Otak",
            "Pempek",
            "Mie Bangka",
            "Seruit",
            "Sate Bandeng",
            "Gudeg",
            "Soto Banjar"
    };

    private static String[] namadaerah = {
            "Aceh",
            "Sumatera Utara",
            "Sumatera Barat",
            "Jambi",
            "Kepulauan Riau",
            "Palembang",
            "Bangka Belitung",
            "Lampung",
            "Banten",
            "Yogyakarta",
            "Kalimantan Selatan"
    };



    private static String[] detailfood={

            "\t\tMie Aceh adalah masakan mie pedas khas Aceh di Indonesia. Mie kuning tebal dengan irisan daging sapi, daging kambing atau makanan laut (udang dan cumi) disajikan dalam sup sejenis kari yang gurih dan pedas. Mie Aceh tersedia dalam dua jenis, Mie Aceh Goreng (digoreng dan kering) dan Mie Aceh Kuah (sup). Biasanya ditaburi bawang goreng dan disajikan bersama emping, potongan bawang merah, mentimun, dan jeruk nipis. saya sudah pernah makan nih, rasanya enak, banyak bumbunya.",
            "\t\tBika ambon adalah sejenis penganan asli Indonesia. Terbuat dari bahan-bahan seperti telur, gula, dan santan, bika ambon umumnya dijual dengan rasa pandan, meskipun kini juga tersedia rasa-rasa lainnya seperti durian, keju, dan cokelat.\n" +
                    "Asal-muasal bika ambon tidak diketahui dengan jelas. Walaupun namanya mengandung kata \"ambon\", bika ambon justru dikenal sebagai oleh-oleh khas Kota Medan, Sumatera Utara. Di Medan, Jalan Majapahit di daerah Medan Petisah merupakan kawasan penjualan bika ambon yang paling terkenal. Di sana terdapat sedikitnya 40 toko yang menjual kue ini. bika ambon ga usah di tanya lagi rasanya manis, enaak.",
             "\t\tRendang (bahasa Minang: Randang) adalah salah satu masakan tradisional Minangkabau yang menggunakan daging dan santan kelapa sebagai bahan utama dengan kandungan bumbu rempah-rempah yang kaya. Masakan dengan citarasa yang pedas ini digemari oleh seluruh kalangan masyarakat, dan dapat ditemukan di seluruh Rumah Makan Padang di Indonesia, Malaysia, ataupun di negara lainnya. Masakan ini kadang lebih dikenal dengan nama Rendang Padang, padahal rendang merupakan masakan khas Minang secara umum.\n" +
                     "Pada tahun 2011, rendang dinobatkan sebagai hidangan peringkat pertama dalam daftar World’s 50 Most Delicious Foods (50 Hidangan Terlezat Dunia) yang digelar oleh CNN International.",
            "\t\tGulai Ikan Patin adalah masakan yang populer di masyarakat Jambi.Gulai ini dimasak dengan menggunakan tempoyak yaitu daging buah durian yang telah difermentasi. Tetapi ada sebagian orang yang memilih untuk mengganti tempoyak dengan santan kelapa untuk menghindari bau dan rasa tempoyak yang cukup menyengat. Selain tempoyak bumbu lain yang digunakan dalam pembuatan Gulai Ikan Patin ini adalah cabe merah, lengkuas, serai, kunyit, bawang merah dan bawang putih",
            "\t\tOtak-otak adalah salah satu makanan khas di Kepulauan Riau, baik di Batam, Tanjung Pinang, maupun di Pulau Penyengat. Pokoknya dimanapun kita makan, penganan ini tidak pernah ketinggalan. Di sini terdapat dua jenis otak-otak yaitu otak-otak yang terbuat dari ikan dan dari cumi yang lebih pedas. Otak-otak ini dibungkus dengan daun kelapa yang berwarna hijau sekalian dengan lidinya, yang kemudian dibakar dengan bara api.",
            "\t\tPempek atau Empek-empek adalah makanan khas Palembang yang terbuat dari ikan dan sagu. Sebenarnya sulit untuk mengatakan bahwa pempek pusatnya adalah Palembang karena hampir di semua daerah di Sumatera Selatan memproduksinya.\n" +
                    "Penyajian pempek ditemani oleh saus berwarna hitam kecoklat-coklatan yang disebut cuka atau cuko (bahasa Palembang). Cuko dibuat dari air yang dididihkan, kemudian ditambah gula merah, udang ebi dan cabe rawit tumbuk, bawang putih, dan garam. Bagi masyarakat asli Palembang, cuko dari dulu dibuat pedas untuk menambah nafsu makan. Namun seiring masuknya pendatang dari luar pulau Sumatera maka saat ini banyak ditemukan cuko dengan rasa manis bagi yang tidak menyukai pedas. Cuko dapat melindungi gigi dari karies (kerusakan lapisan email dan dentin). Karena dalam satu liter larutan kuah pempek biasanya terdapat 9-13 ppm fluor. satu pelengkap dalam menyantap makanan berasa khas ini adalah irisan dadu timun segar dan mie kuning.",
            "\t\tMie atau mi Bangka adalah salah satu dari sekian banyak ciri khas masyarakat pulau bangka, terbuat dari mie basah (kuning) biasa yang disiram dengan kuah berbumbu yang biasanya terbuah dari ikan, udang, cumi, atau kepiting. dan seringkali ditambahi dengan toge atau kecambah, mentimun atau timun, dan kerupuk, lezat bila dihidangkan waktu masih panas, dan ditambahi rasa pedas dari cabe.",
            "\t\tSeruit adalah makanan khas provinsi Lampung, Indonesia, yaitu masakan ikan yang digoreng atau dibakar dicampur sambel terasi, tempoyak (olahan durian) atau mangga. Jenis ikan adalah besarnya ikan sungai seperti belide, baung, layis dll, ditambah lalapan. Sedangkan minumannya adalah serbat, terbuat dari jus buah mangga kwini. Di toko-toko makanan dan oleh-oleh, juga terdapat makanan khas yaitu sambel Lampung, lempok (dodol), keripik pisang, kerupuk kemplang, manisan dll.",
            "\t\tSate bandeng merupakan makanan khas Banten. Berbeda dengan ikan bandeng biasa, daging sate bandeng empuk dan tidak bertulang. Karena kekhasannya, sate bandeng menjadi oleh-oleh dari Banten.\n" +
                    "Banten adalah propinsi yang paling muda di Pulau Jawa. Sebelumnya, Banten merupakan bagian dari propinsi Jawa Barat.",
            "\t\tGudeg (bahasa Jawa gudheg) adalah makanan khas Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tahu dan sambal goreng krecek.",
            "\t\tSoto Banjar adalah soto khas suku Banjar, Kalimantan Selatan dengan bahan utama ayam dan beraroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkeh. Soto berisi daging ayam yang sudah disuwir-suwir, dengan tambahan perkedel atau kentang rebus, rebusan telur, dan ketupat.\n" +
                    "Seperti halnya soto ayam, bumbu Soto Banjar berupa bawang merah, bawang putih dan merica, tapi tidak memakai kunyit. Bumbu ditumis lebih dulu dengan sedikit minyak goreng atau minyak samin hingga harum sebelum dimasukkan ke dalam kuah rebusan ayam. Rempah-rempah nantinya diangkat agar tidak ikut masuk ke dalam mangkuk sewaktu dihidangkan.",


    };


    public int[][] foodimages ={
            {R.drawable.mieaceh,R.drawable.mieaceh2,R.drawable.mieaceh3,R.drawable.mieaceh4},
            {R.drawable.bikaambon,R.drawable.bikaambon2,R.drawable.bikaambon3,R.drawable.bikaambon4},
            {R.drawable.rendang,R.drawable.rendang2,R.drawable.rendang3,R.drawable.rendang4},
            {R.drawable.gulaiikanpatin,R.drawable.gulaipatin2,R.drawable.gulaipatin3,R.drawable.gulaipatin4},
            {R.drawable.otak,R.drawable.otak2,R.drawable.otak3,R.drawable.otak4},
            {R.drawable.pempek,R.drawable.pempek2,R.drawable.pempek3,R.drawable.pempek4},
            {R.drawable.miebangka,R.drawable.mieangka2,R.drawable.mieangka3,R.drawable.mieangka4},
            {R.drawable.seruit,R.drawable.seruit2,R.drawable.seruit3,R.drawable.seruit4},
            {R.drawable.bandeng,R.drawable.bandeng2,R.drawable.bandeng3,R.drawable.bandeng4},
            {R.drawable.gudeg,R.drawable.gudeg2,R.drawable.gudeg3,R.drawable.gudeg4},
            {R.drawable.sotobanjar,R.drawable.sotobanjar2,R.drawable.sotobanjar3,R.drawable.sotobanjar4}

    };


    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodnames.length; position++) {
            Food food = new Food();
            food.setNama(foodnames[position]);
            food.setNamaDaerah(namadaerah[position]);
            food.setDetailMakanan(detailfood[position]);

            food.setImage(position);
            list.add(food);
        }
        return list;
    }


    public int[][] getFoodimages() {
        return foodimages;
    }
}

