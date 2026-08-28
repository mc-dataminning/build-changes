import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gsi {
   private final gso a = new gso();
   private final gsp b;
   private final gsa.a c;
   private final gsa.a d;
   private final gsc e;

   public gsi(int $$0) {
      this.b = gsp.a($$0);
      SequencedMap<gsl, fll> $$1 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gsu.h(), this.a.a(gsl.d()));
         $$0x.put(gsu.i(), this.a.a(gsl.f()));
         $$0x.put(gsu.a(), this.a.a(gsl.e()));
         $$0x.put(gsu.j(), this.a.a(gsl.g()));
         a($$0x, gsu.b());
         a($$0x, gsu.c());
         a($$0x, gsu.d());
         a($$0x, gsu.e());
         a($$0x, gsu.f());
         $$0x.put(gsu.g(), new fll(786432));
         a($$0x, gsl.k());
         a($$0x, gsl.m());
         a($$0x, gsl.l());
         a($$0x, gsl.n());
         a($$0x, gsl.j());
      });
      this.c = gsa.a($$1, new fll(786432));
      this.e = new gsc(this.c);
      SequencedMap<gsl, fll> $$2 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hnk.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gsa.a($$2, new fll(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gsl, fll> $$0, gsl $$1) {
      $$0.put($$1, new fll($$1.O()));
   }

   public gso a() {
      return this.a;
   }

   public gsp b() {
      return this.b;
   }

   public gsa.a c() {
      return this.c;
   }

   public gsa.a d() {
      return this.d;
   }

   public gsc e() {
      return this.e;
   }
}
