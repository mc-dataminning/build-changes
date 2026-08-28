import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gmd {
   private final gmi a = new gmi();
   private final gmj b;
   private final glv.a c;
   private final glv.a d;
   private final glx e;

   public gmd(int $$0) {
      this.b = gmj.a($$0);
      SequencedMap<gmf, ffp> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gmq.h(), this.a.a(gmf.c()));
         $$0x.put(gmq.i(), this.a.a(gmf.e()));
         $$0x.put(gmq.a(), this.a.a(gmf.d()));
         $$0x.put(gmq.j(), this.a.a(gmf.f()));
         a($$0x, gmq.b());
         a($$0x, gmq.c());
         a($$0x, gmq.d());
         a($$0x, gmq.e());
         a($$0x, gmq.f());
         $$0x.put(gmq.g(), new ffp(786432));
         a($$0x, gmf.j());
         a($$0x, gmf.l());
         a($$0x, gmf.k());
         a($$0x, gmf.m());
         a($$0x, gmf.i());
      });
      this.c = glv.a($$1, new ffp(786432));
      this.e = new glx(this.c);
      SequencedMap<gmf, ffp> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hgw.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = glv.a($$2, new ffp(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gmf, ffp> $$0, gmf $$1) {
      $$0.put($$1, new ffp($$1.R()));
   }

   public gmi a() {
      return this.a;
   }

   public gmj b() {
      return this.b;
   }

   public glv.a c() {
      return this.c;
   }

   public glv.a d() {
      return this.d;
   }

   public glx e() {
      return this.e;
   }
}
