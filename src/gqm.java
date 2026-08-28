import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gqm implements gpz.a {
   private final flj a;
   private final Map<aku<dgi>, Map<String, ene>> b = Maps.newIdentityHashMap();
   private final Map<aku<dgi>, Map<String, aao.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gqm(flj $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ffu $$0, gly $$1, double $$2, double $$3, double $$4) {
      fkr $$5 = this.a.j.k();
      aku<dgi> $$6 = this.a.s.ai();
      ji $$7 = ji.a($$5.b().d, 0.0, $$5.b().f);
      ffy $$8 = $$1.getBuffer(gmi.y());
      if (this.b.containsKey($$6)) {
         for (ene $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gms.a(
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
            ene $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gms.a(
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
                  gms.a(
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

   public void a(ene $$0, List<aao.a> $$1, aku<dgi> $$2) {
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
