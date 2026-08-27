import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gan implements gac.a {
   private final eyk a;
   private final Map<ajb<cwe>, Map<String, eby>> b = Maps.newIdentityHashMap();
   private final Map<ajb<cwe>, Map<String, zo.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gan(eyk $$0) {
      this.a = $$0;
   }

   @Override
   public void a(etd $$0, fwq $$1, double $$2, double $$3, double $$4) {
      exv $$5 = this.a.j.m();
      ajb<cwe> $$6 = this.a.r.ad();
      ib $$7 = ib.a($$5.b().c, 0.0, $$5.b().e);
      eth $$8 = $$1.getBuffer(fwy.y());
      if (this.b.containsKey($$6)) {
         for (eby $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               fwo.a(
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

      Map<String, zo.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (zo.a $$11 : $$10.values()) {
            eby $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  fwo.a(
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
                  fwo.a(
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

   public void a(eby $$0, List<zo.a> $$1, ajb<cwe> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, zo.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (zo.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
