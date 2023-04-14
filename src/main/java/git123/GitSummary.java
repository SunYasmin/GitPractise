package git123;

public class GitSummary {

        /*
    -local sadece biz, global gecerli kullanicilar, system herkes
-Terminal kodlari (!!!!!!!!!!  cokkk onemli)
-   Repo=Depo (Repository)
-   git init: Initaliaze iliskilendirme tanimlama yapmak
-   working Space : .git klasorunun bulundugu calisma alanimizdir (yereldedeki)
                    klasor ve dosyalar uzerinden degisiklik burada yapilir
-   Staging Area : Bekleme alanimiz (commit edilecek dosyalar burada bekler, yazici kuyrugu mantigi)
                   versiyon olusturulacak dos veye klsorlerin gecici olarak toplandigi yerdir
                   version (commit) olusturulduktan sonra staging area otmatik olarak bosaltilir
-   Commit Store : Git coomitlerin ayri ayri version olarak tutuldugu yerdir
-   git add . veya git add dosya_adi : projeyi working space deki projeyi Staging Area'ya gonderir
-   git commit : Staging Area'dan Commit Store'a projeyi gondermek icin kullanilir
                    -git commit -m "1.C" : -m  versiyon metni yazdirmak icin, "1.C"'de versiyon metnimiz
-   git log --oneline : git log, Versiyonla ilgili loglar icin; --oneline logun sadece ilk satiri icin
                        -git log butun logu yazdirir
                        - hash_kodu bu komut ile gorulebilir
-   git status : Genel durum ile ilgili bilgi verir

-   git show [hash_kodu] : Versiyondaki değişiklikleri gösterir
                         - hash_kodu 522fdb6 gibi bir koddur ve git log --oneline ile gorulebilir

- Bir repo içinde birden fazla commit olabilir. Bunlardan en son alınan commit’e HEAD denir. 522fdb6 (HEAD -> master) 4.C gibi

- Working space ve
  Stage Area ile ilgili ; - git restore [dosya] :Working spac'deki Tek bir dosyayı iptal eder
                          - git restore .  : Working spac'deki Tüm dosyaları iptal eder
                          - git restore --staged [dosya] : Stage Area'daki Tek bir dosyayı iptal eder
                          - git restore --staged . : Stage Area'daki Tüm dosyaları iptal eder

- Commit Store ile ilgili ; - git checkout [hash] [dosya] : versiyon icindeki "dosya", hash ile belirtilen versiyona döner
                            - git git checkout [hash] .  : Hash değeri verilen versiyona döner
                                                 ==> "." cok onemli eger nokta konulmazsa hash degeri yazilan
                                                         version haricindeki tum versionlar silinir

- Önceki versiyonlara donme; 1. Yontem(Checkout): -git checkout [hash] . komutuyla donulup incelenebilir,
                                                 -git commit –m "3.C" komutuyla kalıcı hale getirilebilir
                                                        * bu yontemde eski versiyonlar kalir istenildiginde donulebilir

                             2. Yontem(Reset):   - git reset --hard [hash] bu komutla hash kodu yazilan versiona donulur
                                                    degisiklikler geri alinamaz
     */


}
