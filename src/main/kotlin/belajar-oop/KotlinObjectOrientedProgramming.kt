package oop

/**
 * Object Oriented Programming adalah sudut pandang bahasa pemrograman yang berkonsep object
 * Ada banyak sudut pandang seperti Functional Programming, Prosedural Programming
 * Namun, saat ini OOP yang paling populer
 * Hampir semua pemrograman mengadopsi OOP, seperti : Java, Python, Javascript, C#
 * Ada beberapa istilah yang perlu di mengerti dalam OOP yaitu : Object dan Class

 * Apa itu Object?
 * Object itu data seperti String, Boolean, Int dll yg sudah dipelajari di Kotlin Dasar
 * Object sendiri adalah data yang berisi properties (fields atau attributes) dan function (methods atau behaviour)
 * Di dalam Number, Boolean, Character, String sebenarnya di dalamnya ada properties

 * Apa itu Class?
 * Class adalah blueprint, prototype atau cetakan untuk membuat Object
 * tanpa Class tidak tidak bisa membuat Object. Sebuah Class bisa menurunkan Object tanpa batas
 * seperti saat kita membuat Variabel dari Number atau lainnya, Variabel itu adalah Object dari kelas Number
 * dari Number itu kita bisa membuat banyak Variabel atau Class. Artinya blueprint (Object Numbernya) cuma 1 tapi Classnya bisa banyak
 *
 * Contoh Class dan Object: Person
 * kita membuat blueprint (Class) Person dengan :
 * 1. properties String firstName; lastName
 * 2. function(param) sayHello(String name); sayGoodBye(String name)
 *
 * dari Class Person di atas kita bisa membuat lebih dari 1 Object, misal :
 * 1. Object pertama dengan firstName -> "Eko"; lastName -> "Kurniawan"
 * 2. Object kedua dengan firstName -> "Brezy"; lastName -> "Baihaqi"
 * 3. Object ketiga dengan firstName -> "Nur"; lastName -> "Nisa"
 */