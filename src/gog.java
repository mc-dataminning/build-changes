import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gog {
   private final gol a = new gol();
   private final gom b;
   private final gny.a c;
   private final gny.a d;
   private final goa e;

   public gog(int $$0) {
      this.b = gom.a($$0);
      SequencedMap<goi, fhl> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(got.h(), this.a.a(goi.c()));
         $$0x.put(got.i(), this.a.a(goi.e()));
         $$0x.put(got.a(), this.a.a(goi.d()));
         $$0x.put(got.j(), this.a.a(goi.f()));
         a($$0x, got.b());
         a($$0x, got.c());
         a($$0x, got.d());
         a($$0x, got.e());
         a($$0x, got.f());
         $$0x.put(got.g(), new fhl(786432));
         a($$0x, goi.j());
         a($$0x, goi.l());
         a($$0x, goi.k());
         a($$0x, goi.m());
         a($$0x, goi.i());
      });
      this.c = gny.a($$1, new fhl(786432));
      this.e = new goa(this.c);
      SequencedMap<goi, fhl> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hjc.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gny.a($$2, new fhl(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<goi, fhl> $$0, goi $$1) {
      $$0.put($$1, new fhl($$1.R()));
   }

   public gol a() {
      return this.a;
   }

   public gom b() {
      return this.b;
   }

   public gny.a c() {
      return this.c;
   }

   public gny.a d() {
      return this.d;
   }

   public goa e() {
      return this.e;
   }
}
