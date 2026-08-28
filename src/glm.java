import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class glm {
   private final glr a = new glr();
   private final gls b;
   private final gle.a c;
   private final gle.a d;
   private final glg e;

   public glm(int $$0) {
      this.b = gls.a($$0);
      SequencedMap<glo, fgi> $$1 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(glz.h(), this.a.a(glo.c()));
         $$0x.put(glz.i(), this.a.a(glo.e()));
         $$0x.put(glz.a(), this.a.a(glo.d()));
         $$0x.put(glz.j(), this.a.a(glo.f()));
         a($$0x, glz.b());
         a($$0x, glz.c());
         a($$0x, glz.d());
         a($$0x, glz.e());
         a($$0x, glz.f());
         $$0x.put(glz.g(), new fgi(786432));
         a($$0x, glo.j());
         a($$0x, glo.l());
         a($$0x, glo.k());
         a($$0x, glo.m());
         a($$0x, glo.i());
      });
      this.c = gle.a($$1, new fgi(786432));
      this.e = new glg(this.c);
      SequencedMap<glo, fgi> $$2 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hdq.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gle.a($$2, new fgi(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<glo, fgi> $$0, glo $$1) {
      $$0.put($$1, new fgi($$1.N()));
   }

   public glr a() {
      return this.a;
   }

   public gls b() {
      return this.b;
   }

   public gle.a c() {
      return this.c;
   }

   public gle.a d() {
      return this.d;
   }

   public glg e() {
      return this.e;
   }
}
