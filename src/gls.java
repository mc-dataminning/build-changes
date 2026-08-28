import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gls {
   private final glx a = new glx();
   private final gly b;
   private final glk.a c;
   private final glk.a d;
   private final glm e;

   public gls(int $$0) {
      this.b = gly.a($$0);
      SequencedMap<glu, fgo> $$1 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gmf.h(), this.a.a(glu.c()));
         $$0x.put(gmf.i(), this.a.a(glu.e()));
         $$0x.put(gmf.a(), this.a.a(glu.d()));
         $$0x.put(gmf.j(), this.a.a(glu.f()));
         a($$0x, gmf.b());
         a($$0x, gmf.c());
         a($$0x, gmf.d());
         a($$0x, gmf.e());
         a($$0x, gmf.f());
         $$0x.put(gmf.g(), new fgo(786432));
         a($$0x, glu.j());
         a($$0x, glu.l());
         a($$0x, glu.k());
         a($$0x, glu.m());
         a($$0x, glu.i());
      });
      this.c = glk.a($$1, new fgo(786432));
      this.e = new glm(this.c);
      SequencedMap<glu, fgo> $$2 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hdw.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = glk.a($$2, new fgo(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<glu, fgo> $$0, glu $$1) {
      $$0.put($$1, new fgo($$1.N()));
   }

   public glx a() {
      return this.a;
   }

   public gly b() {
      return this.b;
   }

   public glk.a c() {
      return this.c;
   }

   public glk.a d() {
      return this.d;
   }

   public glm e() {
      return this.e;
   }
}
