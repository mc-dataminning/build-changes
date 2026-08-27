import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gbp implements gbe.a {
   private final ezi a;
   private final Map<ajg<cxb>, Map<String, ecw>> b = Maps.newIdentityHashMap();
   private final Map<ajg<cxb>, Map<String, zq.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gbp(ezi $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eub $$0, fxs $$1, double $$2, double $$3, double $$4) {
      eyt $$5 = this.a.j.m();
      ajg<cxb> $$6 = this.a.r.ad();
      ib $$7 = ib.a($$5.b().c, 0.0, $$5.b().e);
      euf $$8 = $$1.getBuffer(fya.y());
      if (this.b.containsKey($$6)) {
         for (ecw $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               fxq.a(
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

      Map<String, zq.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (zq.a $$11 : $$10.values()) {
            ecw $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  fxq.a(
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
                  fxq.a(
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

   public void a(ecw $$0, List<zq.a> $$1, ajg<cxb> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, zq.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (zq.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
