import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gwq implements gwd.a {
   private final frd a;
   private final Map<alh<djx>, Map<String, ert>> b = Maps.newIdentityHashMap();
   private final Map<alh<djx>, Map<String, aaz.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gwq(frd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(flo $$0, gsa $$1, double $$2, double $$3, double $$4) {
      fql $$5 = this.a.j.k();
      alh<djx> $$6 = this.a.s.aj();
      iv $$7 = iv.a($$5.b().d, 0.0, $$5.b().f);
      flr $$8 = $$1.getBuffer(gsl.w());
      if (this.b.containsKey($$6)) {
         for (ert $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gst.a(
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

      Map<String, aaz.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aaz.a $$11 : $$10.values()) {
            ert $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gst.a(
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
                  gst.a(
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

   public void a(ert $$0, List<aaz.a> $$1, alh<djx> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aaz.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aaz.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
