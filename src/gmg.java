import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gmg {
   private final gml a = new gml();
   private final gmm b;
   private final gly.a c;
   private final gly.a d;
   private final gma e;

   public gmg(int $$0) {
      this.b = gmm.a($$0);
      SequencedMap<gmi, ffr> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gmt.h(), this.a.a(gmi.c()));
         $$0x.put(gmt.i(), this.a.a(gmi.e()));
         $$0x.put(gmt.a(), this.a.a(gmi.d()));
         $$0x.put(gmt.j(), this.a.a(gmi.f()));
         a($$0x, gmt.b());
         a($$0x, gmt.c());
         a($$0x, gmt.d());
         a($$0x, gmt.e());
         a($$0x, gmt.f());
         $$0x.put(gmt.g(), new ffr(786432));
         a($$0x, gmi.j());
         a($$0x, gmi.l());
         a($$0x, gmi.k());
         a($$0x, gmi.m());
         a($$0x, gmi.i());
      });
      this.c = gly.a($$1, new ffr(786432));
      this.e = new gma(this.c);
      SequencedMap<gmi, ffr> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hhc.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gly.a($$2, new ffr(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gmi, ffr> $$0, gmi $$1) {
      $$0.put($$1, new ffr($$1.R()));
   }

   public gml a() {
      return this.a;
   }

   public gmm b() {
      return this.b;
   }

   public gly.a c() {
      return this.c;
   }

   public gly.a d() {
      return this.d;
   }

   public gma e() {
      return this.e;
   }
}
