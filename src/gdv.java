import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gdv {
   private final gea a = new gea();
   private final geb b;
   private final gdp.a c;
   private final gdp.a d;
   private final gdq e;

   public gdv(int $$0) {
      this.b = geb.a($$0);
      SortedMap<gdx, ezu> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gee.h(), this.a.a(gdx.c()));
         $$0x.put(gee.i(), this.a.a(gdx.e()));
         $$0x.put(gee.a(), this.a.a(gdx.d()));
         $$0x.put(gee.k(), this.a.a(gdx.f()));
         a($$0x, gee.b());
         a($$0x, gee.c());
         a($$0x, gee.d());
         a($$0x, gee.e());
         a($$0x, gee.f());
         $$0x.put(gee.g(), new ezu(786432));
         a($$0x, gdx.j());
         a($$0x, gdx.k());
         a($$0x, gdx.m());
         a($$0x, gdx.n());
         a($$0x, gdx.l());
         a($$0x, gdx.o());
         a($$0x, gdx.p());
         a($$0x, gdx.i());
         grg.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gdp.a(new ezu(1536));
      this.c = gdp.a($$1, new ezu(786432));
      this.e = new gdq(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gdx, ezu> $$0, gdx $$1) {
      $$0.put($$1, new ezu($$1.I()));
   }

   public gea a() {
      return this.a;
   }

   public geb b() {
      return this.b;
   }

   public gdp.a c() {
      return this.c;
   }

   public gdp.a d() {
      return this.d;
   }

   public gdq e() {
      return this.e;
   }
}
