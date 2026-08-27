import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gbu {
   private final gbz a = new gbz();
   private final gca b;
   private final gbo.a c;
   private final gbo.a d;
   private final gbp e;

   public gbu(int $$0) {
      this.b = gca.a($$0);
      SortedMap<gbw, exs> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gcd.h(), this.a.a(gbw.c()));
         $$0x.put(gcd.i(), this.a.a(gbw.e()));
         $$0x.put(gcd.a(), this.a.a(gbw.d()));
         $$0x.put(gcd.k(), this.a.a(gbw.f()));
         a($$0x, gcd.b());
         a($$0x, gcd.c());
         a($$0x, gcd.d());
         a($$0x, gcd.e());
         a($$0x, gcd.f());
         $$0x.put(gcd.g(), new exs(786432));
         a($$0x, gbw.j());
         a($$0x, gbw.k());
         a($$0x, gbw.m());
         a($$0x, gbw.n());
         a($$0x, gbw.l());
         a($$0x, gbw.o());
         a($$0x, gbw.p());
         a($$0x, gbw.i());
         gpe.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gbo.a(new exs(1536));
      this.c = gbo.a($$1, new exs(786432));
      this.e = new gbp(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gbw, exs> $$0, gbw $$1) {
      $$0.put($$1, new exs($$1.I()));
   }

   public gbz a() {
      return this.a;
   }

   public gca b() {
      return this.b;
   }

   public gbo.a c() {
      return this.c;
   }

   public gbo.a d() {
      return this.d;
   }

   public gbp e() {
      return this.e;
   }
}
