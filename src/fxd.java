import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fxd implements fws.a {
   private final evi a;
   private final Map<ahf<ctp>, Map<String, dyy>> b = Maps.newIdentityHashMap();
   private final Map<ahf<ctp>, Map<String, yo.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fxd(evi $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eqb $$0, fth $$1, double $$2, double $$3, double $$4) {
      eut $$5 = this.a.j.m();
      ahf<ctp> $$6 = this.a.r.ae();
      hx $$7 = hx.a($$5.b().c, 0.0, $$5.b().e);
      eqf $$8 = $$1.getBuffer(ftp.w());
      if (this.b.containsKey($$6)) {
         for (dyy $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               ftf.a(
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

      Map<String, yo.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (yo.a $$11 : $$10.values()) {
            dyy $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  ftf.a(
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
                  ftf.a(
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

   public void a(dyy $$0, List<yo.a> $$1, ahf<ctp> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, yo.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (yo.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
