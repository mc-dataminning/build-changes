import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gvb implements guo.a {
   private final fpo a;
   private final Map<alf<djh>, Map<String, era>> b = Maps.newIdentityHashMap();
   private final Map<alf<djh>, Map<String, aax.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gvb(fpo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fjy $$0, gqm $$1, double $$2, double $$3, double $$4) {
      fow $$5 = this.a.j.k();
      alf<djh> $$6 = this.a.s.aj();
      iv $$7 = iv.a($$5.b().d, 0.0, $$5.b().f);
      fkc $$8 = $$1.getBuffer(gqx.y());
      if (this.b.containsKey($$6)) {
         for (era $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               grf.a(
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
            era $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  grf.a(
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
                  grf.a(
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

   public void a(era $$0, List<aax.a> $$1, alf<djh> $$2) {
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
