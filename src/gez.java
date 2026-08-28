import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gez {
   private final gfe a = new gfe();
   private final gff b;
   private final get.a c;
   private final get.a d;
   private final geu e;

   public gez(int $$0) {
      this.b = gff.a($$0);
      SortedMap<gfb, faz> $$1 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gfi.h(), this.a.a(gfb.c()));
         $$0x.put(gfi.i(), this.a.a(gfb.e()));
         $$0x.put(gfi.a(), this.a.a(gfb.d()));
         $$0x.put(gfi.k(), this.a.a(gfb.f()));
         a($$0x, gfi.b());
         a($$0x, gfi.c());
         a($$0x, gfi.d());
         a($$0x, gfi.e());
         a($$0x, gfi.f());
         $$0x.put(gfi.g(), new faz(786432));
         a($$0x, gfb.j());
         a($$0x, gfb.l());
         a($$0x, gfb.k());
         a($$0x, gfb.m());
         a($$0x, gfb.n());
         a($$0x, gfb.i());
         gsl.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = get.a(new faz(1536));
      this.c = get.a($$1, new faz(786432));
      this.e = new geu(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gfb, faz> $$0, gfb $$1) {
      $$0.put($$1, new faz($$1.G()));
   }

   public gfe a() {
      return this.a;
   }

   public gff b() {
      return this.b;
   }

   public get.a c() {
      return this.c;
   }

   public get.a d() {
      return this.d;
   }

   public geu e() {
      return this.e;
   }
}
