# Raita-Algoritmasi
Raita algoritması, veri sıkıştırma algoritmaları için kullanılan bir matematiksel yöntemdir. Bu algoritma, veri sıkıştırma performansını artırarak daha küçük dosya boyutları elde etmek için tasarlanmıştır.

Raita algoritması, ara veri dizisi için Huffman kodlaması ile birlikte kullanılır. Ara veri dizisi, veri sıkıştırma algoritması tarafından üretilen bir ara çıktıdır ve genellikle daha az boyutta olur. Raita algoritması, ara veri dizisi içindeki sıralı elemanların tekrarlarını sıkıştırmak için kullanılır.

Algoritmanın çalışma şekli şu şekildedir:

1. Ara veri dizisi üzerinde bir dizi işlem yapılır. Bu işlemler, elemanların tekrar sayılarının hesaplanması ve fark kodlaması yapılmasıdır.

2. Elemanların tekrar sayıları hesaplanır ve kodlanır. Raita algoritması, 
elemanların tekrar sayılarının önceki elemanın tekrar sayısına göre farklarına dayanır. 
Bu farklar, daha az sayıda bit kullanılarak kodlanabilir.

3.Kodlama işlemi tamamlandıktan sonra, elde edilen veri boyutu, 
Huffman kodlaması ile birleştirilir. Bu, daha iyi bir sıkıştırma oranı elde etmek için yapılır.

Raita algoritması, veri sıkıştırma algoritmalarının bir parçası olarak kullanıldığı için,
 genellikle dosya boyutlarının azaltılması gereken uygulamalarda kullanılır. 
Bu algoritma, daha iyi bir sıkıştırma oranı sağlayarak, daha küçük dosya boyutları elde etmeye yardımcı olur.

Raita algoritmasının zaman karmaşıklığı, veri boyutuna ve elemanların dağılımına bağlıdır.

En iyi durumda, algoritma O(n) zaman karmaşıklığına sahiptir, ancak en kötü durumda O(n^2) zaman karmaşıklığına sahip olabilir. 
Ortalama durumda ise O(n log n) zaman karmaşıklığı beklenir.

En iyi durumda, elemanların tekrar sayıları birbirine çok yakındır 
ve ara veri dizisi küçük boyutlarda olduğunda algoritmanın performansı iyileşir.

En kötü durumda ise, elemanların tekrar sayıları arasındaki farklar büyük olduğunda 
ve ara veri dizisi büyük olduğunda, algoritma yavaşlayabilir.

Algoritmanın zaman karmaşıklığını analiz etmek için, elemanların tekrar sayılarının dağılımını incelemek önemlidir.
Bu, bir veri kümesindeki elemanların benzersizliğine bağlıdır.
Eğer elemanların tekrar sayıları birbirine çok yakın ise, algoritmanın performansı iyi olacaktır. 
Ancak, elemanların tekrar sayıları arasındaki farklar çok büyükse, algoritmanın performansı kötüleşebilir.

Raita algoritması, genellikle veri sıkıştırma algoritmalarının bir parçası olarak kullanıldığından,
algoritmanın performansı, sıkıştırılan verinin türüne, boyutuna ve özelliklerine bağlı olarak değişebilir.

YÖNERGE ---->>> KODU ÇALIŞTIRMAK İÇİN UYGUN OLAN DERLEYİCİLERİ KULLANINIZ (İNTELLJİJ İDEA, NETBEANS , ECLİPSE , VS CODE)
