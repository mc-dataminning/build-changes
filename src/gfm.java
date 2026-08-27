import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gfm {
   private final gfr a = new gfr();
   private final gfs b;
   private final gfg.a c;
   private final gfg.a d;
   private final gfh e;

   public gfm(int $$0) {
      this.b = gfs.a($$0);
      SortedMap<gfo, fax> $$1 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gfv.h(), this.a.a(gfo.c()));
         $$0x.put(gfv.i(), this.a.a(gfo.e()));
         $$0x.put(gfv.a(), this.a.a(gfo.d()));
         $$0x.put(gfv.k(), this.a.a(gfo.f()));
         a($$0x, gfv.b());
         a($$0x, gfv.c());
         a($$0x, gfv.d());
         a($$0x, gfv.e());
         a($$0x, gfv.f());
         $$0x.put(gfv.g(), new fax(786432));
         a($$0x, gfo.j());
         a($$0x, gfo.k());
         a($$0x, gfo.m());
         a($$0x, gfo.n());
         a($$0x, gfo.l());
         a($$0x, gfo.o());
         a($$0x, gfo.p());
         a($$0x, gfo.i());
         gte.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gfg.a(new fax(1536));
      this.c = gfg.a($$1, new fax(786432));
      this.e = new gfh(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gfo, fax> $$0, gfo $$1) {
      $$0.put($$1, new fax($$1.J()));
   }

   public gfr a() {
      return this.a;
   }

   public gfs b() {
      return this.b;
   }

   public gfg.a c() {
      return this.c;
   }

   public gfg.a d() {
      return this.d;
   }

   public gfh e() {
      return this.e;
   }
}
