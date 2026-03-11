<p align="center"> <img src="https://capsule-render.vercel.app/api?type=waving&color=0:3DDC84,100:2E7D32&height=200&section=header&text=Fragment%20Navigation%20101&fontSize=40&fontColor=ffffff"/>
</p> <p align="center"> Android'de <b>Fragment</b> ve <b>Navigation Component</b> kullanımını öğretmek için hazırlanmış basit ve öğretici bir örnek proje. </p> 
<p align="center">

## 📖 Proje Hakkında

FragmentAndNav101, Android uygulamalarında kullanılan Fragment yapısını ve Navigation Component’i öğrenmek için hazırlanmış örnek bir projedir.

Bu proje özellikle şu kişiler için uygundur:

1. Android öğrenmeye yeni başlayanlar

2. Fragment mantığını anlamak isteyen geliştiriciler

3. Navigation Component kullanmayı öğrenmek isteyenler

## ✨ Temel Özellikler

    ✅ Navigation Graph: Uygulama akışının görselleştirilmesi ve tek merkezden yönetimi.

    ✅ Safe Args: Sayfalar arası güvenli veri transferi.

    ✅ Fragment Lifecycle: Fragment yaşam döngüsüne uygun yönetim.

    ✅ Backstack Yönetimi: Geri tuşu davranışının özelleştirilmesi.
    
## 🧱 Uygulama Mimarisi

Projede Single Activity Architecture kullanılmıştır.

<img src="screenshots/app_architecture.png" width="500" height="300">

| Bileşen         | Açıklama                               |
| --------------- | -------------------------------------- |
| MainActivity    | Uygulamanın tek activity’si            |
| NavHostFragment | Fragment geçişlerini yöneten container |
| LoginFragment   | Kullanıcı giriş ekranı                 |
| UserFragment    | Kullanıcı bilgileri ekranı             |

## 🧭 Navigation Akışı

Kullanıcı giriş yaptıktan sonra User ekranına yönlendirilir.

<img src="screenshots/navigasyon_akisi.png" width="400" height="300">

## 📱 Uygulama Görselleri
|Login Screen |Login Error| User Screen |
|:---:|:---:|:---:|
|<img src="screenshots/loginfragment.png" width="248" height="572">| <img src="screenshots/loginfragment_error.png" width="248" height="572"> |<img src="screenshots/userfragment.png" width="248" height="572">|

## 🎬 Uygulama Demo
<p align="center"> <img src="screenshots/FragNavAnim.gif" width="248" height="572"> </p>

**Geliştirici:** [Bilişim EML](https://github.com/bilisimeml)  [Akif KORKMAZ](https://github.com/akifkorkmaz)

**Yıl:** 2026

