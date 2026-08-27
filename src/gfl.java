import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gfl implements gfa.a {
   private final fde a;
   private final Map<akg<dad>, Map<String, egh>> b = Maps.newIdentityHashMap();
   private final Map<akg<dad>, Map<String, aaq.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gfl(fde $$0) {
      this.a = $$0;
   }

   @Override
   public void a(exx $$0, gbo $$1, double $$2, double $$3, double $$4) {
      fcp $$5 = this.a.j.m();
      akg<dad> $$6 = this.a.r.ae();
      in $$7 = in.a($$5.b().c, 0.0, $$5.b().e);
      eyb $$8 = $$1.getBuffer(gbw.y());
      if (this.b.containsKey($$6)) {
         for (egh $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gbm.a(
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

      Map<String, aaq.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aaq.a $$11 : $$10.values()) {
            egh $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gbm.a(
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
                  gbm.a(
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

   public void a(egh $$0, List<aaq.a> $$1, akg<dad> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aaq.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aaq.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
