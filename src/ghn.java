import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ghn implements ghc.a {
   private final ffh a;
   private final Map<ale<dca>, Map<String, eie>> b = Maps.newIdentityHashMap();
   private final Map<ale<dca>, Map<String, abl.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public ghn(ffh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(faa $$0, gdq $$1, double $$2, double $$3, double $$4) {
      fes $$5 = this.a.j.l();
      ale<dca> $$6 = this.a.r.af();
      iz $$7 = iz.a($$5.b().c, 0.0, $$5.b().e);
      fae $$8 = $$1.getBuffer(gdy.y());
      if (this.b.containsKey($$6)) {
         for (eie $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gdo.a(
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
            eie $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gdo.a(
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
                  gdo.a(
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

   public void a(eie $$0, List<abl.a> $$1, ale<dca> $$2) {
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
