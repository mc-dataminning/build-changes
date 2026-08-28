import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gds {
   private final gdx a = new gdx();
   private final gdy b;
   private final gdm.a c;
   private final gdm.a d;
   private final gdn e;

   public gds(int $$0) {
      this.b = gdy.a($$0);
      SortedMap<gdu, ezr> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(geb.h(), this.a.a(gdu.c()));
         $$0x.put(geb.i(), this.a.a(gdu.e()));
         $$0x.put(geb.a(), this.a.a(gdu.d()));
         $$0x.put(geb.k(), this.a.a(gdu.f()));
         a($$0x, geb.b());
         a($$0x, geb.c());
         a($$0x, geb.d());
         a($$0x, geb.e());
         a($$0x, geb.f());
         $$0x.put(geb.g(), new ezr(786432));
         a($$0x, gdu.j());
         a($$0x, gdu.k());
         a($$0x, gdu.m());
         a($$0x, gdu.n());
         a($$0x, gdu.l());
         a($$0x, gdu.o());
         a($$0x, gdu.p());
         a($$0x, gdu.i());
         grd.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gdm.a(new ezr(1536));
      this.c = gdm.a($$1, new ezr(786432));
      this.e = new gdn(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gdu, ezr> $$0, gdu $$1) {
      $$0.put($$1, new ezr($$1.I()));
   }

   public gdx a() {
      return this.a;
   }

   public gdy b() {
      return this.b;
   }

   public gdm.a c() {
      return this.c;
   }

   public gdm.a d() {
      return this.d;
   }

   public gdn e() {
      return this.e;
   }
}
