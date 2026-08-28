import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gmf {
   private final gmk a = new gmk();
   private final gml b;
   private final glx.a c;
   private final glx.a d;
   private final glz e;

   public gmf(int $$0) {
      this.b = gml.a($$0);
      SequencedMap<gmh, ffq> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gms.h(), this.a.a(gmh.c()));
         $$0x.put(gms.i(), this.a.a(gmh.e()));
         $$0x.put(gms.a(), this.a.a(gmh.d()));
         $$0x.put(gms.j(), this.a.a(gmh.f()));
         a($$0x, gms.b());
         a($$0x, gms.c());
         a($$0x, gms.d());
         a($$0x, gms.e());
         a($$0x, gms.f());
         $$0x.put(gms.g(), new ffq(786432));
         a($$0x, gmh.j());
         a($$0x, gmh.l());
         a($$0x, gmh.k());
         a($$0x, gmh.m());
         a($$0x, gmh.i());
      });
      this.c = glx.a($$1, new ffq(786432));
      this.e = new glz(this.c);
      SequencedMap<gmh, ffq> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hhb.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = glx.a($$2, new ffq(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gmh, ffq> $$0, gmh $$1) {
      $$0.put($$1, new ffq($$1.R()));
   }

   public gmk a() {
      return this.a;
   }

   public gml b() {
      return this.b;
   }

   public glx.a c() {
      return this.c;
   }

   public glx.a d() {
      return this.d;
   }

   public glz e() {
      return this.e;
   }
}
