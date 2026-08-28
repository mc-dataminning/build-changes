import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gjo {
   private final gjt a = new gjt();
   private final gju b;
   private final gjg.a c;
   private final gjg.a d;
   private final gji e;

   public gjo(int $$0) {
      this.b = gju.a($$0);
      SequencedMap<gjq, feo> $$1 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gkb.h(), this.a.a(gjq.c()));
         $$0x.put(gkb.i(), this.a.a(gjq.e()));
         $$0x.put(gkb.a(), this.a.a(gjq.d()));
         $$0x.put(gkb.j(), this.a.a(gjq.f()));
         a($$0x, gkb.b());
         a($$0x, gkb.c());
         a($$0x, gkb.d());
         a($$0x, gkb.e());
         a($$0x, gkb.f());
         $$0x.put(gkb.g(), new feo(786432));
         a($$0x, gjq.j());
         a($$0x, gjq.l());
         a($$0x, gjq.k());
         a($$0x, gjq.m());
         a($$0x, gjq.i());
      });
      this.c = gjg.a($$1, new feo(786432));
      this.e = new gji(this.c);
      SequencedMap<gjq, feo> $$2 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hbq.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gjg.a($$2, new feo(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gjq, feo> $$0, gjq $$1) {
      $$0.put($$1, new feo($$1.M()));
   }

   public gjt a() {
      return this.a;
   }

   public gju b() {
      return this.b;
   }

   public gjg.a c() {
      return this.c;
   }

   public gjg.a d() {
      return this.d;
   }

   public gji e() {
      return this.e;
   }
}
