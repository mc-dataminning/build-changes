import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gwd implements gvq.a {
   private final fqq a;
   private final Map<alq<dkj>, Map<String, esf>> b = Maps.newIdentityHashMap();
   private final Map<alq<dkj>, Map<String, abi.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gwd(fqq $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fld $$0, grn $$1, double $$2, double $$3, double $$4) {
      fpy $$5 = this.a.j.k();
      alq<dkj> $$6 = this.a.s.aj();
      iw $$7 = iw.a($$5.b().d, 0.0, $$5.b().f);
      flg $$8 = $$1.getBuffer(gry.w());
      if (this.b.containsKey($$6)) {
         for (esf $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gsg.a(
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

      Map<String, abi.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abi.a $$11 : $$10.values()) {
            esf $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gsg.a(
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
                  gsg.a(
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

   public void a(esf $$0, List<abi.a> $$1, alq<dkj> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abi.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abi.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
