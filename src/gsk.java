import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gsk {
   private final gsq a = new gsq();
   private final gsr b;
   private final gsc.a c;
   private final gsc.a d;
   private final gse e;

   public gsk(int $$0) {
      this.b = gsr.a($$0);
      SequencedMap<gsn, fln> $$1 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gsw.h(), this.a.a(gsn.d()));
         $$0x.put(gsw.i(), this.a.a(gsn.f()));
         $$0x.put(gsw.a(), this.a.a(gsn.e()));
         $$0x.put(gsw.j(), this.a.a(gsn.g()));
         a($$0x, gsw.b());
         a($$0x, gsw.c());
         a($$0x, gsw.d());
         a($$0x, gsw.e());
         a($$0x, gsw.f());
         $$0x.put(gsw.g(), new fln(786432));
         a($$0x, gsn.k());
         a($$0x, gsn.m());
         a($$0x, gsn.l());
         a($$0x, gsn.n());
         a($$0x, gsn.j());
      });
      this.c = gsc.a($$1, new fln(786432));
      this.e = new gse(this.c);
      SequencedMap<gsn, fln> $$2 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hnm.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gsc.a($$2, new fln(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gsn, fln> $$0, gsn $$1) {
      $$0.put($$1, new fln($$1.O()));
   }

   public gsq a() {
      return this.a;
   }

   public gsr b() {
      return this.b;
   }

   public gsc.a c() {
      return this.c;
   }

   public gsc.a d() {
      return this.d;
   }

   public gse e() {
      return this.e;
   }
}
