import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gcq {
   private final gcv a = new gcv();
   private final gcw b;
   private final gck.a c;
   private final gck.a d;
   private final gcl e;

   public gcq(int $$0) {
      this.b = gcw.a($$0);
      SortedMap<gcs, eyp> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gcz.h(), this.a.a(gcs.c()));
         $$0x.put(gcz.i(), this.a.a(gcs.e()));
         $$0x.put(gcz.a(), this.a.a(gcs.d()));
         $$0x.put(gcz.k(), this.a.a(gcs.f()));
         a($$0x, gcz.b());
         a($$0x, gcz.c());
         a($$0x, gcz.d());
         a($$0x, gcz.e());
         a($$0x, gcz.f());
         $$0x.put(gcz.g(), new eyp(786432));
         a($$0x, gcs.j());
         a($$0x, gcs.k());
         a($$0x, gcs.m());
         a($$0x, gcs.n());
         a($$0x, gcs.l());
         a($$0x, gcs.o());
         a($$0x, gcs.p());
         a($$0x, gcs.i());
         gqb.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gck.a(new eyp(1536));
      this.c = gck.a($$1, new eyp(786432));
      this.e = new gcl(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gcs, eyp> $$0, gcs $$1) {
      $$0.put($$1, new eyp($$1.I()));
   }

   public gcv a() {
      return this.a;
   }

   public gcw b() {
      return this.b;
   }

   public gck.a c() {
      return this.c;
   }

   public gck.a d() {
      return this.d;
   }

   public gcl e() {
      return this.e;
   }
}
