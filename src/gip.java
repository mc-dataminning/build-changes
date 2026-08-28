import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gip {
   private final giu a = new giu();
   private final giv b;
   private final gih.a c;
   private final gih.a d;
   private final gij e;

   public gip(int $$0) {
      this.b = giv.a($$0);
      SequencedMap<gir, fdy> $$1 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gjc.h(), this.a.a(gir.c()));
         $$0x.put(gjc.i(), this.a.a(gir.e()));
         $$0x.put(gjc.a(), this.a.a(gir.d()));
         $$0x.put(gjc.j(), this.a.a(gir.f()));
         a($$0x, gjc.b());
         a($$0x, gjc.c());
         a($$0x, gjc.d());
         a($$0x, gjc.e());
         a($$0x, gjc.f());
         $$0x.put(gjc.g(), new fdy(786432));
         a($$0x, gir.j());
         a($$0x, gir.l());
         a($$0x, gir.k());
         a($$0x, gir.m());
         a($$0x, gir.i());
      });
      this.c = gih.a($$1, new fdy(786432));
      this.e = new gij(this.c);
      SequencedMap<gir, fdy> $$2 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hap.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gih.a($$2, new fdy(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gir, fdy> $$0, gir $$1) {
      $$0.put($$1, new fdy($$1.M()));
   }

   public giu a() {
      return this.a;
   }

   public giv b() {
      return this.b;
   }

   public gih.a c() {
      return this.c;
   }

   public gih.a d() {
      return this.d;
   }

   public gij e() {
      return this.e;
   }
}
