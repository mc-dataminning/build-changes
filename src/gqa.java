import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gqa {
   private final gqf a = new gqf();
   private final gqg b;
   private final gps.a c;
   private final gps.a d;
   private final gpu e;

   public gqa(int $$0) {
      this.b = gqg.a($$0);
      SequencedMap<gqc, fiz> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gqn.h(), this.a.a(gqc.c()));
         $$0x.put(gqn.i(), this.a.a(gqc.e()));
         $$0x.put(gqn.a(), this.a.a(gqc.d()));
         $$0x.put(gqn.j(), this.a.a(gqc.f()));
         a($$0x, gqn.b());
         a($$0x, gqn.c());
         a($$0x, gqn.d());
         a($$0x, gqn.e());
         a($$0x, gqn.f());
         $$0x.put(gqn.g(), new fiz(786432));
         a($$0x, gqc.j());
         a($$0x, gqc.l());
         a($$0x, gqc.k());
         a($$0x, gqc.m());
         a($$0x, gqc.i());
      });
      this.c = gps.a($$1, new fiz(786432));
      this.e = new gpu(this.c);
      SequencedMap<gqc, fiz> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hkz.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gps.a($$2, new fiz(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gqc, fiz> $$0, gqc $$1) {
      $$0.put($$1, new fiz($$1.R()));
   }

   public gqf a() {
      return this.a;
   }

   public gqg b() {
      return this.b;
   }

   public gps.a c() {
      return this.c;
   }

   public gps.a d() {
      return this.d;
   }

   public gpu e() {
      return this.e;
   }
}
