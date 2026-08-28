import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class ght {
   private final ghy a = new ghy();
   private final ghz b;
   private final ghl.a c;
   private final ghl.a d;
   private final ghn e;

   public ght(int $$0) {
      this.b = ghz.a($$0);
      SequencedMap<ghv, fdf> $$1 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gig.h(), this.a.a(ghv.c()));
         $$0x.put(gig.i(), this.a.a(ghv.e()));
         $$0x.put(gig.a(), this.a.a(ghv.d()));
         $$0x.put(gig.j(), this.a.a(ghv.f()));
         a($$0x, gig.b());
         a($$0x, gig.c());
         a($$0x, gig.d());
         a($$0x, gig.e());
         a($$0x, gig.f());
         $$0x.put(gig.g(), new fdf(786432));
         a($$0x, ghv.j());
         a($$0x, ghv.l());
         a($$0x, ghv.k());
         a($$0x, ghv.m());
         a($$0x, ghv.i());
      });
      this.c = ghl.a($$1, new fdf(786432));
      this.e = new ghn(this.c);
      SequencedMap<ghv, fdf> $$2 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> gzp.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = ghl.a($$2, new fdf(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<ghv, fdf> $$0, ghv $$1) {
      $$0.put($$1, new fdf($$1.M()));
   }

   public ghy a() {
      return this.a;
   }

   public ghz b() {
      return this.b;
   }

   public ghl.a c() {
      return this.c;
   }

   public ghl.a d() {
      return this.d;
   }

   public ghn e() {
      return this.e;
   }
}
