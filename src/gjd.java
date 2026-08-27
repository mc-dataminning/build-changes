import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gjd implements gis.a {
   private final fgj a;
   private final Map<aks<dca>, Map<String, ejl>> b = Maps.newIdentityHashMap();
   private final Map<aks<dca>, Map<String, aba.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gjd(fgj $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbc $$0, gfg $$1, double $$2, double $$3, double $$4) {
      ffu $$5 = this.a.j.m();
      aks<dca> $$6 = this.a.r.af();
      ir $$7 = ir.a($$5.b().c, 0.0, $$5.b().e);
      fbg $$8 = $$1.getBuffer(gfo.z());
      if (this.b.containsKey($$6)) {
         for (ejl $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gfe.a(
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

      Map<String, aba.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aba.a $$11 : $$10.values()) {
            ejl $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gfe.a(
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
                  gfe.a(
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

   public void a(ejl $$0, List<aba.a> $$1, aks<dca> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aba.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aba.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
