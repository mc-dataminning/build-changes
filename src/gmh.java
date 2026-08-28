import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gmh {
   private final gmm a = new gmm();
   private final gmn b;
   private final glz.a c;
   private final glz.a d;
   private final gmb e;

   public gmh(int $$0) {
      this.b = gmn.a($$0);
      SequencedMap<gmj, ffs> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gmu.h(), this.a.a(gmj.c()));
         $$0x.put(gmu.i(), this.a.a(gmj.e()));
         $$0x.put(gmu.a(), this.a.a(gmj.d()));
         $$0x.put(gmu.j(), this.a.a(gmj.f()));
         a($$0x, gmu.b());
         a($$0x, gmu.c());
         a($$0x, gmu.d());
         a($$0x, gmu.e());
         a($$0x, gmu.f());
         $$0x.put(gmu.g(), new ffs(786432));
         a($$0x, gmj.j());
         a($$0x, gmj.l());
         a($$0x, gmj.k());
         a($$0x, gmj.m());
         a($$0x, gmj.i());
      });
      this.c = glz.a($$1, new ffs(786432));
      this.e = new gmb(this.c);
      SequencedMap<gmj, ffs> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hhd.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = glz.a($$2, new ffs(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gmj, ffs> $$0, gmj $$1) {
      $$0.put($$1, new ffs($$1.R()));
   }

   public gmm a() {
      return this.a;
   }

   public gmn b() {
      return this.b;
   }

   public glz.a c() {
      return this.c;
   }

   public glz.a d() {
      return this.d;
   }

   public gmb e() {
      return this.e;
   }
}
