import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gqz {
   private final grf a = new grf();
   private final grg b;
   private final gqr.a c;
   private final gqr.a d;
   private final gqt e;

   public gqz(int $$0) {
      this.b = grg.a($$0);
      SequencedMap<grc, fka> $$1 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(grl.h(), this.a.a(grc.c()));
         $$0x.put(grl.i(), this.a.a(grc.e()));
         $$0x.put(grl.a(), this.a.a(grc.d()));
         $$0x.put(grl.j(), this.a.a(grc.f()));
         a($$0x, grl.b());
         a($$0x, grl.c());
         a($$0x, grl.d());
         a($$0x, grl.e());
         a($$0x, grl.f());
         $$0x.put(grl.g(), new fka(786432));
         a($$0x, grc.j());
         a($$0x, grc.l());
         a($$0x, grc.k());
         a($$0x, grc.m());
         a($$0x, grc.i());
      });
      this.c = gqr.a($$1, new fka(786432));
      this.e = new gqt(this.c);
      SequencedMap<grc, fka> $$2 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hma.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gqr.a($$2, new fka(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<grc, fka> $$0, grc $$1) {
      $$0.put($$1, new fka($$1.V()));
   }

   public grf a() {
      return this.a;
   }

   public grg b() {
      return this.b;
   }

   public gqr.a c() {
      return this.c;
   }

   public gqr.a d() {
      return this.d;
   }

   public gqt e() {
      return this.e;
   }
}
