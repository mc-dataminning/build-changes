import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gfd {
   private final gfi a = new gfi();
   private final gfj b;
   private final gex.a c;
   private final gex.a d;
   private final gey e;

   public gfd(int $$0) {
      this.b = gfj.a($$0);
      SequencedMap<gff, fbd> $$1 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gfm.h(), this.a.a(gff.c()));
         $$0x.put(gfm.i(), this.a.a(gff.e()));
         $$0x.put(gfm.a(), this.a.a(gff.d()));
         $$0x.put(gfm.k(), this.a.a(gff.f()));
         a($$0x, gfm.b());
         a($$0x, gfm.c());
         a($$0x, gfm.d());
         a($$0x, gfm.e());
         a($$0x, gfm.f());
         $$0x.put(gfm.g(), new fbd(786432));
         a($$0x, gff.j());
         a($$0x, gff.l());
         a($$0x, gff.k());
         a($$0x, gff.m());
         a($$0x, gff.n());
         a($$0x, gff.i());
         gsq.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gex.a(new fbd(1536));
      this.c = gex.a($$1, new fbd(786432));
      this.e = new gey(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gff, fbd> $$0, gff $$1) {
      $$0.put($$1, new fbd($$1.I()));
   }

   public gfi a() {
      return this.a;
   }

   public gfj b() {
      return this.b;
   }

   public gex.a c() {
      return this.c;
   }

   public gex.a d() {
      return this.d;
   }

   public gey e() {
      return this.e;
   }
}
