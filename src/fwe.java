import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fwe implements fvt.a {
   private final euk a;
   private final Map<ags<csy>, Map<String, dyg>> b = Maps.newIdentityHashMap();
   private final Map<ags<csy>, Map<String, yc.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fwe(euk $$0) {
      this.a = $$0;
   }

   @Override
   public void a(epd $$0, fsi $$1, double $$2, double $$3, double $$4) {
      etv $$5 = this.a.j.m();
      ags<csy> $$6 = this.a.r.ad();
      hv $$7 = hv.a($$5.b().c, 0.0, $$5.b().e);
      eph $$8 = $$1.getBuffer(fsq.w());
      if (this.b.containsKey($$6)) {
         for (dyg $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               fsg.a(
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

      Map<String, yc.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (yc.a $$11 : $$10.values()) {
            dyg $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  fsg.a(
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
                  fsg.a(
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

   public void a(dyg $$0, List<yc.a> $$1, ags<csy> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, yc.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (yc.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
