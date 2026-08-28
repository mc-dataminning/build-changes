import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gqu {
   private final gra a = new gra();
   private final grb b;
   private final gqm.a c;
   private final gqm.a d;
   private final gqo e;

   public gqu(int $$0) {
      this.b = grb.a($$0);
      SequencedMap<gqx, fjv> $$1 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(grg.h(), this.a.a(gqx.c()));
         $$0x.put(grg.i(), this.a.a(gqx.e()));
         $$0x.put(grg.a(), this.a.a(gqx.d()));
         $$0x.put(grg.j(), this.a.a(gqx.f()));
         a($$0x, grg.b());
         a($$0x, grg.c());
         a($$0x, grg.d());
         a($$0x, grg.e());
         a($$0x, grg.f());
         $$0x.put(grg.g(), new fjv(786432));
         a($$0x, gqx.j());
         a($$0x, gqx.l());
         a($$0x, gqx.k());
         a($$0x, gqx.m());
         a($$0x, gqx.i());
      });
      this.c = gqm.a($$1, new fjv(786432));
      this.e = new gqo(this.c);
      SequencedMap<gqx, fjv> $$2 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hlt.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gqm.a($$2, new fjv(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gqx, fjv> $$0, gqx $$1) {
      $$0.put($$1, new fjv($$1.V()));
   }

   public gra a() {
      return this.a;
   }

   public grb b() {
      return this.b;
   }

   public gqm.a c() {
      return this.c;
   }

   public gqm.a d() {
      return this.d;
   }

   public gqo e() {
      return this.e;
   }
}
