import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fxp implements fxe.a {
   private final evr a;
   private final Map<ahg<ctx>, Map<String, dzg>> b = Maps.newIdentityHashMap();
   private final Map<ahg<ctx>, Map<String, yp.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fxp(evr $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eqk $$0, ftt $$1, double $$2, double $$3, double $$4) {
      evc $$5 = this.a.j.m();
      ahg<ctx> $$6 = this.a.r.ae();
      hx $$7 = hx.a($$5.b().c, 0.0, $$5.b().e);
      eqo $$8 = $$1.getBuffer(fub.w());
      if (this.b.containsKey($$6)) {
         for (dzg $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               ftr.a(
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

      Map<String, yp.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (yp.a $$11 : $$10.values()) {
            dzg $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  ftr.a(
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
                  ftr.a(
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

   public void a(dzg $$0, List<yp.a> $$1, ahg<ctx> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, yp.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (yp.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
