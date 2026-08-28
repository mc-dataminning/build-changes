import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gts implements gtf.a {
   private final fof a;
   private final Map<ald<dip>, Map<String, eqa>> b = Maps.newIdentityHashMap();
   private final Map<ald<dip>, Map<String, aav.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gts(fof $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fiq $$0, gpd $$1, double $$2, double $$3, double $$4) {
      fnn $$5 = this.a.j.k();
      ald<dip> $$6 = this.a.s.aj();
      iu $$7 = iu.a($$5.b().d, 0.0, $$5.b().f);
      fiu $$8 = $$1.getBuffer(gpn.y());
      if (this.b.containsKey($$6)) {
         for (eqa $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gpx.a(
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

      Map<String, aav.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (aav.a $$11 : $$10.values()) {
            eqa $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gpx.a(
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
                  gpx.a(
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

   public void a(eqa $$0, List<aav.a> $$1, ald<dip> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, aav.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (aav.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
