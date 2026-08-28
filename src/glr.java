import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class glr {
   private final glw a = new glw();
   private final glx b;
   private final glj.a c;
   private final glj.a d;
   private final gll e;

   public glr(int $$0) {
      this.b = glx.a($$0);
      SequencedMap<glt, fgn> $$1 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gme.h(), this.a.a(glt.c()));
         $$0x.put(gme.i(), this.a.a(glt.e()));
         $$0x.put(gme.a(), this.a.a(glt.d()));
         $$0x.put(gme.j(), this.a.a(glt.f()));
         a($$0x, gme.b());
         a($$0x, gme.c());
         a($$0x, gme.d());
         a($$0x, gme.e());
         a($$0x, gme.f());
         $$0x.put(gme.g(), new fgn(786432));
         a($$0x, glt.j());
         a($$0x, glt.l());
         a($$0x, glt.k());
         a($$0x, glt.m());
         a($$0x, glt.i());
      });
      this.c = glj.a($$1, new fgn(786432));
      this.e = new gll(this.c);
      SequencedMap<glt, fgn> $$2 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hdv.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = glj.a($$2, new fgn(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<glt, fgn> $$0, glt $$1) {
      $$0.put($$1, new fgn($$1.N()));
   }

   public glw a() {
      return this.a;
   }

   public glx b() {
      return this.b;
   }

   public glj.a c() {
      return this.c;
   }

   public glj.a d() {
      return this.d;
   }

   public gll e() {
      return this.e;
   }
}
