import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gie {
   private final gij a = new gij();
   private final gik b;
   private final ghw.a c;
   private final ghw.a d;
   private final ghy e;

   public gie(int $$0) {
      this.b = gik.a($$0);
      SequencedMap<gig, fdq> $$1 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gir.h(), this.a.a(gig.c()));
         $$0x.put(gir.i(), this.a.a(gig.e()));
         $$0x.put(gir.a(), this.a.a(gig.d()));
         $$0x.put(gir.j(), this.a.a(gig.f()));
         a($$0x, gir.b());
         a($$0x, gir.c());
         a($$0x, gir.d());
         a($$0x, gir.e());
         a($$0x, gir.f());
         $$0x.put(gir.g(), new fdq(786432));
         a($$0x, gig.j());
         a($$0x, gig.l());
         a($$0x, gig.k());
         a($$0x, gig.m());
         a($$0x, gig.i());
      });
      this.c = ghw.a($$1, new fdq(786432));
      this.e = new ghy(this.c);
      SequencedMap<gig, fdq> $$2 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hae.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = ghw.a($$2, new fdq(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gig, fdq> $$0, gig $$1) {
      $$0.put($$1, new fdq($$1.M()));
   }

   public gij a() {
      return this.a;
   }

   public gik b() {
      return this.b;
   }

   public ghw.a c() {
      return this.c;
   }

   public ghw.a d() {
      return this.d;
   }

   public ghy e() {
      return this.e;
   }
}
