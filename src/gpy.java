import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gpy implements gpl.a {
   private final fmg a;
   private final Map<aly<dhi>, Map<String, eoc>> b = Maps.newIdentityHashMap();
   private final Map<aly<dhi>, Map<String, abu.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public gpy(fmg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgs $$0, gll $$1, double $$2, double $$3, double $$4) {
      flp $$5 = this.a.j.k();
      aly<dhi> $$6 = this.a.s.ah();
      jh $$7 = jh.a($$5.b().d, 0.0, $$5.b().f);
      fgw $$8 = $$1.getBuffer(glv.y());
      if (this.b.containsKey($$6)) {
         for (eoc $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gmf.a(
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

      Map<String, abu.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abu.a $$11 : $$10.values()) {
            eoc $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gmf.a(
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
                  gmf.a(
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

   public void a(eoc $$0, List<abu.a> $$1, aly<dhi> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abu.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abu.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
