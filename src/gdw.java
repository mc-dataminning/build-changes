import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gdw implements gdl.a {
   private final fbp a;
   private final Map<ajs<cyx>, Map<String, eez>> b = Maps.newIdentityHashMap();
   private final Map<ajs<cyx>, Map<String, aac.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gdw(fbp $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ewi $$0, fzz $$1, double $$2, double $$3, double $$4) {
      fba $$5 = this.a.j.n();
      ajs<cyx> $$6 = this.a.r.ae();
      ib $$7 = ib.a($$5.b().c, 0.0, $$5.b().e);
      ewm $$8 = $$1.getBuffer(gah.y());
      if (this.b.containsKey($$6)) {
         for (eez $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               fzx.a(
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

      Map<String, aac.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aac.a $$11 : $$10.values()) {
            eez $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  fzx.a(
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
                  fzx.a(
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

   public void a(eez $$0, List<aac.a> $$1, ajs<cyx> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aac.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aac.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
