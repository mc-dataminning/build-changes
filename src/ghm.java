import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ghm implements ghb.a {
   private final ffg a;
   private final Map<ale<dbz>, Map<String, eid>> b = Maps.newIdentityHashMap();
   private final Map<ale<dbz>, Map<String, abl.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public ghm(ffg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezz $$0, gdp $$1, double $$2, double $$3, double $$4) {
      fer $$5 = this.a.j.l();
      ale<dbz> $$6 = this.a.r.af();
      iz $$7 = iz.a($$5.b().c, 0.0, $$5.b().e);
      fad $$8 = $$1.getBuffer(gdx.y());
      if (this.b.containsKey($$6)) {
         for (eid $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gdn.a(
                  $$0,
                  $$8,
                  (double)$$9.h() - $$2,
                  (double)$$9.i() - $$3,
                  (double)$$9.j() - $$4,
                  (double)($$9.k() + 1) - $$2,
                  (double)($$9.l() + 1) - $$3,
                  (double)($$9.m() + 1) - $$4,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      Map<String, abl.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abl.a $$11 : $$10.values()) {
            eid $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gdn.a(
                     $$0,
                     $$8,
                     (double)$$12.h() - $$2,
                     (double)$$12.i() - $$3,
                     (double)$$12.j() - $$4,
                     (double)($$12.k() + 1) - $$2,
                     (double)($$12.l() + 1) - $$3,
                     (double)($$12.m() + 1) - $$4,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  gdn.a(
                     $$0,
                     $$8,
                     (double)$$12.h() - $$2,
                     (double)$$12.i() - $$3,
                     (double)$$12.j() - $$4,
                     (double)($$12.k() + 1) - $$2,
                     (double)($$12.l() + 1) - $$3,
                     (double)($$12.m() + 1) - $$4,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               }
            }
         }
      }
   }

   public void a(eid $$0, List<abl.a> $$1, ale<dbz> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abl.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abl.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
