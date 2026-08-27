import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fuo implements fud.a {
   private final etd a;
   private final Map<agh<csa>, Map<String, dwz>> b = Maps.newIdentityHashMap();
   private final Map<agh<csa>, Map<String, xr.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fuo(etd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(enw $$0, fqu $$1, double $$2, double $$3, double $$4) {
      eso $$5 = this.a.j.m();
      agh<csa> $$6 = this.a.r.ad();
      ht $$7 = ht.a($$5.b().c, 0.0, $$5.b().e);
      eoa $$8 = $$1.getBuffer(frc.w());
      if (this.b.containsKey($$6)) {
         for (dwz $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.f(), 500.0)) {
               fqs.a(
                  $$0,
                  $$8,
                  (double)$$9.g() - $$2,
                  (double)$$9.h() - $$3,
                  (double)$$9.i() - $$4,
                  (double)($$9.j() + 1) - $$2,
                  (double)($$9.k() + 1) - $$3,
                  (double)($$9.l() + 1) - $$4,
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

      Map<String, xr.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (xr.a $$11 : $$10.values()) {
            dwz $$12 = $$11.a();
            if ($$7.a($$12.f(), 500.0)) {
               if ($$11.b()) {
                  fqs.a(
                     $$0,
                     $$8,
                     (double)$$12.g() - $$2,
                     (double)$$12.h() - $$3,
                     (double)$$12.i() - $$4,
                     (double)($$12.j() + 1) - $$2,
                     (double)($$12.k() + 1) - $$3,
                     (double)($$12.l() + 1) - $$4,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  fqs.a(
                     $$0,
                     $$8,
                     (double)$$12.g() - $$2,
                     (double)$$12.h() - $$3,
                     (double)$$12.i() - $$4,
                     (double)($$12.j() + 1) - $$2,
                     (double)($$12.k() + 1) - $$3,
                     (double)($$12.l() + 1) - $$4,
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

   public void a(dwz $$0, List<xr.a> $$1, agh<csa> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, xr.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (xr.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
