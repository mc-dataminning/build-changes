import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gvg implements gut.a {
   private final fpt a;
   private final Map<alf<djm>, Map<String, erf>> b = Maps.newIdentityHashMap();
   private final Map<alf<djm>, Map<String, aax.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gvg(fpt $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fkd $$0, gqr $$1, double $$2, double $$3, double $$4) {
      fpb $$5 = this.a.j.k();
      alf<djm> $$6 = this.a.s.aj();
      iv $$7 = iv.a($$5.b().d, 0.0, $$5.b().f);
      fkh $$8 = $$1.getBuffer(grc.y());
      if (this.b.containsKey($$6)) {
         for (erf $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               grk.a(
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

      Map<String, aax.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aax.a $$11 : $$10.values()) {
            erf $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  grk.a(
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
                  grk.a(
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

   public void a(erf $$0, List<aax.a> $$1, alf<djm> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aax.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aax.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
