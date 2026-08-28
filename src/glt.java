import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class glt {
   private final gly a = new gly();
   private final glz b;
   private final gll.a c;
   private final gll.a d;
   private final gln e;

   public glt(int $$0) {
      this.b = glz.a($$0);
      SequencedMap<glv, fgp> $$1 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gmg.h(), this.a.a(glv.c()));
         $$0x.put(gmg.i(), this.a.a(glv.e()));
         $$0x.put(gmg.a(), this.a.a(glv.d()));
         $$0x.put(gmg.j(), this.a.a(glv.f()));
         a($$0x, gmg.b());
         a($$0x, gmg.c());
         a($$0x, gmg.d());
         a($$0x, gmg.e());
         a($$0x, gmg.f());
         $$0x.put(gmg.g(), new fgp(786432));
         a($$0x, glv.j());
         a($$0x, glv.l());
         a($$0x, glv.k());
         a($$0x, glv.m());
         a($$0x, glv.i());
      });
      this.c = gll.a($$1, new fgp(786432));
      this.e = new gln(this.c);
      SequencedMap<glv, fgp> $$2 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hdx.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gll.a($$2, new fgp(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<glv, fgp> $$0, glv $$1) {
      $$0.put($$1, new fgp($$1.N()));
   }

   public gly a() {
      return this.a;
   }

   public glz b() {
      return this.b;
   }

   public gll.a c() {
      return this.c;
   }

   public gll.a d() {
      return this.d;
   }

   public gln e() {
      return this.e;
   }
}
