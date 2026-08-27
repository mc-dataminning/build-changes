import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gao {
   private final gat a = new gat();
   private final gau b;
   private final gai.a c;
   private final gai.a d;
   private final gaj e;

   public gao(int $$0) {
      this.b = gau.a($$0);
      SortedMap<gaq, ewm> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gax.h(), this.a.a(gaq.c()));
         $$0x.put(gax.i(), this.a.a(gaq.e()));
         $$0x.put(gax.a(), this.a.a(gaq.d()));
         $$0x.put(gax.k(), this.a.a(gaq.f()));
         a($$0x, gax.b());
         a($$0x, gax.c());
         a($$0x, gax.d());
         a($$0x, gax.e());
         a($$0x, gax.f());
         $$0x.put(gax.g(), new ewm(786432));
         a($$0x, gaq.j());
         a($$0x, gaq.k());
         a($$0x, gaq.m());
         a($$0x, gaq.n());
         a($$0x, gaq.l());
         a($$0x, gaq.o());
         a($$0x, gaq.p());
         a($$0x, gaq.i());
         gnx.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gai.a(new ewm(1536));
      this.c = gai.a($$1, new ewm(786432));
      this.e = new gaj(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gaq, ewm> $$0, gaq $$1) {
      $$0.put($$1, new ewm($$1.I()));
   }

   public gat a() {
      return this.a;
   }

   public gau b() {
      return this.b;
   }

   public gai.a c() {
      return this.c;
   }

   public gai.a d() {
      return this.d;
   }

   public gaj e() {
      return this.e;
   }
}
