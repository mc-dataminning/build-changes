import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gfb implements geq.a {
   private final fcu a;
   private final Map<ake<czu>, Map<String, efy>> b = Maps.newIdentityHashMap();
   private final Map<ake<czu>, Map<String, aao.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gfb(fcu $$0) {
      this.a = $$0;
   }

   @Override
   public void a(exn $$0, gbe $$1, double $$2, double $$3, double $$4) {
      fcf $$5 = this.a.j.m();
      ake<czu> $$6 = this.a.r.ae();
      im $$7 = im.a($$5.b().c, 0.0, $$5.b().e);
      exr $$8 = $$1.getBuffer(gbm.y());
      if (this.b.containsKey($$6)) {
         for (efy $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gbc.a(
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

      Map<String, aao.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aao.a $$11 : $$10.values()) {
            efy $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gbc.a(
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
                  gbc.a(
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

   public void a(efy $$0, List<aao.a> $$1, ake<czu> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aao.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aao.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
